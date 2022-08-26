
package triangulo;

import java.util.Scanner;


public class Triangulo {

    
    public static void main(String[] args) {
          Scanner sn=new Scanner (System.in);
         
         System.out.println("Area y perimetro del triangulo");
         System.out.println("Digite la base");
           double a=sn.nextDouble();
       
         System.out.println("Digite la altura");
           double b=sn.nextDouble();
           
         System.out.println("Digite lado1");
           double c=sn.nextDouble();
       
         System.out.println("Digite la lado2");
           double d=sn.nextDouble();
           
         System.out.println("Digite la lado2");
           double e=sn.nextDouble();
       
           
         System.out.println("Area y perimetro del triangulo"); System.out.println("Digite un lado del cuadrado");
           double f=sn.nextDouble();
         
           
      area are=new area(b, a, c, d, e, f);
        are.area1();
        are.perimetro();
        are.areacua();
        are.pericua();
     
      System.out.println("El area del triangulo es " +are.area1());
      System.out.println("El perimetro del triangulo es " +are.perimetro());
      System.out.println("El perimetro del cuadrado es " +are.pericua());
      System.out.println("El area del cuadrado es " +are.areacua());
     
      
        
    }
    
}
