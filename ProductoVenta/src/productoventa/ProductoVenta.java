
package productoventa;


public class ProductoVenta {

    
    public static void main(String[] args) {
        Producto[] pro=new Producto[3];
        
        pro[0]=new Producto("Producto 1", 10);
        pro[1]=new Precedero(2, "Producto 2", 10);
        pro[2]=new No_precederos("Tipo 1", " Producto 3", 5);
        
        double total=0;
        
        for(int i=0; i<pro.length; i++)
        {
           total=pro[i].calcular(5); 
           System.out.println("El valor del producto es:  "+total);
        }
    }
    
}
