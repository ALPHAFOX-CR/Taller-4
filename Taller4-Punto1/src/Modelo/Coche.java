
package Modelo;
import java.util.Scanner;

public class Coche {

    private static String ColorCoche = " Negro ";
    private static String MarcaCoche = " Lamborghini ";
    private static String Matricula = " JDK-234 ";
    private int Modelo;
    private int CaballosFuerza;
    private int NumPuertas;
    
    
    public Coche(){
        this.Modelo = 2005;
        this.CaballosFuerza = 350;
        this.NumPuertas = 2;
    }
    
    public static String getColorCoche() {
        return ColorCoche;
    }
    public static void setColorCoche(String aColorCoche) {
        ColorCoche = aColorCoche;
    }
    public static String getMarcaCoche() {
        return MarcaCoche;
    }
    public static void setMarcaCoche(String aMarcaCoche) {
        MarcaCoche = aMarcaCoche;
    }
    public int getModelo() {
        return Modelo;
    }
    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }
    public int getCaballosFuerza() {
        return CaballosFuerza;
    }
    public void setCaballosFuerza(int CaballosFuerza) {
        this.CaballosFuerza = CaballosFuerza;
    }
    public int getNumPuertas() {
        return NumPuertas;
    }
    public void setNumPuertas(int NumPuertas) {
        this.NumPuertas = NumPuertas;
    }
    public static String getMatricula() {
        return Matricula;
    }
    public static void setMatricula(String aMatricula) {
        Matricula = aMatricula;
    }
    
    public static String PruebaCoche(){
        Scanner Modificar = new Scanner(System.in);
        
        int Modelo;
        int CaballosFuerza;
        int NumPuertas;
    
    
        System.out.print("Escriba El Nuevo Color Del Coche : ");
        ColorCoche = Modificar.nextLine();
        System.out.print("Escriba La Nueva Marca Del Coche : ");
        MarcaCoche = Modificar.nextLine();
        System.out.print("Escriba La Nueva Matricula Del Coche : ");
        Matricula = Modificar.nextLine();
        System.out.print("Escriba El Nuevo Modelo : ");
        Modelo = Modificar.nextInt();
        System.out.print("Escriba Los Nuevos Caballos De Fuerza : ");
        CaballosFuerza = Modificar.nextInt();
        System.out.print("Escriba El Nuevo Numero De Puertas : ");
        NumPuertas = Modificar.nextInt();
        System.out.println("------------------------------------");
        System.out.println("Color Nuevo : " + ColorCoche);
        System.out.println("Marca Nueva : " + MarcaCoche);
        System.out.println("Matricula Nueva : " + Matricula);
        System.out.println("Modelo Nuevo : " + Modelo);
        System.out.println("Caballos De Fuerza Nuevos : " + CaballosFuerza);
        System.out.println("Numero De Puertas Nuevas : " + NumPuertas);
        System.out.println();
        return "-------- Modificado --------";
    }
    
}
