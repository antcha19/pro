package ejercicio123;

public class pez {

	private String nombre;
	private int numero_escamas;
	protected int pesogramos;

	public pez(String nombre, int numero_escamas, int pesogramos) {
		this.nombre = nombre;
		this.numero_escamas = numero_escamas;
		this.pesogramos = pesogramos;
	}

	public String calibre() {
		String calibre = "";
		if (this.pesogramos < 100) {
			calibre= "pequeno";
		}
		else if (this.pesogramos >= 100 && this.pesogramos <= 300) {
			calibre= "mediano";
		}
		else if (this.pesogramos >= 300 && this.pesogramos <= 500) {
			calibre= "grande";
		}
		else if (this.pesogramos > 500) {
			calibre= "cacholote";
		}
		return calibre;

	}

	// getters
	public String getNombre() {
		return nombre;
	}

	public int getNumero_escamas() {
		return numero_escamas;
	}

	public int getPesogramos() {
		return pesogramos;
	}

	// setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNumero_escamas(int numero_escamas) {
		this.numero_escamas = numero_escamas;
	}

	public void setPesogramos(int pesogramos) {
		this.pesogramos = pesogramos;
	}

}
