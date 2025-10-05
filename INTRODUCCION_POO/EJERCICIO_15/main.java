package INTRODUCCION_POO.EJERCICIO_15;

public class main {
        public static void main(String[] args) {
        System.out.println("=== BUZONES Y CARTAS ===\n");
        
        System.out.println("== INSTANCIACIÓN DE 3 BUZONES ==");
        
        Buzon buzon1 = new Buzon(001);
        Buzon buzon2 = new Buzon(002);
        Buzon buzon3 = new Buzon(003);
        
        buzon1.agregarCarta("C123", "Juan Álvarez", "Peter Chaves", "Querido Peter, espero que esta carta te encuentre bien. Te escribo para coordinar nuestra reunion de trabajo.");
        buzon1.agregarCarta("C456", "Pepe Mujica", "Wilmer Pérez", "Estimado Wilmer, agradezco tu apoyo en el proyecto. Sin tu ayuda no hubieramos logrado el exito.");
        buzon1.agregarCarta("C789", "Paty Vasques", "Pepe Mujica", "Hola Pepe, te extraño mucho. Espero verte pronto para compartir momentos de amor y felicidad.");
        buzon2.agregarCarta("C111", "María López", "Carlos Ruiz", "Carlos, nuestro amor es eterno. Cada dia te amo mas.");
        buzon2.agregarCarta("C222", "Ana García", "Peter Chaves", "Peter, necesitamos hablar sobre el informe financiero.");
        buzon2.agregarCarta("C333", "Luis Martínez", "Juan Álvarez", "Juan, la reunión se pospuso para la proxima semana.");
        buzon3.agregarCarta("C444", "Pedro Sánchez", "María López", "María, el amor que siento por ti es inmenso.");
        buzon3.agregarCarta("C555", "Wilmer Pérez", "Ana García", "Ana, confirmo la recepcion de los documentos.");
        buzon3.agregarCarta("C666", "Carlos Ruiz", "Paty Vasques", "Paty, nuestro proyecto avanza con mucho amor y dedicacion.");
        
        System.out.println("\n== INSTANCIACION DE 3 CARTAS INDEPENDIENTES ==");
        Carta carta1 = new Carta("C777", "Esta es una carta sobre el amor verdadero.");
        Carta carta2 = new Carta("C888", "Documentos importantes para la empresa.");
        Carta carta3 = new Carta("C999", "El amor y la amistad son esenciales en la vida.");
        
        carta1.mostrarInfo();
        carta2.mostrarInfo();
        carta3.mostrarInfo();
        
        System.out.println("\n== CARTAS RECIBIDAS POR DESTINATARIOS ==");
        String destinatarioX = "Peter Chaves";
        int cartasPeter = buzon1.contarCartasPorDestinatario(destinatarioX) + buzon2.contarCartasPorDestinatario(destinatarioX);
        System.out.println(destinatarioX + " recibio " + cartasPeter + " cartas");
        
        System.out.println("\n== ELIMINACIÓN DE CARTA ==");
        buzon1.eliminarCarta("C123");
        
        System.out.println("\n== VERIFICACIÓN DE REMITENTES QUE RECIBIERON CARTAS ==");
        System.out.println(buzon1.verificarRemitenteRecibio("Pepe Mujica"));
        System.out.println(buzon2.verificarRemitenteRecibio("Juan Álvarez"));
        
        System.out.println("\n== BÚSQUEDA DE PALABRA CLAVE ==");
        buzon1.buscarPalabraClave("amor");
        buzon2.buscarPalabraClave("amor");
        buzon3.buscarPalabraClave("amor");
        
        System.out.println("\n== INFORMACIÓN COMPLETA DE LOS BUZONES ==");
        buzon1.mostrarCartas();
        buzon2.mostrarCartas();
        buzon3.mostrarCartas();
        
        System.out.println("\n=== DATOS ===");
        System.out.println("Total de cartas en todos los buzones: " + (buzon1.getNroC() + buzon2.getNroC() + buzon3.getNroC()));
        System.out.println("Buzón 1: " + buzon1.getNroC() + " cartas");
        System.out.println("Buzón 2: " + buzon2.getNroC() + " cartas");
        System.out.println("Buzón 3: " + buzon3.getNroC() + " cartas");
    }
    
}
