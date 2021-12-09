package es.upm.dit.fprg.universidad;

public interface CarreraUniversitaria {
	
	public static final int NUMERO_CREDITOS = 240;
	
	void matricularEstudiante(Asignatura asignatura, Estudiante estudiante);
	void asignarProfesor(Asignatura asignatura, Profesor profesor);
}
