/**
@Ejercicio 2
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de 
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del 
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = Pi * (radio * radio)).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ Pi ∗ radio).
 */
package pooej02;
import Entidad.Circunferencias;
import java.util.Scanner;
/**
* @author lucas
*/
public class POOEj02 {
/**
* @param args the command line arguments
*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
//Se pide al Usuario que ingrese el radio
        System.out.println("Ingrese el radio");
       int radio = leer.nextInt();
//Se importa la clase Circunferencias.
       Circunferencias circ = new Circunferencias(radio);
    // "Circ" le asigna el valor a calcular en Perimetro y al Area
              circ.Perimetro();
              circ.Area();
    //Se muestra los resultados
              System.out.println(circ.toString());
      

        
        
        
       
    }
    
}
