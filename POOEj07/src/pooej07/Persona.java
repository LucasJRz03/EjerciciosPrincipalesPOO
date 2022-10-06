/**
@Ejercicio 7
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo 
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro 
atributo, puede hacerlo. Los métodos que se implementarán son:
* Un constructor por defecto.
* Un constructor con todos los atributos como parámetro.
* Métodos getters y setters de cada atributo.
* Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al 
usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. 
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa 
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la 
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona 
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la 
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la 
función devuelve un 1. 
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve 
un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos 
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene 
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es 
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en 
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y 
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package pooej07;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Persona {
     Scanner leer = new Scanner(System.in);
     
//Atributos 
     private String nombre; 
     private int edad;
     private String sexo;
     private double peso, altura;

//Constructores
    public Persona() {
    }
    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

//GETTERS Y SETTERS
    //NOMBRE
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //EDAD
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    //SEXO
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    //PESO 
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    //ALTURA
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
//METODO DE CREAR PERSONA
    public Persona CrearPersona() {
        
        System.out.println("Ingrese su nombre completo:");
        this.nombre = leer.nextLine();
        
        System.out.println("Ingrese la edad:");
        this.edad = leer.nextInt();
        
        System.out.println("Ingrese su sexo ('H' hombre, 'M' mujer, 'O' otro)");
        this.sexo = leer.next();
        this.sexo = this.sexo.toUpperCase();
         System.out.println(sexo);
        while( !"H".equals(sexo) && !"M".equals(sexo) && !"O".equals(sexo) ){
            System.out.println("Ingrese solamente 'H', 'M' y/o 'O'");
         this.sexo = leer.next();
         this.sexo = this.sexo.toUpperCase();
        }
        
        System.out.println("Ingrese su peso:");
        this.peso = leer.nextDouble();
        
        System.out.println("Ingrese su altura:");
        this.altura = leer.nextDouble();
         return null;
       }
    
//Metodo Calcular Edad 
    public boolean MayorDeEdad() {
        boolean mayor;
        mayor = edad >= 18;
    return mayor;
    }
    
//Método calcularIMC
    public int CalcularIMC(){
    int IMC;
    double calcularIMC = peso / (altura * altura) ;
        if (calcularIMC < 20) {           
                   IMC = -1;
        } else
            if (calcularIMC >= 20 && calcularIMC <=25) {
                IMC = 0;
            } else {
                IMC = 1;
            }
                     
      return IMC;
    }       
      
}
