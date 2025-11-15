package COMPOSICION_AGREGACION.EJERCICIO_6;

public class Medicamento {
        private String nombre;
        private String tipo;
        private double precio;
        private int stock;
    
    public Medicamento(String nombre, String tipo, double precio, int stock) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.stock = stock;
    }
    
    // Getters y setters
    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
    
    @Override
    public String toString() {
        return "Medicamento{nombre='" + nombre + "', tipo='" + tipo + "', precio=" + precio + ", stock=" + stock + "}";
    }
}
