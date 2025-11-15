package COMPOSICION_AGREGACION.EJERCICIO_2;

public class Main {
        public static void main(String[] args) {

        Departamento depto1 = new Departamento("Ventas");
        Departamento depto2 = new Departamento("Marketing");

        Empleado emp1 = new Empleado("Juan", "Vendedor", 2500);
        Empleado emp2 = new Empleado("Maria", "Gerente", 4000);
        Empleado emp3 = new Empleado("Carlos", "Analista", 3000);

        depto1.agregarEmpleado(emp1);
        depto1.agregarEmpleado(emp2);
        depto1.agregarEmpleado(emp3);

        depto1.mostrarEmpleados();
        depto2.mostrarEmpleados();

        depto1.cambioSalario(10);
        System.out.println("\nDespues del aumento del 10%:");
        depto1.mostrarEmpleados();

        System.out.println("\n¿Maria pertenece a ambos departamentos? " + (depto1.tieneEmpleado(emp2) && depto2.tieneEmpleado(emp2)));

        depto1.moverEmpleados(depto2);
        System.out.println("\nDespues de mover empleados:");
        depto1.mostrarEmpleados();
        depto2.mostrarEmpleados();
    }
}
