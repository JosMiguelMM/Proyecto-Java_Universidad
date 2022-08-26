
package funcionario_clases.heredasas;

public abstract class Distribuidor extends Empleado{
    
    private int zona;

    public Distribuidor(int zona, int ide, String nombre, int edad, double sueldo) {
        super(ide, nombre, edad, sueldo);
        this.zona = zona;
    }
    
    public Distribuidor(int ide, String nombre, int edad, double sueldo) {
        super(ide, nombre, edad, sueldo);
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return super.toString() + "zona=" + zona + '}';
    }
    
    public boolean  prima()
       {if (super.getEdad()<30 && this.zona==3)
           {
               double nuevosueldo=super.getSueldo()+super.prima;
               super.setSueldo(nuevosueldo);
               return true;
               
           }
           
       else return false;
       }
    
}
