/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bisiesto;
import java.util.Scanner;
/**
 * para encontrar el doc, tenemos que ir a la carpeta del proyecto/ dis/ doc/ y abrir el archivo index
 * @author Yo mismo
 * @version 1.0 07/11/2017
 */
/*
* @param Le damos anio, ara saber si es bisiesto o no
* @return Devuelte tru si anio es bisiesto, sino devuelve false
*/
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
