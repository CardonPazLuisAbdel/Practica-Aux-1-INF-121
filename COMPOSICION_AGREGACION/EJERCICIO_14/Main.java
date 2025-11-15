package COMPOSICION_AGREGACION.EJERCICIO_14;

import java.util.List;

public class Main {
        public static void main(String[] args) {
        Empresa empresa = new Empresa("Tech Solutions");
        empresa.agregarEmpleado(new Empleado("Ana Garcia", "Desarrollador", 5000));
        empresa.agregarEmpleado(new Empleado("Carlos Lopez", "Gerente", 8000));
        empresa.agregarEmpleado(new Empleado("Maria Rodriguez", "Analista", 4500));
        empresa.agregarEmpleado(new Empleado("Pedro Martinez", "Desarrollador", 5200));

        empresa.mostrarEmpleados();

        System.out.println("\nBuscando a Ana Garcia:");
        Empleado encontrado = empresa.buscarEmpleado("Ana Garcia");
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado);
        }

        System.out.println("\nPromedio salarial: " + empresa.promedioSalarial());

        System.out.println("\nEmpleados con salario mayor a 5000:");
        List<Empleado> empleadosAltos = empresa.empleadosConSalarioMayor(5000);
        for (Empleado emp : empleadosAltos) {
            System.out.println(emp);
        }

        empresa.eliminarEmpleado("Carlos Lopez");
        System.out.println("\nDespues de eliminar a Carlos Lopez:");
        empresa.mostrarEmpleados();
    }
}
