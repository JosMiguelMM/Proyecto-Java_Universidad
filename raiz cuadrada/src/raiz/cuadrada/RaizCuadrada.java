
package raiz.cuadrada;
import java.util.Scanner;
public class RaizCuadrada {

  
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in); //se instancia
         
        double a,b,c, raiz, raiz1, raiz2;
        System.out.println("Digite el valor de b");
        b=entrada.nextDouble();
        
        System.out.println("Digite el valor de a");
        a=entrada.nextDouble();
        
        System.out.println("Digite el valor de c");
        c=entrada.nextDouble();
        
        raiz=(Math.pow(b, 2)-4*(a*c));
        
          if(raiz>0)
          {raiz1=(-b+raiz)/(2*a);
           raiz2=(-b-raiz)/(2*a);
         System.out.println("La raiz 1 es   "+raiz1);
         System.out.println("La raiz 2 es   " +raiz2);
          }
          
         else if(raiz==0)
                 {raiz1=-b/(2*a);
                         System.out.println("La raiz es unica  "+raiz1);
                 
                 }
         else{System.out.println("La raiz es imaginaria");
                 
         }
         } 
          
    }
    

