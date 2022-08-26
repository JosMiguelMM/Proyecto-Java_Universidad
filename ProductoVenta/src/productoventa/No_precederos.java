
package productoventa;


public class No_precederos extends Producto {
 
    private String tipo;

    public No_precederos(String tipo, String nombre, double precio) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "No_precederos{" + "tipo=" + tipo + '}';
    }
    
    
    
}
