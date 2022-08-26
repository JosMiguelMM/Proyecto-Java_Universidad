
package abstracto;


public class Abstracto {

    
    public static void main(String[] args) {
        Planta planta=new Planta();
        Animal_carnivoro anicar=new Animal_carnivoro();
        Animal_hervivoro aniher=new Animal_hervivoro();
        planta.alimentarse();
        System.out.println("___________________________________________________");
        anicar.alimentarse();
        System.out.println("___________________________________________________");
        aniher.alimentarse();
    }
    
}
