package COMPOSICION_AGREGACION.EJERCICIO_10;

public class Persona {
        private String nombre;
        private String apellido;
        private int edad;
        private String rol;
        private String ci;
    
    public Persona(String nombre, String apellido, int edad, String rol, String ci) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.rol = rol;
        this.ci = ci;
    }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public int getEdad() { return edad; }
    public String getRol() { return rol; }
    public String getCi() { return ci; }
    
    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', apellido='" + apellido + "', edad=" + edad + ", rol='" + rol + "'}";
    }
}
