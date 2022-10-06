/**
@Ejercicio 6
. Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad 
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos: 
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual 
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la 
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El 
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero. 
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo 
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package pooej06;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 * @author lucas
 */
public class POOEj06 {
    
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cafetera cafe1= new Cafetera();
        int opcion; boolean correcto = false;
         
        do {
            System.out.println(" ");
            System.out.println("Eliga una opcion:"
                    + "\n1. Llenar cafetera"
                    + "\n2. Vaciar cafetera"
                    + "\n3. Agregar cafe"
                    + "\n4. Servir cafe"
                    + "\n5. Salir");
            opcion = leer.nextInt();
            
             switch(opcion){
                 case 1: 
                     cafe1.LlenarCafetera();
                     System.out.println("Se llenó la cafetera");
                     break;
                 case 2: 
                     cafe1.VaciarCafetera();
                     System.out.println("Se vacio la cafetera");
                     break;
                 case 3:
                     System.out.println("Ingrese cantidad de cafe que le quiere agregar a la cafetera");
                     cafe1.AgregarCafe(leer.nextInt());
                     break;
                 case 4: 
                     System.out.println("Ingrese el tamaño de la taza \n1.Chica (5).\n2.Mediana (10).\n3.Grande (20)");
                     cafe1.ServirCafe(leer.nextInt());
                     break;
            
            }

        }while(opcion!= 5);
                
   }
    }