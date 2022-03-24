
package Modelo;
import java.util.Scanner;


public class DatosLibros {
    
    private String Titulo;
    private String PriNombre;
    private String SegNombre;
    private String PriApellido;
    private int ISBN;
    private int NumPaginas;
    private String Edition;
    private String Ciudad;
    private String Pais;
    private String FechaPublicacion;
    
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    public String getPriNombre() {
        return PriNombre;
    }
    public void setPriNombre(String PriNombre) {
        this.PriNombre = PriNombre;
    }
    public String getSegNombre() {
        return SegNombre;
    }
    public void setSegNombre(String SegNombre) {
        this.SegNombre = SegNombre;
    }
    public String getPriApellido() {
        return PriApellido;
    }
    public void setPriApellido(String PriApellido) {
        this.PriApellido = PriApellido;
    }
    public int getISBN() {
        return ISBN;
    }
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    public int getNumPaginas() {
        return NumPaginas;
    }
    public void setNumPaginas(int NumPaginas) {
        this.NumPaginas = NumPaginas;
    }
    public String getEdition() {
        return Edition;
    }
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }
    public String getCiudad() {
        return Ciudad;
    }
    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }
    public String getPais() {
        return Pais;
    }
    public void setPais(String Pais) {
        this.Pais = Pais;
    }
    public String getFechaPublicacion() {
        return FechaPublicacion;
    }
    public void setFechaPublicacion(String FechaPublicacion) {
        this.FechaPublicacion = FechaPublicacion;
    }
    
    
    public static String Libros(){
        Scanner Editar = new Scanner(System.in);
        int N;
        
        System.out.print("Digite La Cantidad De Libros Que Desea Agregar : ");
        N = Editar.nextInt();
        
        String[] ISBN = new String[N];
        String[] NumPaginas = new String[N];
        String[] TituloLibro = new String[N];
        String[] PriNombre = new String[N];
        String[] SegNombre = new String[N];
        String[] PriApellido = new String[N];
        String[] Editorial = new String[N];
        String[] Ciudad = new String[N];
        String[] Pais = new String[N];
        String[] FechaPublicacion = new String[N];
        
        for(int i = 0; i < N; i++){
            System.out.println("-----------------------------------");
            System.out.print("Digite El Titulo : ");
            TituloLibro[i] = Editar.nextLine();
            System.out.print("Digite El Primer Nombre : ");
            PriNombre[i] = Editar.nextLine();
            System.out.print("Digite El Segundo Nombre : ");
            SegNombre[i] = Editar.nextLine();
            System.out.print("Digite El Primer Apellido : ");
            PriApellido[i] = Editar.nextLine();
            System.out.print("Digite El ISBN : ");
            ISBN[i] = Editar.nextLine();
            System.out.print("Digite El Numero De Paginas : ");
            NumPaginas[i] = Editar.nextLine();
            System.out.print("Digite El Nombre De La Editorial : ");
            Editorial[i] = Editar.nextLine();
            System.out.print("Digite La Ciudad : ");
            Ciudad[i] = Editar.nextLine();
            System.out.print("Digite El Pais : ");
            Pais[i] = Editar.nextLine();
            System.out.print("Digite La Fecha De Publicacion : ");
            FechaPublicacion[i] = Editar.nextLine();
            
            System.out.println("-----------------------------------");
            
        }
        System.out.println(" ------------ LIBROS GUARDADOS ------------ ");
        
        for(int i = 0; i < N; i++){
            System.out.println("TITULO DEL LIBRO " +(i + 1)+ " : " + TituloLibro[i]);
            System.out.println("PRIMER NOMBRE DEL AUTOR DEL LIBRO " +(i + 1)+ " : " + PriNombre[i]);
            System.out.println("SEGUNDO NOMBRE DEL AUTOR DEL LIBRO " +(i + 1)+ " : " + SegNombre[i]);
            System.out.println("PRIMER APELLIDO DEL AUTOR DEL LIBRO " +(i + 1)+ " : " + PriApellido[i]);
            System.out.println("ISBN DEL LIBRO " +(i + 1)+ " : " + ISBN[i]);
            System.out.println("NUMERO DE PAGINAS DEL LIBRO " +(i + 1)+ " : " + NumPaginas[i]);
            System.out.println("NOMBRE DE LA EDITORIAL DEL LIBRO " +(i + 1)+ " : " + Editorial[i]);
            System.out.println("CIUDAD DEL LIBRO " +(i + 1)+ " : " + Ciudad[i]);
            System.out.println("PAIS DEL LIBRO " +(i + 1)+ " : " + Pais[i]);
            System.out.println("FECHA DE PUBLICACION DEL LIBRO " +(i + 1)+ " : " + FechaPublicacion[i]);
            System.out.println("----------------------------------------------------");
        }
    return "-------------------- AGREGADOS --------------------\n";
    }
    
}
