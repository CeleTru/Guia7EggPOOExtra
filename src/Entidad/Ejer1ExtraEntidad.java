/*
1. Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
 */
package Entidad;

public class Ejer1ExtraEntidad {

    private String titulo;
    private String autor;
    
      // Constructor vacío
    
    public Ejer1ExtraEntidad() {
        this.titulo = "";
        this.autor = "";
    }

    // Constructor con parámetros

    public Ejer1ExtraEntidad(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
     // Métodos getters y setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
