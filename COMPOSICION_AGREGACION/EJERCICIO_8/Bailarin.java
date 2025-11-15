package COMPOSICION_AGREGACION.EJERCICIO_8;

public class Bailarin {
        private String nombre;
        private int edad;
        private String fraternidad;
        private String facultad;
        private String ci;
    
    public Bailarin(String nombre, int edad, String ci, String fraternidad, String facultad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ci = ci;
        this.fraternidad = fraternidad;
        this.facultad = facultad;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getFraternidad() { return fraternidad; }
    public String getFacultad() { return facultad; }
    public String getCi() { return ci; }
    
    @Override
    public String toString() {
        return "Bailarin{nombre='" + nombre + "', edad=" + edad + ", fraternidad='" + fraternidad + "', facultad='" + facultad + "'}";
    }
}
