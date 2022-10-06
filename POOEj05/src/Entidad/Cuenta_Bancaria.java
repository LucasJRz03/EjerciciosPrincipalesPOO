/**
@Ejercicio 5
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: 
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las 
operaciones asociadas a dicha clase son: 
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes 
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar 
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la 
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el 
saldo actual en 0. 
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el 
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. 
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta..
 */
package Entidad;
import java.util.Scanner;

/**
 * @author lucas
 */
public class Cuenta_Bancaria {
    Scanner leer = new Scanner(System.in);
    
//Atributos
    private int DNI; 
    private int numeroCuenta;
    private int saldo;
    
//Constructores
    public Cuenta_Bancaria() {
    }
    public Cuenta_Bancaria(int DNI, int numeroCuenta, int saldo) {
        this.DNI = DNI;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

//GETTERS Y SETTERS
    //DNI DEL CLIENTE
    public int getDNI() {
        return DNI;
    }
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    //NUMERO DE CUENTA DEL CLIENTE
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    //SALDO ACTUAL DEL CLIENTE
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
//EL USUARIO INGRESA SUS DATOS
     public Cuenta_Bancaria CrearCuenta() {
         System.out.print("Ingrese su DNI= ");
         DNI = leer.nextInt();
         System.out.print("Ingrese su numero de cuenta= ");
         numeroCuenta = leer.nextInt();
         System.out.print("Ingrese su saldo actual= $");
         saldo = leer.nextInt();
     return null;
     }
 
//Metodo para ingresar dinero a su cuenta
    public double Ingresar() {
        System.out.print("-Cantidad de dinero a ingresar en su cuenta? \n$");
        double Ingresar = leer.nextInt();
        return saldo += Ingresar;
    }

//Metodo para retirar dinero de su cuenta
    public double Retirar() {
        System.out.print("-Cantidad de dinero a retirar de su cuenta? \n$");
        double Retirar = leer.nextInt();
        if (Retirar > saldo) {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("La cantida a retirar excede su saldo actual.\nSe procede a retirar todo su saldo");
            Retirar = saldo;  
            saldo -= saldo;   
            System.out.println("Cantidad retirada= $"+Retirar);
        } else {
            saldo -= Retirar;   
            System.out.println("Cantidad retirada= $"+Retirar);
         }
          return Retirar;
    }

//Metodo extracion rápida
    public double ExtraccionRapida(){
        System.out.print("Sacar solo el 20% de su sueldo como maximo. \n$");
        double extraer = leer.nextInt(); 
         
        while(extraer > 0.20*this.saldo){
            System.out.print("Usted esta intentando sacar más del 20%. \nIntente de nuevo= $");
             extraer = leer.nextInt();    
        }      
    saldo -=extraer;    
        return extraer;
    }      
   
//Método consultar Saldo
    public String ConsultarSaldo() {
        return "Su saldo actual es de $"+saldo+" Pesos";    
    }
    
//Método consultarDatos  
    public String ConsultarDatos() {
        return "\nDatos del cliente:"
                +"\nDNI ="+DNI
                +"\nNumero De Cuenta ="+numeroCuenta
                +"\nSaldo Actual ="+saldo;
    }
   
    
}
