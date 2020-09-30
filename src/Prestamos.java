import java.awt.image.AreaAveragingScaleFilter;
import java.util.Scanner;
import java.util.ArrayList;

public class Prestamos {
    private String nombrePrestamo;
    private String apellidoPrestamo;
    Scanner sc=new Scanner(System.in);
    ArrayList<String> testNombre=new ArrayList<String>();

    public String getNombrePrestamo(){return nombrePrestamo;}
    public void Test1(){
        System.out.println("Ingrese el nombre: ");
        nombrePrestamo=sc.next();
        System.out.println("Ingrese el apellido: ");
        apellidoPrestamo=sc.next();

        testNombre.add(nombrePrestamo+", "+apellidoPrestamo);
        System.out.println(testNombre);
    }
}


