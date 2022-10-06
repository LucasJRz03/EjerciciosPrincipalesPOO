/**
@Ejercicio 8
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String) 
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase 
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a 
través de los métodos set, se guardará la frase y la longitud de manera automática según 
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos: 
* a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase 
ingresada. 
* b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por 
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
* c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: 
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
* e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que 
compone la clase con otra nueva frase ingresada por el usuario.

* f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con 
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la 
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que 
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package pooej08;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class POOEj08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        int opcion; 
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
         Cadena cadena1 = new Cadena();
         cadena1.setFrase(frase);
         cadena1.mostrarVocales();
     do {    
        System.out.println("\n1. Mostrar vocales"
                           +"\n2. Invertir frase"
                           +"\n3. Veces repetida (La letra que el usuario eliga) "
                           +"\n4. Comparar longitud"
                           +"\n5. Unir frase"
                           +"\n6. Reemplazar"
                           +"\n7. Contiene"
                           +"\n8. Salir");
                           opcion = leer.nextInt();
                           
        switch (opcion) {
            case 1:
                cadena1.mostrarVocales();
                break;
            case 2: 
                cadena1.InvertirFrase();
                break;
            case 3: 
                cadena1.vecesRepetida(frase);
                break;
            case 4:
                cadena1.compararLongitud(frase);
                break;
            case 5: 
                cadena1.unirFrases(frase);
                break;
            case 6:
                cadena1.reemplazar(frase);
                break;
            case 7:
                cadena1.contiene(frase);
                break;
            case 8:
                System.out.println("Hasta la proxima :)");   
        }                                                             
     } while(opcion != 8);            
   }
    
}
