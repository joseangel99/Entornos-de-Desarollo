
package bisiesto;
import java.util.Scanner;

public class Bisiesto {
    public static boolean esBisiesto(int anio){
       if(anio % 400 == 0 || anio % 4 == 0 && anio % 100 != 0){
           return true;
        }
        else{
           return false;
        } 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int  anio;
        boolean esbisiesto;
    
        Scanner teclado;
        
        System.out.println("Introduzca el anio: ");
        teclado = new Scanner(System.in);
        anio = teclado.nextInt();
        teclado.close();
        
        esbisiesto = esBisiesto(anio);
        
        if(esbisiesto){
            System.out.println("Es bisiesto");
        }
        else{
            System.out.println("No es bisiesto");
        }
    }
    
}
