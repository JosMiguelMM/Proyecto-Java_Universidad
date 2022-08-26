
package matriz1;

import java.util.Scanner;

public class Matriz1 {

    
    public static void main(String[] args) {
        
        Scanner sn=new Scanner(System.in);
        int matriz1[][];
        matriz1=new int [4][4];
        int sumadiagonal=0, sumadiagonal1=0;
        
        System.out.println("Digite los valores de la matriz ");
         for(int i=0; i<matriz1.length;i++)
         { for (int j=0; j<matriz1.length;j++)
                 {
                  matriz1[i][j]=sn.nextInt();
                 }
              System.out.println("  ");
         }
        
         
         System.out.println("Impresion  valores de la matriz ");
         for(int i=0; i<matriz1.length;i++)
         { for (int j=0; j<matriz1.length;j++)
                 {
                   System.out.print("  "+matriz1[i][j]);
                 }
              System.out.println("  ");
         }
          //hallar la diagonal de izquierda a derecha 
         
          for(int i=0; i<matriz1.length;i++)
         { for (int j=0; j<matriz1.length;j++)
                 {
                     if(i==j)
                         {sumadiagonal = sumadiagonal+matriz1[i][j];
                    }
              System.out.println("  ");
         }
    }
    System.out.println("Resultado de la diagonal derecha a izquierda "+sumadiagonal);
 
//hallar la diagonal de  derecha a izquierda 
          for(int i=0; i<matriz1.length;i++)
         {for (int j=0; j<matriz1.length;j++)
                 {
                     if((i+j)==(matriz1.length-1))
                         {sumadiagonal1=sumadiagonal1+matriz1[i][j];
                    }
              System.out.println("  ");
         }
    }
    System.out.println("Resultado de la diagonal derecha a izquierda  "+sumadiagonal);

    }
}

