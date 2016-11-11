/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication7;
import java.util.Random;
/**
 *
 * @author alumne
 */
public class Reglas {

    static String comprobarCadena(String[] paraules) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 public Reglas(){
     
        
    }
     
   public String comprobarCadena( String[] paraules, String paraula){ 
       String resposta = null;
    do{
        
           //COMENTARI VOSTRE
            Random rnd = new Random();
            int endevina=(int)(rnd.nextDouble()*paraules.length);
           
           //COMENTARI VOSTRE
            paraula=paraules[endevina];
                   
            System.out.println("La paraula que has d'encertar té "+paraula.length()+" lletres");

            //Creo l'array de caràcters que mostraran les encertades
            char lletres[]=new char[paraula.length()];
               for(int i=0;i<paraula.length();i++){
              lletres[i] ='_';
                }
    
       }while(resposta.equals("S"));
      return paraula;
 } 
   
   
   
   
   /*
   public String comprobarVidas( String[] paraules, String paraula){ 
         int count = 0, encerts = 0, pos = 0;
          char c = 0;
          char lletres = 0;
         //COMENTARI VOSTRE
              if (pos == -1) {
                   count++;
                   System.out.println("Aquesta lletra no es troba dins de la paraula. Ara et queden "+ (10-count)+ " intents");
                   //COMENTARI VOSTRE
                   if(count == 10) System.out.println("Has esgotat tots els intents");
               } 
              else {                        
                        //COMENTARI VOSTRE
                       for(int i=0;i<lletres.length;i++){
                           if(paraula.charAt(i) == c){
                               
                               lletres[i] =c;
                              
                               encerts +=1;
                           }
                        System.out.print(lletres[i]+" ");
                           
                       }
                  System.out.println("Molt bé!!! Torna a intentar-ho");
                  
                  if(encerts == paraula.length()){
                      System.out.println("Has acabat encertant la paraula. Felicitats!!!!");
                      count =10;
                  }

               }
    
    
   
    
    return pepe; */
    }

