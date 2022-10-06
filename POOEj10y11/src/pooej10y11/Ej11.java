/**
@Ejercicio 11
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la 
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase 
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al 
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date, 
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se 
puede conseguir instanciando un objeto Date con constructor vacío. 
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date()
 */
package pooej10y11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       int dia, mes, anio;
        Date fechaActual = new Date();
        
        System.out.println("Ingrese Dia");
        dia = leer.nextInt();
        System.out.println("Ingrese Mes");
        mes = leer.nextInt()-1;
        System.out.println("Ingrese Año");
        anio = leer.nextInt()-1900;
         Date fecha = new Date(anio, mes, dia);
         
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Fecha ingresada:");
        System.out.println(sdf.format(fecha));
        System.out.println("Fecha Actual:");
        System.out.println(sdf.format(fechaActual));
       
        if (fecha.getYear() > fechaActual.getYear()) {
            System.out.println("La diferencia del año ingresado con el año actual es "+ (fecha.getYear() - fechaActual.getYear()));
        } else {
              System.out.println("La diferencia del año ingresado con el año actual es "+ (fechaActual.getYear() - fecha.getYear()));      
                    }
            
        }
    }
    
