package POLIMORFISMO.EJERCICIO_3;

public class Matriz {
    private float[][] matriz;
    
    public Matriz() {
        this.matriz = new float[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    matriz[i][j] = 1.0f;
                } else {
                    matriz[i][j] = 0.0f;
                }
            }
        }
    }
    
    public Matriz(float[][] matriz) {
        this.matriz = matriz;
    }
    
    public Matriz sumar(Matriz otra) {
        float[][] resultado = new float[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                resultado[i][j] = this.matriz[i][j] + otra.matriz[i][j];
            }
        }
        return new Matriz(resultado);
    }
    
    public Matriz restar(Matriz otra) {
        float[][] resultado = new float[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                resultado[i][j] = this.matriz[i][j] - otra.matriz[i][j];
            }
        }
        return new Matriz(resultado);
    }
    
    public boolean igual(Matriz otra) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (this.matriz[i][j] != otra.matriz[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public void mostrar() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}