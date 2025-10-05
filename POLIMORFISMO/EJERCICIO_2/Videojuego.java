package POLIMORFISMO.EJERCICIO_2;
import java.util.Scanner;
public class Videojuego {
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;
    
    public Videojuego() {
        this.nombre = "Sin nombre";
        this.plataforma = "PC";
        this.cantidadJugadores = 1;
    }
    
    public Videojuego(String nombre) {
        this.nombre = nombre;
        this.plataforma = "Multiplataforma";
        this.cantidadJugadores = 1;
    }
    
    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }
    
    public String getNombre(){ 
        return nombre; 
    }

    public void setNombre(String nombre){ 
        this.nombre = nombre; 
    }
    
    public String getPlataforma(){ 
        return plataforma; 
    }

    public void setPlataforma(String plataforma){ 
        this.plataforma = plataforma; 
    }
    
    public int getCantidadJugadores(){ 
        return cantidadJugadores; 
    }

    public void setCantidadJugadores(int cantidadJugadores){ 
        this.cantidadJugadores = cantidadJugadores; 
    }
    
    public void agregarJugador() {
        this.cantidadJugadores++;
        System.out.println("Se agregó 1 jugador. Total: " + cantidadJugadores);
    }
    
    public void agregarJugadores() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de jugadores a agregar: ");
        
        try {
            int cantidad = leer.nextInt();
            if (cantidad > 0) {
                this.cantidadJugadores += cantidad;
                System.out.println("Se agregaron " + cantidad + " jugadores. Total: " + cantidadJugadores);
            } else {
                System.out.println("La cantidad debe ser mayor a 0");
            }
        } catch (Exception e) {
            System.out.println("Error: Debe ingresar un numero valido");
        }
    }
    
    public void agregarJugadores(int cantidad) {
        if (cantidad > 0) {
            this.cantidadJugadores += cantidad;
            System.out.println("Se agregaron " + cantidad + " jugadores. Total: " + cantidadJugadores);
        } else {
            System.out.println("La cantidad debe ser mayor a 0");
        }
    }
    
    public void mostrarInfo() {
        System.out.println("=== INFORMACION DEL VIDEOJUEGO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Cantidad de Jugadores: " + cantidadJugadores);
        System.out.println("-----------------------------");
    }
    
    public void mostrarInfo(boolean formatoCorto) {
        if (formatoCorto) {
            System.out.println(nombre + " | " + plataforma + " | " + cantidadJugadores + " jugadores");
        } else {
            mostrarInfo();
        }
    }
}
