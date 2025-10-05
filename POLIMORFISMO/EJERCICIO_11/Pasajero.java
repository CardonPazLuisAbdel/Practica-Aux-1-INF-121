package POLIMORFISMO.EJERCICIO_11;

public class Pasajero {
    private String nombre;
    private int edad;
    private String genero;
    
    public Pasajero() {
        this.nombre = "";
        this.edad = 0;
        this.genero = "";
    }
    
    public Pasajero(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    
    public void operatorPlusPlus() {
        System.out.println("Leyendo datos del pasajero:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
    }
    
    public void operatorMinusMinus() {
        System.out.println("Mostrando pasajero: " + nombre + " (" + edad + " años, " + genero + ")");
    }
    
    public String getNombre() { 
        return nombre; 
    }

    public int getEdad() { 
        return edad; 
    }

    public String getGenero() { 
        return genero; 
    }
}
