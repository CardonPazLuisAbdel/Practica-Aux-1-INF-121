package MANEJO_DE_EXCEPCIONES.EJERCICIO_4;

public class Inventario {
    private java.util.ArrayList<Producto> productos;
    
    public Inventario() {
        this.productos = new java.util.ArrayList<>();
    }
    
    public void agregarProducto(Producto p) throws IllegalArgumentException {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(p.getCodigo())) {
                throw new IllegalArgumentException("Error: El codigo '" + p.getCodigo() + "' ya existe");
            }
        }

        if (p.getPrecio() < 0) {
            throw new IllegalArgumentException("Error: El precio no puede ser negativo");
        }
        if (p.getStock() < 0) {
            throw new IllegalArgumentException("Error: El stock no puede ser negativo");
        }
        
        productos.add(p);
    }
    
    public Producto buscarProducto(String codigo) throws ProductoNoEncontradoException {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        throw new ProductoNoEncontradoException("Error: Producto con codigo '" + codigo + "' no encontrado");
    }
    
    public void venderProducto(String codigo, int cantidad) 
            throws ProductoNoEncontradoException, StockInsuficienteException {
        Producto producto = buscarProducto(codigo);
        
        if (producto.getStock() < cantidad) {
            throw new StockInsuficienteException("Error: Stock insuficiente para el producto '" + producto.getNombre() + "'. Stock actual: " + producto.getStock());
        }
        producto.setStock(producto.getStock() - cantidad);
    }
    
    public void mostrarProductos() {
        System.out.println("=== INVENTARIO ===");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
