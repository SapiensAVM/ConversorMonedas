package com.monedas;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Convertidor de Monedas Internacional ===");

        try {
            System.out.print("Ingrese la moneda base (por ejemplo, USD): ");
            String base = scanner.nextLine().toUpperCase();

            Map<String, Double> tasas = CurrencyConverter.obtenerTasas(base);

            System.out.print("Ingrese la moneda destino (por ejemplo, EUR): ");
            String destino = scanner.nextLine().toUpperCase();

            if (!tasas.containsKey(destino)) {
                System.out.println("Moneda destino no válida.");
                return;
            }

            System.out.print("Ingrese la cantidad a convertir: ");
            double cantidad = scanner.nextDouble();

            double tasa = tasas.get(destino);
            double resultado = cantidad * tasa;

            System.out.printf("%.2f %s = %.2f %s\n", cantidad, base, resultado, destino);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
