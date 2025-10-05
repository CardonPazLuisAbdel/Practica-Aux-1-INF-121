package POLIMORFISMO.EJERCICIO_13;

public class main {
        public static void main(String[] args) {

        MP4 mp4 = new MP4("Sony", 16.0);

        mp4.agregarCancion("Back To Black", "Amy Winehouse", 100.0);
        mp4.agregarCancion("Lost On You", "LP", 150.0);
        mp4.agregarCancion("Shape of You", "Ed Sheeran", 120.0);
        
        mp4.agregarVideo("Heathens", "twenty one pilots", 50.0);
        mp4.agregarVideo("Harmonica Andromeda", "KSHMR", 70.0);
        mp4.agregarVideo("Without Me", "Halsey", 30.0);

        System.out.println("=== CAPACIDAD INICIAL ===");
        mp4.mostrarCapacidad();

        System.out.println("\n=== SOBRECARGA METODO BORRAR ===");

        mp4.borrar("Shape of You");

        mp4.borrar("LP", true);

        mp4.borrar("Back To Black", 100.0);

        System.out.println("\n=== OPERADOR + (ANIADIR CANCIÓN) ===");
        String[] nuevaCancion = {"Bohemian Rhapsody", "Queen", "85.5"};
        mp4.operatorPlus(nuevaCancion);

        String[] cancionExistente = {"Lost On You", "LP", "150.0"};
        mp4.operatorPlus(cancionExistente);

        System.out.println("\n=== OPERADOR - (ANIADIR VIDEO) ===");
        String[] nuevoVideo = {"Thunder", "Imagine Dragons", "45.0"};
        mp4.operatorMinus(nuevoVideo);

        String[] videoExistente = {"Heathens", "twenty one pilots", "50.0"};
        mp4.operatorMinus(videoExistente);

        System.out.println("\n=== CAPACIDAD FINAL ===");
        mp4.mostrarCapacidad();
    }
}
