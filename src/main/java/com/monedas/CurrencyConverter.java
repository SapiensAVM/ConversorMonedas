package com.monedas;

import com.google.gson.Gson;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class CurrencyConverter {
    private static final String API_URL = "https://api.exchangerate.host/latest?base=%s";

    public static Map<String, Double> obtenerTasas(String monedaBase) throws Exception {
        String urlStr = String.format(API_URL, monedaBase);
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        try (InputStreamReader reader = new InputStreamReader(conn.getInputStream())) {
            Gson gson = new Gson();
            RespuestaTasaCambio response = gson.fromJson(reader, RespuestaTasaCambio.class);
            return response.rates;
        }
    }

    static class RespuestaTasaCambio {
        Map<String, Double> rates;
    }
}
