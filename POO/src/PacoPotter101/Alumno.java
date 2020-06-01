package PacoPotter101;

public class Alumno {

	private String DNI;
	private String nombre;
	private int edad;

	public Alumno(String DNI, String nombre, int edad) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.edad = edad;
	}

	public void altaAlumno() {

		System.out.println("-Alumno de NIF:" + DNI + " y  nombre:" + nombre + " tiene " + edad + " años.");
	}

	public String getDNI() {
		return DNI;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	
}
