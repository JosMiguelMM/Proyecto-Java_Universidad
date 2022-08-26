
package clases_vehiculos_polimorfismo;


public class Vehiculocarga extends Vehiculo {
    
    private int toneladas;

    public Vehiculocarga(int toneladas, String matricula, String marca, int modelo, int cilindreje) {
        super(matricula, marca, modelo, cilindreje);
        this.toneladas = toneladas;
    }

    public int getToneladas() {
        return toneladas;
    }

    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }

    @Override
    public String toString() {
        return super.toString()+ "toneladas=" + toneladas;
    }
    
    
    
}
