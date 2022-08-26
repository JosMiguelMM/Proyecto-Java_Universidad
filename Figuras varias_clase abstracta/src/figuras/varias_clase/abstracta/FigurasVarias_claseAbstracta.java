
package figuras.varias_clase.abstracta;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

public class FigurasVarias_claseAbstracta {
   
   static ArrayList<Poligono1> poligono1 = new ArrayList<Poligono1>();
    Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        //metodo invocar Poligono1
        invocarPoligono();
        // metodo invocar resultados
        invocarResultados();
      }
    public static void invocarPoligono()
    {Scanner entrada = new Scanner(System.in);
      char opcion;
      int  opc;
        do {
            do{
                System.out.println("Digite el tipo de poligono");
                System.out.println("1-Digite el tipo de triangulo");
                System.out.println("2-Digite el tipo Rectangulo");
                System.out.println("3-Digite el tipo de Circunferencia");
                opc = entrada.nextInt();
               }while(opc<1 || opc > 3);
               switch(opc)
               {case 1:
                     invocarTriangulo1();
                     break;
                case 2:
                     invocarRectangulo1();
                     break;
                case 3: 
                     invocarCircunferencia1();
                     break;
               }
              System.out.println("desea introducir otro poligono digite s/n");
                 opcion = entrada.next().charAt(0);
        }while(opcion =='s' || opcion == 'S');
         }
        public static void invocarTriangulo1()
       {Scanner entrada = new Scanner(System.in);
           double lado1,lado2,lado3;
           System.out.println("Digilado lado 1");
           lado1=entrada.nextDouble();
           System.out.println("Digilado lado 2");
           lado2=entrada.nextDouble();
           System.out.println("Digilado lado 3");
           lado3=entrada.nextDouble();
           Triangulo1 triangulo1 = new Triangulo1(lado1,lado2,lado3);
           poligono1.add(triangulo1);
         }
       public static void invocarRectangulo1()
       {Scanner entrada = new Scanner(System.in);
           double lado1,lado2;
           System.out.println("Digilado lado 1");
           lado1=entrada.nextDouble();
           System.out.println("Digilado lado 2");
           lado2=entrada.nextDouble();
           Rectangulo1 rectangulo1 = new Rectangulo1(lado1,lado2);
           poligono1.add(rectangulo1);
         }
         public static void invocarCircunferencia1()
       {Scanner entrada = new Scanner(System.in);
           double lado1;
           System.out.println("Digilado lado 1");
           lado1=entrada.nextDouble();
           Circunferencia1 circunferencia1 = new Circunferencia1(lado1);
           poligono1.add(circunferencia1);
         }
           public static void invocarResultados()
            {    for(Poligono1 polig:poligono1 )
             {
                 System.out.println(polig.toString());
                 System.out.println("el area es :"+polig.area());
                 System.out.println("---------------------------------");
          
               }
             }
}
