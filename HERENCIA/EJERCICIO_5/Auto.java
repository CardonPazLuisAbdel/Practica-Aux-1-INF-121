package HERENCIA.EJERCICIO_5;

public class Auto extends Vehiculo {
    private int caballosFuerza;
    private boolean descapotable;
    
    public Auto(String conductor, String placa, int id, int caballosFuerza, boolean descapotable) {
        super(conductor, placa, id);
        this.caballosFuerza = caballosFuerza;
        this.descapotable = descapotable;
    }
    
    public void mostrarPlacaConductor() {
        super.mostrarPlacaConductor();
        System.out.println("Tipo: Auto | Caballos Fuerza: " + caballosFuerza + " | Descapotable: " + (descapotable ? "Si" : "No"));
    }
    
    public int getCaballosFuerza() { 
        return caballosFuerza; 
    }

    public boolean esDescapotable() { 
        return descapotable; 
    }
}