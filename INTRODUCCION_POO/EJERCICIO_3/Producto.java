package INTRODUCCION_POO.EJERCICIO_3;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public void vender(int cantidad){
        if(cantidad<=0){
            System.out.println("No se vendio ningun producto");
            return;
        }else if (cantidad > 0 && cantidad <= stock){
            this.stock = this.stock - cantidad;
            System.out.println("Se vendio: " + cantidad + " unidades del producto: " + this.nombre);
        }else{
            System.out.println("No hay stock suficiente del producto: " + this.nombre + " para la venta");
            return;
        }
    }

    public void reabastecer(int cantidad){
        if(cantidad <= 0){
            System.out.println("No se reabastecio ningun producto");
            return;
        }else{
            this.stock = this.stock + cantidad;
            System.out.println("Se reabastecio: " + cantidad + " unidades del producto: " + this.nombre);
        }
    }
    
}
