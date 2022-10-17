/**
@Ejercicio 1
 Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́definir 
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y 
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además 
definir los métodos getters y setters correspondientes.
 */
package pooejextra01;

import java.util.Scanner;

/**
 * @author lucas
 */
public class POOEjExtra01 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese el nombre de la cancion");
        String cancion = leer.nextLine();
        System.out.println("Ingrese el nombre del autor");
        String autor = leer.nextLine();
        Cancion cancion1 = new Cancion(cancion, autor);
        cancion1.mostrarInfo();
    }
    
}
