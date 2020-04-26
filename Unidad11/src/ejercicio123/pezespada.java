package ejercicio123;

public class pezespada extends pezglovo {

	private String lugar_pesca;

	public pezespada(String nombre, int numero_escamas, int pesogramos, int toxinas, String lugar_pesca) {
		super(nombre, numero_escamas, pesogramos, toxinas);
		this.lugar_pesca = lugar_pesca;
	}

	/*
	 * método que leerá el lugar de pesca y devolverá con un booleano si es
	 * auténtico pez espada o no. - si está pescado en el ‘Mediterraneo’ → es
	 * emperador (devuelve false) - si está pescado en el ‘Atlántico’ o ‘Pacífico’ →
	 * es pez espada (devuelve true) - si el lugar de pesca es distinto a los
	 * anteriores → es otra especie (devuelve false)
	 */
	public boolean coincidelugar() {
		
		if ((this.lugar_pesca).equals("Atlántico") || (this.lugar_pesca).equals("‘Pacífico’")) {
			return true;
		} else {
			return false;
		}
	}

	// getters y setters
	public String getLugar_pesca() {
		return lugar_pesca;
	}

	public void setLugar_pesca(String lugar_pesca) {
		this.lugar_pesca = lugar_pesca;
	}

}
