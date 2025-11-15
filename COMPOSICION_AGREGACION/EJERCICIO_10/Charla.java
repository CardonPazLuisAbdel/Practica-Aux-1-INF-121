package COMPOSICION_AGREGACION.EJERCICIO_10;

import java.util.ArrayList;
import java.util.List;

public class Charla {
        private String titulo;
        private Persona speaker;
        private List<Persona> participantes;
        private int nroParticipantes;
    
    public Charla(String titulo, Persona speaker) {
        this.titulo = titulo;
        this.speaker = speaker;
        this.participantes = new ArrayList<>();
        this.nroParticipantes = 0;
    }
    
    public void agregarParticipante(Persona participante) {
        if (!participante.getRol().equals("participante")) {
            System.out.println("Error: Solo se pueden agregar participantes");
            return;
        }
        participantes.add(participante);
        nroParticipantes++;
    }
    
    public void eliminarCharla() {
        participantes.clear();
        nroParticipantes = 0;
        speaker = null;
    }
    
    public double edadPromedioParticipantes() {
        if (participantes.isEmpty()) return 0;
        int suma = 0;
        for (Persona p : participantes) {
            suma += p.getEdad();
        }
        return (double) suma / participantes.size();
    }
    
    public boolean contienePersona(String nombre, String apellido) {
        if (speaker != null && speaker.getNombre().equals(nombre) && speaker.getApellido().equals(apellido)) {
            return true;
        }
        for (Persona p : participantes) {
            if (p.getNombre().equals(nombre) && p.getApellido().equals(apellido)) {
                return true;
            }
        }
        return false;
    }
    
    public String getTitulo() { return titulo; }
    public Persona getSpeaker() { return speaker; }
    public int getNroParticipantes() { return nroParticipantes; }
    public List<Persona> getParticipantes() { return participantes; }
}
