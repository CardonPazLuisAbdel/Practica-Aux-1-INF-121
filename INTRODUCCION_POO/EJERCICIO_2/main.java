package INTRODUCCION_POO.EJERCICIO_2;

public class main {
    public static void main(String[] args) {
        Bus bus = new Bus(50);
        System.out.println("prueba 1");
        bus.subirPasajeros(17);
        System.out.println("Asientos disponibles: " + bus.asientosDisponibles());
        System.out.println("Ganancia total: " + bus.cobrarPasaje() + " Bs");
        System.out.println(bus.toString()+"\n");

        System.out.println("prueba 2");
        bus.subirPasajeros(52);
        

    }
}
