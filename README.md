# Conversor de Monedas

Este proyecto proporciona una herramienta sencilla para convertir entre múltiples monedas internacionales, utilizando tasas de cambio actualizadas desde una API externa.

## Características

- **Conversión entre múltiples monedas internacionales**: Soporta la conversión de diversas monedas, como USD, EUR, GBP, JPY, etc.
- **Tasas de cambio actualizadas**: Utiliza la API de [Exchangerate-API](https://www.exchangerate-api.com) (o cualquier otra API que prefieras) para obtener las tasas de cambio más recientes.
- **Interfaz amigable desde la consola**: Permite interactuar con el programa desde la terminal de manera simple.
- **Uso de la biblioteca Gson**: Analiza los datos JSON de forma eficiente para obtener las tasas de cambio.

## Requisitos

- **Java 8 o superior**: Este proyecto fue desarrollado con Java.
- **Gson**: Se utiliza para analizar los datos JSON.
- **Dependencias adicionales**:
  - Librerías HTTP (por ejemplo, `HttpURLConnection` o alguna biblioteca como `OkHttp` si prefieres un enfoque más avanzado).

## Instalación

1. Clona este repositorio:

   ```bash
   git clone https://github.com/tu_usuario/conversor-moneda.git
