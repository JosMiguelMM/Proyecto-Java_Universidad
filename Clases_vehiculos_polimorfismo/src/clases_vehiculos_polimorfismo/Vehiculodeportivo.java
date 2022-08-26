
package clases_vehiculos_polimorfismo;


public class Vehiculodeportivo extends Vehiculo{
    
    private int  npasajeros;

    public Vehiculodeportivo(int npasajeros, String matricula, String marca, int modelo, int cilindreje) {
        super(matricula, marca, modelo, cilindreje);
        this.npasajeros = npasajeros;
    }

   

    

    public int getNpasajeros() {
        return npasajeros;
    }

    public void setNpasajeros(int npasajeros) {
        this.npasajeros = npasajeros;
    }

    @Override
    public String toString() {
        return super.toString()  + "npasajeros=" + npasajeros ;
    }
    
    
    
}
