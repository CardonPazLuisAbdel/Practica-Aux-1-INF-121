package INTRODUCCION_POO.EJERCICIO_15;

public class Buzon {
    private int nro;
    private int nroC;
    private String[][] cartas;
    private Carta[] detallesCartas;
    
    public Buzon(int nro) {
        this.nro = nro;
        this.nroC = 0;
        this.cartas = new String[50][3];
        this.detallesCartas = new Carta[50];
    }
    
    public void agregarCarta(String codigo, String remitente, String destinatario, String descripcion) {
        if (nroC < 50) {
            cartas[nroC][0] = codigo;
            cartas[nroC][1] = remitente;
            cartas[nroC][2] = destinatario;
            detallesCartas[nroC] = new Carta(codigo, descripcion);
            nroC++;
            System.out.println("Carta " + codigo + " agregada al buzón " + nro);
        } else {
            System.out.println("¡Buzón lleno! No se puede agregar más cartas.");
        }
    }
    
    public boolean eliminarCarta(String codigo) {
        for (int i = 0; i < nroC; i++) {
            if (cartas[i][0] != null && cartas[i][0].equals(codigo)) {
                // Desplazar elementos hacia atrás
                for (int j = i; j < nroC - 1; j++) {
                    cartas[j][0] = cartas[j + 1][0];
                    cartas[j][1] = cartas[j + 1][1];
                    cartas[j][2] = cartas[j + 1][2];
                    detallesCartas[j] = detallesCartas[j + 1];
                }
                cartas[nroC - 1][0] = null;
                cartas[nroC - 1][1] = null;
                cartas[nroC - 1][2] = null;
                detallesCartas[nroC - 1] = null;
                nroC--;
                System.out.println("Carta " + codigo + " eliminada.");
                return true;
            }
        }
        System.out.println("Carta con código " + codigo + " no encontrada.");
        return false;
    }
    
    public int contarCartasPorDestinatario(String destinatario) {
        int count = 0;
        for (int i = 0; i < nroC; i++) {
            if (cartas[i][2] != null && cartas[i][2].equalsIgnoreCase(destinatario)) {
                count++;
            }
        }
        return count;
    }
    
    public String verificarRemitenteRecibio(String remitente) {
        StringBuilder resultado = new StringBuilder();
        boolean encontrado = false;
        
        for (int i = 0; i < nroC; i++) {
            if (cartas[i][2] != null && cartas[i][2].equalsIgnoreCase(remitente)) {
                resultado.append("El remitente '").append(remitente)
                        .append("' recibió una carta de '").append(cartas[i][1]).append("'\n");
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            resultado.append("El remitente '").append(remitente).append("' no ha recibido cartas.");
        }
        
        return resultado.toString();
    }
    
    public void buscarPalabraClave(String palabra) {
        System.out.println("Buscando palabra '" + palabra + "' en las descripciones:");
        boolean encontrada = false;
        
        for (int i = 0; i < nroC; i++) {
            if (detallesCartas[i] != null && detallesCartas[i].contienePalabra(palabra)) {
                System.out.println("Coincidencia encontrada:");
                System.out.println("Código: " + cartas[i][0]);
                System.out.println("Remitente: " + cartas[i][1]);
                System.out.println("Destinatario: " + cartas[i][2]);
                System.out.println("Descripción: " + detallesCartas[i].getDescripcion());
                System.out.println("---");
                encontrada = true;
            }
        }
        
        if (!encontrada) {
            System.out.println("No se encontraron coincidencias para la palabra '" + palabra + "'");
        }
    }
    
    public void mostrarCartas() {
        System.out.println("=== BUZÓN " + nro + " ===");
        System.out.println("Número de cartas: " + nroC);
        
        if (nroC == 0) {
            System.out.println("El buzón está vacío.");
            return;
        }
        
        for (int i = 0; i < nroC; i++) {
            System.out.println("Carta " + (i + 1) + ":");
            System.out.println("  Código: " + cartas[i][0]);
            System.out.println("  Remitente: " + cartas[i][1]);
            System.out.println("  Destinatario: " + cartas[i][2]);
            if (detallesCartas[i] != null) {
                System.out.println("  Descripción: " + detallesCartas[i].getDescripcion());
            }
            System.out.println("---");
        }
    }
    
    public int getNro(){ 
        return nro; 
    }
    public int getNroC(){ 
        return nroC; 
    }
    public String[][] getCartas(){ 
        return cartas; 
    }
}
