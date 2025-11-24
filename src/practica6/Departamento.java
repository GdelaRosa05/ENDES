package practica6;

import java.util.List;
import java.util.ArrayList;

public class Departamento {

    private String nombre;

    private List<Curso> cursos = new ArrayList<>();

    public Departamento() {}

    public Departamento(String nombre) {
        this.nombre = nombre;
    }
}
