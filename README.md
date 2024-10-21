# GeoJSON con Turf.js - Aplicación Web de Mapas

## Descripción de la Aplicación

Esta aplicación web utiliza **GeoJSON** y **Turf.js** para mostrar puntos en un mapa interactivo, permitiendo visualizar información geográfica de varias estaciones de radio en España. La aplicación se construye utilizando **JavaScript**, **HTML**, y varias librerías de mapas y de cálculos geoespaciales, y está diseñada para proporcionar una interfaz amigable donde los usuarios puedan interactuar con los datos en tiempo real.

## Tecnologías Utilizadas

- **HTML5** y **CSS**: Para la estructura y el diseño de la página.
- **JavaScript**: Para el manejo de la lógica y la interacción del usuario con el mapa.
- **OpenLayers** (APIIGN): Para la creación y manipulación del mapa interactivo.
- **Turf.js**: Para realizar operaciones geoespaciales sobre las coordenadas de las estaciones.
- **Bootstrap**: Para dar estilo y hacer la página responsiva.

## Características Principales

1. **Mapa Interactivo**: La aplicación muestra un mapa donde se representan las estaciones de radio en España. Cada estación se representa como un punto en el mapa.

2. **Obtención Dinámica de Datos**: La aplicación realiza una petición a una API para obtener los datos de las estaciones, que se muestran en el mapa en tiempo real.

3. **Uso de GeoJSON y Turf.js**: Los datos de las estaciones se convierten a un formato **GeoJSON** utilizando **Turf.js**, una librería que permite trabajar fácilmente con datos geoespaciales.

4. **Controles Personalizados**: Se implementa un control personalizado que permite cambiar el estilo de los puntos en el mapa.

5. **Interfaz de Usuario Amigable**: Con el uso de Bootstrap y estilos personalizados, la aplicación tiene un diseño intuitivo y sencillo de usar.

## Estructura del Código

1. **HTML**: Define la estructura de la página, incluyendo el contenedor del mapa y las referencias a las librerías necesarias.

2. **JavaScript**:
    - **API Fetch**: Se obtiene la lista de estaciones de radio desde la API en `http://localhost:8080/api/estaciones`.
    - **Turf.js**: Se crea un objeto `FeatureCollection` con todos los puntos de las estaciones, usando las coordenadas (`lat`, `lon`).
    - **OpenLayers (APIIGN)**: Se utiliza para agregar los puntos en el mapa, manejar el estilo de los puntos, y definir un panel de herramientas extra. APIIGN está basado en OpenLayers, lo que permite aprovechar su funcionalidad avanzada para la visualización y manipulación de datos geoespaciales.
    - **Controles Personalizados**: Se implementa un control que permite al usuario activar o desactivar un estilo específico para los puntos en el mapa.

## Instalación en IntelliJ

1. Clonar el repositorio
2. Crear un nuevo proyecto en IntelliJ a partir del código clonado



## Uso de la Aplicación

1. Al ejecutar la clase `MapasRadioApplicacion`, en http://localhost:8080 se mostrará un mapa de España con los puntos correspondientes a las estaciones de radio.
2. Al hacer clic en una estación, se puede ver información adicional sobre ella.
3. Utilice el botón de control superior izquierdo para activar o desactivar la clusterización de los puntos

## Licencia

Este proyecto está bajo la licencia **MIT**. Siéntase libre de usar, modificar y distribuir el código.

---

© 2024 - Desarrollado por Alejandro Teixeira Muñoz.
