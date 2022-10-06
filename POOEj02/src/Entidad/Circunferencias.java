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
package Entidad;
import java.util.Scanner;
/**
 * @author lucas
 */

public class Circunferencias {
    Scanner leer = new Scanner(System.in);
    
//Atributos
    private int radio; 
    public double Area; 
    public double Perimetro;
 
//Constructores
    public Circunferencias(){
    }
    public Circunferencias(int radio) {
        this.radio = radio;  
    }
    
//Metodos GETT y SETT de Radio.
    public int getRadio() {
        return radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }

//Calculador del Area del radio
    public void Area() {
         this.Area = Math.PI * this.radio * this.radio;
    
    }
//Calculador del Perimetro del radio
    public void Perimetro() {
     this.Perimetro = 2*Math.PI * this.radio;
    }
    
//Muestra los resultados en pantalla
    @Override
    public String toString() {
   return "El Radio es : ["+this.radio+"] \n" + " Perimetro: ["+this.Perimetro+"] \n" + " Area: ["+this.Area+"]";
}
}
