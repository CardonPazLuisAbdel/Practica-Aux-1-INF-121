package COMPOSICION_AGREGACION.EJERCICIO_8;

import java.util.ArrayList;
import java.util.List;

public class Facultad {
        private String nombre;
        private List<Bailarin> bailarines;
        private List<String> fraternidades;
    
    public Facultad(String nombre) {
        this.nombre = nombre;
        this.bailarines = new ArrayList<>();
        this.fraternidades = new ArrayList<>();
    }
    
    public void agregarBailarin(Bailarin bailarin) {
        if (!bailarin.getFacultad().equals(this.nombre)) {
            System.out.println("Error: El bailarin pertenece a otra facultad");
            return;
        }
        bailarines.add(bailarin);

        if (!fraternidades.contains(bailarin.getFraternidad())) {
            fraternidades.add(bailarin.getFraternidad());
        }
    }
    
    public void mostrarBailarines() {
        System.out.println("Bailarines de la facultad " + nombre + ":");
        for (Bailarin bailarin : bailarines) {
            System.out.println(bailarin);
        }
    }

    public String getNombre() { return nombre; }
    public List<String> getFraternidades() { return fraternidades; }
}
