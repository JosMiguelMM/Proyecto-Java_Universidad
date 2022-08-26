
package vectores;


public class Vectores {

   
    public static void main(String[] args) {
       
        int vector[]={4, 6, 2, 10, 20, 50, 4};
        int resultado=0;
        
         for (int i=0;i<vector.length; i++)
         {resultado=resultado+vector[i];
           
          }    
         System.out.println("La suma de los datos del vector es  "+resultado);
                 
    }
    
}
