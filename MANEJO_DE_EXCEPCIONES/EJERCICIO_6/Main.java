package MANEJO_DE_EXCEPCIONES.EJERCICIO_6;

public class Main {
        public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("12345", "Juan Perez", 1000.0);
        
        System.out.println("=== CUENTA INICIAL ===");
        cuenta.mostrarInfo();

        System.out.println("\n=== DEPOSITO VALIDO ===");
        try {
            cuenta.depositar(500.0);
            System.out.println("Deposito exitoso de 500.0");
            cuenta.mostrarInfo();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== DEPOSITO CON MONTO NEGATIVO ===");
        try {
            cuenta.depositar(-100.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== RETIRO VALIDO ===");
        try {
            cuenta.retirar(200.0);
            System.out.println("Retiro exitoso de 200.0");
            cuenta.mostrarInfo();
        } catch (FondosInsuficientesException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== RETIRO QUE SUPERA EL SALDO ===");
        try {
            cuenta.retirar(2000.0);
        } catch (FondosInsuficientesException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== ESTADO FINAL ===");
        cuenta.mostrarInfo();
    }
}
