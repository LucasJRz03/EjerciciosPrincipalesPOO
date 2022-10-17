/**
@Ejercicio 6
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como 
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad 
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los 
parámetros que sean necesarios:
* Constructores, tanto el vacío como el parametrizado.
* Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con 
la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la 
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el 
valor que ingresó el usuario y encontradas en 0.
• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: 
buscar como se usa el vector.length.
• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila 
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre 
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá 
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se 
busque una letra que no esté, se le restará uno a sus oportunidades.
• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
• Método juego(): el método juego se encargará de llamar todos los métodos 
previamente mencionados e informará cuando el usuario descubra toda la palabra o 
se quede sin intentos. Este método se llamará en el main
 */
package pooejextra06;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Ahorcado {
    Scanner leer = new Scanner(System.in);
    
//Atributos
    private String Buscar[];
    private String palabra;
    private int intentos;
    int encontradas = 0;
    String letra;
 
//Constructores
    public Ahorcado() {
    }
    public Ahorcado(String palabra) {
        this.palabra = palabra;
    }

//Gett y Sett
    public String getPalabra() {
        return palabra;
    }
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getIntentos() {
        return intentos;
    }
    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

   
 
//Metodos
    public void crearJuego() {
        System.out.println("*Ingrese la palabra");
        palabra = leer.nextLine();
        palabra = palabra.toUpperCase();
        Buscar = new String[palabra.length()];
        System.out.println("*Ingrese la cantidad de intentos");
        intentos = leer.nextInt();
        
    //INGRESA LA PALABRA INGRESADA EN EL VECTOR "BUSCAR"
    String caracter; 
    int cont1 = 0; int cont2 = 1; 
    
        for (int i = 0; i < palabra.length(); i++) {
          caracter = palabra.substring(cont1, cont2);
          cont1++; cont2++;
          Buscar[i] = caracter;
        }
    }
 
//Metodo que dice si se encontro las letras que el usuario buscaba
    private boolean encontradas() {
        boolean vof = false;
        
        System.out.println("*Ingrese una letra");
        letra = leer.next();
        letra = letra.toUpperCase();
        for (int i = 0; i < Buscar.length; i++) {
            if (letra.equals(Buscar[i])) {
                encontradas++;   
                vof = true;
                System.out.println("#En posicion "+(i+1));
            }        
        } 
        System.out.println("_Encontradas="+encontradas+"\n_Faltan="+(Buscar.length-encontradas));    
    return vof;
    }
        
//Metodo que busca si contiene la letra 
    public void buscar() {
        letra = letra.toUpperCase();
        boolean vof = false;
        for (int i = 0; i < Buscar.length; i++) {
            if (letra.equals(Buscar[i])) {
                vof = true;
               break;
            } 
        }
        if (vof) {
            System.out.println("-Forma parte de la palabra");       
        } else  {
            System.out.println("-No es parte de la palabra");
        }    
    }
      
//Muestra la longitud de la palabra
    private void longitud() {
        System.out.println("_La longitud de la palabra es="+Buscar.length);
    } 
    
//Metodo intentos
    private void intentos() {
        System.out.println("_Intentos="+intentos);    
    }   
     
//Metodo juego que se encarga de manejar todos los demás metodos
    public void Juego() {
           crearJuego();
           
        do {
            if (encontradas() == false){
             intentos--;
            }
            buscar();
            longitud();
            intentos();
        
       } while (encontradas < palabra.length() && intentos > 0);
        System.out.println("La palabra era: "+palabra);
    }
}
