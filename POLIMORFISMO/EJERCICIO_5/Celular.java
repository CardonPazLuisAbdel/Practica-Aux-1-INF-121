package POLIMORFISMO.EJERCICIO_5;

public class Celular {
    private String nroTel;
    private String dueño;
    private double espacio;
    private int ram;
    private int nroApp;
    
    public Celular(String nroTel, String dueño, double espacio, int ram, int nroApp) {
        this.nroTel = nroTel;
        this.dueño = dueño;
        this.espacio = espacio;
        this.ram = ram;
        this.nroApp = nroApp;
    }
    
    public Celular operatorPlusPlus() {
        this.nroApp += 10;
        return this;
    }
    
    public Celular operatorMinusMinus() {
        this.espacio -= 5;
        return this;
    }
    
    public void mostrarDatos() {
        System.out.println("Numero: " + nroTel);
        System.out.println("Dueño: " + dueño);
        System.out.println("Espacio: " + espacio + " GB");
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Numero de Apps: " + nroApp);
        System.out.println("------------------------");
    }
}
