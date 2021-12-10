package es.upm.dit.fprg.universidad;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Asignatura {

	private double creditos;
	private String nombre;
	private int curso;
	private Set<Estudiante> alumnos;

	public Asignatura(double creditos, String nombre, int curso) {
		this.creditos = creditos;
		this.nombre = nombre;
		this.curso = curso;
		this.alumnos = new HashSet<Estudiante>();
	}

	public void matricular(Estudiante e) {
		this.alumnos.add(e);
	}

	public Set<Estudiante> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Set<Estudiante> alumnos) {
		this.alumnos = alumnos;
	}

	public double getCreditos() {
		return creditos;
	}

	public void setCreditos(double creditos) {
		this.creditos = creditos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public void imprimeListadoNotas() {
		System.out.println("Listado de notas de " + this.nombre + ":");

		for (Estudiante e : this.alumnos) {
			String dni = e.getDni();
			Map<Asignatura, Double> notas = e.getNotas();
			double nota = notas.get(this);
			System.out.println("- " + dni + " -> " + nota);
		}
		System.out.println("\n***********\n");

	}

}
