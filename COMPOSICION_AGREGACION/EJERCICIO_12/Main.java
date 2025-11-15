package COMPOSICION_AGREGACION.EJERCICIO_12;

import java.util.List;

public class Main {
        public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Dr. Garcia", "Cardiologoa");
        Doctor doctor2 = new Doctor("Dra. Lopez", "Pediatria");
        Doctor doctor3 = new Doctor("Dr. Martinez", "Cardiologia");

        Hospital hospital1 = new Hospital("Hospital Central");
        Hospital hospital2 = new Hospital("Hospital del Norte");

        hospital1.asignarDoctor(doctor1);
        hospital1.asignarDoctor(doctor2);
        
        hospital2.asignarDoctor(doctor1);
        hospital2.asignarDoctor(doctor3);

        hospital1.mostrarDoctores();
        hospital2.mostrarDoctores();

        System.out.println("\nCardiologos en Hospital Central:");
        List<Doctor> cardiologos = hospital1.getDoctoresPorEspecialidad("Cardiologia");
        for (Doctor doc : cardiologos) {
            System.out.println(doc);
        }
    }
}
