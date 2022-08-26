
package figuras.varias_clase.abstracta;

public class Triangulo1 extends Poligono {
    
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo1(double lado1, double lado2, double lado3, double nmulados) {
        super(nmulados);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    @Override
    public String toString() {
        return "Triangulo1{" + "lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + '}';
    }
    
    
    @Override
    public double area()
    {
        double pp=(lado1+lado2+lado3)/3;
        return Math.sqrt((pp*(pp-lado1)*(pp-lado2)*(pp-lado3)));
    }
    
}
