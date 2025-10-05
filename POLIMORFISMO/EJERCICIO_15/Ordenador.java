package POLIMORFISMO.EJERCICIO_15;

public class Ordenador {
    private String codigoSerial;
    private int numero;
    private int memoriaRAM;
    private String procesador;
    private String estado;
    
    public Ordenador() {
        this.codigoSerial = "";
        this.numero = 0;
        this.memoriaRAM = 0;
        this.procesador = "";
        this.estado = "inactivo";
    }
    
    public Ordenador(String codigoSerial, int numero, int memoriaRAM, String procesador, String estado) {
        this.codigoSerial = codigoSerial;
        this.numero = numero;
        this.memoriaRAM = memoriaRAM;
        this.procesador = procesador;
        this.estado = estado;
    }
    
    public void informacion() {
        System.out.println("Serial: " + codigoSerial + " | Numero: " + numero + " | RAM: " + memoriaRAM + "GB | Procesador: " + procesador + " | Estado: " + estado);
    }

    public String getCodigoSerial() { 
        return codigoSerial;
    }

    public int getNumero() { 
        return numero; 
    }

    public int getMemoriaRAM() { 
        return memoriaRAM; 
    }

    public String getProcesador() { 
        return procesador;
    }

    public String getEstado() { 
        return estado; 
    }

    public void setEstado(String estado) { 
        this.estado = estado; 
    }
}