
package javaapplication7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author portatil
 */
public class JavaApplication7 {

    
    public static void main(String[] args) {
        
     
    Scanner lector = new Scanner (System.in);
     
    //COMENTARI VOSTRE
    String[] paraules={"ATOM","MOLECULA","BIO", "PERL"};
    
   //COMENTARI VOSTRE
    String resposta, comprobar,llegit="";
    boolean valid;
    int count, encerts, pos;
    char c;
               
            
            //COMENTARI VOSTRE
            count=0;
            encerts=0;
            
            do{
                valid=false;
                
                //COMENTARI VOSTRE
              do{
                System.out.println ("Si us plau, Escriu una lletra valida");
                llegit=lector.nextLine().toUpperCase();
                if(llegit.matches("[ABCDEFGHIJKLMNÑOPQRSTUVWXYZ ]")) valid=true;
              }while(valid == false || llegit.isEmpty() || llegit==null);
              
              //COMENTARI VOSTRE
              c=llegit.toUpperCase().charAt(0);
              
              //COMENTARI VOSTRE
              comprobar =Reglas.comprobarCadena(paraules);
               pos =comprobar.indexOf(c);
              
         }while(count !=10);
        
        System.out.println("Vols continuar?(S/N)");
        resposta=lector.nextLine().toUpperCase();
    
   } 
}
