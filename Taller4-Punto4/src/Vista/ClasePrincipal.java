
package Vista;
import Modelo.*;

public class ClasePrincipal {
    
    public static void main(String[] args) {
        Habitacion r = new Habitacion();
        System.out.println("Largo Inicil : "+ r.getLargo() + " Metros");
        System.out.println("Ancho Inicil : "+ r.getAncho() + " Metros");
        System.out.println("Altura Inicial : "+ r.getAltura() + " Metros");
        System.out.println("-----------------------");
        System.out.println("Enchape Total Para El Piso : " + r.EnchapePiso() + " Metros");
        System.out.println("Enchape Total Para La Pared : " + r.EnchapePared() + " Metros");    
    }
}
