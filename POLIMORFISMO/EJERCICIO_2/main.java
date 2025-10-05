package POLIMORFISMO.EJERCICIO_2;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("== INSTANCIACION DE VIDEOJUEGOS == ");
        
        Videojuego juego1 = new Videojuego();
        juego1.setNombre("Minecraft");
        juego1.setPlataforma("PC/Consolas/Móvil");
        juego1.setCantidadJugadores(4);
        
        Videojuego juego2 = new Videojuego("Fornite");
        juego2.setPlataforma("PC/PS/Xbox/Switch");
        juego2.setCantidadJugadores(100);
        
        Videojuego juego3 = new Videojuego("League of Legends", "PC", 10);
        
        System.out.println("\nINFORMACIÓN INICIAL DE LOS VIDEOJUEGOS:");
        juego1.mostrarInfo();
        juego2.mostrarInfo();
        juego3.mostrarInfo();
        
        System.out.println("\nSOBRECARGA");
        
        System.out.println("\n--- PROBANDO CON " + juego1.getNombre() + " ---");
        System.out.println("Estado inicial: " + juego1.getCantidadJugadores() + " jugadores");
        
        System.out.println("\n1. agregarJugador() - sin parámetros:");
        juego1.agregarJugador();
        
        System.out.println("\n2. agregarJugadores() - con entrada por teclado:");
        juego1.agregarJugadores();
        
        System.out.println("\n3. agregarJugadores(3) - con parámetro:");
        juego1.agregarJugadores(3);
        
        System.out.println("\nEstado final de " + juego1.getNombre() + ": " + 
                        juego1.getCantidadJugadores() + " jugadores");
        
        System.out.println("\n--- PROBANDO CON " + juego2.getNombre() + " ---");
        System.out.println("Estado inicial: " + juego2.getCantidadJugadores() + " jugadores");
        
        juego2.agregarJugador();                    
        juego2.agregarJugadores(5);                 
        juego2.agregarJugador();                    
        
        System.out.println("Estado final de " + juego2.getNombre() + ": " + 
                        juego2.getCantidadJugadores() + " jugadores");
        
        System.out.println("\n--- PROBANDO CON " + juego3.getNombre() + " ---");
        System.out.println("Estado inicial: " + juego3.getCantidadJugadores() + " jugadores");
        
        System.out.println("\nProbando con cantidad negativa:");
        juego3.agregarJugadores(-5);
        
        System.out.println("\nProbando con cantidad cero:");
        juego3.agregarJugadores(0);
        
        juego3.agregarJugadores(2);
        
        System.out.println("Estado final de " + juego3.getNombre() + ": " + 
                        juego3.getCantidadJugadores() + " jugadores");
        
        
        
        Videojuego[] biblioteca = {juego1, juego2, juego3};
        
        System.out.println("\nBIBLIOTECA DE VIDEOJUEGOS (formato corto):");
        for (Videojuego juego : biblioteca) {
            juego.mostrarInfo(true);
        }
        
        System.out.println("\n--- SIMULACION DE SISTEMA DE JUEGO ---");
        simularSistemaJuego(biblioteca);
        
        leer.close();
    }
    
    public static void simularSistemaJuego(Videojuego[] juegos) {
        System.out.println("Iniciando sesiones de juego...");
        
        for (int i = 0; i < juegos.length; i++) {
            System.out.println("\n--- Sesión " + (i + 1) + ": " + juegos[i].getNombre() + " ---");
            if (i == 0) {
                juegos[i].agregarJugador();
            } else if (i == 1) {
                juegos[i].agregarJugadores(3);
            } else {
                System.out.println("Configurando jugadores para " + juegos[i].getNombre() + ":");
                juegos[i].agregarJugadores();
            }
            juegos[i].mostrarInfo(true);
        }
        
        System.out.println("\n--- RESUMEN FINAL ---");
        for (Videojuego juego : juegos) {
            System.out.println(juego.getNombre() + ": " + juego.getCantidadJugadores() + " jugadores activos");
        }
    }
}