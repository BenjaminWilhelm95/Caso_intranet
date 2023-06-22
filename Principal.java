public class Principal {
    public static void main(String[] args) {
        Curso curso = new Curso();

        Alumno alumno1 = new Alumno("Juan", "Pérez", "12345678-9", 1);
        Alumno alumno2 = new Alumno("María", "González", "98765432-1", 2);

        curso.agregarAlumno(alumno1);
        curso.agregarAlumno(alumno2);

        System.out.println(curso.toString());

        curso.eliminarAlumno(alumno1);

        System.out.println(curso.toString());

        boolean existeAlumno = Alumno.buscarAlumnoPorRut("98765432-1", curso.getAlumnos());
        if (existeAlumno) {
            System.out.println("El alumno existe.");
        } else {
            System.out.println("El alumno no existe.");
        }
    }
}