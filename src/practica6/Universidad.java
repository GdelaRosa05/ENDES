package practica6;

import java.util.List;
import java.util.ArrayList;

public class Universidad {

    private String nombre;

    private List<Departamento> departamentos = new ArrayList<>();

    public Universidad() {}

    public Universidad(String nombre) {
        this.nombre = nombre;
    }
}

