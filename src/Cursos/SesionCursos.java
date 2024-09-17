package Cursos;

public class SesionCursos {
    private static SesionCursos instancia;
    private int cursoId;  // Cambiado de estudianteId a cursoId

    private SesionCursos() {}

    // Singleton para obtener la instancia de la sesión del curso
    public static SesionCursos getInstance() {
        if (instancia == null) {
            instancia = new SesionCursos();
        }
        return instancia;
    }

    // Getter para el ID del curso
    public int getCursoId() {
        return cursoId;
    }

    // Setter para el ID del curso
    public void setCursoId(int id) {
        this.cursoId = id;
    }
}



