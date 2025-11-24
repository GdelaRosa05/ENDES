package practica6;

import java.util.Date;

public abstract class Persona {

    protected String dni;
    protected String nombre;
    protected Date fechaNacimiento;

    protected Direccion domicilio;

    public Persona() {}

    public Persona(String dni, String nombre, Date fechaNacimiento, Direccion domicilio) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.domicilio = domicilio;
    }

    public int getEdad() {
        return 0;
    }
}
