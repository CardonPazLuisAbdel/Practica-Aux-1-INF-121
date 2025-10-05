package HERENCIA.EJERCICIO_7;

public class main {
        public static void main(String[] args) {
        // a) Instanciar a dos estudiantes y un docente
        Estudiante estudiante1 = new Estudiante("Juan Perez", 20, "Informatica");
        Estudiante estudiante2 = new Estudiante("Maria Garcia", 22, "Sistemas");
        Docente docente = new Docente("Carlos Lopez", 35, "Programacion");

        System.out.println("=== INFORMACION DE PERSONAS ===");
        estudiante1.mostrar();
        System.out.println();
        estudiante2.mostrar();
        System.out.println();
        docente.mostrar();

        System.out.println("\n=== PROMEDIO DE EDAD DE ESTUDIANTES ===");
        double promedio = promedio(estudiante1, estudiante2);
        System.out.println("Promedio de edad: " + promedio + " años");

        System.out.println("\n=== MODIFICAR EDAD ===");
        estudiante1.modificarEdad(21);
        estudiante1.mostrar();

        System.out.println("\n=== COMPARACION DE EDADES ===");
        boolean mismaEdad = verificarMismaEdad(estudiante1, docente);
        System.out.println("¿El estudiante " + estudiante1.getNombre() + " tiene la misma edad que el docente " + docente.getNombre() + "? " + (mismaEdad ? "SÍ" : "NO"));
    }

    public static double promedio(Estudiante est1, Estudiante est2) {
        return (est1.getEdad() + est2.getEdad()) / 2.0;
    }

    public static boolean verificarMismaEdad(Estudiante estudiante, Docente docente) {
        return estudiante.getEdad() == docente.getEdad();
    }
}
