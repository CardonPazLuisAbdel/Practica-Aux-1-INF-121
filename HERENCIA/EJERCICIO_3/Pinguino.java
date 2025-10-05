package HERENCIA.EJERCICIO_3;

public class Pinguino extends Animal {
    
    public Pinguino(String nombre, int edad) {
        super(nombre, edad);
    }

    public void desplazarse() {
        System.out.println(getNombre() + " el pinguino esta nadando ");
    }
}
