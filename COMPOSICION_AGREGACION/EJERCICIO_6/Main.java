package COMPOSICION_AGREGACION.EJERCICIO_6;

import java.util.List;

public class Main {
        public static void main(String[] args) {
        Registro registro = new Registro("2025-01-15");

        registro.agregarMedicamento(new Medicamento("Paracetamol", "Analgesico", 5.50, 100));
        registro.agregarMedicamento(new Medicamento("Amoxicilina", "Antibiotico", 12.80, 50));
        registro.agregarMedicamento(new Medicamento("Ibuprofeno", "Analgesico", 7.20, 75));

        registro.mostrarMedicamentos();

        System.out.println("\nMedicamentos analgesicos:");
        List<Medicamento> analgesicos = registro.buscarPorTipo("Analgesico");
        for (Medicamento med : analgesicos) {
            System.out.println(med);
        }
    }
}
