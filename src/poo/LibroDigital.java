package poo;

public class LibroDigital extends Libro {
    private String formato;
    private double tamanoMB;

    // Constructor
    public LibroDigital(String titulo, String ISBN, String editorial, String idioma, int numPaginas, int anio, String disponibilidad, String formato, double tamanoMB) {
        super(titulo, ISBN, editorial, idioma, numPaginas, anio, disponibilidad);
        this.formato = formato;
        this.tamanoMB = tamanoMB;
    }

    // Getters y Setters
    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getTamanoMB() {
        return tamanoMB;
    }

    public void setTamanoMB(double tamanoMB) {
        this.tamanoMB = tamanoMB;
    }
}
