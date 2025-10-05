package HERENCIA.EJERCICIO_5;

public class main {
        public static void main(String[] args) {

        Bus bus = new Bus("Juan Perez", "ABC123", 1, 50, "Transporte Urbano");
        Auto auto = new Auto("María Garcia", "XYZ789", 2, 150, true);
        Moto moto = new Moto("Carlos Lopez", "DEF456", 3, 600, true);

        System.out.println("=== PLACA Y CONDUCTOR DE VEHICULOS ===");
        bus.mostrarPlacaConductor();
        System.out.println();
        auto.mostrarPlacaConductor();
        System.out.println();
        moto.mostrarPlacaConductor();

        System.out.println("\n=== CAMBIO DE CONDUCTORES ===");
        bus.cambiarConductor("Pedro Rodriguez");
        auto.cambiarConductor("Ana Martinez");
        
        System.out.println("\n=== INFORMACION ACTUALIZADA ===");
        bus.mostrarPlacaConductor();
        System.out.println();
        auto.mostrarPlacaConductor();
    }
}
