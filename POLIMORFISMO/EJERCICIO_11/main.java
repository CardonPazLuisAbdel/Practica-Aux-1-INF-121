package POLIMORFISMO.EJERCICIO_11;

public class main {
        public static void main(String[] args) {
        Crucero crucero1 = new Crucero("Caribe Paradise", "Mexico", "Bahamas");
        Crucero crucero2 = new Crucero("Mediterranean Dream", "España", "Italia");
        
        Pasajero pasajero1 = new Pasajero("Juan Vargas", 35, "M");
        Pasajero pasajero2 = new Pasajero("Martina Vasques", 28, "F");
        Pasajero pasajero3 = new Pasajero("Wilmer Montero", 42, "M");
        Pasajero pasajero4 = new Pasajero("Ana García", 31, "F");
        Pasajero pasajero5 = new Pasajero("Carlos López", 45, "M");
        
        crucero1.agregarPasajero("Juan Vargas", "502", "500");
        crucero1.agregarPasajero("Martina Vasques", "603", "1000");
        crucero1.agregarPasajero("Wilmer Montero", "401", "925");
        
        crucero2.agregarPasajero("Ana García", "201", "750");
        crucero2.agregarPasajero("Carlos López", "305", "800");
        
        System.out.println("=== OPERADORES ++ Y -- ===");
        crucero1.operatorPlusPlus();
        crucero1.operatorMinusMinus();
        pasajero1.operatorPlusPlus();
        pasajero1.operatorMinusMinus();
        
        System.out.println("\n=== OPERADOR == (SUMA TOTAL PASAJES) ===");
        double sumaTotal = crucero1.operatorEqualsEquals(crucero2);
        System.out.println("Suma total de pasajes: $" + sumaTotal);
        
        System.out.println("\n=== OPERADOR + (MISMA CANTIDAD PASAJEROS) ===");
        boolean mismaCantidad = crucero1.operatorPlus(crucero2);
        System.out.println("¿Tienen misma cantidad de pasajeros? " + mismaCantidad);
        
        System.out.println("\n=== OPERADOR - (CONTAR HOMBRES/MUJERES) ===");
        String conteo1 = crucero1.operatorMinus();
        String conteo2 = crucero2.operatorMinus();
        System.out.println("Crucero 1: " + conteo1);
        System.out.println("Crucero 2: " + conteo2);
    }
}
