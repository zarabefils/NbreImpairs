
package  AffichageNbreImpairs ;

import java.util.Scanner;


public class AffichageNbreImpairs {

    
    public static void main(String[] args) {
        
       System.out.println("Veuillez entrer votre valeur");
       Scanner sc = new Scanner(System.in);
       int n;
       
       n = sc.nextInt();
        
        
        int i=1;
        
        System.out.println(" Voici la liste des nombres impairs plus petit que " +n );
        while (i<n){
            
        System.out.println(i);
           i=i+2;
        
         
             
  }
}
    }
        
        
        
    
    

