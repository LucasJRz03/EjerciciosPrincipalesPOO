/**
@Ejercicio 6
 Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad 
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos: 
* Constructor predeterminado o vacío
* Constructor con la capacidad máxima y la cantidad actual 
* Métodos getters y setters.
* Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
* Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la 
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El 
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
cuanto quedó la taza. 
* Método vaciarCafetera(): pone la cantidad de café actual en cero. 
* Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo 
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Entidad;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Cafetera {
    Scanner leer = new Scanner(System.in);

//Atributos
    public int capacidadMaxima = 50; 
    public int capacidadActual = 2;

//Construtores
    public Cafetera() {
    }
    public Cafetera(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

//Metodo Getter y Setter
    //Capacidad Maxima
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    //Capacidad Minima
    public int getCapacidadActual() {
        return capacidadActual;
    }
    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
 
//Método Llenar Cafetera   
    public void LlenarCafetera() {     
    capacidadActual = capacidadMaxima;          
    }

//Método Vaciar Cafetera 
    public void VaciarCafetera() {
    capacidadActual = 0;
    }
    
//Método agregarCafe
    public void AgregarCafe(int agregar) {       
        if (agregar > capacidadMaxima) {
            System.out.println("¡¡Vaya, rebaso la capacidad de la cafetera. La cafetera se llenara hasta su maximo!!");
            capacidadActual = capacidadMaxima;     
        }  
    }
    
//Método Servir Taza
    public int ServirCafe(int tamaño) {    
        
        while (tamaño < 1 || tamaño > 3) {
            System.out.println("Ingrese una de las opciones del 1 al 3 ");
            tamaño = leer.nextInt();
        }
        //Taza de tamaño Chica
        if ( tamaño == 1) {
        int chica = 5; int taza=0;
            for (int i = 0; i < this.capacidadActual; i++) {
                taza+= 1;        
            }
           if (taza < 5) {
               System.out.println("No alcanza para llenar la taza, se sirve lo que quede.\nLa taza quedo en "+taza);
               this.capacidadActual -=taza; 
           } else 
               if (taza >= 5) {
                   System.out.println("Se lleno la taza completamente");
                   this.capacidadActual -=5;
               } 
            System.out.println("La cafetera ahora tiene "+this.capacidadActual+"/"+this.capacidadMaxima);
        }
        //Taza de tamaño Mediana
        if (tamaño == 2) {
        int mediana = 10; int taza = 0;
            for (int i = 0; i < this.capacidadActual; i++) {
                taza+=1;   
            }
            if (taza < 10) {
                System.out.println("No alcanza para llenar la taza, se sirve lo que quede.\nLa taza quedo en "+taza);
                this.capacidadActual -=taza;
            } else 
                if (taza >= 5) {
                    System.out.println("Se lleno la taza completamente");
                    this.capacidadActual -=10;
                }
            System.out.println("La cafetera ahora tiene "+this.capacidadActual+"/"+this.capacidadMaxima);
        }
        //Taza de tamaño Grande
        if (tamaño == 3) {
        int grande = 20; int taza = 0;
            for (int i = 0; i < this.capacidadActual; i++) {
                taza+=1;      
            }
            if (taza < 20){
                System.out.println("No alcanza para llenar la taza, se sirve lo que quede.\nLa taza quedo en "+taza);
                this.capacidadActual -=taza;
            } else
                if (taza >= 20) {
                    System.out.println("Se lleno la taza completamente");
                    this.capacidadActual -=20;     
            }
            System.out.println("La cafetera ahora tiene "+this.capacidadActual+"/"+this.capacidadMaxima);
        }
    return this.capacidadActual;
    }
}
