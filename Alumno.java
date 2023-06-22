import java.util.ArrayList;
public class Alumno {
    private String nombre;
    private String apellido;
    private String rut;
    private int numeroMatricula;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String rut, int numeroMatricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public boolean validarRut() {
        // Lógica de validación del rut
        // Retorna true si el rut es válido, false en caso contrario
        return true;
    }

    public static boolean buscarAlumnoPorRut(String rut, ArrayList<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            if (alumno.getRut().equals(rut)) {
                return true; // El alumno existe
            }
        }
        return false; // El alumno no existe
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Rut: " + rut + "\n" +
                "Número de Matrícula: " + numeroMatricula + "\n";
    }
}
