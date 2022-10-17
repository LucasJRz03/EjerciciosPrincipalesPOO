/**
@Ejercicio 3
 Vamos a realizar una clase llamada Raices, donde representaremos los valores de una 
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c. 
Hay que insertar estos 3 valores para construir el objeto a través de un método 
constructor. Luego, las operaciones que se podrán realizar son las siguientes: 
* Método getDiscriminante(): devuelve el valor del discriminante (double). El 
discriminante tiene la siguiente formula: (b^2)-4*a*c 
* Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para 
que esto ocurra, el discriminante debe ser mayor o igual que 0. 
* Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para 
que esto ocurra, el discriminante debe ser igual que 0. 
* Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles 
soluciones. 
* Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es 
en el caso en que se tenga una única solución posible. 
 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por 
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso 
de no existir solución, se mostrará un mensaje. 
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
 */
package pooejextra03;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Raices {
    Scanner leer = new Scanner(System.in);
    
    
//Atributos
    private double a, b, c;
    
//Constructores
    public Raices() {
    }
    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
//Gett y Sett
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

//CrearRaices
    public void CrearRaices(){
        System.out.print("De un valor a 'A'=");
        a = leer.nextInt();
        System.out.print("De un valor a 'B'=");
        b = leer.nextInt();
        System.out.print("De un valor a 'C'=");
        c = leer.nextInt();
    }

//Método Get Discriminante
    public double getDiscriminante() {
       double discriminante = 0;
       discriminante = Math.pow(b, 2) - 4*a*c;      
        return discriminante;
    }
    
//Método que comprueba si tiene Raices   
    public boolean verSiTieneRaices() {
        double discriminante = 0; boolean vof =false;
        discriminante = getDiscriminante();
        vof = discriminante >= 0;
        
    return vof;
    }

//Método que comprueba si tiene Raiz
    public boolean verSiTieneRaiz() {
        double discriminante = 0; boolean vof =false;
        discriminante = getDiscriminante();
        vof = discriminante == 0;
    return vof;
    }  
    
//Método Obtener Raices
    public void obtenerRaices() { 
        double Raiz1 = -b+Math.sqrt(getDiscriminante())/2*a;
        double Raiz2 = -b-Math.sqrt(getDiscriminante())/2*a;
        System.out.println("\nRaiz1="+Raiz1+ "\nRaiz2="+Raiz2);
    }
    
 //Metodo Obtener Raiz 
    public void obtenerRaiz() {
        double raiz = -b/2*a;
        System.out.println("\nRaiz="+raiz);
    }
    
//Metodo Calcular
    public void Calcular() {
        if (verSiTieneRaices()) {
            obtenerRaices();
        } else 
            if (verSiTieneRaiz()){
                obtenerRaices();
            } else{
                System.out.println("No existe una solucion");}
            
        }
    
}
