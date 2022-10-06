/**
@Ejercicio 1
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas
 */
package pooej01;

import Entidad.Libro;
import Service.ServiceLibro;
import java.util.Scanner;

/**
 * @author lucas
 */
public class POOEj01 {
 /**
 * @param args the command line arguments
 */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServiceLibro completar = new ServiceLibro();
        Libro libro1 = new Libro(1001, 200, "Yo y mi otro hermano", "Pepito");
        System.out.println("Desea ver el informe predeterminado? S/N");
        String Ingreso = leer.nextLine();
        Ingreso = Ingreso.toUpperCase();
        
        while(!"N".equals(Ingreso) && !"S".equals(Ingreso)){
            System.out.println("Error, ingrese la letra 'S' o 'N' para continuar");
            Ingreso = leer.nextLine();
            Ingreso = Ingreso.toUpperCase();
            
        }
        if ("N".equals(Ingreso)) {
          System.out.println("\nIngrese los datos del libro: ");
           libro1 = completar.crearLibro();
            System.out.println(libro1.Informe());
    
        }else {
            if ("S".equals(Ingreso)){
              System.out.println(libro1.Informe());
            }
        }
        
}
}