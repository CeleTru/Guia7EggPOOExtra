/*
6. Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
con los parámetros que sean necesarios:
 Constructores, tanto el vacío como el parametrizado.
 Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0.
 Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
 Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
 Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
 Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
 Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.

Un ejemplo de salida puede ser así:

Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
----------------------------------------------
Ingrese una letra:
z
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 3
---------------------------------------------
Ingrese una letra:
b
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 2
----------------------------------------------
Ingrese una letra:
u
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 1
----------------------------------------------
Ingrese una letra:

q
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Mensaje: Lo sentimos, no hay más oportunidades
 */
package Servicio;

import Entidad.Ejer6ExtraEntidad;
import java.util.Scanner;

public class Ejer6ExtraServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ejer6ExtraEntidad v1 = new Ejer6ExtraEntidad();

    public void crearJuego() {

        System.out.println("Ingrese la palabra a adivinar: ");
        v1.setFrase(leer.nextLine().toUpperCase());
        v1.setPalabra(v1.getFrase().toCharArray());
        v1.setIntentosRestantes(v1.getFrase().length());

        System.out.print("Palabra: ");
        for (int i = 0; i < v1.getFrase().length(); i++) {
            char letra = v1.getFrase().charAt(i);
            if (letraEncontrada(letra)) {
                System.out.print(letra + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }

    public int longitud() {
        System.out.println("La longitud de la palabra es: " + v1.getFrase().length());
        return v1.getFrase().length();
    }

    public boolean buscar(char letra) {
        boolean encontrada = false;
        for (int i = 0; i < v1.getFrase().length(); i++) {
            if (v1.getPalabra()[i] == v1.getLetra()) {
                encontrada = true;
                v1.setEncontradas(v1.getEncontradas() + 1);
            }
        }
        if (encontrada) {
            System.out.println("La letra pertenece a la palabra");
        } else {
            System.out.println("La letra no pertenece a la palabra");
            v1.setIntentosRestantes(v1.getIntentosRestantes() - 1);
        }
        return encontrada;
    }

    public int intentos() {
        System.out.println("Número de oportunidades restantes: " + v1.getIntentosRestantes() + "/" + (v1.getFrase().length())); // Se muestra el número total de intentos
        return v1.getIntentosRestantes();
    }

    public void juego() {

        while (v1.getIntentosRestantes() > 0 && v1.getEncontradas() < v1.getFrase().length()) {
            System.out.println("----------------------------------------------");

            System.out.println("Ingrese una letra: ");
            v1.setLetra(Character.toUpperCase(leer.nextLine().charAt(0)));

            boolean encontrada = buscar(v1.getLetra());

            if (encontrada) {
                v1.getPalabra()[v1.getEncontradas() - 1] = v1.getLetra(); // Se corrige el índice de la palabra encontrada
            }

            intentos();
        }

        if (v1.getEncontradas() == v1.getFrase().length()) {
            System.out.println("¡Felicitaciones, has encontrado la palabra!");
        } else {
            System.out.println("Lo siento, no has encontrado la palabra.");
            System.out.println("La palabra era: " + v1.getFrase());
        }
    }

    public boolean letraEncontrada(char letra) {
        for (int i = 0; i < v1.getEncontradas(); i++) {
            if (v1.getPalabra()[v1.getEncontradas() - 1] == v1.getLetra()) {
                return true;
            }
        }
        return false;
    }

}
