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
	
	@Override
	public void imprimirInformacion() {
		System.out.println(getNombre() + " " + getApellidos() + " - " + getDespacho());
	}
	
	
}
