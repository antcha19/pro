package ejercicio122;

public class persona {

	private String nombre;
	private String DNI;
	private int edad;
	protected String residencia;

	public persona(String nombre, String DNI, int edad, String residencia) {
		this.nombre = nombre;
		this.DNI = DNI;
		this.edad = edad;
		this.residencia = residencia;
	}

	/*
	 * además de un método que nos devolverá los años necesarios para llegar a la
	 * edad de jubilación (actualmente,65 años).
	 */
	public int anyosjubilacion() {
		return (65 - this.edad);
	}

	// getters
	public String getNombre() {
		return nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public int getEdad() {

		return edad;
	}

	public String getResidencia() {
		return residencia;
	}

	// setters

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}

}
