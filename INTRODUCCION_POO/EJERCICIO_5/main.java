package INTRODUCCION_POO.EJERCICIO_5;

public class main {
    public static void main(String[] args){
        Persona persona1 = new Persona("Rodrigo","Paz","Mcgill",30,152484);
        Persona persona2 = new Persona("Victor","Paz","Smith",17,154564);
        System.out.println("Datos de la persona 1:");
        persona1.mostrarDatos();
        persona1.mayorDeEdad();
        System.out.println("\nDatos de la persona 2:");
        persona2.mostrarDatos();
        persona2.mayorDeEdad();
        System.out.println("\n¿mismo apellido paterno?");
        if (persona1.getPaterno().equals(persona2.getPaterno())){
            System.out.println("tienen el mismo apellido paterno");
        }else{
            System.out.println("no tienen el mismo apellido paterno");
        }
    }
}
