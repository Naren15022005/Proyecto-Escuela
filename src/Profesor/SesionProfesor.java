package Profesor;

public class SesionProfesor {
    private static SesionProfesor instancia;
    private int profesorId;  // Identificador único del profesor

    private SesionProfesor() {}

    // Singleton para obtener la instancia de la sesión del profesor
    public static SesionProfesor getInstance() {
        if (instancia == null) {
            instancia = new SesionProfesor();
        }
        return instancia;
    }

    // Getter para el ID del profesor
    public int getProfesorId() {
        return profesorId;
    }

    // Setter para el ID del profesor
    public void setProfesorId(int id) {
        this.profesorId = id;
    }
}



