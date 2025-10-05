package INTRODUCCION_POO.EJERCICIO_7;

public class main {
    public static void main(String[] args){
        Mascota mascota1 = new Mascota("Firulais", "Perro");
        Mascota mascota2 = new Mascota("Michi", "Gato");

        
        System.out.println("Jugar con las mascotas");
        mascota1.jugar(3);
        mascota2.jugar(3);


        System.out.println("\nAlimentar mascotas");
        mascota1.alimentar(3);
        mascota2.alimentar(2);
    }
    
}
