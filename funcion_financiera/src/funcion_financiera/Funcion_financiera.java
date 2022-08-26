
package funcion_financiera;

import static java.lang.Math.log;
import static java.lang.Math.pow;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Funcion_financiera {

    
    public static void main(String[] args) {
      Scanner sn=new Scanner (System.in);
      DecimalFormat df=new DecimalFormat("#.0000");
      double vf, vp, n, i;
      int opcion = 0;
        do{System.out.println("1-Valor futuro");
           System.out.println("2-Valor presente");
           System.out.println("3-Periodo o Tiempo");
           System.out.println("4-Valor interes");
           System.out.println("  ");
           System.out.println("Digite la opcion");
           opcion=sn.nextInt();
           
           switch (opcion)
           {case 1:
             {System.out.println("Digite el valor presente");
                vp=sn.nextDouble();
              System.out.println("Digite el periodo o tiempo");
                n=sn.nextDouble();
              System.out.println("Digite el interes");
                i=sn.nextDouble();
                
                  vf=vp*Math.pow((1+i),n);
              System.out.println("El valor futuro es :  "+df.format(vf));
             }break; 
              
            case 2:
             {System.out.println("Digite el valor futuro");
                vf=sn.nextDouble();
              System.out.println("Digite el periodo o tiempo");
                n=sn.nextDouble();
              System.out.println("Digite el interes");
                i=sn.nextDouble();
                
                  vp=vf*Math.pow((1+i),-n);
              System.out.println("El valor presente es  :  "+df.format(vp));
             
            
              }break;  
           
              
             case 3:
             {System.out.println("Digite el valor futuro");
                vf=sn.nextDouble();
              System.out.println("Digite el presente");
                vp=sn.nextDouble();
              System.out.println("Digite el interes");
                i=sn.nextDouble();
                
                  n=Math.log(vf/vp)/Math.log(1+i);
              System.out.println("El  periodo o tiempos es :  "+df.format(vf));
             
            
              }break;
              
              case 4:
             {{System.out.println("Digite el valor futuro");
                vf=sn.nextDouble();
              System.out.println("Digite el presente");
                vp=sn.nextDouble();
              System.out.println("Digite el perido");
                n=sn.nextDouble();
                
                 i = (double)(Math.pow((vf/vp), (1/n))-1);
                
              System.out.println("El interes es  :  "+df.format(i));
             
            
              }break;
             }
           }
        }while(opcion<5);
    }

    
}
