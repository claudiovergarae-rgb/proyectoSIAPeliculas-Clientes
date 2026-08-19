import java.io.*;
import java.util.*;

public class Main
{
    public static void main (String arr[]) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Pelicula> catalogo = new ArrayList<>();
        int opcion;


        System.out.println("0 - Salir");
        System.out.println("1 - Agregar pelicula");
        System.out.printf("Ingrese la opcion a elegir: ");

        
        do
        {
            opcion = Integer.parseInt(lector.readLine());


            lector.readLine(); //limpiar buffer
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
            }
        }while(opcion != 0);

    }
}