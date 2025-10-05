package HERENCIA.EJERCICIO_3;

public class main {
    public static void main(String[] args) {
        Animal[] animales = new Animal[4];
        
        animales[0] = new Leon("Simba", 5);
        animales[1] = new Pinguino("Pingu", 3);
        animales[2] = new Canguro("Saltarin", 4);
        animales[3] = new Leon("Mufasa", 8);

        System.out.println("=== DESPLAZAMIENTO DE ANIMALES ===");
        for (Animal animal : animales) {
            animal.desplazarse();
        }

        System.out.println("\n=== INFORMACION DE LOS ANIMALES ===");
        for (Animal animal : animales) {
            System.out.println(animal.getNombre() + " - " + animal.getEdad() + " anios");
        }
    }
}