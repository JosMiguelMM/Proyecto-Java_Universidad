
package funcionario_clases.heredasas;


public abstract class Empleado {
    
    private int ide;
    private String nombre;
    private int edad;
    private double sueldo;
    public double prima=500000;

    public Empleado(int ide, String nombre, int edad, double sueldo) {
        this.ide = ide;
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }
     
   
    

     
    public int getIde() {
        return ide;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double getPrima() {
        return prima;
    }

    public void setIde(int ide) {
        this.ide = ide;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setPrima(double prima) {
        this.prima = prima;
    }

      @Override
       public String toString() {
        return "Empleado{" + "ide=" + ide + ", nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + '}';
         }

    public abstract boolean  prima();
    {
        
    }
    
           
}
