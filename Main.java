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
            System.out.println("3 - Menu empleados");
            System.out.printf("Ingrese la opcion a elegir: ");

            opcion = Integer.parseInt(lector.readLine());

            switch(opcion){
                case 1:
                    menuPelicula(lector, arrayListCatalogo);
                    break;
                case 2:
                    menuCliente(lector, mapaClientes);
                    break;
                case 3:
                    System.out.println("Aun no implementado");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }while(opcion != 0);

    }

    public static void menuCliente (BufferedReader lector, HashMap<String,Cliente> mapaClientes) throws IOException {
        /* 
        AGREGAR
        QUITAR
        MOSTRAR
         */

        int opcion;

        do
        {

            System.out.println("0 - Salir");
            System.out.println("1 - Agregar cliente");
            System.out.println("2 - Quitar cliente");
            System.out.println("3 - Mostrar cliente");
            System.out.println("4 - Acciones cliente");
            System.out.printf("Ingrese la opcion a elegir: ");

            opcion = Integer.parseInt(lector.readLine());


            switch(opcion){

                case 1:
                    String nombre, rut;
                    int edad;

                    System.out.printf("Ingrese nombre: ");
                    nombre = lector.readLine();

                    System.out.printf("Ingrese rut: ");
                    rut = lector.readLine();

                    System.out.printf("Ingrese edad: ");
                    edad = Integer.parseInt(lector.readLine());

                    Cliente nuevoCliente = new Cliente(nombre, rut, edad);
                    mapaClientes.put(rut, nuevoCliente);

                    break;

                case 2:

                    System.out.printf("Ingrese rut: ");
                    rut = lector.readLine();

                    if(mapaClientes.containsKey(rut))
                    {
                        mapaClientes.remove(rut);
                        System.out.println("Cliente eliminado");
                        
                    }else System.out.println("Cliente no existe");
                    break;

                case 3:

                    System.out.printf("Ingrese rut: ");
                    rut = lector.readLine();

                    if(mapaClientes.containsKey(rut))
                    {
                        Cliente mostrar = mapaClientes.get(rut);

                        System.out.println("\nNombre: "+mostrar.getNombre());
                        System.out.println("Rut: "+mostrar.getRut());
                        System.out.println("Cantidad atrasos: "+mostrar.getCantAtrasos());
                        if(mostrar.isAptoPrestamos()) System.out.println("Cliente apto para prestamos");
                        else System.out.println("Cliente NO apto para prestamos");
                        System.out.println("Multa actual: "+mostrar.getMultaAcumulada());
                        System.out.println();

                        
                    }else System.out.println("Cliente no existe");
                    break;
                
                case 4:

                    accionesCliente(lector, mapaClientes);
                    
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        }while(opcion != 0);
        
    }

    public static void accionesCliente(BufferedReader lector, HashMap<String,Cliente> mapaClientes) throws IOException
    {
        int opcion;

        do
        {
            System.out.println("0 - Salir");
            System.out.println("1 - Prestar pelicula");
            System.out.println("2 - Recibir pelicula");
            System.out.println("3 - ");
            System.out.printf("Ingrese la opcion a elegir: ");

            opcion = Integer.parseInt(lector.readLine());

            switch(opcion){
                case 1:

                    System.out.println("Aun no implementado");

                    // pedirPelicula();
                    break;
                case 2:
                    System.out.println("Aun no implementado");
                    break;
                case 3:
                    System.out.println("Aun no implementado");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }while(opcion != 0);

    }

    public static void menuPelicula (BufferedReader lector, ArrayList<Pelicula> catalogo) throws IOException {

        int opcion;

        do
        {
            System.out.println("0 - Salir");
            System.out.println("1 - Agregar pelicula");
            System.out.println("2 - Quitar pelicula");
            System.out.println("3 - Mostrar catalogo");
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

                System.out.println("\n_________________________\n");

                for(int i = 0 ; i < catalogo.size() ; i++)
                {
                    Pelicula act = catalogo.get(i);
                    
                    System.out.println("ID: "+act.getIdPelicula());
                    System.out.println("Titulo: "+act.getTitulo());
                    System.out.println("Año: "+act.getEstrenoYear());
                    System.out.println("Genero: "+act.getGenero());
                    System.out.println("Copias disponibles: "+act.getCopiasDisponibles());

                    System.out.println("\n_________________________\n");

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
