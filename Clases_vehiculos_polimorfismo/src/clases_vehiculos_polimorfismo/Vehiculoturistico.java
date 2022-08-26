
package clases_vehiculos_polimorfismo;


public class Vehiculoturistico extends Vehiculo {
    
    private int puertas;

    public Vehiculoturistico(int puertas, String matricula, String marca, int modelo, int cilindreje) {
        super(matricula, marca, modelo, cilindreje);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return super.toString() + "puertas=" + puertas ;
    }
    
    
}
