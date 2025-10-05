package HERENCIA.EJERCICIO_13;

public class Chef extends Empleado {
    private String especialidad;
    private int horasExtra;
    
    public Chef(String nombre, int ci, double sueldoMes, String especialidad, int horasExtra) {
        super(nombre, ci, sueldoMes);
        this.especialidad = especialidad;
        this.horasExtra = horasExtra;
    }
    
    public String getEspecialidad() { return especialidad; }
    public int getHorasExtra() { return horasExtra; }
    
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Especialidad: " + especialidad + " | Horas Extra: " + horasExtra);
    }

    public double sueldoTotal() {
        double sueldoHora = getSueldoMes() / 160;
        return getSueldoMes() + (horasExtra * sueldoHora * 1.5);
    }
}
