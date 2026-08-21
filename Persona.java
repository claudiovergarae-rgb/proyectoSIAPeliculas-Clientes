public abstract class Persona
/* 
abstract porque en nuestro sistema "no existen" personas sin un rol (son cliente o encargado) 
entonces, se restringe la creacion de personas con un new Persona (eso queda en manos de las sub clases)
*/
{
    private String nombre;
    private String rut;
    private int edad;

// constructores

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

//metodos

    public abstract void identificarse(); //cada sub clase debe implementar (o no, dependiendo si se convierte en una super) "su propio" identificarse

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