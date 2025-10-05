package POLIMORFISMO.EJERCICIO_11;

public class Crucero {
    private String nombre;
    private String paisOrigen;
    private String paisDestino;
    private int nroPasajeros;
    private String[][] pasajeros;
    
    public Crucero() {
        this.nombre = "";
        this.paisOrigen = "";
        this.paisDestino = "";
        this.nroPasajeros = 0;
        this.pasajeros = new String[100][3];
    }
    
    public Crucero(String nombre, String paisOrigen, String paisDestino) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.paisDestino = paisDestino;
        this.nroPasajeros = 0;
        this.pasajeros = new String[100][3];
    }
    
    public void agregarPasajero(String nombre, String nroHabitacion, String costoPasaje) {
        if (nroPasajeros < 100) {
            pasajeros[nroPasajeros][0] = nombre;
            pasajeros[nroPasajeros][1] = nroHabitacion;
            pasajeros[nroPasajeros][2] = costoPasaje;
            nroPasajeros++;
        }
    }
    
    public void operatorPlusPlus() {
        System.out.println("Leyendo datos del crucero " + nombre);
        System.out.println("Origen: " + paisOrigen);
        System.out.println("Destino: " + paisDestino);
        System.out.println("Pasajeros: " + nroPasajeros);
    }
    
    public void operatorMinusMinus() {
        System.out.println("Mostrando crucero: " + nombre + " (" + paisOrigen + " -> " + paisDestino + ")");
    }
    
    public double operatorEqualsEquals(Crucero otro) {
        double total1 = calcularTotalPasajes();
        double total2 = otro.calcularTotalPasajes();
        return total1 + total2;
    }
    
    public boolean operatorPlus(Crucero otro) {
        return this.nroPasajeros == otro.nroPasajeros;
    }
    
    public String operatorMinus() {
        int hombres = 0;
        int mujeres = 0;
        
        for (int i = 0; i < nroPasajeros; i++) {
            String nombre = pasajeros[i][0];
            if (nombre.contains("a") || nombre.contains("A")) {
                mujeres++;
            } else {
                hombres++;
            }
        }
        
        return "Hombres: " + hombres + ", Mujeres: " + mujeres;
    }
    
    private double calcularTotalPasajes() {
        double total = 0;
        for (int i = 0; i < nroPasajeros; i++) {
            total += Double.parseDouble(pasajeros[i][2]);
        }
        return total;
    }
    
    public String getNombre() { 
        return nombre; 
    }

    public int getNroPasajeros() { 
        return nroPasajeros; 
    }
}
