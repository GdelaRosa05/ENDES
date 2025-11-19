package poo;

import java.util.ArrayList;

public class Usuario extends PersonaPoo {
    private int numSocio;
    private ArrayList<Libro> listaLibrosPrestados;

    // Constructor
    public Usuario(String nombre, int edad, String apellidos, String DNI,  String email, String telefono, String profesion, int añosExperiencia, int numSocio) {
        super(nombre, edad, apellidos, DNI, email, telefono, profesion, añosExperiencia);
        this.numSocio = numSocio;
        this.listaLibrosPrestados = new ArrayList<>();
    }

    // Getters y Setters
    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public ArrayList<Libro> getListaLibrosPrestados() {
        return listaLibrosPrestados;
    }

    public void prestarLibro(Libro libro) {
        listaLibrosPrestados.add(libro);
    }

    public void devolverLibro(Libro libro) {
        listaLibrosPrestados.remove(libro);
    }
}