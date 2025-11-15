package COMPOSICION_AGREGACION.EJERCICIO_8;

import java.util.List;

public class Main {
        public static void main(String[] args) {

        Fraternidad fraternidad1 = new Fraternidad("Tinkus", "Juan Perez");
        Fraternidad fraternidad2 = new Fraternidad("Morenada", "Maria Lopez");

        Facultad facultad1 = new Facultad("Ingeniería");
        Facultad facultad2 = new Facultad("Ciencias Puras");

        Bailarin bailarin1 = new Bailarin("Carlos", 20, "12345", "Tinkus", "Ingenieria");
        Bailarin bailarin2 = new Bailarin("Ana", 22, "12346", "Tinkus", "Ingenieria");
        Bailarin bailarin3 = new Bailarin("Luis", 21, "12347", "Morenada", "Ciencias Puras");
        Bailarin bailarin4 = new Bailarin("Sofia", 23, "12348", "Morenada", "Ciencias Puras");
        Bailarin bailarin5 = new Bailarin("Pedro", 19, "12349", "Tinkus", "Ingenieria");

        fraternidad1.agregarBailarin(bailarin1);
        fraternidad1.agregarBailarin(bailarin2);
        fraternidad1.agregarBailarin(bailarin5);
        
        fraternidad2.agregarBailarin(bailarin3);
        fraternidad2.agregarBailarin(bailarin4);

        facultad1.agregarBailarin(bailarin1);
        facultad1.agregarBailarin(bailarin2);
        facultad1.agregarBailarin(bailarin5);
        
        facultad2.agregarBailarin(bailarin3);
        facultad2.agregarBailarin(bailarin4);

        fraternidad1.mostrarBailarines();
        fraternidad2.mostrarBailarines();
        
        facultad1.mostrarBailarines();
        facultad2.mostrarBailarines();

        System.out.println("\nParticipantes mayores de 21 anios:");
        List<Bailarin> todosBailarines = List.of(bailarin1, bailarin2, bailarin3, bailarin4, bailarin5);
        for (Bailarin b : todosBailarines) {
            if (b.getEdad() > 21) {
                System.out.println(b.getNombre() + " - " + b.getEdad() + " anios");
            }
        }
    }
}
