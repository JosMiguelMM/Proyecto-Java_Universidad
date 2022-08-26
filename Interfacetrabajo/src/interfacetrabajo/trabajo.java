
package interfacetrabajo;


public class trabajo {
   
private int identi;
    private String nombre;
    private String direcio;
    private String tele;
    private double sueldo;

    public trabajo(int identi, String nombre, String direcio, String tele, double sueldo) {
        this.identi = identi;
        this.nombre = nombre;
        this.direcio = direcio;
        this.tele = tele;
        this.sueldo = sueldo;
    }

    

    
 

    public double getSueldo() {
        return sueldo;
    }

    

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "trabajo{" + "identi=" + identi + ", nombre=" + nombre + ", direcio=" + direcio + ", tele=" + tele + ", sueldo=" + sueldo + '}';
    }

   

   

  

   
    
    }
    
    
    
    

