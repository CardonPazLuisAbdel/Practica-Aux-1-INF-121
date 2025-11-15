package MANEJO_DE_EXCEPCIONES.EJERCICIO_4;

public class Main {
        public static void main(String[] args) {
        Inventario inventario = new Inventario();
        System.out.println("=== AGREGAR PRODUCTOS ===");
        try {
            inventario.agregarProducto(new Producto("P001", "Laptop", 1500.0, 10));
            inventario.agregarProducto(new Producto("P002", "Mouse", 25.0, 50));
            inventario.agregarProducto(new Producto("P003", "Teclado", 45.0, 30));
            System.out.println("Productos agregados exitosamente");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== INTENTAR AGREGAR CODIGO DUPLICADO ===");
        try {
            inventario.agregarProducto(new Producto("P001", "Tablet", 300.0, 5));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== INTENTAR AGREGAR PRECIO NEGATIVO ===");
        try {
            inventario.agregarProducto(new Producto("P004", "Auriculares", -50.0, 10));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        inventario.mostrarProductos();

        System.out.println("\n=== VENTAS EXITOSAS ===");
        try {
            inventario.venderProducto("P001", 2);
            inventario.venderProducto("P002", 5);
            System.out.println("Ventas realizadas exitosamente");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== INTENTAR VENDER PRODUCTO INEXISTENTE ===");
        try {
            inventario.venderProducto("P999", 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== INTENTAR VENDER CON STOCK INSUFICIENTE ===");
        try {
            inventario.venderProducto("P001", 20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== INVENTARIO FINAL ===");
        inventario.mostrarProductos();
    }
}
