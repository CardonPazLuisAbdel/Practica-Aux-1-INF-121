package INTRODUCCION_POO.EJERCICIO_7;

public class Mascota {
    private String nombre;
    private String tipo;
    private int energia;
    private static final int maxEnergia = 100;
    private static final int minEnergia = 0;

    public Mascota(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
        this.energia = 100;
    }

        public void jugar(int cantidad){
        cantidad = cantidad * -15;
        int energiarestante = this.energia + cantidad;
        if(cantidad >= minEnergia){
            System.out.println("No se jugo con la mascota");
            return;
        }else if (energiarestante >= minEnergia && energiarestante <= maxEnergia){
            this.energia = energiarestante;
            System.out.println("Se jugo con la mascota: " + this.nombre + ", su energia es: " + this.energia);
            return;
        }else{
            System.out.println("la mascota no tiene energia para jugar");
            return;}
    }

    public void alimentar(int cantidad){
        int energiaGanada = cantidad * 20;
        int nuevaEnergia = this.energia + energiaGanada;
        if (energiaGanada <= 0) {
            System.out.println("No se alimento a la mascota");
            return;
        } else if (nuevaEnergia >= maxEnergia) {
            this.energia = maxEnergia;
            System.out.println("Se alimento a la mascota: " + this.nombre + ", su energia es: " + this.energia);
            return;
        } else {
            this.energia = nuevaEnergia;
            System.out.println("Se alimento a la mascota: " + this.nombre + ", su energia es: " + this.energia);
            return;
        }
    }

}
