import java.util.Scanner;
import java.util.ArrayList;
public class Mat
        erial {
    Scanner sc = new Scanner(System.in);
    String titulo;
    String autor;
    int añoPublicacion;
    ArrayList<ArrayList> registroMateriales=new ArrayList<ArrayList>();
    ArrayList<String> registroLibro=new ArrayList<String>();

    public void addTitulo(){
        System.out.println("Ingrese el titulo del material");
    }
    public void addAutor(){
        System.out.println("Ingrese el autor del material");
    }
    public void addPublicacion(){
        System.out.println("Ingrese el año de publicacion");
    }
}

    class Libro extends Material{
        String editorial;
        int paginas;
        Boolean True;

        public void addTitulo(){
            System.out.println("Ingrese el titulo del libro: ");
            titulo=sc.next();
        }
        public void addAutor(){
            System.out.println("Ingrese el autor del libro: ");
            autor=sc.next();
        }
        public void addPublicacion(){
            System.out.println("Ingrese el año de publicacion del libro: ");
            añoPublicacion=sc.nextInt();
        }
        public void addEditorial(){
            System.out.println("Ingrese la editorial del libro: ");
            editorial=sc.next();
        }
        public void addPaginas(){
            System.out.println("Ingrese  el numero de paginas del libro: ");
            paginas=sc.nextInt();
        }

        public void regLibro(){
            Material tes=new Libro();
            Libro newLib=new Libro();


            registroLibro.add("{"+tes.titulo+", "+tes.autor+", "+tes.añoPublicacion+", "+newLib.editorial+", "+newLib.paginas+" paginas"+"}");


            registroMateriales.add(registroLibro);

            System.out.println(registroLibro);
            System.out.println("Libro agregado con exito!");
            System.out.println("Regresando al Menu Principal.");
            Menus returnMenu=new Menus();
            returnMenu.menuPrincipal();
        }

        public void ingLibro(){
            addTitulo();
            addAutor();
            addPublicacion();
            addEditorial();
            addPaginas();
            regLibro();
        }
    }


    class Revista extends Material{
        String categoria;
        int paginas;
        public void addTitulo(){
            System.out.println("Ingrese el titulo de la revista: ");
            titulo=sc.next();
        }
        public void addAutor(){
            System.out.println("Ingrese el autor de la revista: ");
            autor=sc.next();
        }
        public void addPublicacion(){
            System.out.println("Ingrese el año de publicacion de la revista: ");
            añoPublicacion=sc.nextInt();
        }
        public void addCategoria(){
            System.out.println("Ingrese la categoria de la revista: ");
            categoria=sc.next();
        }
        public void addPaginas(){
            System.out.println("Ingrese  el numero de paginas de la revista: ");
            paginas=sc.nextInt();
        }
    }


    class Tesis extends Material{
        String tipoTesis;
        String institucionTesis;
        String paisTesis;

        public void addTitulo(){
            System.out.println("Ingrese el titulo de la tesis: ");
            titulo=sc.next();
        }
        public void addAutor(){
            System.out.println("Ingrese el autor de la tesis: ");
            autor=sc.next();
        }
        public void addPublicacion(){
            System.out.println("Ingrese el año de publicacion de la tesis: ");
            añoPublicacion=sc.nextInt();
        }
        public void addTipoTesis(){
            System.out.println("Ingrese el tipo de tesis (Licenciatura, Doctorado o Maestria): ");
            tipoTesis=sc.next();
        }
        public void addInstitucion(){
            System.out.println("Ingrese la institucion proveniente de la tesis: ");
            institucionTesis=sc.next();
        }
        public void addPais(){
            System.out.println("Ingrese el pais proveniente de la tesis: ");
            paisTesis=sc.next();
        }
    }


    class Documento extends Material{
        int paginas;

        public void addTitulo(){
            System.out.println("Ingrese el titulo del documento: ");
            titulo=sc.next();
        }
        public void addAutor(){
            System.out.println("Ingrese el autor del documento: ");
            autor=sc.next();
        }
        public void addPublicacion(){
            System.out.println("Ingrese el año de pubicacion del documento: ");
            añoPublicacion=sc.nextInt();
        }
        public void addPaginas(){
            System.out.println("Ingrese la cantidad de paginas del documento: ");
            paginas=sc.nextInt();
        }
    }


    class Periodico extends Material{
        String nombrePeriodico;
        int paginas;
        int fecha;
        public void addTitulo(){
            System.out.println("Ingrese el titulo del articulo en el periodico: ");
            titulo=sc.next();
        }
        public void addAutor(){
            System.out.println("Ingrese el autor del articulo en el periodico: ");
            autor=sc.next();
        }
        public void addPublicacion() {
            System.out.println("Ingrese el año de publicacion del articulo en el periodico: ");
            añoPublicacion=sc.nextInt();
        }
        public void addNombrePeriodico(){
            System.out.println("Ingrese el nombre del periodico: ");
            nombrePeriodico=sc.next();
        }
        public void addPaginas(){
            System.out.println("Ingrese la cantidad de paginas en el articulo/periodico: ");
            paginas=sc.nextInt();
        }
        public void addFecha(){
            System.out.println("Ingrese el dia y mes (D/M) de la publicacion del periodico: ");
            fecha=sc.nextInt();
        }
    }

