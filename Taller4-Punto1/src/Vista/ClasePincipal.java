
package Vista;
import Modelo.*;

public class ClasePincipal {

    public static void main(String[] args) {
        Coche c = new Coche();
        
        System.out.println("Color : " + Coche.getColorCoche());
        System.out.println("Marca : " + Coche.getMarcaCoche());
        System.out.println("Matricula : " + Coche.getMatricula());
        System.out.println("Modelo : " + c.getModelo());
        System.out.println("Caballos De Fuerza : " + c.getCaballosFuerza());
        System.out.println("Numero De Puertas : " + c.getNumPuertas());
        System.out.println("------------------------------------");
        System.out.println("           Estado          \n" + Coche.PruebaCoche());
    }
    
}
