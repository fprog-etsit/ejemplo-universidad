package es.upm.dit.fprg.universidad;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class PruebaUniversidad {

	public static void main(String[] args) {

		Estudiante pedro = new Estudiante(18, "Pedro", "Agúndez", "121341T");
		Estudiante ana = new Estudiante(18, "Ana", "Agúndez", "598724985R");

		List<Estudiante> estudiantes = new ArrayList<Estudiante>();
		estudiantes.add(pedro);
		estudiantes.add(ana);

		Asignatura asignaturaFPRG = new Asignatura(6, "FPRG", 1);
		Asignatura asignaturaFIS = new Asignatura(6, "Física", 1);

		Profesor prof = new Profesor(18, "Enrique", "Agúndez", "Corchado", "B-208");

		Set<Asignatura> asignaturas = new HashSet<Asignatura>();
		asignaturas.add(asignaturaFPRG);
		asignaturas.add(asignaturaFIS);

		Set<Profesor> profesores = new HashSet<Profesor>();
		profesores.add(prof);

		IngenieriaBiomedica bio = new IngenieriaBiomedica("Grado de Ingeniería Biomédica", asignaturas, profesores);
		prof.impartirAsignatura(asignaturaFPRG);
		prof.impartirAsignatura(asignaturaFIS);

		for (Estudiante est : estudiantes) {
			bio.matricularEstudiante(asignaturaFPRG, est);
			bio.matricularEstudiante(asignaturaFIS, est);
		}

		for (Profesor p : bio.getProfesores()) {
			p.evaluarTodasAsignaturas();
		}

		String nombreFichero = "./datos/bio/estudiantes/listado.csv";
		try {
			bio.escribeEstudiantes(nombreFichero);

			Scanner sc = new Scanner(new File(nombreFichero));

			String[] cabeceras = null;

			while (sc.hasNextLine()) {
				String linea = sc.nextLine();
				String[] partes = linea.split("\\,");
				if (cabeceras == null) {
					cabeceras = new String[2];
					cabeceras[0] = partes[2];
					cabeceras[1] = partes[3];
				} else {
					String resultado = partes[2];
					System.out.println(cabeceras[0] + ": " + resultado);
					System.out.println(cabeceras[1]);
					String[] notas = partes[3].split("/");
					for(String nota : notas) {
						String[] aux = nota.split(":");
						System.out.println(aux[0] + " -> " + aux[1]);
					}
					System.out.println("******\n");
				}
			}
			sc.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		
//		for (Asignatura a : bio.getAsignaturas()) {
//			a.imprimeListadoNotas();
//		}
//		
//		for (Estudiante e : bio.getEstudiantes()) {
//			e.imprimeListadoNotas();
//		}
//		
//		System.out.println("¡Emergencia! ¡Fuego en Cafetería!\n\n");
//		
//		for (Persona p : bio.getPersonas()) {
//			Random r = new Random();
//			SalidasEmergencia[] salidas = SalidasEmergencia.values();
//			int aux = r.nextInt(salidas.length);
//			SalidasEmergencia salida = salidas[aux];
//
//			System.out.println("Persona evacuada: ");
//			p.imprimirInformacion();
//			p.evacuarEdificio(salida);
//			System.out.println("\n******\n");
//			
//		}

	}

}
