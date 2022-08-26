
package matriz1;

import java.util.Scanner;


public class sumamatriz {

    
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
      int matriz1[][]; 
      int matriz2[][]; 
      int matriz3[][]; 
       matriz1=new int [3][3]; 
       matriz2=new int [3][3]; 
       matriz3=new int [3][3]; 
       
       System.out.println("Cargar matriz 1");
         for (int i=0;i<matriz1.length; i++)
         {for (int j=0;j<matriz1.length; j++)
           {
            matriz1[i][j]=sn.nextInt();
            }
         }
            
        System.out.println("Cargar matriz 2");
         for (int i=0;i<matriz3.length; i++)
         {for (int j=0;j<matriz2.length; j++)
           {
            matriz2[i][j]=sn.nextInt();
            }
         }
         System.out.println("Impresion  valores de la matriz 1 ");
         for(int i=0; i<matriz1.length;i++)
         { for (int j=0; j<matriz1.length;j++)
                 {
                   System.out.print("  "+matriz1[i][j]);
                 }
              System.out.println("  ");
         }
         
         System.out.println("Impresion  valores de la matriz 2 ");
         for(int i=0; i<matriz2.length;i++)
         { for (int j=0; j<matriz2.length;j++)
                 {
                   System.out.print("  "+matriz2[i][j]);
                 }
              System.out.println("  ");
         }
         
         
         System.out.println("La suma matriz es ");
         for (int i=0;i<matriz3.length; i++)
         {for (int j=0;j<matriz3.length; j++)
           {
            matriz3[i][j] =matriz1[i][j]+matriz2[i][j];
            }
         }
         
         System.out.println("La suma de las matrices es ");
         for(int i=0; i<matriz3.length;i++)
         { for (int j=0; j<matriz3.length;j++)
                 {
                   System.out.print("  "+matriz3[i][j]);
                 }
              System.out.println("  ");
         }
    }
    
}
