/*
@Ejercicio 4
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con 
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la 
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la 
altura. Se deberán además definir los métodos getters, setters y constructores 
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2
 */
package Entidad;
import java.util.Scanner;

/**
 * @author lucas
 */
public class Rectangulo {
    Scanner leer = new Scanner(System.in);
    
//Atributos
    private int base; public int superficie = 0;
    private int altura; public int perimetro = 0;
    
//Construtores
    public Rectangulo(){
        base = 0;
        altura = 0;
    }
    public Rectangulo(int base, int altura){
    this.base = base;
    this.altura = altura;
    }
    
//Gett y Sett de Altura y Base
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
   
//El Usuario ingresa la base y la altura
    public Rectangulo CrearRectangulo(){
        
        System.out.print("Ingrese la Base: ");
        base = leer.nextInt();
        System.out.print("Ingrese la altura: ");
        altura = leer.nextInt();
       
        return null;      
    }
    
//Calculadores 
    public int CalcularSuperficie() {
        return this.superficie = this.base * this.altura;
    }

    public int CalcularPerimetro() {
        
        return this.perimetro = (this.base + this.altura) * 2;
    }

//Dibuja el rectangulo en pantalla
    public void DibujarRectangulo(){
        System.out.println("--------------");
        System.out.println("Dibujo del rectangulo: ");
   if( (this.base >= 0 && this.base <=100) && (this.altura >= 0 && this.altura <=100) ) {
        //Linea superior
        for (int i = 0; i < this.altura; i++) {
            System.out.print("* "); 
            for (int j = 0; j < this.base-1; j++) {
                System.out.print("* ");     
            }
            System.out.println("  ");
       }   
   }
      
    }   
    
//Muestra los resultados en pantalla
    
    @Override
    public String toString() {
    return "\nEl Perimetro es: "+perimetro+" \nLa Superficie es: "+superficie;
    }
    
    
}