
package Vista;
import Modelo.*;

public class ClasePrincipal {

    public static void main(String[] args) {
        TrianguloIsoceles r = new TrianguloIsoceles();
        System.out.println("La Base Es : " + r.getBase());
        System.out.println("La Altura Es : " + r.getAltura());
        System.out.println("El Lado A Es: " + r.getLadoA());
        System.out.println("El Lado B Es: " + r.getLadoB());
        System.out.println("El Lado C Es: " + r.getLadoC());
        System.out.println("-----------------------------------------");
        System.out.println("El Area Es: " + r.calcularArea());
        System.out.println("El Longitud De Sus Lados Iguales Es: " + r.LadosIguales());
        System.out.println("El Perimetro Es: " + r.CalcularPerimetro());
    }
    
}
