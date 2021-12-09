package es.upm.dit.fprg.universidad;

public class Asignatura {
	
	private double creditos;
	private String nombre;
	private int curso;
	
	public Asignatura(double creditos, String nombre, int curso) {
		this.creditos = creditos;
		this.nombre = nombre;
		this.curso = curso;
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
	
	
}
