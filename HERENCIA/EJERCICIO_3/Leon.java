package HERENCIA.EJERCICIO_3;

public class Leon extends Animal {
    
    public Leon(String nombre, int edad) {
        super(nombre, edad);
    }

    public void desplazarse() {
        System.out.println(getNombre() + " el leon esta caminando ");
    }
}
