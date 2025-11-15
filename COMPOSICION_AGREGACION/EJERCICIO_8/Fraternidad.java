package COMPOSICION_AGREGACION.EJERCICIO_8;

import java.util.ArrayList;
import java.util.List;

public class Fraternidad {
        private String nombre;
        private String encargado;
        private List<Bailarin> bailarines;
    
    public Fraternidad(String nombre, String encargado) {
        this.nombre = nombre;
        this.encargado = encargado;
        this.bailarines = new ArrayList<>();
    }
    
    public void agregarBailarin(Bailarin bailarin) {
        if (!bailarin.getFraternidad().equals(this.nombre)) {
            System.out.println("Error: El bailarin pertenece a otra fraternidad");
            return;
        }
        bailarines.add(bailarin);
    }
    
    public void mostrarBailarines() {
        System.out.println("Bailarines de la fraternidad " + nombre + " (Encargado: " + encargado + "):");
        for (Bailarin bailarin : bailarines) {
            System.out.println(bailarin);
        }
    }

    public String getNombre() { return nombre; }
    public String getEncargado() { return encargado; }
}
