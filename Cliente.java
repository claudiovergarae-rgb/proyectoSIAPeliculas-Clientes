import java.util.*;

public class Cliente
{
    private String nombre;
    private String rut;
    private int cantPedidos;
    private int cantAtrasos;
    private double multaAcumulada;
    private ArrayList<Pelicula> peliculasEnPosesion;
    private boolean aptoPrestamos;


    public Cliente()
    {
        nombre = "";
        rut = "";
        cantPedidos = 0;
        cantAtrasos = 0;
        multaAcumulada = 0;
        peliculasEnPosesion = new ArrayList<>();
        aptoPrestamos = true;
    }

    public Cliente(String nombre, String rut)
    {
        this.nombre = nombre;
        this.rut = rut;
        cantPedidos = 0;
        cantAtrasos = 0;
        multaAcumulada = 0;
        peliculasEnPosesion = new ArrayList<>();
        aptoPrestamos = true;
    }

    public void pedirPelicula(Pelicula pelicula)
    {
        if(aptoPrestamos)
            peliculasEnPosesion.add(pelicula);
        
        else System.out.println("Cliente no apto para pedir");
    }


    public void clienteDevolver(Pelicula pelicula)
    {
        if (peliculasEnPosesion.remove(pelicula))
            pelicula.devolver();
        else
            System.out.println("El cliente no tenía la película");
    }

    //getter y setters

    public String getNombre()
    {
        return nombre;
    } 

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getRut()
    {
        return rut;
    }

    public void setRut(String rut){
        //en caso de errores de tipeo, aunque no se si dejarlo
        this.rut = rut;
    }

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