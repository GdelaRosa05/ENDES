package poo;

public class Empleado extends PersonaPoo {
    private String puesto;
    private double sueldo;

    // Constructor
    public Empleado(String nombre, int edad, String apellidos, String DNI, String email, String telefono, String profesion, int añosExperiencia, String puesto, double sueldo) {
        super(nombre, edad, apellidos, DNI, email, telefono, profesion, añosExperiencia);
        this.puesto = puesto;
        this.sueldo = sueldo;
    }

    // Getters y Setters
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}