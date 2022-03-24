
package Vista;
import Modelo.*;

public class ClasePrincipal {

    public static void main(String[] args) {
       CuentaBanco n = new CuentaBanco();
        System.out.println("Su Nombre Es : " + CuentaBanco.getNomCliente());
        System.out.println("Numero De Cuenta : " + n.getNoCuenta());
        System.out.println("Su Saldo Es : " + n.getSaldo());
        System.out.println("Consigno : " + n.Consignar());
        System.out.println("Retiro : " + n.Retirar());
    }
    
}
