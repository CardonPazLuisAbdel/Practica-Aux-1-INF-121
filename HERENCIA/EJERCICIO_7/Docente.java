package HERENCIA.EJERCICIO_7;

public class Docente extends Persona {
    private String materia;

    public Docente(String nombre, int edad, String materia) {
        super(nombre, edad);
        this.materia = materia;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Materia: " + materia);
    }
    
    public String getMateria() {
        return materia; 
    }
}
