package COMPOSICION_AGREGACION.EJERCICIO_4;

public class Main {
        public static void main(String[] args) {
        Ropero ropero = new Ropero("Madera");

        ropero.adicionarRopa(new Ropa("Camisa", "Algodon"));
        ropero.adicionarRopa(new Ropa("Pantalon", "Jean"));
        ropero.adicionarRopa(new Ropa("Camisa", "Seda"));
        ropero.adicionarRopa(new Ropa("Chaqueta", "Cuero"));

        ropero.mostrarTodasRopas();

        ropero.mostrarRopas("Algodon", "Camisa");

        ropero.eliminarRopa("Jean", "Pantalon");
        System.out.println("\nDespues de eliminar pantalon de jean:");
        ropero.mostrarTodasRopas();
    }
}
