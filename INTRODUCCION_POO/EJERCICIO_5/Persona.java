package INTRODUCCION_POO.EJERCICIO_5;

public class Persona {
    private String nombre;
    private String materno;
    private String paterno;
    private int edad;
    private int ci;

    public Persona(String nombre, String paterno, String materno, int edad, int ci){
        this.nombre = nombre;
        this.materno = materno;
        this.paterno = paterno;
        this.edad = edad;
        this.ci = ci;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + this.nombre + " " + this.paterno + " " + this.materno + ", Edad: " + this.edad + ", CI: " + this.ci);

    }
    
    public void mayorDeEdad(){
        if (this.edad >= 18){
            System.out.println("es mayor de edad");

        }else{
            System.out.println("es menor de edad");
        }
    }

    public String getPaterno(){
        return this.paterno;
    }
}
