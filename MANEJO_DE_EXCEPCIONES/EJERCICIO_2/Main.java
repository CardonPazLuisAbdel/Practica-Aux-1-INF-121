package MANEJO_DE_EXCEPCIONES.EJERCICIO_2;

public class Main {
        public static void main(String[] args) {
        System.out.println("=== PRUEBAS EXITOSAS ===");
        try {
            System.out.println("5 + 3 = " + Calculadora.sumar(5, 3));
            System.out.println("5 - 3 = " + Calculadora.restar(5, 3));
            System.out.println("5 * 3 = " + Calculadora.multiplicar(5, 3));
            System.out.println("5 / 3 = " + Calculadora.dividir(5, 3));
            
            int numero = Calculadora.convertirAEntero("123");
            System.out.println("String '123' convertido a: " + numero);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== PRUEBAS CON ERRORES ===");
        try {
            System.out.println("5 / 0 = " + Calculadora.dividir(5, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            int numero = Calculadora.convertirAEntero("abc");
            System.out.println("String 'abc' convertido a: " + numero);
        } catch (NumeroInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            int numero = Calculadora.convertirAEntero("12.34");
            System.out.println("String '12.34' convertido a: " + numero);
        } catch (NumeroInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
