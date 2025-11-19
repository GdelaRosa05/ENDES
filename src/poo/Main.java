package poo;

public class Main {
    public static void main(String[] args) {

        // a) Crea una Biblioteca llamada “Central”.
        Biblioteca biblioteca = new Biblioteca("Central", "Calle Mayor 1");

        // b) Crea distintos tipos de Libro (LibroFisico, LibroDigital).
        LibroFisico libroFisico1 = new LibroFisico("El Quijote", "ISBN-001", "Anaya", "Español", 800, 2000, "Disponible", "Estantería A-1");
        LibroFisico libroFisico2 = new LibroFisico("1984", "ISBN-002", "Planeta", "Español", 350, 1995, "Disponible", "Estantería B-3");
        LibroDigital libroDigital1 = new LibroDigital("Java para novatos", "ISBN-003", "Pearson", "Español", 450, 2020, "Disponible", "PDF", 5.2);
        LibroDigital libroDigital2 = new LibroDigital("POO en Java", "ISBN-004", "McGraw-Hill", "Español", 300, 2022, "Disponible", "EPUB", 3.8);

        // Añadimos los libros a la biblioteca
        biblioteca.addLibro(libroFisico1);
        biblioteca.addLibro(libroFisico2);
        biblioteca.addLibro(libroDigital1);
        biblioteca.addLibro(libroDigital2);

        // c) Crea varias salas de diferentes tipos y las añada a la biblioteca.
        SalaLectura salaLectura = new SalaLectura("Sala de Lectura 1", 20, "Verde", "Lectura", "Libre");
        SalaEstudio salaEstudio = new SalaEstudio("Sala de Estudio 1", 15, "Blanca", "Estudio", "Libre", 10);
        SalaInformatica salaInformatica = new SalaInformatica("Sala de Informática 1", 12, "Digital", "Informatica", "Libre", 8);

        // Añadir salas a la biblioteca
        biblioteca.addSala(salaLectura);
        biblioteca.addSala(salaEstudio);
        biblioteca.addSala(salaInformatica);

        // (Opcional) Añadir algunos libros a la SalaLectura
        salaLectura.añadirLibro(libroFisico1);
        salaLectura.añadirLibro(libroFisico2);

        // d) Crea distintas Persona (Usuario, Empleado) y las asocie a salas o a préstamos.

        // Usuarios
        Usuario usuario1 = new Usuario("Ana", 25, "López", "12345678A", "ana@mail.com", "600111222", "Estudiante", 2, 1);
        Usuario usuario2 = new Usuario("Carlos", 30, "García", "87654321B", "carlos@mail.com", "600333444", "Profesor", 6, 2);

        // Empleados
        Empleado empleado1 = new Empleado("María", 40, "Sánchez", "11223344C", "maria@mail.com", "600555666", "Bibliotecaria", 15, "Responsable de lectura", 1500.0);
        Empleado empleado2 = new Empleado("Juan", 38, "Pérez", "55667788D", "juan@mail.com", "600777888", "Técnico informático", 12, "Responsable informática", 1600.0);

        // Registrar visitas
        biblioteca.registrarVisita(usuario1);
        biblioteca.registrarVisita(usuario2);
        biblioteca.registrarVisita(empleado1);
        biblioteca.registrarVisita(empleado2);

        // Asignar responsables a las salas
        biblioteca.asignarResponsable(salaLectura, empleado1);
        biblioteca.asignarResponsable(salaInformatica, empleado2);

        // Meter personas en salas
        salaLectura.getPersonas().add(usuario1);
        salaEstudio.getPersonas().add(usuario2);
        salaInformatica.getPersonas().add(empleado2);

        // Asociar libros prestados a usuarios
        usuario1.prestarLibro(libroFisico1);
        usuario1.prestarLibro(libroDigital1);

        usuario2.prestarLibro(libroFisico2);
        usuario2.prestarLibro(libroDigital2);

        // e) Muestre por pantalla toda la información.
        System.out.println();
        biblioteca.mostrarInformacion();
    }
}
