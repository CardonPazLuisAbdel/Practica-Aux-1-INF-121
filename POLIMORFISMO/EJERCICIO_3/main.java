package POLIMORFISMO.EJERCICIO_3;

public class main {
    public static void main(String[] args) {
        Matriz identidad = new Matriz();
        System.out.println("Matriz Identidad:");
        identidad.mostrar();
        
        float[][] datos1 = new float[10][10];
        float[][] datos2 = new float[10][10];
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                datos1[i][j] = i + j;
                datos2[i][j] = i * j;
            }
        }
        
        Matriz matriz1 = new Matriz(datos1);
        Matriz matriz2 = new Matriz(datos2);
        
        System.out.println("\nMatriz 1:");
        matriz1.mostrar();
        
        System.out.println("\nMatriz 2:");
        matriz2.mostrar();
        
        Matriz suma = matriz1.sumar(matriz2);
        System.out.println("\nSuma de matrices:");
        suma.mostrar();
        
        Matriz resta = matriz1.restar(matriz2);
        System.out.println("\nResta de matrices:");
        resta.mostrar();
        
        System.out.println("\n¿Matriz1 es igual a Matriz2? " + matriz1.igual(matriz2));
        System.out.println("¿Matriz1 es igual a sí misma? " + matriz1.igual(matriz1));
    }
}

