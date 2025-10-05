package HERENCIA.EJERCICIO_7;

public class Persona {
    private String nombre;
    private int edad;
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad);
    }

    public void modificarEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
    }
    
    public String getNombre() {
        return nombre; 
    }

    public int getEdad() { 
        return edad; 
    }
}
