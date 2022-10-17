/**
 @Ejercicio 4
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su 
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la letra 
(String o char) que le corresponde. Dispondrá de los siguientes métodos: 
• Métodos getters y setters para el número de DNI y la letra.
• Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le 
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el 
resultado del calculo. 
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en 
mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que 
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el número 
de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe buscar en 
un array (vector) de caracteres la posición que corresponda al resto de la división para 
obtener la letra correspondiente. La tabla de caracteres es la siguiente:
POSICIÓN LETRA
-0  -> T
-1  -> R
-2  -> W
-3  -> A
-4  -> G
-5  -> M
-6  -> Y
-7  -> F
-8  -> P
-9  -> D
-10 -> X
-11 -> B
-12 -> N
-13 -> J
-14 -> Z
-15 -> S
-16 -> Q
-17 -> V
-18 -> H
-19 -> L
-20 -> C
-21 -> K
-22 -> E
 */
package pooejextra04;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class NIF {
    Scanner leer = new Scanner(System.in);
    
    private int DNI;
    private String letra;
    private int valorNif;

    public NIF() {
    }
    public NIF(int DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public int getDNI() {
        return DNI;
    }
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return letra;
    }
    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    
//METODO CREAR NIF
    public void crearNif() {
  
        System.out.println("Ingrese su Dni:");
        DNI = leer.nextInt();
        valorNif = DNI % 23;     
       
        
    }
    
    
//METODO MOSTRAR NIF
    public void mostrar() {
        System.out.println("NIF= "+DNI+"-"+letra);
    }
    
 
// Busca la letra que le corresponda
    private void verificador() {
     switch (valorNif) {
        case 0:
            letra = "T";
            break;
        case 1:
            letra = "R";
            break;
        case 2: 
            letra = "W";
            break;
        case 3:
            letra = "A";
            break;
         case 4:
            letra = "G";
            break;
        case 5:
            letra = "M";
            break;
        case 6: 
            letra = "Y";
            break;
        case 7:
            letra = "F";
            break;   
        case 8:
            letra = "P";
            break;
        case 9:
            letra = "D";
            break;
        case 10: 
            letra = "X";
            break;
        case 11:
            letra = "B";
            break;
         case 12:
            letra = "N";
            break;
        case 13:
            letra = "J";
            break;
        case 14: 
            letra = "Z";
            break;
        case 15:
            letra = "S";
            break;    
        case 16:
            letra = "Q";
            break;
        case 17: 
            letra = "V";
            break;
        case 18:
            letra = "H";
            break;
         case 19:
            letra = "L";
            break;
        case 20:
            letra = "C";
            break;
        case 21: 
            letra = "K";
            break;
        case 22:
            letra = "E";
            break;    
     }
    }
}
