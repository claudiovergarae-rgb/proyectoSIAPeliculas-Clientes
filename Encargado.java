public class Encargado extends Persona
{
    private double sueldoBase;
    private String idEmpleado; //identificador de empresa
    private String turno;

    //constructores

    public Encargado()
    {
        super();
        sueldoBase = 0;
        idEmpleado = "";
        turno = "";
    }
    
    public Encargado(String nombre, String rut, int edad, double sueldoBase, String idEmpleado, String turno)
    {
        super(nombre, rut, edad);
        this.sueldoBase = sueldoBase;
        this.idEmpleado = idEmpleado;
        this.turno = turno;
    }

    // metodos

    @Override
    public void identificarse()
    {
        if(!idEmpleado.isEmpty() && idEmpleado != null)
        {
            System.out.println("Rol: Encargado");
            System.out.println("Nombre: "+nombre);
            System.out.println("Rut: "+rut);
            System.out.println("ID de empleado: "+idEmpleado);
            System.out.println("Turno: "+turno);
            System.out.println("Sueldo: $"+sueldoBase);

        }
    }



    //getter y setter
}