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
    
    public Encargado(String nombre, String rut, double sueldoBase, String idEmpleado, String turno)
    {
        super(nombre, rut);
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
            System.out.println("Nombre: "+getNombre());
            System.out.println("Rut: "+getRut());
            System.out.println("ID de empleado: "+idEmpleado);
            System.out.println("Turno: "+turno);
            System.out.println("Sueldo: $"+sueldoBase);

        }
    }
    
    
    //getter y setter
    
	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}


    
}