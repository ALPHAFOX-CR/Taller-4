
package Modelo;
import java.util.Scanner;


public class Informe {
        
        public double PromedioVentas;
        public int MenosVenta;
        public int MasVentas;
        public double AcomuladoVentas;
        
    public double getPromedioVentas() {
        return PromedioVentas;
    }
    public void setPromedioVentas(double PromedioVentas) {
        this.PromedioVentas = PromedioVentas;
    }
    public int getMenosVenta() {
        return MenosVenta;
    }
    public void setMenosVenta(int MenosVenta) {
        this.MenosVenta = MenosVenta;
    }
    public int getMasVentas() {
        return MasVentas;
    }
    public void setMasVentas(int MasVentas) {
        this.MasVentas = MasVentas;
    }
    public double getAcomuladoVentas() {
        return AcomuladoVentas;
    }
    public void setAcomuladoVentas(double AcomuladoVentas) {
        this.AcomuladoVentas = AcomuladoVentas;
    }
   
    public String Informes(){
        
        Scanner Valor = new Scanner(System.in);
        int N = 12;
        float Acomulado = 0;
        double Promedio = 0;
        double[] Meses = new double[N];
       
        System.out.println("-------- Informe De Cada Mes --------");
        
        for (int i = 0; i < N; i++){
        
        System.out.print("Digite El Informe Del "+(i+1)+" Mes : ");
        Meses[i] = Valor.nextDouble();
        
        }
        System.out.println("-------- Los Valores De Informes De Cada Mes Son --------");
        
        for(int i = 0; i < N; i++){
            
        System.out.println("Mes "+(i+1)+" : " + Meses[i]);
        }
        for(int i = 0; i < N; i++){
        Acomulado = (float) (Acomulado + Meses[i]);
        }
        Promedio = Acomulado/N;
        
        int Mayor = (int) Meses[0];
        int Posicion = 0;
        
        for (int i = 0; i < N; i++){
            
            if(Meses[i] > Mayor){
                Mayor = (int) Meses[i];
                Posicion = i+1;
            }
        
        }
        int Menor = (int) Meses[0];
        int Posicion2 = 0;
        
        for (int i = 0; i < N; i++){
            
            if(Meses[i] < Menor){
                Menor = (int) Meses[i];
                Posicion2 = i+1;
            }
        
        }
        System.out.println("---------------------------------");
        System.out.println("El Acomulado Del Año Es : " + Acomulado);
        System.out.println("El Promedio  Del Año Es : " + Promedio);
        System.out.println("El Numero Mayor Es : " + Mayor);
        System.out.println("Su Mes Es : " + Posicion);
        System.out.println("El Numero Menor Es : " + Menor);
        System.out.println("Su Mes Es : " + Posicion2);
        
        return " --- Finalizado --- ";
        
       }
   
       
    }
    

