package poo;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private String nombre;
    private int capacidad;
    private String pizarra;
    private String tipo;
    private String disponibilidad;
    private List<PersonaPoo> personas;
    private PersonaPoo responsable;

    // Constructor
    public Sala(String nombre, int capacidad, String pizarra, String tipo, String disponibilidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.pizarra = pizarra;
        this.tipo = tipo;
        this.disponibilidad = disponibilidad;
        this.personas = new ArrayList<>();
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getPizarra() {
        return pizarra;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public List<PersonaPoo> getPersonas() {
        return personas;
    }

    public PersonaPoo getResponsable() {
        return responsable;
    }      

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setPizarra(String pizarra) {
        this.pizarra = pizarra;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void setResponsable(PersonaPoo responsable) {
        this.responsable = responsable;
    }

    // Métodos PersonaPoo
    public void entrarPersona(PersonaPoo p){
        if(personas.size() < this.capacidad){
            personas.add(p);
            System.out.println(p.getNombre() + " ha entrado en la sala " + this.nombre + ".");
        } else{
            System.out.println("No puede entrar " + p.getNombre() + ". La sala " + this.nombre + " está llena.");
        }
    }

    public void salirPersona(PersonaPoo p){
        if(personas.size() > 0){
            personas.remove(p);
            System.out.println(p.getNombre() + " ha salido de la sala " + this.nombre + ".");
        } else{
            System.out.println("No puede salir nadie, la sala ya está vacía.");
        }
    }

    public void mostrarPersonas(){
        System.out.println("Personas en la sala " + this.nombre + ":");
        for(PersonaPoo p : personas){
            System.out.println(p.getNombre());
        }
    }

    // Método para mostrar información de la sala
    public void informacion() {
        System.out.println("Sala: " + nombre + " - " + capacidad +
                ". Se utiliza para " + tipo + ", dispone " + pizarra +
                " y está " + disponibilidad + " para su reserva.");
    }
}
