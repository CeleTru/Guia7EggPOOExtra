/*
2. En java Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos con la fórmula distancia = √[(x2 - x1)² + (y2 - y1)²]
 */
package EggExtra;

import Entidad.Ejer2ExtraEntidad;
import Servicio.Ejer2ExtraServicio;


public class Ejer2Extra {

 
    public static void main(String[] args) {
        
        Ejer2ExtraServicio vs = new Ejer2ExtraServicio();
        Ejer2ExtraEntidad v1 = vs.crearPuntos();
        
        vs.calcularDistancia();
        
  


    }
    
}
