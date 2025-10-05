package HERENCIA.EJERCICIO_13;

public class Empleado {
    private String nombre;
    private int ci;
    private double sueldoMes;
    
    public Empleado(String nombre, int ci, double sueldoMes) {
        this.nombre = nombre;
        this.ci = ci;
        this.sueldoMes = sueldoMes;
    }
    
    public String getNombre() { return nombre; }
    public int getCi() { return ci; }
    public double getSueldoMes() { return sueldoMes; }
    public void setSueldoMes(double sueldoMes) { this.sueldoMes = sueldoMes; }
    
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " | CI: " + ci + " | Sueldo Mes: $" + sueldoMes);
    }
    
    public double sueldoTotal() {
        return sueldoMes;
    }
}
