package practica6;

import java.util.Date;

public class Matricula {

    private Date fecha;
    private double notaFinal;

    private Estudiante estudiante;
    private Curso curso;

    public Matricula() {}

    public Matricula(Date fecha, double notaFinal, Estudiante estudiante, Curso curso) {
        this.fecha = fecha;
        this.notaFinal = notaFinal;
        this.estudiante = estudiante;
        this.curso = curso;
    }

    public double calcularNotaFinal() {
        return 0;
    }
}

