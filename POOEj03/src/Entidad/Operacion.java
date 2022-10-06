/**
@Ejercicio 3
Crear una clase llamada Operacion que tenga como atributos privados numero1 y 
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en 
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si 
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si 
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar 
una división por cero, el método devuelve 0 y se le informa al usuario el error. 
Si no, se hace la división y se devuelve el resultado al main.
 */
package Entidad;
import java.util.Scanner;

/**
 * @author lucas
 */
public class Operacion {
    Scanner leer = new Scanner(System.in);
 
//Atributos
    private int numero1; private int numero2;
    
    
//Constructores 
    public Operacion(){
    }
    public Operacion(int numero1, int numero2) {
    this.numero1 = numero1;
    this.numero2 = numero2; 
    }
    
//Metodos Gett y Sett
    public int getNumero1() {
        return numero1;
    }
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
    public int getNumero2() {
        return numero2;
    }
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
 
//El Usuario ingresa los 2 numeros acá
    public Operacion CrearOperacion() {
        
        System.out.println("Ingrese el primer numero");
        numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2 = leer.nextInt();
       
    return null;
    }
  
//Calculadores 
    public int Sumar() {
    return this.numero1 + this.numero2;
    }
    public int Restar() {
    return this.numero1 - this.numero2;
    }
    public int Multiplicar() {
    return this.numero1 * this.numero2;    
    }  
    public double Dividir() {
    return this.numero1 / this.numero2;
    }

//Muestra los resultados en pantalla
    @Override
    public String toString() {
    return "\nLa suma de "+numero1+" y "+numero2+" Es= "+Sumar()+ 
            "\nLa resta de "+numero1+" y "+numero2+" Es= "+Restar()+ 
            "\nLa multiplicacion de "+numero1+" y "+numero2+" Es= "+Multiplicar()+ 
            "\nLa division de "+numero1+" y "+numero2+" Es= "+Dividir();
    }
}
