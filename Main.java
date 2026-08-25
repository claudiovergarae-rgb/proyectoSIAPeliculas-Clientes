import java.io.*;
import java.util.*;

public class Main
{
    public static void main (String arr[]) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Pelicula> catalogo = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        int opcion;

        do
        {

            System.out.println("0 - Salir");
            System.out.println("1 - Menu clientes");
            System.out.println("2 - Menu peliculas");
            System.out.printf("Ingrese la opcion a elegir: ");

            opcion = Integer.parseInt(lector.readLine());

            switch(opcion);
            case 1:
                menuPelicula(lector, catalogo);
                break;
            case 2:
                menuCliente(lector, clientes);
                break;
            case 0:
                System.out.println("Saliendo...");
                break;
            case default:
                System.out.println("Opcion invalida");
            
        }while(opcion != 0);

    }

    public static void menuCliente (BufferedReader lector, ArrayList<Cliente> clientes) {
        /* 
        AGREGAR
        QUITAR
        MOSTRAR
         */
    }

    public static void menuPelicula (BufferedReader lector, ArrayList<Pelicula> catalogo) {

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
                catalogo.add(nuevaPelicula);

                menuPelicula(lector, catalogo);
            }

        }while(opcion != 0);
        
    }
}