package es.upm.dit.fprg.universidad;

import java.util.HashSet;
import java.util.Set;

public class Profesor extends Persona{
	
	private Set<Asignatura> asignaturas;
	private String despacho;
	
	public Profesor(int edad, String nombre, String apellidos, String dni, String despacho) {
		super(edad, nombre, apellidos, dni);
		this.despacho = despacho;
		this.asignaturas = new HashSet<>();
	}

	public Set<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Set<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	public void impartirAsignatura(Asignatura asignatura) {
		this.asignaturas.add(asignatura);
	}
	
	public void evaluarEstudiante(Asignatura asignatura, Estudiante estudiante) {
		double nota = Math.random()*10;
		estudiante.asignarNota(asignatura, nota);
	}
	
	public void evaluarAsignatura(Asignatura asignatura) {
		Set<Estudiante> estudiantes = asignatura.getAlumnos();
		for (Estudiante e : estudiantes) {
			this.evaluarEstudiante(asignatura, e);
		}
	}
	
	public void evaluarTodasAsignaturas() {
		for (Asignatura a : this.asignaturas) {
			this.evaluarAsignatura(a);
		}
	}
	
	@Override
	public void imprimirInformacion() {
		System.out.println("Profesor: " + getNombre() + " " + getApellidos() + " - Despacho: " + getDespacho());
	}
	
	
}
