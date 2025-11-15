package MANEJO_DE_EXCEPCIONES.EJERCICIO_4;

public class StockInsuficienteException extends Exception {
        public StockInsuficienteException(String mensaje) {
        super(mensaje);
    }
}
