
package clases_vehiculos_polimorfismo;


public class Clases_vehiculos_polimorfismo {

   
    public static void main(String[] args) {
        
        Vehiculo misVehiculos[]=new Vehiculo[4];
        
        misVehiculos[0]=new Vehiculo("2020an", "Toyota", 2020, 2200);
        misVehiculos[1]=new Vehiculocarga(40, "MM3020", "Chevrolet", 2019, 6000);
        misVehiculos[2]=new Vehiculodeportivo(50, "BBB330", "Nisan", 2021, 5000);
        misVehiculos[3]=new Vehiculoturistico(2, "GGG30", "Renoult", 2018, 4000);
          
        
       for (Vehiculo vehiculos: misVehiculos) 
       {
           System.out.println(vehiculos.toString());
           System.out.println("------------------------------------------------------------------------------------------");
       }
        
    }
    
}
