import java.util.ArrayList;

public class Curso {
    private ArrayList<Alumno> alumnos;

    public Curso() {
        alumnos = new ArrayList<Alumno>();
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void eliminarAlumno(Alumno alumno) {
        alumnos.remove(alumno);
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curso:\n");
        for (Alumno alumno : alumnos) {
            sb.append(alumno.toString());
        }
        return sb.toString();
    }
}
