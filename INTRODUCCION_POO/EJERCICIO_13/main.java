package INTRODUCCION_POO.EJERCICIO_13;

import java.util.Arrays;
import java.util.Comparator;

public class main {
        public static void main(String[] args) {
        System.out.println("=== FRUTAS ===\n");
        System.out.println("=INSTANCIACION DE 3 FRUTAS DE DIFERENTES FORMAS=\n");
        
        System.out.println("==FORMA 1==");
        Fruta kiwi = new Fruta();
        kiwi.setNombre("Kiwi");
        kiwi.setTipo("Subtropical");
        kiwi.agregarV("C");
        kiwi.agregarV("K");
        kiwi.agregarV("E");
        
        System.out.println("\n==FORMA 2==");
        Fruta naranja = new Fruta("Naranja", "Cítrica");
        naranja.agregarV("C");
        naranja.agregarV("B1");
        naranja.agregarV("B9");
        
        System.out.println("\n==FORMA 3==");
        String[] vitaminasFresa = {"C", "K", "B9"};
        Fruta fresa = new Fruta("Fresa", "Bosque", vitaminasFresa);
        fresa.agregarV("B5");
        
        System.out.println("\n=FRUTAS INSTANCIADAS=");
        kiwi.mostrarInfo();
        naranja.mostrarInfo();
        fresa.mostrarInfo();
        
        System.out.println("\n=FRUTA CON MÁS VITAMINAS=");
        Fruta[] frutas = {kiwi, naranja, fresa};
        Fruta frutaMasVitaminas = frutas[0];
        
        for (Fruta fruta : frutas) {
            if (fruta.getNroVitaminas() > frutaMasVitaminas.getNroVitaminas()) {
                frutaMasVitaminas = fruta;
            }
        }
        System.out.println("La fruta con mas vitaminas es: " + frutaMasVitaminas.getNombre() + " con " + frutaMasVitaminas.getNroVitaminas() + " vitaminas");
        
        
        System.out.println("\n=VITAMINAS DE LA NARANJA=");
        naranja.mostrarInfo();
        
        
        System.out.println("\n=VITAMINAS CITRICAS=");
        int totalVitaminasCitricas = 0;
        for (Fruta fruta : frutas) {
            int citricasFruta = fruta.nroVCitricas();
            System.out.println(fruta.getNombre() + " tiene " + citricasFruta + " vitaminas cítricas");
            totalVitaminasCitricas = totalVitaminasCitricas + citricasFruta;
        }
        System.out.println("Total de vitaminas citricas en todas las frutas: " + totalVitaminasCitricas);
        
        
        System.out.println("\n=ORDENACIÓN POR NOMBRE DE PRIMERA VITAMINA=");
        
    
        Arrays.sort(frutas, new Comparator<Fruta>() {
            @Override
            public int compare(Fruta f1, Fruta f2) {
                if (f1.getNroVitaminas() == 0 && f2.getNroVitaminas() == 0) return 0;
                if (f1.getNroVitaminas() == 0) return -1;
                if (f2.getNroVitaminas() == 0) return 1;
                
                String vit1 = f1.getV()[0];
                String vit2 = f2.getV()[0];
                return vit1.compareTo(vit2);
            }
        });
        
        System.out.println("Frutas ordenadas por primera vitamina");
        for (Fruta fruta : frutas) {
            if (fruta.getNroVitaminas() > 0) {
                System.out.println(fruta.getNombre() + " - Primera vitamina: " + fruta.getV()[0]);
            } else {
                System.out.println(fruta.getNombre() + " - Sin vitaminas");
            }
        }
        
        System.out.println("\n=== INFORMACION FINAL ===");
        for (Fruta fruta : frutas) {
            fruta.mostrarInfo();
            System.out.println("Vitaminas citricas: " + fruta.nroVCitricas());
            System.out.println("---");
        }
    }
    
}
