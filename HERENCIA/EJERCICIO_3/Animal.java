package HERENCIA.EJERCICIO_3;

public class Animal {
    private String nombre;
    private int edad;
    
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void desplazarse() {
        System.out.println(nombre + " se esta desplazando");
    }
    
    public String getNombre() { 
        return nombre; 
    }

    public int getEdad() { 
        return edad; 
    }
}