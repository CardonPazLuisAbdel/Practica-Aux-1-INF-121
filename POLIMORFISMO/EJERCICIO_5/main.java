package POLIMORFISMO.EJERCICIO_5;

public class main {
        public static void main(String[] args) {
        Celular celular = new Celular("77712345", "Juan Perez", 128.0, 8, 15);
        
        System.out.println("== DATOS ANTES DE LOS OPERADORES ==");
        celular.mostrarDatos();
        
        celular.operatorPlusPlus();
        
        celular.operatorMinusMinus();
        
        System.out.println("== DATOS DESPUES DE LOS OPERADORES ==");
        celular.mostrarDatos();
    }
}
