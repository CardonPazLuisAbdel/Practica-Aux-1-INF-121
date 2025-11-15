package COMPOSICION_AGREGACION.EJERCICIO_4;

import java.util.ArrayList;
import java.util.List;

public class Ropero {
        private String material;
        private List<Ropa> ropas;
        private int nroRopas;
    
    public Ropero(String material) {
        this.material = material;
        this.ropas = new ArrayList<>();
        this.nroRopas = 0;
    }
    
    public void adicionarRopa(Ropa ropa) {
        ropas.add(ropa);
        nroRopas++;
    }
    
    public void eliminarRopa(String material, String tipo) {
        ropas.removeIf(ropa -> ropa.getMaterial().equals(material) && ropa.getTipo().equals(tipo));
        nroRopas = ropas.size();
    }
    
    public void mostrarRopas(String material, String tipo) {
        System.out.println("Ropas de material '" + material + "' y tipo '" + tipo + "':");
        for (Ropa ropa : ropas) {
            if (ropa.getMaterial().equals(material) && ropa.getTipo().equals(tipo)) {
                System.out.println(ropa);
            }
        }
    }
    
    public void mostrarTodasRopas() {
        System.out.println("Todas las ropas en el ropero:");
        for (Ropa ropa : ropas) {
            System.out.println(ropa);
        }
    }

    public String getMaterial() { return material; }
    public int getNroRopas() { return nroRopas; }
    public List<Ropa> getRopas() { return ropas; }
}
