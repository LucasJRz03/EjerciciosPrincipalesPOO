/**
@Ejercicio 3
Crear una clase llamada Operacion que tenga como atributos privados numero1 y 
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en 
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si 
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si 
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar 
una división por cero, el método devuelve 0 y se le informa al usuario el error se le 
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */

package pooej03;
import java.util.Scanner;
import Entidad.Operacion;

/**
 * @author lucas
 */
public class POOEj03 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      Operacion operar1 = new Operacion();
      operar1.CrearOperacion();
      int opc;
        do {
            System.out.println("  ");
            System.out.println("Eliga una opcion:"
                    + "\n1. Sumar"
                    + "\n2. Restar"
                    + "\n3. Multiplicar"
                    + "\n4. Dividir"
                    + "\n5. Hacer todos los calculos"
                    + "\n6. Salir");
                    opc = leer.nextInt();
    switch(opc){   
        case 1:  
                System.out.println("La suma es ="+operar1.Sumar());
                break;
        case 2:
                System.out.println("La resta es ="+operar1.Restar());
                break;
        case 3:       
                System.out.println("La multiplicacion es ="+operar1.Multiplicar());
                break;
        case 4:       
                System.out.println("La division es ="+operar1.Dividir());
                break;
        case 5: 
                operar1.Sumar();
                operar1.Restar();
                operar1.Multiplicar();
                operar1.Dividir();
                System.out.println(operar1.toString());
                break;
    }       
     } while (opc != 6); 
        
        
        
    }
    
}
