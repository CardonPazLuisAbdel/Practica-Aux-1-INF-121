package HERENCIA.EJERCICIO_1;

public class main {
        public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan", "Perez", "1234567", "COMP001", "CLI001");
        Jefe jefe = new Jefe("Maria", "Gomez", "7654321", "Centro", "Gerente");
        
        System.out.println("=== DATOS DEL CLIENTE ===");
        cliente.mostrarDatos();
        
        System.out.println("\n=== DATOS DEL JEFE ===");
        jefe.mostrarDatos();


        System.out.println("\n=== ERRORES EN EL DIAGRAMA ORIGINAL ===");
        System.out.println("1. FALTA HERENCIA: No hay relacion de herencia entre las clases");
        System.out.println("2. DUPLICACION DE ATRIBUTOS:");
        System.out.println("   - 'nombre' aparece en Persona y Cliente");
        System.out.println("   - 'ci' aparece en Persona y Jefe");
        System.out.println("3. NOMBRES INCORRECTOS:");
        System.out.println("   - Clases en minuscula (deben ser PascalCase)");
        System.out.println("   - Metodo generico 'method(type): type' sin proposito claro");
        System.out.println("4. FALTAN CONSTRUCTORES: No se especifican constructores");
        System.out.println("5. FALTAN METODOS ESPECIFICOS: No hay metodos utiles");
        
        System.out.println("\n=== CoMO EVITAR ESTOS ERRORES ===");
        System.out.println("1. ESTABLECER HERENCIA: Usar flechas de herencia cuando hay relacion 'es-un'");
        System.out.println("2. EVITAR DUPLICACION: Los atributos comunes van en la clase base");
        System.out.println("3. USAR CONVENCIONES:");
        System.out.println("   - Clases en PascalCase: Persona, Cliente, Jefe");
        System.out.println("   - Metodos con nombres descriptivos");
        System.out.println("4. INCLUIR CONSTRUCTORES: Especificar constructores con parametros");
        System.out.println("5. DEFINIR METODOS RELEVANTES: Metodos que representen comportamientos reales");
        System.out.println("6. USAR super(): Llamar al constructor de la clase base en subclases");
        System.out.println("7. SOBRESCRIBIR METODOS: Usar override para personalizar comportamientos");
    }
    
}
