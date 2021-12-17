package es.upm.dit.fprg.universidad;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Map.Entry;
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
		asignatura.matricular(estudiante);
		this.estudiantes.add(estudiante);
	}

	@Override
	public void asignarProfesor(Asignatura asignatura, Profesor profesor) {
		profesor.impartirAsignatura(asignatura);
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(Set<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public Set<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(Set<Profesor> profesores) {
		this.profesores = profesores;
	}

	public Set<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Set<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	public Set<Persona> getPersonas() {
		Set<Persona> personas = new HashSet<Persona>();
		personas.addAll(this.estudiantes);
		personas.addAll(this.profesores);
		return personas;
	}
	
	public void escribeEstudiantes(String nombreFichero) throws Exception {
		File fichero = new File(nombreFichero);
		
		if (!fichero.getParentFile().exists()) {
			fichero.getParentFile().mkdirs();
		}
		
		PrintWriter writer = new PrintWriter(fichero);
		writer.println("Nombre,Apellidos,DNI,Notas");
		for (Estudiante e : this.estudiantes) {
			String nombre = e.getNombre();
			String apellidos = e.getApellidos();
			String dni = e.getDni();
			String notas = "";
			for (Entry<Asignatura,Double> nota : e.getNotas().entrySet()) {
				notas += nota.getKey().getNombre()+":"+nota.getValue()+"/";
			}
			writer.println(nombre+","+apellidos+","+dni+","+notas);
		}
		writer.close();
		
	}
	
	

}
