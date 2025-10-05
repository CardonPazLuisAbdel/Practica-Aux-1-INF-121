package INTRODUCCION_POO.EJERCICIO_15;

public class Carta {
    private String codigo;
    private String descripcion;
    
    public Carta(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }
    
    public String getCodigo(){ 
        return codigo; 
    }

    public void setCodigo(String codigo){ 
        this.codigo = codigo; 
    }
    
    public String getDescripcion(){ 
        return descripcion; 
    }

    public void setDescripcion(String descripcion){ 
        this.descripcion = descripcion; 
    }
    
    public boolean contienePalabra(String palabra){
        return descripcion.toLowerCase().contains(palabra.toLowerCase());
    }
    
    public void mostrarInfo(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("---");
    }
}
