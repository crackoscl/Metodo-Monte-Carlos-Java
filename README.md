# Método de Monte Carlo para calcular π

## Descripción del Proyecto

Este proyecto implementa una aplicación gráfica en Java que utiliza el método de Monte Carlo para calcular el valor de π (pi). La interfaz de usuario se construye utilizando la biblioteca Swing, y permite a los usuarios ajustar el número de puntos utilizados en el cálculo a través de un control deslizante (slider).

## Características

- **Interfaz Gráfica**: Utiliza Swing GUI  para crear una experiencia de usuario interactiva.
- **Cálculo de π**: Implementa el método de Monte Carlo para estimar el valor de π.
- **Visualización**: Muestra el número de puntos dentro del círculo y el valor estimado de π en tiempo real.
- **Interactividad**: Permite al usuario ajustar la cantidad de puntos a calcular mediante un slider.

## Requisitos

- Java Development Kit (JDK) 8 o superior


## Estructura del Proyecto

El proyecto está compuesto por las siguientes clases:

- `MainFrame`: Clase principal que crea la ventana de la aplicación y gestiona la interfaz de usuario.
- `MonteCarloPiCalculator`: Clase responsable de realizar los cálculos necesarios para estimar π.
- `CanvasPanel`: Clase que extiende `JPanel` y se encarga de dibujar los puntos y el círculo en la interfaz gráfica.

## Instalación

1. Clona el repositorio o descarga el código fuente.
2. Asegúrate de tener el JDK instalado en tu máquina.
3. Compila el código utilizando un IDE como  Eclipse, Vscode o desde la línea de comandos.
4. Ejecuta la clase `MainFrame`.

## Uso

1. Al iniciar la aplicación, se abrirá una ventana que mostrará un slider en la parte superior, un área de dibujo en el centro, y un label en la parte inferior.
2. Ajusta el slider para cambiar el número de puntos que se utilizarán en el cálculo de π.
3. Observa cómo el valor de π se actualiza en tiempo real en el label, junto con el número de puntos dentro del círculo.

## Ejemplo de Uso

- Mueve el slider hacia la derecha para aumentar el número de puntos.
- Observa cómo el valor estimado de π se aproxima a su valor real (3.14159...) a medida que aumentas la cantidad de puntos.





| ![Ejemplo]() |
|:--:|


<p align="center" width="100%">
    <img width="80%" src="https://github.com/crackoscl/crackoscl.github.io/blob/master/img/Grabaci%C3%B3n%20de%20pantalla%20desde%202024-09-13%2022-52-01.gif"> 
</p>


## Contribuciones

Las contribuciones son bienvenidas. Si deseas mejorar el proyecto, por favor crea un fork del repositorio y envía un pull request.

## Licencia

Este proyecto está bajo la Licencia MIT. Puedes usar, copiar, modificar y distribuir este software bajo los términos de esta licencia.

---

¡Disfruta explorando el método de Monte Carlo y aprendiendo sobre la estimación de π!
