/**
@Ejercicio 12
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes 
métodos: 
• Agregar un método de creación del objeto que respete la siguiente firma: 
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al 
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la 
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener 
en cuenta que para conocer la edad de la persona también se debe conocer la fecha 
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que 
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método 
anterior.
 */
package pooej12;

import java.util.Date;
import java.util.Scanner;

/**
 * @author lucas
 */
public class POOEj12 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Date fec = new Date();
        Persona n1 = new Persona();
        int opcion;
        do {
            System.out.println("\n1. Crear Persona"
                               +"\n2. Calcular Edad"
                               +"\n3. Menor Que (El usuario ingresa otra Edad)"
                               +"\n4. Mostrar Persona"
                               +"\n5. Salir");
                             opcion = leer.nextInt();
                             
                             switch (opcion) {
                                 case 1:
                                     n1.crearPersona();
                                     break;
                                 case 2:
                                     n1.calcularEdad();
                                     break;
                                 case 3:
                                     System.out.println(n1.menorQue(opcion) );
                                     break;
                                 case 4:
                                     n1.mostrarPersona();
                                     break;
                                 case 5:
                                     System.out.println("Nos vemos!");
                                     break;
                             }
                             
                             
        } while (opcion != 5);
        
       
    }
    
}
