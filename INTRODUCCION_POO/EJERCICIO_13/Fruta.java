package INTRODUCCION_POO.EJERCICIO_13;

public class Fruta {
    private String nombre;
    private String tipo;
    private int nroVitaminas;
    private String [] v;

    public Fruta(){
        this.nombre = "Sin nombre";
        this.tipo = "Sin tipo";
        this.nroVitaminas = 0;
        this.v = new String[30];
    }

    public Fruta(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
        this.nroVitaminas = 0;
        this.v = new String[30];
    }
    public Fruta(String nombre, String tipo, String[] v){
        this.nombre = nombre;
        this.tipo = tipo;
        this.v = new String[30];
        this.nroVitaminas = 0;
        for(int i = 0; i < v.length && i < this.v.length; i++){
            if (v[i] != null) {
                this.v[this.nroVitaminas] = v[i];
                this.nroVitaminas++;
            }
        }
        
    }

    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public int getNroVitaminas(){
        return nroVitaminas;
    }

    public String[] getV(){
        return v;
    }

    public void agregarV(String v){
        for(int i = 0; i < this.v.length; i++){
            if(this.v[i] == null){
                this.v[i] = v;
                this.nroVitaminas++;
                System.out.println("Vitamina " + v + " agregada a la fruta.");
                return;
            }
        }
        System.out.println("No se pueden agregar mas vitaminas a la fruta.");
    }

    public void mostrarV(){
        System.out.print("Vitaminas: ");
        for(int i = 0; i < this.nroVitaminas; i++){
            System.out.print(this.v[i] + " ");
        }
        System.out.println();
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Numero de Vitaminas: " + nroVitaminas);
        mostrarV();
    }

    public boolean esCitrica(){
        return tipo.equalsIgnoreCase("Citrica");
    }

    public int nroVCitricas(){
        int count = 0;
        if(v != null){
            for(int i = 0; i < nroVitaminas; i++){
                if(v[i].equalsIgnoreCase("C") || v[i].equalsIgnoreCase("B1") || v[i].equalsIgnoreCase("B2") || v[i].equalsIgnoreCase("B3") || v[i].equalsIgnoreCase("B5") || v[i].equalsIgnoreCase("B6") || v[i].equalsIgnoreCase("B9")){
                    count++;
                }
            }
        }
        return count;
    }
}
