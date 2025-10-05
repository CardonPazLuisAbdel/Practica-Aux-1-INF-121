package POLIMORFISMO.EJERCICIO_7;

public class Parada {
    private int nroAdmins;
    private int nroAutos;
    private String[] admins;
    private String[][] autos;
    
    public Parada() {
        this.nroAdmins = 0;
        this.nroAutos = 0;
        this.admins = new String[10];
        this.autos = new String[10][3];
    }
    
    public Parada(int nroAdmins, int nroAutos) {
        this.nroAdmins = 0;
        this.nroAutos = 0; 
        this.admins = new String[10];
        this.autos = new String[10][3];
    }
    
    public void adicionar(String admin) {
        if (nroAdmins < 10) {
            admins[nroAdmins] = admin;
            nroAdmins++;
        }
    }
    
    public void adicionar(String conductor, String placa, String nombreP) {
        if (nroAutos < 10) {
            autos[nroAutos][0] = conductor;
            autos[nroAutos][1] = placa;
            autos[nroAutos][2] = nombreP;
            nroAutos++;
        }
    }
    
    public void mostrar() {
        System.out.println("Número de Admins: " + nroAdmins);
        System.out.println("Número de Autos: " + nroAutos);
        
        System.out.println("Administradores:");
        for (int i = 0; i < nroAdmins; i++) {
            System.out.println("- " + admins[i]);
        }
        
        System.out.println("Autos:");
        for (int i = 0; i < nroAutos; i++) {
            System.out.println("- Conductor: " + autos[i][0] + ", Placa: " + autos[i][1] + ", NombreP: " + autos[i][2]);
        }
    }
}
