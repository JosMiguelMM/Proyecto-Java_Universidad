
package matriz;

import java.util.Scanner;


public class Matriz {

    
    public static void main(String[] args) {
       
        Scanner sn=new Scanner(System.in);
        int matriz[][];
        matriz=new int[3][3];
      
       System.out.println("Digite los valores de la matriz");
       for (int i=0; i<matriz.length; i++)
       { for (int j=0; j<matriz.length; j++)
         {matriz[i][j]=sn.nextInt();
         
           
         }
           
       }
       
        for (int i=0; i<matriz.length; i++)
        { for (int j=0; j<matriz.length; j++)
         {System.out.println("Valores de la matriz   "+i+ " "+j+"    "+matriz[i][j]);
         
           
         }
           
        }
    }
    
}
