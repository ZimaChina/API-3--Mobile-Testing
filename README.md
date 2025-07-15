
# Actividad 3 - Mobile Testing

Este repositorio contiene una pequeña aplicación en Kotlin que se conecta a una API externa y muestra el listado de productos disponibles en una plataforma de e-commerce.

## 📋 Descripción

Se realiza una conexión a la API pública:

```
https://jsonkeeper.com/b/MX0A
```

La cual devuelve un JSON con una lista de productos, que incluye: nombre, descripción, precio y disponibilidad.

El objetivo de esta actividad es simular la funcionalidad base de un módulo de productos en una app móvil de e-commerce.

## 🧪 Ejecución

Este ejemplo fue desarrollado en Kotlin (JVM) para simplificar la entrega, pudiendo ser ejecutado directamente desde consola o IDE como IntelliJ IDEA.

### ✅ Requisitos

- Kotlin 1.9+
- Gradle
- Gson (para deserializar JSON)
- kotlinx-coroutines

### 🚀 Cómo correrlo

1. Clonar el repositorio.
2. Ejecutar la función `main()` en `Main.kt`.

La salida esperada será una lista como esta:

```
iPhone 13 - 999.99 USD
Samsung Galaxy S21 - 899.99 USD
Google Pixel 6 - 799.99 USD
```

## 🧩 Estructura del proyecto

```
├── build.gradle.kts
├── settings.gradle.kts
└── src
    └── main
        └── kotlin
            └── Main.kt
```

## 🧠 Tecnologías utilizadas

- Kotlin
- Coroutines
- Gson
- HTTP (HttpURLConnection)

## 📄 Licencia

Uso educativo - Actividad 3 (Mobile Testing)
