/**
@Ejercicio 1
 Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́definir 
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y 
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además 
definir los métodos getters y setters correspondientes.
 */
package pooejextra01;
/**
 * @author lucas
 */
public class Cancion {
    
//Atributos
    private String titulo;
    private String autor;
    
//Constructores
    public Cancion() {
    }
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
//Gett y Sett
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
    
//Mostrar datos
    public void mostrarInfo() {
        System.out.println("Titulo de la cancion= "+titulo);
        System.out.println("Autor de la cancion= "+autor);
    }
}
