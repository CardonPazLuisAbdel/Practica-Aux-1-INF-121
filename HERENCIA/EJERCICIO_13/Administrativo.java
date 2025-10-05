package HERENCIA.EJERCICIO_13;

public class Administrativo extends Empleado {
    private String cargo;
    private int horasExtra;
    
    public Administrativo(String nombre, int ci, double sueldoMes, String cargo, int horasExtra) {
        super(nombre, ci, sueldoMes);
        this.cargo = cargo;
        this.horasExtra = horasExtra;
    }
    
    public String getCargo() { return cargo; }
    public int getHorasExtra() { return horasExtra; }
    
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cargo: " + cargo + " | Horas Extra: " + horasExtra);
    }

    public double sueldoTotal() {
        double sueldoHora = getSueldoMes() / 160;
        return getSueldoMes() + (horasExtra * sueldoHora * 1.25);
    }
}
