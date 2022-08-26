
package productoventa;

public class Precedero extends Producto {
   
    private int dias_caducidar;

    public Precedero(int dias_caducidar, String nombre, double precio) {
        super(nombre, precio);
        this.dias_caducidar = dias_caducidar;
    }

    public int getDias_caducidar() {
        return dias_caducidar;
    }

    public void setDias_caducidar(int dias_caducidar) {
        this.dias_caducidar = dias_caducidar;
    }

    @Override
    public String toString() {
        return "Precedero{" + "dias_caducidar=" + dias_caducidar + '}';
    }

    public double  calcular (int cantidad)
    {
        double total=super.calcular(cantidad);
        
        switch(dias_caducidar)
                {case 1:
                    total=super.calcular(cantidad)/4;
                    break;
                    
                    case 2:
                    total=super.calcular(cantidad)/3;
                    break;
                    
                    case 3:
                    total=super.calcular(cantidad)/2;
                    break;
                }
            return total;
      
    }
    
}
