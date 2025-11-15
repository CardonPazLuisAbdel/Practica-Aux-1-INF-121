package COMPOSICION_AGREGACION.EJERCICIO_14;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
        private String nombre;
        private List<Empleado> empleados;
    
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }
    
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
    
    public void mostrarEmpleados() {
        System.out.println("Empleados de " + nombre + ":");
        for (Empleado emp : empleados) {
            System.out.println(emp);
        }
    }
    
    public Empleado buscarEmpleado(String nombre) {
        for (Empleado emp : empleados) {
            if (emp.getNombre().equalsIgnoreCase(nombre)) {
                return emp;
            }
        }
        return null;
    }
    
    public void eliminarEmpleado(String nombre) {
        empleados.removeIf(emp -> emp.getNombre().equalsIgnoreCase(nombre));
    }
    
    public double promedioSalarial() {
        if (empleados.isEmpty()) return 0;
        double suma = 0;
        for (Empleado emp : empleados) {
            suma += emp.getSalario();
        }
        return suma / empleados.size();
    }
    
    public List<Empleado> empleadosConSalarioMayor(double salarioMinimo) {
        List<Empleado> resultado = new ArrayList<>();
        for (Empleado emp : empleados) {
            if (emp.getSalario() > salarioMinimo) {
                resultado.add(emp);
            }
        }
        return resultado;
    }

    public String getNombre() { return nombre; }
    public List<Empleado> getEmpleados() { return empleados; }
}
