/**
@Ejercicio 2
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus 
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos 
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en 
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia 
que existe entre los dos puntos que existen en la clase Puntos. 
 */
package pooejextra02;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Puntos {
    Scanner leer = new Scanner(System.in);
    
//Atributos
    private double x1, y1;
    private double x2, y2;
    
//Constructores
    public Puntos() {
    }

    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
//Gett y Sett
    public double getX1() {
        return x1;
    }
    public void setX1(double x1) {
        this.x1 = x1;
    }
    public double getY1() {
        return y1;
    }
    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }
    public void setX2(double x2) {
        this.x2 = x2;
    }
    public double getY2() {
        return y2;
    }
    public void setY2(double y2) {
        this.y2 = y2;
    }
        

//Metodo crear Puntos
    public void CrearPuntos() {
        System.out.println("De un valor a x1=");
        x1 = leer.nextInt();
        System.out.println("De un valor a y1=");
        y1 = leer.nextInt();
        System.out.println("De un valor a x2=");
        x2 = leer.nextInt();
        System.out.println("De un valor a y2=");
        y2 = leer.nextInt();
    }    
    
//Calcular la distancia entre los 2 puntos
    public double Distancia() {
        double valorX = 0, valorY = 0; double raiz = 0, distancia = 0; 
        valorX = x2 - x1;
        valorY = y2 - y1;
        valorX = (int) Math.pow(valorX, 2);
        valorY = (int) Math.pow(valorY, 2);
        raiz = valorX + valorY;
        distancia = (int) Math.sqrt(raiz);
        
        return distancia;
    }
    
}
