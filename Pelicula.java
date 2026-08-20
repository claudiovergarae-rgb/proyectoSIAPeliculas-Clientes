public class Pelicula {
    
    private String titulo;
    private String autor;
    private String genero;
    private int estrenoYear;
    private int idPelicula;
    private int cantPrestamos;
    private int copiasDisponibles;

    public Pelicula() {
        this.titulo = "";
        this.autor = "";
        this.genero = "";
        this.estrenoYear = 0;
        this.idPelicula = 0;
        this.cantPrestamos = 0;
        this.copiasDisponibles = 0;
    }

    public Pelicula(String titulo, String autor, String genero, int estrenoYear, int idPelicula, int copiasDisponibles) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.estrenoYear = estrenoYear;
        this.idPelicula = idPelicula;
        this.cantPrestamos = 0;
        this.copiasDisponibles = copiasDisponibles;
    }

    public boolean prestar() {
        if (copiasDisponibles > 0) {
            copiasDisponibles --;
            cantPrestamos++;
            return true;

        } else {
            System.out.println("No hay copias disponibles."); //Cambiar esto al main si es posible
            return false;

        }
    }
    public void devolver() {
        copiasDisponibles ++;
    }


    
    
    //getter y setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEstrenoYear() {
        return estrenoYear;
    }

    public void setEstrenoYear(int estrenoYear) {
        this.estrenoYear = estrenoYear;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public int getCantPrestamos() {
        return cantPrestamos;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public void setCopiasDisponibles(int copiasDisponibles) {
        this.copiasDisponibles = copiasDisponibles;
    }
}