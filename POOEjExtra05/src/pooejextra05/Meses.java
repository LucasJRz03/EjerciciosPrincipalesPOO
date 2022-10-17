/**
@Ejercicio 5
 Crea una clase en Java donde declares una variable de tipo array de Strings que contenga 
los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto 
de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El 
programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar 
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un 
ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado
 */
package pooejextra05;



/**
 *
 * @author lucas
 */
public class Meses {
    
    private final  String meses[] = new String[12];
    private String mesSecreto;

    public Meses(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    public Meses() {
    }

    public String getMesSecreto() {
        return mesSecreto;
    }
    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
    public boolean MesSecreto() {    
        llenarConMeses();
         boolean vof = false;
        
        for (int i = 0; i < meses.length; i++) {
            
            if (mesSecreto.equals(meses[6])) {
                System.out.println("Correcto-----------Es el mes secreto-");
                vof = true;
                break;
            } else {
                System.out.println("Incorrecto--------Intenta de nuevo-");
               break;
            }  
        }  
       return vof;
    } 
    
   
    
    private void llenarConMeses() {
        for (int i = 0; i < 12; i++) {
            
            switch (i) {
                case 0:
                    meses[i] = "enero";
                    break;
                case 1:
                    meses[i] = "febrero";
                    break;
                case 2:
                    meses[i] = "marzo";
                    break;
                case 3:
                    meses[i] = "abril";
                    break;
                case 4:
                    meses[i] = "mayo";
                    break;
                case 5:
                    meses[i] = "junio";
                    break;
                case 6:
                    meses[i] = "julio";
                    break;
                case 7:
                    meses[i] = "agosto";
                    break;
                case 8:
                    meses[i] = "septiembre";
                    break;
                case 9:
                    meses[i] = "octubre";
                    break;
                case 10:
                    meses[i] = "noviembre";
                    break;
                case 11:
                    meses[i] = "diciembre";
                    break;    
            }
        }
    }
      
}
