package practica6;

import java.util.List;
import java.util.ArrayList;

public class Curso {

    private String codigo;
    private String nombre;
    private int cupoMaximo;

    private Profesor profesor;

    private Departamento departamento;

    private List<Matricula> inscripciones = new ArrayList<>();

    private List<Horario> horarios = new ArrayList<>();

    public Curso() {}

    public Curso(String codigo, String nombre, int cupoMaximo, Profesor profesor, Departamento departamento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cupoMaximo = cupoMaximo;
        this.profesor = profesor;
        this.departamento = departamento;
    }

    public Matricula inscribir(Estudiante e) {
        return null;
    }
}

