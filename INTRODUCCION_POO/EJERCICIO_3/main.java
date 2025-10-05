package INTRODUCCION_POO.EJERCICIO_3;

public class main {
    public static void main(String[] args){
        Producto producto1 = new Producto("Leche", 4.5, 20);
        Producto producto2 = new Producto("Pan", 0.5, 15);

        System.out.println("Venta de productos");
        producto1.vender(5);
        producto2.vender(10);
        producto1.vender(20);
        producto2.vender(-3);

        System.out.println("\nReabastecimiento de productos");
        producto1.reabastecer(10);
        producto2.reabastecer(5);
        producto1.reabastecer(-4);
    }
    
}
