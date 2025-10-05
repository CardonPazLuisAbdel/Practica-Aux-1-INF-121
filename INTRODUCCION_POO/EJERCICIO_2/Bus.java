package INTRODUCCION_POO.EJERCICIO_2;

public class Bus{
    public int capacidad;
    public int pasajeros;
    private double ganancia;
    private static final double pasaje= 1.50;
    

    public Bus(int capacidad){
        this.capacidad = capacidad;
        this.pasajeros = 0;
        this.ganancia = 0.0;
    }

    public void subirPasajeros(int cantidad){
        if(cantidad <= 0){
            System.out.println("No subio ningun pasajero.");
            return;
        }
        else if (cantidad + this.pasajeros > capacidad){
            System.out.println("No hay espacio suficiente en el bus.");
            return;
        }else {
            this.pasajeros = this.pasajeros + cantidad;
            System.out.println("Subieron: " + cantidad + " pasajerons");
        }
    }

    public double cobrarPasaje(){
        double total = this.pasajeros * pasaje;
        this.ganancia = this.ganancia + total;
        double gananciaTotal = this.ganancia;
        return gananciaTotal;
    }

    public int asientosDisponibles(){
        int disponibles = this.capacidad - this.pasajeros;
        return disponibles;
    }

    public String toString(){
        return "Capacidad: " + capacidad + ", Pasajeros: " + pasajeros + ", Ganancia: " + ganancia + " Bs";
    }
}
