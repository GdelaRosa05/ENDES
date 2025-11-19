package poo;

public class SalaEstudio extends Sala {
    private int numMesas;

    // Constructor
    public SalaEstudio(String nombre, int capacidad, String pizarra, String tipo, String disponibilidad, int numMesas) {
        super(nombre, capacidad, pizarra, tipo, disponibilidad);
        this.numMesas = numMesas;
    }

    // Getters y Setters
    public int getNumMesas() {
        return numMesas;
    }

    public void setNumMesas(int numMesas) {
        this.numMesas = numMesas;
    }
}

