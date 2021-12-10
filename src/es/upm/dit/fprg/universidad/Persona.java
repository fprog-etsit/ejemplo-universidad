package es.upm.dit.fprg.universidad;

public class Persona {
	
	private int edad;
	private String nombre;
	private String apellidos;
	private String dni;
	
	public Persona(int edad, String nombre, String apellidos, String dni) {
		this.edad = edad;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public void imprimirInformacion() {
		System.out.println("Persona: " + getNombre() + " " + getApellidos());
	}
	
	public void evacuarEdificio(SalidasEmergencia salida) {
		System.out.println(this.nombre + " " + this.apellidos + " ha evacuado el edificio por la salida " + salida);
	}
}
