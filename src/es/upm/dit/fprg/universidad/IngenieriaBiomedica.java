package es.upm.dit.fprg.universidad;

import java.util.HashSet;
import java.util.Set;

public class IngenieriaBiomedica implements CarreraUniversitaria {
	
	private String descripcion;
	private Set<Estudiante> estudiantes;
	private Set<Profesor> profesores;
	private Set<Asignatura> asignaturas;
	
	public IngenieriaBiomedica(String descripcion, Set<Asignatura> asignaturas, Set<Profesor> profesores) {
		this.descripcion = descripcion;
		this.profesores = profesores;
		this.asignaturas = asignaturas;
		this.estudiantes = new HashSet<>();
	}
	
	@Override
	public void matricularEstudiante(Asignatura asignatura, Estudiante estudiante) {
		estudiante.matricular(asignatura);
	}

	@Override
	public void asignarProfesor(Asignatura asignatura, Profesor profesor) {
		profesor.impartirAsignatura(asignatura);
	}

}
