package MANEJO_DE_EXCEPCIONES.EJERCICIO_2;

public class Calculadora {
        public static int sumar(int a, int b) {
        return a + b;
    }
    
    public static int restar(int a, int b) {
        return a - b;
    }
    
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    
    public static double dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Error: Division por cero no permitida");
        }
        return (double) a / b;
    }

    public static int convertirAEntero(String str) throws NumeroInvalidoException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new NumeroInvalidoException("Error: '" + str + "' no es un numero válido");
        }
    }
}
