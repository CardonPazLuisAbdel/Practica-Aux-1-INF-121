package HERENCIA.EJERCICIO_5;

public class Vehiculo {
    protected String conductor;
    protected String placa;
    protected int id;
    
    public Vehiculo(String conductor, String placa, int id) {
        this.conductor = conductor;
        this.placa = placa;
        this.id = id;
    }
    
    public void mostrarPlacaConductor() {
        System.out.println("Placa: " + placa + " | Conductor: " + conductor);
    }

    public void cambiarConductor(String nuevoConductor) {
        this.conductor = nuevoConductor;
        System.out.println("Conductor cambiado a: " + nuevoConductor);
    }
    
    public String getConductor() { 
        return conductor; 
    }

    public String getPlaca() { 
        return placa;
    }

    public int getId() { 
        return id; 
    }
}
