/**
@Ejercicio 10
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El 
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. 
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números 
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 
20
 */
package pooej10y11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class POOEj10 {

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random darValor= new Random();
        int maximo = 50; int minimo = 1;
        double[] vectorA = new double[50];
        double[] vectorB = new double[20];
        
        for (int i = 0; i != 50; i++) {
            vectorA[i] = darValor.nextInt(maximo-minimo)+minimo;
        }
        System.out.println("\nVector A= "
                           +"\n"+Arrays.toString(vectorA));
        Arrays.sort(vectorA);
        
        for (int i = 0; i !=20;i++) {
            if (i <= 9) {
                vectorB[i] = vectorA[i];
            } else{
                vectorB[i] = 0.5;
            }
        }
        System.out.println("\nVector A de menor a mayor="
                           +"\n"+Arrays.toString(vectorA));
        System.out.println("\nVector B="
                           +"\n"+Arrays.toString(vectorB));
    }
}
