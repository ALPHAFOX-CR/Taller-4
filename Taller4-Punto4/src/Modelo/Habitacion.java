
package Modelo;

public class Habitacion {

    private double Largo;
    private double Ancho;
    private double Altura;
    
    public Habitacion(){
        this.Largo = 10;
        this.Ancho = 20;
        this.Altura = 30;
    }
    public double getLargo() {
        return Largo;
    }
    public void setLargo(double Largo) {
        this.Largo = Largo;
    }
    public double getAncho() {
        return Ancho;
    }
    public void setAncho(double Ancho) {
        this.Ancho = Ancho;
    }
    public double getAltura() {
        return Altura;
    }
    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
    
    public double EnchapePiso(){
        double Enchape;
        double EnchapeTotal;
        double DesperdicioCorte;
        Enchape = (this.Ancho * this.Largo);
        DesperdicioCorte = Enchape * 0.15;
        EnchapeTotal = Enchape + DesperdicioCorte;
        return EnchapeTotal;
    }
    public double EnchapePared(){
        double Enchape;
        double EnchapeTotal;
        double DesperdicioCorte;
        Enchape = (this.Ancho * this.Largo * this.Altura);
        DesperdicioCorte = Enchape * 0.15;
        EnchapeTotal = Enchape + DesperdicioCorte;
        return EnchapeTotal; 
    }
}
