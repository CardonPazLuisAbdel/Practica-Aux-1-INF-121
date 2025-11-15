package COMPOSICION_AGREGACION.EJERCICIO_12;

public class Doctor {
        private String nombre;
        private String especialidad;
    
    public Doctor(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    
    @Override
    public String toString() {
        return "Doctor{nombre='" + nombre + "', especialidad='" + especialidad + "'}";
    }
}
