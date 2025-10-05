package HERENCIA.EJERCICIO_7;

public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Carrera: " + carrera);
    }

    public void modificarEdad(int nuevaEdad) {
        super.modificarEdad(nuevaEdad);
        System.out.println("Edad del estudiante actualizada a: " + nuevaEdad);
    }
    
    public String getCarrera() { 
        return carrera; 
    }
}
