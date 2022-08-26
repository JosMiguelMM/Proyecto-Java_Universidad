
package clases_sumar.datos;


public class operaciones {
   private int a;
   private int b;

    public operaciones(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    public void setA(int a){
       this.a=a;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    //metodos
         public int suma()
          {
             return a+b;
          }
          public int resta(){
             return a-b;
            }
           public int multi(){
            return a*b;
            }
           public int divi(){
            return a/b;
            }
}
