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
* 
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
public class Cadena {
    Scanner leer = new Scanner( System.in);
    
//ATRIBUTOS
    private String frase;
    private int longitud;
    
    
//CONSTRUTORES
    public Cadena() {
        
    }
    public Cadena(String frase) {
        this.frase = frase;
        
    }
    
//GETTS Y SETTS
    public String getFrase() {
        return frase;
    }
    public void setFrase(String frase) {
        this.frase = frase.toUpperCase();
        this.longitud = frase.length();
    }

    public int getLongitud() {
        return longitud;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

//METODO MOSTRAR VOCALES
    public void mostrarVocales() {
      String caracter; 
      int vocales = 0;
      int cont1 = 0, cont2 = 1;
        for (int i = 0; i < frase.length(); i++) {
        caracter= this.frase.substring(cont1, cont2);
         cont1 ++; cont2 ++;
          if ("A".equals(caracter) ||"E".equals(caracter) || "I".equals(caracter) || "O".equals(caracter) || "U".equals(caracter)){
            vocales ++;
          } 
        }  
        System.out.println("La frase '"+frase+"' tiene "+vocales+" vocales");     
    }

//Metodo frase invertida
    public void InvertirFrase() {
        System.out.print("La frase invertida es =");
        String fraseInvertida = "";
        for (int i = frase.length()-1; i >=0; i--) {
            fraseInvertida += frase.charAt(i);           
        }
        System.out.println(fraseInvertida);  
}
    
//METODO DE VECES QUE SE REPITE UN CARACTER INGRESADO POR EL USUARIO
    public void vecesRepetida(String letra) {
        int contar = 0;
        int cont1 = 0; int cont2 = 1;
        System.out.println("Ingrese una letra");
        letra = leer.next();
        letra = letra.toUpperCase();
        while(letra.length() >= 2) {
            System.out.println("Ingrese solo una letra");
            letra = leer.next();
            letra = letra.toUpperCase();
        }
        for (int i = 0; i < frase.length(); i++) {    
            if ( letra.equals(frase.substring(cont1, cont2)) ) {
                contar++;
            }
            cont1++; cont2++;
        }
        System.out.println("Se encontro "+contar+" veces la letra '"+letra+"'");
    }
    
//Método compararLongitud(String frase)
    public void compararLongitud(String frase2) {
        boolean largo;
        
        System.out.println("Ingrese otra frase");
        frase2 = leer.nextLine();
        largo = frase2.length() > longitud;
        if ( largo == true) {
            System.out.println("La segunda frase es más larga");      
        } else {
            System.out.println("La primera frase es más larga");
        }
         
    }
    
//Método unirFrases(String frase)
    public void unirFrases (String frase2) {
        StringBuilder Unir = new StringBuilder();
        System.out.println("Ingrese otra frase");
        frase2 = leer.nextLine();
        frase2 = frase2.toUpperCase();
        Unir.append(frase);
        Unir.append(frase2);
        System.out.println(Unir);      
    }
    
//Método reemplazar(String letra)
    public String reemplazar(String letra){
        System.out.println("Ingrese una letra");
        letra = leer.next();
        letra = letra.toUpperCase();
       String reemplazaF = "";
        for (int i = 0; i != this.frase.length(); i++) {
            if (this.frase.substring(i,i+1).equals("A")) {
                reemplazaF = reemplazaF.concat(letra);
            } else {
              reemplazaF = reemplazaF.concat(frase.substring(i,i+1));
            }  
        }
        return reemplazaF;
        } 
   
//Metodo contiene(String letra)
    public boolean contiene(String letra) {
        boolean vof = false;
        System.out.println("Ingrese una letra para saber si esta en la frase");
        letra = leer.next();
        letra = letra.toUpperCase();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i,i+1).equals(letra)) {
                vof = true;
            break;
            } else {
            vof = false;
            }
        }
        return vof;
    }
    
       
}
 

