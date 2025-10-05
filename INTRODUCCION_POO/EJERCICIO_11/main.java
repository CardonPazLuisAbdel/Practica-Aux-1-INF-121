package INTRODUCCION_POO.EJERCICIO_11;

public class main {
    public static void main(String[] args){
        Producto producto1 = new Producto("Laptop", 1500.00);
        Producto producto2 = new Producto("Smartphone", 800.00);
        Producto producto3 = new Producto("Tablet", 400.00);
        Producto producto4 = new Producto("Monitor", 300.00);

        System.out.println("======= Productos =======\n");

        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);
        System.out.println(producto4);

        System.out.println("\n======= Pedidos =======\n");

        Pedido pedido1 = new Pedido(101);
        pedido1.agregarProducto(producto1.getNombre());
        pedido1.agregarProducto(producto2.getNombre());
        pedido1.agregarProducto(producto3.getNombre());
        pedido1.agregarProducto(producto4.getNombre());

        System.out.println(pedido1);

        pedido1.cambiarEstado("Enviado");
        System.out.println(pedido1);
    }
    
}
