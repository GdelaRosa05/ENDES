package practica6;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Profesor extends Persona {

    private double salario;

    private List<Curso> cursosDictados = new ArrayList<>();

    public Profesor() {}

    public Profesor(String dni, String nombre, Date fechaNacimiento, Direccion domicilio, double salario) {
        super(dni, nombre, fechaNacimiento, domicilio);
        this.salario = salario;
    }

    public void asignarCurso(Curso c) {}
}
