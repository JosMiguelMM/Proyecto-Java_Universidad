
package figuras.varias_clase.abstracta;


public abstract class Poligono {
     
    protected double nmulados;

    public Poligono(double nmulados) {
        this.nmulados = nmulados;
    }

    public double getNmulados() {
        return nmulados;
    }

    public void setNmulados(double nmulados) {
        this.nmulados = nmulados;
    }

    @Override
    public String toString() {
        return "Poligono{" + "nmulados=" + nmulados + '}';
    }
    
    
    public abstract double area ();
    
}
