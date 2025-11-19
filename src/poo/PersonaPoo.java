package poo;

public class PersonaPoo {
    /**
     *  Definición de atributos de la persona
     */
    private String nombre;
    private int edad;
    private String direccion;
    private String apellidos;
    private String DNI;
    private String email;
    private String telefono;
    private String profesion;
    private int añosExperiencia;

    /**
     *  Definición del comportamiento de la persona
     */
    public PersonaPoo (String nombre, int edad, String apellidos, String DNI, String email, String telefono, String profesion, int añosExperiencia){
        this.nombre = nombre;
        this.edad = edad;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.email = email;
        this.telefono = telefono;
        this.profesion = profesion;
        this.añosExperiencia = añosExperiencia;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: " + this.nombre + ", edad: " + this.getEdad() + ", dirección: " + this.direccion + ", apellidos: " + this.apellidos + ", DNI: " + this.DNI + ", email: " + this.email + ", teléfono: " + this.telefono + ", profesión: " + this.profesion + "y años de experiencia: " + this.añosExperiencia + " años.");
    }

    public boolean estaJubilado(){
        if(this.edad > 65){
            System.out.println("Está jubilado");
            return true;
        } else{
            System.out.println("La persona está en edad para trabajar");
            return false;
        }
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public void setEdad (int edad){
        this.edad = edad;
    }

    public void setDireccion (String direccion){
        this.direccion = direccion;
    }

    public void setApellidos (String apellidos){
        this.apellidos = apellidos;
    }

    public void setDNI (String DNI){
        this.DNI = DNI;
    }

    public void setEmail (String email){
        this.email = email;
    }

    public void setTelefono (String telefono){
        this.telefono = telefono;
    }

    public void setProfesion (String profesion){
        this.profesion = profesion;
    }

    public void setAñosExperiencia (int añosExperiencia){
        this.añosExperiencia = añosExperiencia;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public String getDNI() {
        return this.DNI;
    }

    public String getEmail() {
        return this.email;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public String getProfesion() {
        return this.profesion;
    }

    public int getAñosExperiencia() {
        return this.añosExperiencia;
    }
}
