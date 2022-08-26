
package funcionario_clases.heredasas;


public class FUNCIONARIO_clasesHeredasas {

    public static void main(String[] args) {
        
        Empleado  em=new Empleado ( 999, "Juan ", 35, 3500000) {
            @Override
            public boolean prima() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        
        Comerciante co=new Comerciante(1, 999, "Juan ", 35, 350000);
        co.prima();
       
        
       Distribuidor di=new Distribuidor(3, 999, "Juan ", 35, 3500000) {};
        co.prima();
        di.prima();
        
         System.out.println(em);
         System.out.println(co);
         System.out.println(di);
    }
    
}
