package HERENCIA.EJERCICIO_1;

public class Persona {
    private String nombre;
    private String apellido;
    private String ci;
    
    public Persona(String nombre, String apellido, String ci) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
    }
    
    public void mostrarDatos() {
        System.out.println("CI: " + ci + " | Nombre: " + nombre + " " + apellido);
    }
    
    public String getNombre() { 
        return nombre; 
    }

    public String getApellido() { 
        return apellido; 
    }

    public String getCi() { 
        return ci; 
    }
}