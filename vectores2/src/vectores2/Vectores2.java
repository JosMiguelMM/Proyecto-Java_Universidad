
package vectores2;

import java.io.InputStream;
import java.util.Scanner;

public class Vectores2 {

   
    public static void main(String[] args) {
      Scanner sn=new Scanner(System.in);
      int vector[];
      int resultado = 0;
      vector=new int [10];
      
       for(int i=0;i<vector.length;i++)
       {   vector[i]=sn.nextInt();
         resultado=resultado+vector[i];
        
       
       }
       System.out.println("la suma de los vectores es  "+resultado);
      
      
      
    }
    
}
