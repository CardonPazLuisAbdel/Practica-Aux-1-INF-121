package POLIMORFISMO.EJERCICIO_7;

public class Main {
    public static void main(String[] args) {
        Parada parada1 = new Parada();
        parada1.adicionar("Carlos Mendoza");
        parada1.adicionar("Juan Perez", "ABC123", "Toyota Corolla");
        
        Parada parada2 = new Parada(2, 2);
        parada2.adicionar("Ana Garcia");
        parada2.adicionar("Luis Torres");
        parada2.adicionar("María Lopez", "XYZ789", "Nissan Sentra");
        parada2.adicionar("Pedro Ruiz", "DEF456", "Honda Civic");
        
        System.out.println("Parada 1:");
        parada1.mostrar();
        
        System.out.println("\nParada 2:");
        parada2.mostrar();
    }
}
