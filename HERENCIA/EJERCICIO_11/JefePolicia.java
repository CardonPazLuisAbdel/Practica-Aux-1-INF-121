package HERENCIA.EJERCICIO_11;

public class JefePolicia implements IPersona, IEmpleado, IPolicia {
    private String nombre;
    private int edad;

    private double sueldo;
    private String departamento;

    private String grado;
    private int añosServicio;

    private int numeroAgentes;
    private String distrito;

    public JefePolicia(String nombre, int edad, double sueldo, String departamento, String grado, int añosServicio, int numeroAgentes, String distrito) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        this.departamento = departamento;
        this.grado = grado;
        this.añosServicio = añosServicio;
        this.numeroAgentes = numeroAgentes;
        this.distrito = distrito;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    public double getSueldo() { return sueldo; }
    public String getDepartamento() { return departamento; }

    public String getGrado() { return grado; }
    public int getAñosServicio() { return añosServicio; }

    public int getNumeroAgentes() { return numeroAgentes; }
    public String getDistrito() { return distrito; }

    public void mostrarDatos() {
        System.out.println("=== DATOS COMPLETOS JEFE POLICIA ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " anios");
        System.out.println("Sueldo: $" + sueldo);
        System.out.println("Departamento: " + departamento);
        System.out.println("Grado: " + grado);
        System.out.println("Anios de Servicio: " + añosServicio);
        System.out.println("Numero de Agentes: " + numeroAgentes);
        System.out.println("Distrito: " + distrito);
    }
}
