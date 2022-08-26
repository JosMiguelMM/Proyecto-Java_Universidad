
package clases_sumar.datos;

import java.util.Scanner;

public class Clases_sumarDatos {

    
    public static void main(String[] args) {
       
        operaciones ope=new operaciones(30, 11);
        ope.suma();
        ope.resta();
        ope.multi();
        ope.divi();
        
        System.out.println("La suma de a+b es :  "+ope.suma());
        System.out.println("La resta de a-b es :  "+ope.resta());
        System.out.println("La multiplicacion de a*b es :  "+ope.multi());
        System.out.println("La división de a/b :  "+ope.divi());
    }
    
}
