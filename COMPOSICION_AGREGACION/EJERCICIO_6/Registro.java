package COMPOSICION_AGREGACION.EJERCICIO_6;

import java.util.ArrayList;
import java.util.List;

public class Registro {
        private String fecha;
        private List<Medicamento> medicamentos;
        private int cantidad;
    
    public Registro(String fecha) {
        this.fecha = fecha;
        this.medicamentos = new ArrayList<>();
        this.cantidad = 0;
    }
    
    public void agregarMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
        cantidad++;
    }
    
    public void mostrarMedicamentos() {
        System.out.println("Registro del " + fecha + ":");
        for (Medicamento med : medicamentos) {
            System.out.println(med);
        }
    }
    
    public List<Medicamento> buscarPorTipo(String tipo) {
        List<Medicamento> resultado = new ArrayList<>();
        for (Medicamento med : medicamentos) {
            if (med.getTipo().equalsIgnoreCase(tipo)) {
                resultado.add(med);
            }
        }
        return resultado;
    }

    public String getFecha() { return fecha; }
    public int getCantidad() { return cantidad; }
}
