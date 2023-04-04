/*
2. En java Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos con la fórmula distancia = √[(x2 - x1)² + (y2 - y1)²]
 */
package Servicio;

import Entidad.Ejer2ExtraEntidad;
import java.util.Scanner;

/**
 *
 * @author CELESTE
 */
public class Ejer2ExtraServicio {

    Ejer2ExtraEntidad v1 = new Ejer2ExtraEntidad();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    // Método para crear puntos ingresados por el usuario
    public Ejer2ExtraEntidad crearPuntos() {

        System.out.println("Ingrese el valor de x1: ");
        v1.setX1(leer.nextInt());
        System.out.println("Ingrese el valor de y1: ");
        v1.setY1(leer.nextInt());
        System.out.println("Ingrese el valor de x2: ");
        v1.setX2((leer.nextInt()));
        System.out.println("Ingrese el valor de y2: ");
        v1.setY2(leer.nextInt());

        return v1;

    }

    // Método para calcular la distancia entre dos puntos
    public void calcularDistancia() {
        double distancia = Math.round(Math.sqrt(Math.pow((v1.getX2() - v1.getX1()), 2) + Math.pow((v1.getY2() - v1.getY1()), 2))) * 10000.0 / 10000.0;

        System.out.println("La distancia entre los dos puntos es  " + distancia);

    }

}
