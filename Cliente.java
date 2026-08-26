import java.util.*;

public class Cliente extends Persona
{
    private int cantPedidos;
    private int cantAtrasos;
    private int edad;
    private double multaAcumulada;
    private ArrayList<Pelicula> peliculasEnPosesion;
    private int maximoPeliculas; // por defecto 3
    private boolean aptoPrestamos;


    //constructores

    public Cliente()
    {
        super();
        cantPedidos = 0;
        cantAtrasos = 0;
        edad = 0;
        multaAcumulada = 0;
        peliculasEnPosesion = new ArrayList<>();
        maximoPeliculas = 3;
        aptoPrestamos = true;
    }

    public Cliente(String nombre, String rut, int edad)
    {
        super(nombre, rut);
        this.edad = edad;
        cantPedidos = 0;
        cantAtrasos = 0;
        multaAcumulada = 0;
        peliculasEnPosesion = new ArrayList<>();
        maximoPeliculas = 3;
        aptoPrestamos = true;
    }


    //metodos

    public void pedirPelicula(Pelicula pelicula)
    {
        if(aptoPrestamos && peliculasEnPosesion.size() < maximoPeliculas){
            if(pelicula.prestar())
                peliculasEnPosesion.add(pelicula);
            
        }
        else System.out.println("Cliente no puede pedir.");
    }


    public void clienteDevolver(Pelicula pelicula)
    {
        if (peliculasEnPosesion.remove(pelicula))
        {
            pelicula.devolver();
        }
        else
            System.out.println("El cliente no tenia la pelicula.");
    }

    public double clientePagar(double montoPagar) //retorna el vuelto a darle al cliente
    {
        if(multaAcumulada == 0){
            System.out.println("El cliente no debe multas.");
            return montoPagar;
        }else if(montoPagar >= multaAcumulada)
        {
            double vuelto = montoPagar - multaAcumulada;
            multaAcumulada = 0;
            return vuelto;
        }else
        {
            multaAcumulada -= montoPagar;
            return 0;
        }
    }


    @Override //buena practica para sobreescribir cualquier metodo
    public void identificarse()
    {
        System.out.println("\nRol: Cliente");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Rut: "+rut);
        System.out.println("Cantidad de peliculas en posesion: "+peliculasEnPosesion.size());
        if(aptoPrestamos){
            System.out.println("El cliente puede pedir peliculas");
        }else{
            System.out.println("El cliente NO puede pedir peliculas");
        }
        System.out.println("Multa actual: $"+multaAcumulada);
        System.out.println();

        
    }



    //getter y setters

    public int getCantPedidos(){
        return cantPedidos;
    }

    public void setCantPedidos(int cantPedidos){
        this.cantPedidos = cantPedidos;
    }

    public int getCantAtrasos(){
        return cantAtrasos;
    }

    public void setCantAtrasos(int cantAtrasos){
        this.cantAtrasos = cantAtrasos;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getMaximoPeliculas(){
        return maximoPeliculas;
    }

    public void setMaximoPeliculas(int maximoPeliculas){
        this.maximoPeliculas = maximoPeliculas;
    }

    public double getMultaAcumulada(){
        return multaAcumulada;
    }

    public void setMultaAcumulada(double multaAcumulada){
        this.multaAcumulada = multaAcumulada;
    }

    public boolean isAptoPrestamos()
    {
        return aptoPrestamos;
    }

}