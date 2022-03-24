
package Modelo;


public class TrianguloIsoceles {

    private double base;
    private double altura;
    private double LadoA;
    private double LadoB;
    private double LadoC;
    
    public TrianguloIsoceles(){
        this.base = 15;
        this.altura = 35;
        this.LadoA = 20;
        this.LadoB = base;
        this.LadoC = LadoA;
    }
    public double getBase(){
        return base;
    }
    public void setBase(double base){
        this.base = base;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getLadoA() {
        return LadoA;
    }
    public void setLadoA(double LadoA) {
        this.LadoA = LadoA;
    }
    public double getLadoB() {
        return LadoB;
    }
    public void setLadoB(double LadoB) {
        this.LadoB = LadoB;
    }
    public double getLadoC() {
        return LadoC;
    }
    public void setLadoC(double LadoC) {
        this.LadoC = LadoC;
    }
    
    public double calcularArea(){
        double Area = (this.base * this.altura)/2;
        return Area;
    }
    public double LadosIguales(){
        LadoA = LadoA;
        LadoC = LadoA;
    return LadoA;
    }
    public double CalcularPerimetro(){
        return 2 * this.LadoA + this.base ;
    }   
}
