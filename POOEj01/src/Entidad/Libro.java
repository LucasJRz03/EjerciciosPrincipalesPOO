/*
@Ejercicio 1
Crear una clase llamada Libro que contenga los siguientes atributos: 
- ISB, 
- Título 
- Autor
- Número de páginas
Y un constructor con todos los atributos pasados por parámetro y un constructor vacío.
Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas
 */
package Entidad;

import java.util.Scanner;

/**
 * @author lucas
 */
public class Libro {
     Scanner leer = new Scanner(System.in);
//Atributos
   private long ISBN;
   private int numPaginas;
   private String titulo;  
   private String autor;
   
   
//Constructores
   public Libro(){
       
   }
    public Libro(int ISBN, int NumPaginas, String Titulo, String Autor){ 
     this.ISBN = ISBN;
     this.numPaginas = NumPaginas;
     this.titulo = Titulo;
     this.autor = Autor;
     
    }
    
//Metodos
    public long getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

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
    
    public String Informe(){
     return "\nNombre del libro = " +titulo+ "\nCodigo (ISBN) = "+ISBN+"\nEscrito por= "+autor+"\nNumeros de paginas= "+numPaginas;
    }
    
}
