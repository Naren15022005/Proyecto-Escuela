package Estudiantes;

public class SesionEstudiante {
    private static SesionEstudiante instancia;
    private int estudianteId;

    // Constructor privado para evitar la creación de múltiples instancias
    private SesionEstudiante() {}

    // Método estático para obtener la instancia de SesionEstudiante
    public static SesionEstudiante getInstance() {
        if (instancia == null) {
            instancia = new SesionEstudiante();
        }
        return instancia;
    }

    // Método para establecer el ID del estudiante
    public void setEstudianteId(int id) {
        this.estudianteId = id;
    }

    // Método para obtener el ID del estudiante
    public int getEstudianteId() {
        return estudianteId;
    }
}
