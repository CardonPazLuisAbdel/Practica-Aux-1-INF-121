package MANEJO_DE_EXCEPCIONES.EJERCICIO_6;

public class CuentaBancaria {
        private String numeroCuenta;
    private String titular;
    private double saldo;
    
    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    
    public void depositar(double monto) throws IllegalArgumentException {
        if (monto <= 0) {
            throw new IllegalArgumentException("Error: El monto a depositar debe ser positivo");
        }
        saldo += monto;
    }
    
    public void retirar(double monto) throws FondosInsuficientesException {
        if (monto > saldo) {
            throw new FondosInsuficientesException("Error: Fondos insuficientes. Saldo actual: " + saldo);
        }
        saldo -= monto;
    }
    
    public void mostrarInfo() {
        System.out.println("Cuenta: " + numeroCuenta + ", Titular: " + titular + ", Saldo: " + saldo);
    }

    public String getNumeroCuenta() { return numeroCuenta; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }
}
