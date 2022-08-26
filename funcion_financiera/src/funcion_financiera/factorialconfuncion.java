
package funcion_financiera;

import java.util.Scanner;


public class factorialconfuncion {

    
    public static void main(String[] args) {
        Scanner sn=new Scanner (System.in);
        int fact=1;
        
        Factorial();
    }
    public static void Factorial()
    { Scanner sn=new Scanner (System.in);
        int n , fact=1;
        
        System.out.println("Digite el valor de n para calcular el factorial");
          n=sn.nextInt();
      for(int i=1; i<=n; i++)
        {
          fact=fact*i;
          System.out.println("El factorial es:  " +fact);
       
         }
      
     }
}
