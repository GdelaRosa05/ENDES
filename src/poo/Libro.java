package poo;

public class Libro {
    private String titulo;
    private String ISBN;
    private String editorial;
    private String idioma;
    private int numPaginas;
    private int anio;
    private String disponibilidad;

    // Constructor completo
    public Libro(String titulo, String ISBN, String editorial, String idioma, int numPaginas, int anio, String disponibilidad) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.editorial = editorial;
        this.idioma = idioma;
        this.numPaginas = numPaginas;
        this.anio = anio;
        this.disponibilidad = disponibilidad;
    }

    // Getters
    public String getTitulo() {
        return this.titulo;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public String getEditorial() {
        return this.editorial;
    }

    public String getIdioma() {
        return this.idioma;
    }

    public int getNumPaginas() {
        return this.numPaginas;
    }

    public int getAnio() {
        return this.anio;
    }

    public String getDisponibilidad() {
        return this.disponibilidad;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    // Método para saber si el libro se encuentra disponible
    public void estaDisponible(){
        if(this.disponibilidad.equalsIgnoreCase("Disponible")){
            System.out.println("El libro " + this.titulo + " está disponible.");
        } else{
            System.out.println("El libro " + this.titulo + " no está disponible.");
        }
    }

    // Método para saber si el libro está escrito en un idioma diferente al español
    public void esExtranjero(){
        if(this.idioma.equalsIgnoreCase("Español")){
            System.out.println("El libro está escrito en español.");
        } else{
            System.out.println("El libro está escrito en " + this.idioma + ", un idioma extranjero.");
        }
    }

    // Método para mostrar información del libro
    public void informacion() {
        System.out.println("Libro: " + titulo + " - " + ISBN + ". Editorial " + editorial +
                ", escrito en " + idioma + ", de " + numPaginas + " páginas (" + anio +
                "). Actualmente está " + disponibilidad + ".");
    }

}
