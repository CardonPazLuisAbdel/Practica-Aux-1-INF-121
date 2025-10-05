package HERENCIA.EJERCICIO_5;

public class Moto extends Vehiculo {
    private int cilindrada;
    private boolean casco;
    
    public Moto(String conductor, String placa, int id, int cilindrada, boolean casco) {
        super(conductor, placa, id);
        this.cilindrada = cilindrada;
        this.casco = casco;
    }
    
    public void mostrarPlacaConductor() {
        super.mostrarPlacaConductor();
        System.out.println("Tipo: Moto | Cilindrada: " + cilindrada + "cc | Casco: " + (casco ? "Si" : "No"));
    }
    
    public int getCilindrada() { 
        return cilindrada; 
    }

    public boolean esCasco() { 
        return casco; 
    }
}
