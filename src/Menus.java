import java.util.ArrayList;
import java.util.Scanner;
public class Menus {
    Scanner sc=new Scanner(System.in);
    int resMenuMain;
    int resMenuMaterial;
    ArrayList<String> regPrestamos=new ArrayList<String>();

    public void menuPrincipal(){
        System.out.println("======================================================");
        System.out.println("1. Agregar Material a la Libreria");
        System.out.println("2. Registrar Nuevo Prestamo");
        System.out.println("3. ");
        System.out.println("");
        System.out.println("Ingrese la opcion que desea realizar: ");
        resMenuMain=sc.nextInt();
        System.out.println("======================================================");

        if (resMenuMain==1){
            menuMaterial();
        }
        else if (resMenuMain==2){
            menuPrestamo();
        }
        else if (resMenuMain==00){
            Prestamos test=new Prestamos();
            test.Test1();
        }
        else {
            System.out.println("Opcion no valida o en desarrollo.");
        }
    }

    public void menuPrestamo(){
        String nombre;
        int tipoMat;
        int idMaterial;
        final String[] material={"Libro","Revista","Documento","Tesis","Periodico"};

        System.out.println("======================================================");
        System.out.println("Ingrese el Nombre del Solicitante: ");
        nombre=sc.next();
        System.out.println("======================================================");
        System.out.println("1. Libro");
        System.out.println("2. Revista");
        System.out.println("3. Documento");
        System.out.println("4. Tesis");
        System.out.println("5. Periodico");
        System.out.println("Ingrese el numero del documento que desea: ");
        tipoMat=sc.nextInt();
        System.out.println("======================================================");
        Material ckMat=new Material();
        idMaterial=tipoMat-1;
        System.out.println(material[idMaterial]+" disponibles para prestamo:");
        System.out.println(ckMat.registroMateriales.get());


        regPrestamos.add("["+"Nombre: "+nombre+", Tipo de Documento: "+material[idMaterial]+", Nombre Documento: "+"]");
    }

    public void menuMaterial(){
        System.out.println("======================================================");
        System.out.println("1. Agregar Libro");
        System.out.println("2. Agregar Revista");
        System.out.println("3. Agregar material.Documento");
        System.out.println("4. Agregar Tesis");
        System.out.println("5. Agregar Periodico");
        System.out.println("");
        System.out.println("Ingrese la opcion del material que desea agregar: ");
        resMenuMaterial=sc.nextInt();
        System.out.println("======================================================");

        if (resMenuMaterial==1){
            //Material agregarLibro=new Libro();
            Libro agregarLibro2=new Libro();

            //agregarLibro.addTitulo();
            //agregarLibro.addAutor();
            //agregarLibro.addPublicacion();
            //agregarLibro2.addEditorial();
            //agregarLibro2.addPaginas();
            //System.out.println("Libro agregado con exito!");
            agregarLibro2.ingLibro();
        }
        else if (resMenuMaterial==2){
            Material agregarRevista=new Revista();
            Revista agregarRevista2=new Revista();

            agregarRevista.addTitulo();
            agregarRevista.addAutor();
            agregarRevista.addPublicacion();
            agregarRevista2.addCategoria();
            agregarRevista2.addPaginas();

            System.out.println("Revista agregada con exito!");
        }
        else if (resMenuMaterial==3){
            Material agregarTesis=new Tesis();
            Tesis agregarTesis2=new Tesis();

            agregarTesis.addTitulo();
            agregarTesis.addAutor();
            agregarTesis.addPublicacion();
            agregarTesis2.addTipoTesis();
            agregarTesis2.addInstitucion();
            agregarTesis2.addPais();

            System.out.println("Tesis agregada con exito!");
        }
        else if (resMenuMaterial==4){
            Material agregarDocumento=new Documento();
            Documento agregarDocumento2=new Documento();

            agregarDocumento.addTitulo();
            agregarDocumento.addAutor();
            agregarDocumento.addPublicacion();
            agregarDocumento2.addPaginas();

            System.out.println("Documento agregado con exito");
        }
        else if (resMenuMaterial==5){
            Material agregarPeriodico=new Periodico();
            Periodico agregarPeriodico2=new Periodico();

            agregarPeriodico.addTitulo();
            agregarPeriodico.addAutor();
            agregarPeriodico.addPublicacion();
            agregarPeriodico2.addNombrePeriodico();
            agregarPeriodico2.addFecha();
            agregarPeriodico2.addPaginas();

            System.out.println("Periodico agrgado con exito!");
        }
        else {
            System.out.println("Opcion no valida.");
        }
    }
}
