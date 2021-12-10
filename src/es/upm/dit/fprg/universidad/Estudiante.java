package es.upm.dit.fprg.universidad;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Estudiante extends Persona {

	private HashMap<Asignatura, Double> notas;

	public Estudiante(int edad, String nombre, String apellidos, String dni) {
		super(edad, nombre, apellidos, dni);

		this.notas = new HashMap<>();
	}

	public HashMap<Asignatura, Double> getNotas() {
		return notas;
	}

	public void setNotas(HashMap<Asignatura, Double> notas) {
		this.notas = notas;
	}

	public void asignarNota(Asignatura asignatura, double nota) {
		this.notas.put(asignatura, nota);
	}

	@Override
	public void imprimirInformacion() {
		System.out.println("Estudiante: " + getNombre() + " " + getApellidos());
	}

	public void imprimeListadoNotas() {
		System.out.println("Listado de notas de " + this.getNombre() + " con dni " + this.getDni() + ":");

		for (Entry<Asignatura, Double> entry : this.notas.entrySet()) {
			System.out.println("- " + entry.getKey().getNombre() + " -> " + entry.getValue());
		}
		System.out.println("\n***********\n");

	}

}
