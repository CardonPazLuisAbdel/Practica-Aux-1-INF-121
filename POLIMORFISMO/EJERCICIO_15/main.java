package POLIMORFISMO.EJERCICIO_15;

public class main {
        public static void main(String[] args) {
        Laboratorio lasin1 = new Laboratorio("Lasin 1", 10);
        Laboratorio lasin2 = new Laboratorio("Lasin 2", 8);

        Ordenador ord1 = new Ordenador("SER001", 1, 16, "Intel i7", "activo");
        Ordenador ord2 = new Ordenador("SER002", 2, 8, "Intel i5", "activo");
        Ordenador ord3 = new Ordenador("SER003", 3, 4, "Intel i3", "inactivo");
        Ordenador ord4 = new Ordenador("SER004", 4, 32, "AMD Ryzen 7", "activo");
        Ordenador ord5 = new Ordenador("SER005", 5, 16, "Intel i7", "activo");
        Ordenador ord6 = new Ordenador("SER006", 6, 8, "Intel i5", "inactivo");

        lasin1.agregarOrdenador(ord1);
        lasin1.agregarOrdenador(ord2);
        lasin1.agregarOrdenador(ord3);
        lasin1.agregarOrdenador(ord4);
        
        lasin2.agregarOrdenador(ord5);
        lasin2.agregarOrdenador(ord6);

        System.out.println("=== INFORMACION BASICA ===");
        lasin1.informacion();
        lasin2.informacion();
        
        System.out.println("\n=== ORDENADORES POR ESTADO ===");
        lasin1.informacion("activo");
        lasin1.informacion("inactivo");
        
        System.out.println("\n=== ORDENADORES CON MAS DE 8GB RAM ===");
        lasin1.informacion(8);
        lasin2.informacion(8);
        
        System.out.println("\n=== COMPARACION ENTRE LABORATORIOS ===");
        lasin1.informacion(lasin2);

        System.out.println("\n=== TRASLADO DE ORDENADORES ===");
        System.out.println("Antes del traslado:");
        System.out.println("Lasin 1: " + lasin1.getCantidadOrdenadores() + " ordenadores");
        System.out.println("Lasin 2: " + lasin2.getCantidadOrdenadores() + " ordenadores");
        
        lasin1.trasladarOrdenadores(lasin2, 2);
        
        System.out.println("\nDespues del traslado:");
        System.out.println("Lasin 1: " + lasin1.getCantidadOrdenadores() + " ordenadores");
        System.out.println("Lasin 2: " + lasin2.getCantidadOrdenadores() + " ordenadores");

        System.out.println("\n=== ESTADO FINAL ===");
        lasin1.informacion("activo");
        lasin2.informacion("activo");
    }
}
