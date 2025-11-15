package COMPOSICION_AGREGACION.EJERCICIO_12;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
        private String nombre;
        private List<Doctor> doctores;
    
    public Hospital(String nombre) {
        this.nombre = nombre;
        this.doctores = new ArrayList<>();
    }
    
    public void asignarDoctor(Doctor doctor) {
        doctores.add(doctor);
    }
    
    public void mostrarDoctores() {
        System.out.println("Doctores del hospital " + nombre + ":");
        for (Doctor doctor : doctores) {
            System.out.println(doctor);
        }
    }
    
    public List<Doctor> getDoctoresPorEspecialidad(String especialidad) {
        List<Doctor> resultado = new ArrayList<>();
        for (Doctor doctor : doctores) {
            if (doctor.getEspecialidad().equalsIgnoreCase(especialidad)) {
                resultado.add(doctor);
            }
        }
        return resultado;
    }

    public String getNombre() { return nombre; }
    public List<Doctor> getDoctores() { return doctores; }
}
