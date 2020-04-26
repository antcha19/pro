package ejercicio122;

public class profesor extends persona {

	private int sueldo;
	private String centro;
	private String lugartrabajo;

	public profesor(String nombre, String DNI, int edad, String residencia, int sueldo, String centro,
			String lugartrabajo) {
		super(nombre, DNI, edad, residencia);
		this.sueldo = sueldo;
		this.centro = centro;
		this.lugartrabajo = lugartrabajo;
	}

	/*
	 * además de un método que nos devolverá un booleano indicando si el lugar de
	 * trabajo coincide con su lugar de residencia o no
	 */
	public boolean coincidelugar() {
		if ((residencia).equals(lugartrabajo)) {
			return true;
		} else {
			return false;
		}
	}

	// getters
	public int getSueldo() {
		return sueldo;
	}

	public String getCentro() {
		return centro;
	}

	public String getLugartrabajo() {
		return lugartrabajo;
	}

	// setters
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public void setCentro(String centro) {
		this.centro = centro;
	}

	public void setLugartrabajo(String lugartrabajo) {
		this.lugartrabajo = lugartrabajo;
	}

}
