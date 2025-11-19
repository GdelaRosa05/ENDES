package poo;

public class SalaInformatica extends Sala {
    private int numEquipos;

    // Constructor
    public SalaInformatica(String nombre, int capacidad, String pizarra, String tipo, String disponibilidad, int numEquipos) {
        super(nombre, capacidad, pizarra, tipo, disponibilidad);
        this.numEquipos = numEquipos;
    }

    // Getters y Setters
    public int getNumEquipos() {
        return numEquipos;
    }

    public void setNumEquipos(int numEquipos) {
        this.numEquipos = numEquipos;
    }
}

