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
package Service;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class ServiceLibro {
    Scanner leer = new Scanner(System.in);
    
     public Libro crearLibro(){
        Libro libroCompleto = new Libro();
        System.out.println("-Ingrese el ISBN:");
        libroCompleto.setISBN(leer.nextInt());
        
        System.out.println("-Ingrese el numero de paginas:");
        libroCompleto.setNumPaginas(leer.nextInt());
        System.out.println("-Ingrese el titulo del libro:");
        libroCompleto.setTitulo(leer.next());
        
        System.out.println("-Ingrese el nombre del autor:");
        libroCompleto.setAutor(leer.next());
        
    return libroCompleto;
    }
    
}
