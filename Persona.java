public class Persona
{
    private String nombre;
    private String rut;
    private int edad;

    public Persona()
    {
        nombre = "";
        rut = "";
        edad = 0;
    }

    public Persona(String nombre, String rut, int edad)
    {
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
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


}