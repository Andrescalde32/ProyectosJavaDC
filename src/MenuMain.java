import java.io.IOException;
import java.util.ArrayList;
//import java.util.Scanner;

public class MenuMain {

    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        Menus insert=new Menus();
        insert.menuPrincipal();

        ArrayList<String> baseDatosMateriales=new ArrayList<String>();
        Libro objLibros=new Libro();
        Revista objRevista=new Revista();
        Tesis objTesis=new Tesis();
        Documento objDocumentos=new Documento();
        Periodico objPeriodico=new Periodico();

        baseDatosMateriales.add(objLibros.titulo+", "+objLibros.autor+", "+objLibros.añoPublicacion+", "+objLibros.editorial+", "+objLibros.paginas+" paginas.");


    }
}
