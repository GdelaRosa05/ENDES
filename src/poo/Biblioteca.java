package poo;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    /**
     * Atributos de la biblioteca
     */
    private String nombre;
    private String direccion;
    private int horaApertura;
    private int horaCierre;
    private List<Libro> libros;
    private List<Sala> salas;

    /**
     * Constructor
     */
    public Biblioteca(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.horaApertura = 9;
        this.horaCierre = 22;
        libros = new ArrayList<>();
        salas = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getHoraApertura() {
        return this.horaApertura;
    }
    public void setHoraApertura(int horaApertura) {
        this.horaApertura = horaApertura;
    }

    public int getHoraCierre() {
        return this.horaCierre;
    }
    public void setHoraCierre(int horaCierre) {
        this.horaCierre = horaCierre;
    }

    // Método para saber si la biblioteca está abierta a la hora indicada 
    public void estaAbierta(int hora){
        if (hora >= this.horaApertura && hora < this.horaCierre){
            System.out.println("Está abierta la biblioteca.");
        } else{
            System.out.println("Está cerrada la biblioteca.");
        }
    }

    // Método para mostrar la información
    public void mostrarInformacion() {

        System.out.println("INFORMACIÓN DE LA BIBLIOTECA");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Dirección: " + this.direccion);
        System.out.println("Horario: " + this.horaApertura + " - " + this.horaCierre);
        System.out.println();

        // Libros
        System.out.println("Libros en la biblioteca:");
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
        } else {
            for (Libro l : libros) {
                System.out.println("- " + l.getTitulo());
            }
        }

        System.out.println();

        // Salas
        System.out.println("Salas de la biblioteca:");

        if (salas.isEmpty()) {
            System.out.println("No hay salas registradas.");
            return;
        }

        for (Sala s : salas) {
            System.out.println("- Sala: " + s.getNombre());
            System.out.println("- Capacidad: " + s.getCapacidad());
            System.out.println("- Tipo: " + s.getTipo());
            System.out.println("- Pizarra: " + s.getPizarra());
            System.out.println("- Disponibilidad: " + s.getDisponibilidad());

            // Responsable
            if (s.getResponsable() != null) {
                System.out.println("Responsable: " + s.getResponsable().getNombre());
            } else {
                System.out.println("Responsable: (no asignado)");
            }

            // Personas dentro
            System.out.println("Personas en la sala:");
            if (s.getPersonas().isEmpty()) {
                System.out.println("  - (Ninguna)");
            } else {
                for (PersonaPoo p : s.getPersonas()) {
                    System.out.println("  - " + p.getNombre());
                }
            }

            // Atributos
            if (s.getTipo().equalsIgnoreCase("Lectura")) {
                SalaLectura sl = (SalaLectura) s;
                System.out.println("Libros en la sala de lectura:");

                if (sl.getListaLibros().isEmpty()) {
                    System.out.println("  - (No hay libros)");
                } else {
                    for (Libro libro : sl.getListaLibros()) {
                        System.out.println("  - " + libro.getTitulo());
                    }
                }

            } else if (s.getTipo().equalsIgnoreCase("Estudio")) {
                SalaEstudio se = (SalaEstudio) s;
                System.out.println("Número de mesas: " + se.getNumMesas());

            } else if (s.getTipo().equalsIgnoreCase("Informatica")) {
                SalaInformatica si = (SalaInformatica) s;
                System.out.println("Número de equipos informáticos: " + si.getNumEquipos());
            }
        }
    }

    public void addLibro(Libro libro) {
        libros.add(libro);
    }

    public void removeLibro(Libro libro) {
        libros.remove(libro);
    }

    public void addSala(Sala sala) {
        salas.add(sala);
    }

    public void removeSala(Sala sala) {
        salas.remove(sala);
    }

    public void mostrarLibros() {
        System.out.println("Libros disponibles:");
        for (Libro l : libros) {
            System.out.println("- " + l.getTitulo());
        }
    }

    public void mostrarSalas() {
        System.out.println("Salas disponibles:");
        for (Sala s : salas) {
            System.out.println("- " + s.getNombre());
        }
    }

    public void mostrarSalasDisponibles(){
        System.out.println("Salas disponibles: ");
        boolean salasDisponibles = false;

        for(Sala s : salas){
            if(s.getPersonas().size() == 0){
                System.out.println(s.getNombre());
                salasDisponibles = true;
            }
        }

        if(salasDisponibles == false){
            System.out.println("No hay salas disponibles.");
        }
    }

    public void mostrarTotalPersonas(){
        System.out.println("Personas totales en todas las salas:");
        int contadorPersonas = 0;

        for(Sala s : salas){
            contadorPersonas += s.getPersonas().size();
        }

        System.out.println("Hay " + contadorPersonas + " en todas las salas.");
    }

    public String buscarLibroPorTitulo(String titulo){
        for(Libro l : libros){
            if(titulo.equalsIgnoreCase(l.getTitulo())){
                return "El libro " + titulo + " existe.";
            }
        }
        return null;
    }

    public void registrarVisita(PersonaPoo p) {
        System.out.println("Ha entrado en la biblioteca: " + p.getNombre());
    }

    public void asignarResponsable(Sala s, PersonaPoo p) {
        s.setResponsable(p);
        System.out.println("Responsable asignado: " + p.getNombre() + " → Sala: " + s.getNombre());
    }

}
 