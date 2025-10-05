package HERENCIA.EJERCICIO_13;

public class main {
        public static void main(String[] args) {
        Chef chef = new Chef("Antonio García", 1234567, 3000.0, "Cocina Francesa", 20);
        Mesero mesero1 = new Mesero("Carlos López", 2345678, 1200.0, "Mañana", 300.0);
        Mesero mesero2 = new Mesero("María Rodríguez", 3456789, 1200.0, "Noche", 450.0);
        Administrativo admin1 = new Administrativo("Pedro Martínez", 4567890, 2000.0, "Contador", 15);
        Administrativo admin2 = new Administrativo("Ana Fernández", 5678901, 1800.0, "Secretaria", 10);

        Empleado[] empleados = {chef, mesero1, mesero2, admin1, admin2};
        
        System.out.println("=== LISTA DE EMPLEADOS ===");
        for (Empleado emp : empleados) {
            emp.mostrarDatos();
            System.out.println("Sueldo Total: $" + emp.sueldoTotal());
            System.out.println("------------------------");
        }

        double sueldoBuscado = 1200.0;
        System.out.println("\n=== EMPLEADOS CON SUELDO MES = $" + sueldoBuscado + " ===");
        for (Empleado emp : empleados) {
            if (emp.getSueldoMes() == sueldoBuscado) {
                emp.mostrarDatos();
                System.out.println("Sueldo Total: $" + emp.sueldoTotal());
                System.out.println("------------------------");
            }
        }

        System.out.println("\n=== DETALLE DE SUELDOS TOTALES ===");
        for (Empleado emp : empleados) {
            System.out.print(emp.getNombre() + " - Sueldo Base: $" + emp.getSueldoMes());
            System.out.println(" - Sueldo Total: $" + emp.sueldoTotal());

            if (emp instanceof Chef) {
                Chef c = (Chef) emp;
                System.out.println("  (Incluye " + c.getHorasExtra() + " horas extra al 50%)");
            } else if (emp instanceof Mesero) {
                Mesero m = (Mesero) emp;
                System.out.println("  (Incluye $" + m.getPropina() + " de propina)");
            } else if (emp instanceof Administrativo) {
                Administrativo a = (Administrativo) emp;
                System.out.println("  (Incluye " + a.getHorasExtra() + " horas extra al 25%)");
            }
        }

        System.out.println("\n=== RESUMEN DE EMPLEADOS ===");
        double totalNomina = 0;
        for (Empleado emp : empleados) {
            totalNomina += emp.sueldoTotal();
        }
        System.out.println("Total a pagar a empleados: $" + totalNomina);
        System.out.println("Numero total de empleados: " + empleados.length);
    }
}
