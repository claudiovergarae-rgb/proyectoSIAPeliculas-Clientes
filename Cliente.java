import java.util.*;

public class Cliente extends Persona
{
    private int cantPedidos;
    private int cantAtrasos;
    private double multaAcumulada;
    private ArrayList<Pelicula> peliculasEnPosesion;
    private int maximoPeliculas; // por defecto 3
    private boolean aptoPrestamos;


    public Cliente()
    {
        super();
        cantPedidos = 0;
        cantAtrasos = 0;
        multaAcumulada = 0;
        peliculasEnPosesion = new ArrayList<>();
        maximoPeliculas = 3;
        aptoPrestamos = true;
    }

    public Cliente(String nombre, String rut, int edad)
    {
        super(nombre, rut, edad);
        cantPedidos = 0;
        cantAtrasos = 0;
        multaAcumulada = 0;
        peliculasEnPosesion = new ArrayList<>();
        maximoPeliculas = 3;
        aptoPrestamos = true;
    }


    public void pedirPelicula(Pelicula pelicula)
    {
        if(aptoPrestamos && peliculasEnPosesion.size() < maximoPeliculas){
            if(pelicula.prestar())
                peliculasEnPosesion.add(pelicula);
            
        }
        else System.out.println("Cliente no apto para pedir");
    }


    public void clienteDevolver(Pelicula pelicula)
    {
        if (peliculasEnPosesion.remove(pelicula))
            pelicula.devolver();
        else
            System.out.println("El cliente no tenia la pelicula");
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