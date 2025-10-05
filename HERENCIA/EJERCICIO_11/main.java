package HERENCIA.EJERCICIO_11;

public class main {
        public static void main(String[] args) {
        JefePolicia jefe1 = new JefePolicia("Carlos Mendoza", 45, 5000.0, "Investigación", "Coronel", 20, 50, "Centro");
        JefePolicia jefe2 = new JefePolicia("Ana Lopez", 38, 4500.0, "Narcoticos", "Teniente Coronel", 15, 35, "Norte");

        System.out.println("=== DATOS DE LOS JEFES DE POLICIA ===");
        System.out.println("\nJEFE 1:");
        jefe1.mostrarDatos();
        
        System.out.println("\nJEFE 2:");
        jefe2.mostrarDatos();

        System.out.println("\n=== COMPARACION DE SUELDOS ===");
        JefePolicia jefeMayorSueldo = (jefe1.getSueldo() > jefe2.getSueldo()) ? jefe1 : jefe2;
        System.out.println("Jefe con mayor sueldo: " + jefeMayorSueldo.getNombre() + " - $" + jefeMayorSueldo.getSueldo());

        System.out.println("\n=== COMPARACION DE GRADOS ===");
        if (jefe1.getGrado().equals(jefe2.getGrado())) {
            System.out.println("Ambos tienen el mismo grado: " + jefe1.getGrado());
        } else {
            System.out.println("Tienen grados diferentes:");
            System.out.println(jefe1.getNombre() + ": " + jefe1.getGrado());
            System.out.println(jefe2.getNombre() + ": " + jefe2.getGrado());
        }

        System.out.println("COMO PERSONA:");
        IPersona persona1 = jefe1;
        IPersona persona2 = jefe2;
        System.out.println("Persona 1: " + persona1.getNombre() + " - " + persona1.getEdad() + " anios");
        System.out.println("Persona 2: " + persona2.getNombre() + " - " + persona2.getEdad() + " anios");

        System.out.println("\nCOMO EMPLEADO:");
        IEmpleado empleado1 = jefe1;
        IEmpleado empleado2 = jefe2;
        System.out.println("Empleado 1: " + empleado1.getDepartamento() + " - $" + empleado1.getSueldo());
        System.out.println("Empleado 2: " + empleado2.getDepartamento() + " - $" + empleado2.getSueldo());

        System.out.println("\nCOMO POLICIA:");
        IPolicia policia1 = jefe1;
        IPolicia policia2 = jefe2;
        System.out.println("Policia 1: " + policia1.getGrado() + " - " + policia1.getAñosServicio() + " anios");
        System.out.println("Policia 2: " + policia2.getGrado() + " - " + policia2.getAñosServicio() + " anios");
    }
}
