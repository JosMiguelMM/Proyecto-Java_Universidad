
package funcionario_clases.heredasas;

//extends herede de 
public class Comerciante extends Empleado {
    
    public double comision;

    public Comerciante(double comision, int ide, String nombre, int edad, double sueldo) {
        super(ide, nombre, edad, sueldo);
        this.comision = comision;
    }

    

    

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return super.toString() + "comision=" + comision + '}';
    }

    

    
   
  
    public boolean  prima()
       {if (super.getEdad()>30 && this.comision>30000)
           {
               double nuevosueldo=super.getSueldo()+super.prima;
               super.setSueldo(nuevosueldo);
               return true;
               
           }
           
       else return false;
       }
}