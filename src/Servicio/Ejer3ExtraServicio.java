/*
3. Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
 Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
 Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
 Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
 Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
 Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.

Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
 */
package Servicio;

import Entidad.Ejer3ExtraEntidad;
import java.util.Scanner;

public class Ejer3ExtraServicio {

    Ejer3ExtraEntidad v1 = new Ejer3ExtraEntidad();

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ejer3ExtraEntidad coeficientes() {

//        System.out.println("Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a)");
        System.out.println("Ingrese el valor del coeficiente A: ");
        v1.setA(leer.nextDouble());
        System.out.println("Ingrese el valor del coeficiente B: ");
        v1.setB(leer.nextDouble());
        System.out.println("Ingrese el valor del coeficiente C: ");
        v1.setC(leer.nextDouble());

//        System.out.println("Formula ecuación 2o grado: (-" + v1.getB() + "±√((" + v1.getB() + "^2)-(4*" + v1.getA() + "* " + v1.getC() + ")))/(2*" + v1.getA() + ")");
        return v1;

    }

    public double getDiscriminante() {
        double discriminante = Math.pow(v1.getB(), 2) - 4 * v1.getA() * v1.getC();

        return discriminante;

    }

    public boolean tieneRaices() {

        double discriminante = getDiscriminante();
        return discriminante >= 0;

    }

    public boolean tieneRaiz() {

        double discriminante = getDiscriminante();
        if (discriminante == 0) {
            double x = (-v1.getB()) / (2 * v1.getA());
            v1.setRoot(x); // Guardar el valor de la raíz en v1
            return true;
        } else {
            return false;
        }
    }
   public void calcular() {

        System.out.println("calcular");
        System.out.println("El valor del discriminante es: " + getDiscriminante());

        if (obtenerRaices()) {
//            System.out.println("El valor de la raíz es: " + v1.getRoot());
        } else {
            System.out.println("No tiene soluciones reales del método calcular()");
        }
    }
    public boolean obtenerRaices() {
        double discriminante = getDiscriminante();
        boolean tieneRaices = discriminante >= 0;

        if (tieneRaices) {
            double x1 = (((-v1.getB()) - Math.sqrt(discriminante)) )/ (2 * v1.getA());
            double x2 = (((-v1.getB()) + Math.sqrt(discriminante)) )/ (2 * v1.getA());
            if (x1 == x2) {
                double raiz = x1;
                v1.setRoot(raiz);
                System.out.println("La única raíz es: " + String.format("%.6f", raiz));
            } else {
                v1.setRoot(x1);
                v1.setRoot(x2);
                System.out.println("Las posibles soluciones son: " + String.format("%.6f", x1) + " y " + String.format("%.6f", x2));
            }
        } else {
            System.out.println("No tiene soluciones reales del método obtenerRaices()");
        }

        return tieneRaices;
    }

 }


//
//    public double getDiscriminante() {
//        double discriminante = Math.pow(v1.getB(), 2) - 4 * v1.getA() * v1.getC();
//
//        return discriminante;
//
//    }
//
//    public boolean tieneRaices() {
//
//        double discriminante = getDiscriminante();
//        return discriminante >= 0;
//
//    }
//
//    public boolean tieneRaiz() {
//
//        double discriminante = getDiscriminante();
//        if (discriminante == 0) {
//            double x = -v1.getB() / (2 * v1.getA());
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public boolean obtenerRaices() {
//
//        if (tieneRaiz()) {
//            double x1 = (-v1.getB() + Math.sqrt(getDiscriminante())) / (2 * v1.getA());
//            double x2 = (-v1.getB() - Math.sqrt(getDiscriminante())) / (2 * v1.getA());
//            if (x1 == x2) {
//                System.out.println("La única raíz es: " + x1);
//            } else {
//                System.out.println("Las posibles soluciones son: " + x1 + " y " + x2);
//            }
//            return true;
//        } else {
//            System.out.println("No tiene soluciones reales del boolean obtenerRaices");
//            return false;
//        }
//    }
//
//    public void calcular() {
//
//        System.out.println("calcular");
//        System.out.println("El valor del discriminante es: " + getDiscriminante());
//
//        if (tieneRaices()) {
//            obtenerRaices();
//        } else if (tieneRaiz()) {
//            obtenerRaices();
//        } else {
//            System.out.println("No tiene soluciones reales del método calcular()");
//        }
//    }
