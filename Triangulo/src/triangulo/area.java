
package triangulo;

public class area {
      
    private double altura;
    private double base;
    private double lado1;
    private double lado2;
    private double lado3;
    private double ladocuad;

    public area(double altura, double base, double lado1, double lado2, double lado3, double ladocuad) {
        this.altura = altura;
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.ladocuad = ladocuad;
    }
   
    
   

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
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

    public double getLadocuad() {
        return ladocuad;
    }
    
    

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
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

    public void setLadocuad(double ladocuad) {
        this.ladocuad = ladocuad;
    }
    
    
    
    public double area1()
    {
       
      return  (base*altura)/2;  
    }
    
    public double  perimetro()
            {
        return lado1+lado2+lado3;}
    
    public double  pericua()
            {
        return ladocuad+ladocuad+ladocuad+ladocuad;}
    
    public double  areacua()
            {
        return ladocuad*ladocuad;}
    
}

   
    
    
    
    
                

