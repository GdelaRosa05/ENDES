package practica6;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Estudiante extends Persona {

    private boolean repetidor;

    private List<Matricula> matriculas = new ArrayList<>();

    public Estudiante() {}

    public Estudiante(String dni, String nombre, Date fechaNacimiento, Direccion domicilio, boolean repetidor) {
        super(dni, nombre, fechaNacimiento, domicilio);
        this.repetidor = repetidor;
    }

    public Matricula inscribirse(Curso c) {
        return null;
    }
}
