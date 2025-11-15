package COMPOSICION_AGREGACION.EJERCICIO_2;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
        private String nombre;
        private List<Empleado> empleados;
    
    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }
    
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
    
    public void mostrarEmpleados() {
        System.out.println("Empleados del departamento " + nombre + ":");
        for (Empleado emp : empleados) {
            System.out.println(emp);
        }
    }
    
    public void cambioSalario(double porcentaje) {
        for (Empleado emp : empleados) {
            double nuevoSalario = emp.getSalario() * (1 + porcentaje/100);
            emp.setSalario(nuevoSalario);
        }
    }
    
    public boolean tieneEmpleado(Empleado empleado) {
        return empleados.contains(empleado);
    }
    
    public void moverEmpleados(Departamento destino) {
        for (Empleado emp : new ArrayList<>(empleados)) {
            destino.agregarEmpleado(emp);
            empleados.remove(emp);
        }
    }
    
    public String getNombre() { return nombre; }
    public List<Empleado> getEmpleados() { return empleados; }
}
