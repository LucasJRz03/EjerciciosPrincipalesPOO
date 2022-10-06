/**
@Ejercicio 12
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes 
métodos: 
• Agregar un método de creación del objeto que respete la siguiente firma: 
* crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al 
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la 
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
* Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener 
en cuenta que para conocer la edad de la persona también se debe conocer la fecha 
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que 
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método 
anterior.
 */
package pooej12;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author lucas
 */
public class Persona {
    Scanner leer = new Scanner(System.in);
    Date fechaActual = new Date();
    SimpleDateFormat diseñoFecha = new SimpleDateFormat("dd/MM/yyyy");
    
//Atributos
    String nombre; String nombre2; 
    Date fecha;
    
//Constructores
    public Persona() {
        
    }
    public Persona(String nombre, Date fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }
    
//Gett y Sett
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre2() {
        return nombre2;
    }
    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }
    
    
//Metodo crear Persona
    public void crearPersona() {
        System.out.println("Ingrese el nombre de la persona");
        nombre = leer.nextLine();
        System.out.println("Ingrese la fecha de nacimiento año/mes/dia");
        Date nacio = new Date(leer.nextInt()-1900, leer.nextInt()-1, leer.nextInt());
        fecha = nacio;   
    }

//Metodo que calcula la edad
    public int calcularEdad() {
      int edad = 0;
        edad = fechaActual.getYear()-fecha.getYear();
        return edad;
    }
    
//Metodo Menor que(int edad)
    public boolean menorQue(int EdadPer2) {
        boolean vof = false;
        System.out.println("Ingrese la Edad de Persona 2");
        EdadPer2 = leer.nextInt();
        vof = EdadPer2 > (fechaActual.getYear()-fecha.getYear());
        return vof;
    }
    
//Metodo Mostrar Persona
    public void mostrarPersona() {
        System.out.println("Nombre:"+nombre);
        System.out.println("Fecha de nacimiento:"+diseñoFecha.format(fecha));
    }
}
