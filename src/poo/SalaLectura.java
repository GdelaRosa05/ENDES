package poo;

import java.util.ArrayList;
import java.util.List;

public class SalaLectura extends Sala {
    private List<Libro> listaLibros;

    // Constructor
    public SalaLectura(String nombre, int capacidad, String pizarra, String tipo, String disponibilidad) {
        super(nombre, capacidad, pizarra, tipo, disponibilidad);
        this.listaLibros = new ArrayList<>();
    }

    // Getters y Setters
    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void añadirLibro(Libro libro) {
        listaLibros.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        listaLibros.remove(libro);
    }
}

