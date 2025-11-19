package poo;

public class LibroFisico extends Libro{
    private String ubicacion;

    // Constructor
    public LibroFisico(String titulo, String ISBN, String editorial, String idioma, int numPaginas, int anio, String disponibilidad, String ubicacion){
        super(titulo, ISBN, editorial, idioma, numPaginas, anio, disponibilidad);
        this.ubicacion = ubicacion;
    }

    // Getters y Setters
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}   
