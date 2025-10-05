package HERENCIA.EJERCICIO_3;

public class Canguro extends Animal {
    
    public Canguro(String nombre, int edad) {
        super(nombre, edad);
    }

    public void desplazarse() {
        System.out.println(getNombre() + " el canguro esta saltando ");
    }
}
