
package operaciones.pkg2;
  import java.util.Scanner; //libreria para leer datos por pantalla

 class Operaciones2 {

   
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in); //se instancia
         double a, b;
         System.out.println("Digite el valor de a");
            a = entrada.nextDouble();
         System.out.println("Digite el valor de b");
            b=entrada.nextFloat();
         
         double suma=a+b;
         double resta=a-b;
         double multi=a*b;
         double divi=a/b;
         
          System.out.println("La suma es:  "+suma);
          System.out.println("La resta es:  "+resta);
          System.out.println("La multiplicacion  es:  "+multi);
          System.out.println("La division es:  "+divi);
         
    }
    
}
