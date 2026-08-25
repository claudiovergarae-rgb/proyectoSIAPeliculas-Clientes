import java.io.*;
import java.util.*;

public class Main
{
    public static void main (String arr[]) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Pelicula> arrayListCatalogo = new ArrayList<>();
        HashMap<String,Cliente> mapaClientes = new HashMap<>();
        int opcion;

        do
        {

            System.out.println("0 - Salir");
            System.out.println("1 - Menu peliculas");
            System.out.println("2 - Menu clientes");
            System.out.printf("Ingrese la opcion a elegir: ");

            opcion = Integer.parseInt(lector.readLine());

            switch(opcion){
                case 1:
                    menuPelicula(lector, arrayListCatalogo);
                    break;
                case 2:
                    menuCliente(lector, mapaClientes);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }while(opcion != 0);

    }

    public static void menuCliente (BufferedReader lector, HashMap<String,Cliente> clientes) throws IOException {
        /* 
        AGREGAR
        QUITAR
        MOSTRAR
         */
        System.out.println("Metodo vacio...");

    }

    public static void menuPelicula (BufferedReader lector, ArrayList<Pelicula> catalogo) throws IOException {

        int opcion;

        do
        {
            System.out.println("0 - Salir");
            System.out.println("1 - Agregar pelicula");
            System.out.println("2 - Quitar pelicula");
            System.out.println("3 - Mostrar peliculas");
            System.out.printf("Ingrese la opcion a elegir: ");

            opcion = Integer.parseInt(lector.readLine());

            if(opcion == 1)
            {
                String titulo, autor, genero;
                int estrenoYear, idPelicula, copiasDisponibles;

                System.out.printf("Ingrese titulo: ");
                titulo = lector.readLine();

                System.out.printf("Ingrese autor: ");
                autor = lector.readLine();

                System.out.printf("Ingrese genero: ");
                genero = lector.readLine();

                System.out.printf("Ingrese año de publicacion: ");
                estrenoYear = Integer.parseInt(lector.readLine());

                System.out.printf("Ingrese id: ");
                idPelicula = Integer.parseInt(lector.readLine());
                
                System.out.printf("Ingrese cantidad de copias en stock: ");
                copiasDisponibles = Integer.parseInt(lector.readLine());

                Pelicula nuevaPelicula = new Pelicula(titulo, autor, genero, estrenoYear, idPelicula, copiasDisponibles);
                agregarOrdenado(catalogo, nuevaPelicula);

            }
            else if(opcion == 2)
            {
                int idPelicula, confirmacion;

                System.out.printf("Ingrese id de la pelicula a eliminar: ");
                idPelicula = Integer.parseInt(lector.readLine());

                Pelicula eliminar = busquedaBinariaPeliculas(catalogo,idPelicula);


                if(eliminar != null)
                {
                    System.out.println("Titulo de la pelicula: "+eliminar.getTitulo());
                    System.out.println("Desea continuar?");
                    System.out.println("1 - Si\n2 - No");
                    System.out.printf("Elija: ");
                    confirmacion = Integer.parseInt(lector.readLine());

                    if(confirmacion == 1)
                    {
                        if (catalogo.remove(eliminar))
                            System.out.println("Pelicula eliminada exitosamente");
                    }else{
                        System.out.println("Saliendo...");
                    }
                }
            }
            else if(opcion == 3)
            {
                for(int i = 0 ; i < catalogo.size() ; i++)
                {
                    Pelicula act = catalogo.get(i);
                    System.out.println("\n_________________________\n");
                    
                    System.out.println("ID: "+act.getIdPelicula());
                    System.out.println("Titulo: "+act.getTitulo());
                    System.out.println("Año: "+act.getEstrenoYear());
                    System.out.println("Genero: "+act.getGenero());
                    System.out.println("Copias disponibles: "+act.getCopiasDisponibles());


                }
            }
            
            else System.out.println("Opcion invalida");
        

        }while(opcion != 0);
        
    }


    public static void agregarOrdenado(ArrayList<Pelicula> catalogo, Pelicula nueva) {
        int i = 0;
        while (i < catalogo.size() && catalogo.get(i).getIdPelicula() < nueva.getIdPelicula()) {
            i++;
        }
        catalogo.add(i, nueva);
    }

    public static Pelicula busquedaBinariaPeliculas(ArrayList<Pelicula> catalogo, int idBuscada) {
        int p = 0, u = catalogo.size()-1, i;
        Pelicula enc = null;
        
        while ((p<=u)&&(enc == null)) {
            i=(p+u)/2;
            int idActual = catalogo.get(i).getIdPelicula();
            if (idActual == idBuscada) enc = catalogo.get(i);
            else {
                if (idActual > idBuscada) u = i-1;
                else p = i+1;
            }
        }
        return enc;
    }

        

}
