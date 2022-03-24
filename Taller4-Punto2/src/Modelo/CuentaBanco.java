
package Modelo;
import java.util.Scanner;

public class CuentaBanco {

    private int NoCuenta;
    private double Saldo;

    private static String NomCliente = "Diego";
    
    public CuentaBanco(){
        this.NoCuenta = 27706900;
        this.Saldo = 500000;
    }
    public int getNoCuenta() {
        return NoCuenta;
    }
    public void setNoCuenta(int NoCuenta) {
        this.NoCuenta = NoCuenta;
    }
    public double getSaldo() {
        return Saldo;
    }
    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    public static String getNomCliente() {
        return NomCliente;
    }
    public static void setNomCliente(String aNomCliente) {
        NomCliente = aNomCliente;
    }
    
    public double Consignar(){
        
        Scanner Valor = new Scanner(System.in);
        double digito;
        double VTotal;
        System.out.print("Escriba El Valor De Desee Consignar : ");
        digito = Valor.nextDouble();
        VTotal = Saldo + digito;
        System.out.println("Nuevo Saldo En Su Cuenta : " + VTotal);
        
    return digito;
    }
    public double Retirar(){
        Scanner Sacar = new Scanner(System.in);
        double retiro;
        double VFinal;
        System.out.print("Ingrese El Valor A Retirar : ");
        retiro = Sacar.nextDouble();
        VFinal = Saldo - retiro;
        System.out.println("Nuevo Saldo En Su Cuenta : " + VFinal);
    return retiro; 
    }
}
