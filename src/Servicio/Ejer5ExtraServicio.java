/*
5. Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package Servicio;

import Entidad.Ejer5ExtraEntidad;
import java.util.Scanner;

public class Ejer5ExtraServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ejer5ExtraEntidad v1 = new Ejer5ExtraEntidad(new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"}, null); // Crear una instancia única antes del ciclo

    public Ejer5ExtraEntidad adivinarMes() {

        v1.setMesSecreto(v1.getMeses()[(int) (Math.random() * v1.getMeses().length)]); // Generar mes aleatorio
        String guess;

        do {
            System.out.print("Adivina el mes secreto. Introduce el nombre del mes en minúsculas: ");
            guess = leer.nextLine().toLowerCase();
            if (guess.equals(v1.getMesSecreto())) {
                System.out.println("¡Acertaste!");
                return new Ejer5ExtraEntidad(v1.getMeses(), "¡Acertaste! " + v1.getMesSecreto());
            } else {
                System.out.println("No has acertado. Inténtalo de nuevo introduciendo otro mes. ");
            }
        } while (true);

    }

}
