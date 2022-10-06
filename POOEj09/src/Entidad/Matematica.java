/**
@Ejercicio 9
Realizar una clase llamada Matemática que tenga como atributos dos números reales con 
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un 
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el 
Math.random para generar los dos números y se guardaran en el objeto con su 
respectivos set. Deberá además implementar los siguientes métodos: 
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado 
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número
 */
package Entidad;
/**
 * @author lucas
 */
public class Matematica {
    

//Atributos
    private double numero1; 
    private double numero2;
 
//Constructores
    public Matematica(){
        
    }
    public Matematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
//Getter y Setter
    public double getNumero1() {
        return numero1;
    }
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
//Metodo Devolver Mayor
    public void devolverMayor(){     
      if (numero1 > numero2) {
            System.out.println(numero1+ " es mayor");
      } else {
            System.out.println(numero2+ " es mayor");
      }    
    }
    
//Metodo Calcular potencia
    public int calcularPotencia() {
        int potencia = 0;
        if ( numero1 > numero2) {
        potencia = (int) Math.pow(numero1, numero2);
        } else {
        potencia = (int) Math.pow(numero2, numero1);
        }
        return potencia;
    }
    
//Método Calcular raiz
    public double calcularRaiz() {
        int raiz = 0;
        if (numero1 < numero2) {
            raiz = (int) Math.sqrt(numero1);  
        } else {
            raiz = (int) Math.sqrt(numero2);
        }
        return raiz;    
    }
}