public class Pelicula {
    
    private String titulo;
    private String autor;
    private String genero;
    private int estrenoYear;
    private int idPelicula;
    private int cantPrestamos;
    private boolean disponible;

    public Pelicula() {
        this.titulo = "";
        this.autor = "";
        this.genero = "";
        this.estrenoYear = 0;
        this.idPelicula = 0;
        this.cantPrestamos = 0;
        this.disponible = false;
    }

    public Pelicula(String titulo, String autor, String genero, int estrenoYear, int idPelicula) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.estrenoYear = estrenoYear;
        this.idPelicula = idPelicula;
        this.cantPrestamos = 0;
        this.disponible = true;
    }

    public void prestar() {
        if (disponible) {
            this.disponible = false;
            this.cantPrestamos++;
        } else 
            System.out.println("La película ya está prestada.");
    }

    public void devolver() {
        this.disponible = true;
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

    public boolean isDisponible() {
        return disponible;
    }
}