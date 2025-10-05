package HERENCIA.EJERCICIO_13;

public class Mesero extends Empleado {
    private String turno;
    private double propina;
    
    public Mesero(String nombre, int ci, double sueldoMes, String turno, double propina) {
        super(nombre, ci, sueldoMes);
        this.turno = turno;
        this.propina = propina;
    }
    
    public String getTurno() { return turno; }
    public double getPropina() { return propina; }
    
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Turno: " + turno + " | Propina: $" + propina);
    }

    public double sueldoTotal() {
        return getSueldoMes() + propina;
    }
}
