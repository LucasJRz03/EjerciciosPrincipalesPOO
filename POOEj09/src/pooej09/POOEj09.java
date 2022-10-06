/**
@Ejercicio 9
Realizar una clase llamada Matemática que tenga como atributos dos números reales con 
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un 
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el 
Math.random para generar los dos números y se guardaran en el objeto con su 
respectivos set. Deberá además implementar los siguientes métodos: 
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado 
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número
 */
package pooej09;
import Entidad.Matematica;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class POOEj09 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Matematica operacion1 = new Matematica();
        Random x = new Random(); int maximo = 5; int minimo = 1;
        int numero1; int numero2;
        numero1 = x.nextInt(maximo-minimo)+minimo;
        numero2 = x.nextInt(maximo-minimo)+minimo;
        operacion1.setNumero1(numero1);
        operacion1.setNumero2(numero2);
        System.out.println(numero1+" y "+numero2);
        int opcion;
        do {
            System.out.println("\n1. Devolver mayor"
                               +"\n2. Calcular potencia"
                               +"\n3. Calcular raiz");
                               opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    operacion1.devolverMayor();
                    break;
                case 2:
                    System.out.println("Resultado="+operacion1.calcularPotencia());
                    break;
                case 3:
                    System.out.println("Resultado="+operacion1.calcularRaiz());
            }
                               
            
        } while (opcion != 4);
    }
    
}
