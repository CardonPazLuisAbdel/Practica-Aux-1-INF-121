package INTRODUCCION_POO.EJERCICIO_11;

public class Producto {
    private String nombre;
    private double precio;
    private boolean disponible;

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = true;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public boolean getDisponible(){
        return disponible;
    }

    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }

    public String toString(){
        return "Producto: " + nombre + ", Precio: " + precio + ", Disponible: " + (disponible ? "Si" : "No");
    }
}
