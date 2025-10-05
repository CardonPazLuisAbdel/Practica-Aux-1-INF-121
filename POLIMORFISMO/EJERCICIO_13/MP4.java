package POLIMORFISMO.EJERCICIO_13;

public class MP4 {
    private String marca;
    private double capacidadGb;
    private int nroCanciones;
    private String[][] canciones;
    private int nroVideos;
    private String[][] videos;
    
    public MP4() {
        this.marca = "";
        this.capacidadGb = 0;
        this.nroCanciones = 0;
        this.nroVideos = 0;
        this.canciones = new String[100][3];
        this.videos = new String[100][3];
    }
    
    public MP4(String marca, double capacidadGb) {
        this.marca = marca;
        this.capacidadGb = capacidadGb;
        this.nroCanciones = 0;
        this.nroVideos = 0;
        this.canciones = new String[100][3];
        this.videos = new String[100][3];
    }
    
    public void agregarCancion(String nombre, String artista, double pesoKb) {
        if (nroCanciones < 100) {
            canciones[nroCanciones][0] = nombre;
            canciones[nroCanciones][1] = artista;
            canciones[nroCanciones][2] = String.valueOf(pesoKb);
            nroCanciones++;
        }
    }
    
    public void agregarVideo(String nombre, String artista, double pesoMb) {
        if (nroVideos < 100) {
            videos[nroVideos][0] = nombre;
            videos[nroVideos][1] = artista;
            videos[nroVideos][2] = String.valueOf(pesoMb);
            nroVideos++;
        }
    }

    public void borrar(String nombre) {
        for (int i = 0; i < nroCanciones; i++) {
            if (canciones[i][0] != null && canciones[i][0].equals(nombre)) {
                eliminarCancion(i);
                System.out.println("Canción '" + nombre + "' eliminada por nombre");
                return;
            }
        }
        System.out.println("Canción '" + nombre + "' no encontrada");
    }

    public void borrar(String artista, boolean porArtista) {
        int eliminadas = 0;
        for (int i = nroCanciones - 1; i >= 0; i--) {
            if (canciones[i][1] != null && canciones[i][1].equals(artista)) {
                eliminarCancion(i);
                eliminadas++;
            }
        }
        System.out.println(eliminadas + " canciones del artista '" + artista + "' eliminadas");
    }

    public void borrar(String nombre, double peso) {
        for (int i = 0; i < nroCanciones; i++) {
            if (canciones[i][0] != null && canciones[i][0].equals(nombre) &&
                Double.parseDouble(canciones[i][2]) == peso) {
                eliminarCancion(i);
                System.out.println("Canción '" + nombre + "' con peso " + peso + "Kb eliminada");
                return;
            }
        }
        System.out.println("Canción '" + nombre + "' con peso " + peso + "Kb no encontrada");
    }

    public boolean operatorPlus(String[] cancion) {
        if (nroCanciones >= 100) {
            System.out.println("No hay espacio para más canciones");
            return false;
        }

        for (int i = 0; i < nroCanciones; i++) {
            if (canciones[i][0] != null && canciones[i][0].equals(cancion[0]) &&
                canciones[i][1] != null && canciones[i][1].equals(cancion[1])) {
                System.out.println("La canción ya existe en el reproductor");
                return false;
            }
        }

        double pesoCancionKb = Double.parseDouble(cancion[2]);
        double capacidadUsada = calcularCapacidadUsada();
        double capacidadDisponible = capacidadGb * 1024 - capacidadUsada; 
        
        if (pesoCancionKb > capacidadDisponible) {
            System.out.println("No hay suficiente espacio para agregar la canción");
            return false;
        }

        canciones[nroCanciones][0] = cancion[0];
        canciones[nroCanciones][1] = cancion[1];
        canciones[nroCanciones][2] = cancion[2];
        nroCanciones++;
        System.out.println("Canción '" + cancion[0] + "' agregada exitosamente");
        return true;
    }

    public boolean operatorMinus(String[] video) {
        if (nroVideos >= 100) {
            System.out.println("No hay espacio para más videos");
            return false;
        }

        for (int i = 0; i < nroVideos; i++) {
            if (videos[i][0] != null && videos[i][0].equals(video[0]) &&
                videos[i][1] != null && videos[i][1].equals(video[1])) {
                System.out.println("El video ya existe en el reproductor");
                return false;
            }
        }

        double pesoVideoMb = Double.parseDouble(video[2]);
        double capacidadUsada = calcularCapacidadUsada();
        double capacidadDisponible = capacidadGb * 1024 - capacidadUsada; // Convertir GB a MB
        
        if (pesoVideoMb > capacidadDisponible) {
            System.out.println("No hay suficiente espacio para agregar el video");
            return false;
        }

        videos[nroVideos][0] = video[0];
        videos[nroVideos][1] = video[1];
        videos[nroVideos][2] = video[2];
        nroVideos++;
        System.out.println("Video '" + video[0] + "' agregado exitosamente");
        return true;
    }

    public void mostrarCapacidad() {
        double capacidadUsada = calcularCapacidadUsada();
        double capacidadDisponible = capacidadGb * 1024 - capacidadUsada;
        
        System.out.println("Capacidad total: " + capacidadGb + " GB");
        System.out.println("Capacidad usada: " + String.format("%.2f", capacidadUsada) + " MB");
        System.out.println("Capacidad disponible: " + String.format("%.2f", capacidadDisponible) + " MB");
        System.out.println("Canciones: " + nroCanciones);
        System.out.println("Videos: " + nroVideos);
    }

    private void eliminarCancion(int index) {
        for (int i = index; i < nroCanciones - 1; i++) {
            canciones[i][0] = canciones[i + 1][0];
            canciones[i][1] = canciones[i + 1][1];
            canciones[i][2] = canciones[i + 1][2];
        }
        nroCanciones--;
    }
    
    private double calcularCapacidadUsada() {
        double total = 0;

        for (int i = 0; i < nroCanciones; i++) {
            if (canciones[i][2] != null) {
                total += Double.parseDouble(canciones[i][2]) / 1024;
            }
        }

        for (int i = 0; i < nroVideos; i++) {
            if (videos[i][2] != null) {
                total += Double.parseDouble(videos[i][2]);
            }
        }
        
        return total;
    }

    public String getMarca() { 
        return marca; 
    }

    public int getNroCanciones() { 
        return nroCanciones; 
    }

    public int getNroVideos() { 
        return nroVideos; 
    }
} 
