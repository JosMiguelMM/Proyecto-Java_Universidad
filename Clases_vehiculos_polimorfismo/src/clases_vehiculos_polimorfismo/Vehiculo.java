
package clases_vehiculos_polimorfismo;


public class Vehiculo {
    
  private String matricula;
  private String marca;
  private int modelo;
  private int cilindreje;  

    public Vehiculo(String matricula, String marca, int modelo, int cilindreje) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindreje = cilindreje;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public int getCilindreje() {
        return cilindreje;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setCilindreje(int cilindreje) {
        this.cilindreje = cilindreje;
    }

    @Override
    public String toString() {
        return "Vehiculo" +"   " + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", cilindreje=" + cilindreje + "  " ;
    }
  
  
    
    
}
