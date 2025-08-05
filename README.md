# Mi Aplicación Android con Jetpack Compose (Lab 2)

## Descripción del Proyecto

Esta es una aplicación Android sencilla desarrollada como parte del Laboratorio 2. La aplicación muestra una pantalla de bienvenida para un proyecto llamado "Destiny".

Actualmente, la interfaz de usuario incluye:
*   Un icono o logo representativo de "Destiny".
*   El nombre del proyecto "Destiny".
*   Un mensaje de bienvenida.
*   Un botón interactivo que, al ser presionado, muestra un mensaje (Toast) con el eslogan del proyecto.

El propósito principal de este laboratorio es familiarizarse con los conceptos básicos de Jetpack Compose para la creación de interfaces de usuario en Android, incluyendo el uso de Composables como `Image`, `Text`, `Button`, `Column`, `Box`, y `Modifiers` para el layout y estilización.

## Instrucciones para Ejecutar la App Localmente

Para ejecutar esta aplicación en tu entorno local (por ejemplo, en un emulador de Android o en un dispositivo físico), sigue estos pasos:

1.  **Requisitos Previos:**
    *   Tener [Android Studio](https://developer.android.com/studio) instalado (se recomienda la versión más reciente compatible con Jetpack Compose).
    *   Un emulador de Android configurado en Android Studio o un dispositivo Android físico con el modo de desarrollador y la depuración USB habilitados.

2.  **Obtener el Código Fuente:**
    *   Clona este repositorio o descarga los archivos fuente en tu máquina local.

3.  **Abrir el Proyecto en Android Studio:**
    *   Abre Android Studio.
    *   Selecciona "Open" (o "Open an Existing Project").
    *   Navega hasta el directorio donde clonaste o descomprimiste el proyecto y selecciona la carpeta raíz del proyecto (la que contiene el archivo `build.gradle` a nivel de proyecto).
    *   Android Studio importará el proyecto y sincronizará las dependencias de Gradle. Esto puede tomar unos minutos la primera vez.

4.  **Seleccionar un Dispositivo/Emulador:**
    *   Una vez que el proyecto esté sincronizado, verás una barra de herramientas en la parte superior de Android Studio. Busca el menú desplegable de dispositivos (usualmente muestra "No Devices" o el nombre de un emulador/dispositivo conectado).
    *   Selecciona un emulador disponible o conecta tu dispositivo Android físico (asegúrate de que esté configurado para depuración).

5.  **Ejecutar la Aplicación:**
    *   Haz clic en el botón verde de "Run 'app'" (parece un triángulo de reproducción) en la barra de herramientas.
    *   Android Studio compilará el código, instalará el APK en el dispositivo/emulador seleccionado y luego iniciará la aplicación.

6.  **Verificar:**
    *   Una vez que la aplicación se inicie, deberías ver la pantalla principal con el icono de "Destiny", el texto y el botón.
    *   Prueba a presionar el botón para ver el mensaje Toast.

---

Si encuentras algún problema durante la compilación o ejecución, asegúrate de que tu entorno de Android Studio esté configurado correctamente y que todas las dependencias de Gradle se hayan descargado sin errores. Puedes intentar `Build > Clean Project` y luego `Build > Rebuild Project` desde el menú de Android Studio.
