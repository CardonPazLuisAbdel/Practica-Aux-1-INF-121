package POLIMORFISMO.EJERCICIO_15;

public class Laboratorio {
    private String nombre;
    private int capacidad;
    private int cantidadOrdenadores;
    private Ordenador[] ordenadores;
    
    public Laboratorio() {
        this.nombre = "";
        this.capacidad = 0;
        this.cantidadOrdenadores = 0;
        this.ordenadores = new Ordenador[20];
    }
    
    public Laboratorio(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.cantidadOrdenadores = 0;
        this.ordenadores = new Ordenador[20];
    }
    
    public void agregarOrdenador(Ordenador ordenador) {
        if (cantidadOrdenadores < 20) {
            ordenadores[cantidadOrdenadores] = ordenador;
            cantidadOrdenadores++;
        }
    }

    public void informacion() {
        System.out.println("Laboratorio: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Ordenadores: " + cantidadOrdenadores);
    }

    public void informacion(String estado) {
        System.out.println("Ordenadores " + estado + "s en " + nombre + ":");
        for (int i = 0; i < cantidadOrdenadores; i++) {
            if (ordenadores[i].getEstado().equals(estado)) {
                ordenadores[i].informacion();
            }
        }
    }

    public void informacion(Laboratorio laboratorio) {
        System.out.println("Comparando con laboratorio: " + laboratorio.nombre);
    }

    public void informacion(int ramMinima) {
        System.out.println("Ordenadores con mas de " + ramMinima + "GB RAM en " + nombre + ":");
        for (int i = 0; i < cantidadOrdenadores; i++) {
            if (ordenadores[i].getMemoriaRAM() > ramMinima) {
                ordenadores[i].informacion();
            }
        }
    }

    public void trasladarOrdenadores(Laboratorio labDestino, int cantidad) {
        int trasladados = 0;
        
        for (int i = cantidadOrdenadores - 1; i >= 0 && trasladados < cantidad; i--) {
            if (ordenadores[i] != null) {
                System.out.println("ANTES - Ordenador: " + ordenadores[i].getCodigoSerial() + " | Estado: " + ordenadores[i].getEstado());
                ordenadores[i].setEstado("inactivo");
                labDestino.agregarOrdenador(ordenadores[i]);
                ordenadores[i] = null;
                cantidadOrdenadores--;
                trasladados++;
                System.out.println("DESPUES - Ordenador trasladado a " + labDestino.nombre);
            }
        }
        reorganizarArray();
        System.out.println("Se trasladaron " + trasladados + " ordenadores a " + labDestino.nombre);
    }
    
    private void reorganizarArray() {
        Ordenador[] nuevoArray = new Ordenador[20];
        int nuevoIndex = 0;
        for (int i = 0; i < 20; i++) {
            if (ordenadores[i] != null) {
                nuevoArray[nuevoIndex] = ordenadores[i];
                nuevoIndex++;
            }
        }
        ordenadores = nuevoArray;
        cantidadOrdenadores = nuevoIndex;
    }

    public String getNombre() {
        return nombre; 
    }

    public int getCantidadOrdenadores() { 
        return cantidadOrdenadores; 
    }

    public Ordenador[] getOrdenadores() { 
        return ordenadores; 
    }
}
