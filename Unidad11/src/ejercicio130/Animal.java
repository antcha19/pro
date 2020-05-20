package ejercicio130;

public abstract class Animal {

	// atributos
	protected String nombre;
	protected String fechaNacimiento;
	protected Double peso;
	protected String comentarios;

	// constructor
	public Animal(String nombre, String fechaNacimiento, Double peso) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.peso = peso;
	}

	// getters
	public String getNombre() {
		return nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public Double getPeso() {
		return peso;
	}

	public String getComentarios() {
		return comentarios;
	}

	// setters
	

	

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public abstract String toString();
}
