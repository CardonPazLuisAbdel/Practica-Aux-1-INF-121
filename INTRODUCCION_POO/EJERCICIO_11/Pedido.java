package INTRODUCCION_POO.EJERCICIO_11;

public class Pedido {
    private int numeroPedido;
    private String estado;
    private String[] productos;

    public Pedido(int numeroPedido){
        this.numeroPedido = numeroPedido;
        this.estado = "Registrado";
        this.productos = new String[3];
    }

    public void agregarProducto(String producto){
        for(int i = 0; i < productos.length; i++){
            if(productos[i] == null){
                productos[i] = producto;
                System.out.println("Producto " + producto + " agregado al pedido.");
                return;
            }
        }
        System.out.println("No se pueden agregar mas productos al pedido.");
    }

    public void cambiarEstado(String nuevoEstado){
        this.estado = nuevoEstado;
        System.out.println("El estado del pedido " + numeroPedido + " ha sido cambiado a: " + nuevoEstado);
    }

    public int getNumeroPedido(){
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido){
        this.numeroPedido = numeroPedido;
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public String toString(){
        StringBuilder productosList = new StringBuilder();
        for(String producto : productos){
            if(producto != null){
                productosList.append(producto).append(", ");
            }
        }
        if(productosList.length() > 0){
            productosList.setLength(productosList.length() - 2);
        } else {
            productosList.append("No hay productos");
        }
        return "Pedido Numero: " + numeroPedido + ", Estado: " + estado + ", Productos: [" + productosList.toString() + "]";
    }
    
}
