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
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package pooej05;

import Entidad.Cuenta_Bancaria;
import java.util.Scanner;


/**
 * @author lucas
 */
public class POOEj05 {
  /**
  * @param args the command line arguments
  */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cuenta_Bancaria datos1 = new Cuenta_Bancaria();      
        datos1.CrearCuenta();
        int opc;
    do {  
            System.out.println("Eliga una opcion:"
                    + "\n1. Ingresar dinero"
                    + "\n2. Retirar dinero"
                    + "\n3. Extracion rapida"
                    + "\n4. Consultar saldo"
                    + "\n5. Consultar datos"
                    + "\n6. Cambiar datos"
                    + "\n7. Salir");
                    opc = leer.nextInt();
       
        switch (opc) {
        case 1:
               datos1.Ingresar();
               break;
        case 2:
               datos1.Retirar();
               break;
        case 3: 
              datos1.ExtraccionRapida();
              break;
        case 4:
              System.out.println(datos1.ConsultarSaldo());
              break;
        case 5:
              System.out.println(datos1.ConsultarDatos());
              break;
        case 6:
              datos1.CrearCuenta();
              break;
        default:
              System.out.println("Hasta la proxima!");
        }
    } while (opc != 7);
  }    
}
