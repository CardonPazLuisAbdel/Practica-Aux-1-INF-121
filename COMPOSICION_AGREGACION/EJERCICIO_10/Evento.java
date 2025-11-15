package COMPOSICION_AGREGACION.EJERCICIO_10;

import java.util.ArrayList;
import java.util.List;

public class Evento {
        private String nombre;
    private List<Charla> charlas;
    private List<Persona> participantes;
    
    public Evento(String nombre) {
        this.nombre = nombre;
        this.charlas = new ArrayList<>();
        this.participantes = new ArrayList<>();
    }
    
    public void agregarCharla(Charla charla) {
        charlas.add(charla);
    }
    
    public void agregarParticipante(Persona participante) {
        participantes.add(participante);
    }
    
    public double edadPromedioParticipantes() {
        if (participantes.isEmpty()) return 0;
        int suma = 0;
        for (Persona p : participantes) {
            suma += p.getEdad();
        }
        return (double) suma / participantes.size();
    }
    
    public boolean personaEnCharla(String nombre, String apellido) {
        for (Charla charla : charlas) {
            if (charla.contienePersona(nombre, apellido)) {
                return true;
            }
        }
        return false;
    }
    
    public void eliminarCharlasPorSpeaker(String ciSpeaker) {
        charlas.removeIf(charla -> charla.getSpeaker() != null && charla.getSpeaker().getCi().equals(ciSpeaker));
    }
    
    public void ordenarCharlasPorParticipantes() {
        charlas.sort((c1, c2) -> Integer.compare(c2.getNroParticipantes(), c1.getNroParticipantes()));
    }
    
    public void mostrarCharlas() {
        System.out.println("Charlas del evento " + nombre + ":");
        for (Charla charla : charlas) {
            System.out.println("Título: " + charla.getTitulo() + ", Speaker: " + (charla.getSpeaker() != null ? charla.getSpeaker().getNombre() : "Ninguno") +", Participantes: " + charla.getNroParticipantes());
        }
    }
}
