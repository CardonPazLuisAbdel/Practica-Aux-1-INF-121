package COMPOSICION_AGREGACION.EJERCICIO_10;

public class Main {
        public static void main(String[] args) {
        Evento evento = new Evento("Conferencia de Tecnologia");

        Persona speaker1 = new Persona("Ana", "Garcia", 35, "speaker", "11111");
        Persona speaker2 = new Persona("Carlos", "Lopez", 40, "speaker", "22222");
        Persona participante1 = new Persona("Juan", "Perez", 25, "participante", "33333");
        Persona participante2 = new Persona("Maria", "Rodriguez", 28, "participante", "44444");
        Persona participante3 = new Persona("Pedro", "Martinez", 30, "participante", "55555");

        Charla charla1 = new Charla("Inteligencia Artificial", speaker1);
        Charla charla2 = new Charla("Blockchain", speaker2);

        charla1.agregarParticipante(participante1);
        charla1.agregarParticipante(participante2);
        charla2.agregarParticipante(participante3);

        evento.agregarCharla(charla1);
        evento.agregarCharla(charla2);

        evento.agregarParticipante(participante1);
        evento.agregarParticipante(participante2);
        evento.agregarParticipante(participante3);

        System.out.println("Edad promedio de participantes: " + evento.edadPromedioParticipantes());
        
        System.out.println("¿Juan Perez esta en alguna charla? " + evento.personaEnCharla("Juan", "Perez"));
        
        evento.mostrarCharlas();

        evento.ordenarCharlasPorParticipantes();
        System.out.println("\nCharlas ordenadas por participantes:");
        evento.mostrarCharlas();
    }
}
