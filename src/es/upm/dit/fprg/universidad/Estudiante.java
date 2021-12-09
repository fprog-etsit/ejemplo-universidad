package es.upm.dit.fprg.universidad;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Estudiante extends Persona{
	
	private HashMap<Asignatura, Double> notas;
	private Set<Asignatura> asignaturas;
	
	public Estudiante(int edad, String nombre, String apellidos, String dni) {
		super(edad, nombre, apellidos, dni);
		
		this.notas = new HashMap<>();
		this.asignaturas = new HashSet<>();
	}

	public HashMap<Asignatura, Double> getNotas() {
		return notas;
	}

	public void setNotas(HashMap<Asignatura, Double> notas) {
		this.notas = notas;
	}

	public Set<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Set<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	public void matricular(Asignatura asignatura) {
		this.asignaturas.add(asignatura);
	}
	
	public void asignarNota(Asignatura asignatura, double nota) {
		this.notas.put(asignatura, nota);
	}
	
	@Override
	public void imprimirInformacion() {
		System.out.println(getNombre() + " " + getApellidos() + " - " + asignaturas.size());
	}
	
	
}
