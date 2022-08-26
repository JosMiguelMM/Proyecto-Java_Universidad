
package figuras.varias_clase.abstracta;

public  class Circunsferencia extends Poligono {
    
    private  double lado1;

    public Circunsferencia(double lado1, double nmulados) {
        super(nmulados);
        this.lado1 = lado1;
      
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    @Override
    public String toString() {
        return "Circunsferencia{" + "lado1=" + lado1 + '}';
    }
    
   
    public double area()
    {double pi=3.141592653589793238462643383279;
        return Math.pow(lado1, 2)*pi;
    }
    
    
}
