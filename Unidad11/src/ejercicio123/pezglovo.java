package ejercicio123;

public class pezglovo extends pez {

	private int toxinas;

	public pezglovo(String nombre, int numero_escamas, int pesogramos, int toxinas) {
		super(nombre, numero_escamas, pesogramos);
		this.toxinas = toxinas;
	}

	/*
	 * además de un método que leerá las toxinas en mg y nos dirá en función de su
	 * peso un calificador de riesgo en caso de querer ingerirlo: - si las toxinas
	 * constituyen menos del 10% del peso del pez: “inofensivo” - si las toxinas
	 * constituyen entre el 10% y el 20% del peso del pez: “riesgo moderado” - si
	 * las toxinas constituyen más del 20% del peso del pez: “yo no lo haría”
	 */
	public String riesgo() {
		String riesgo = "";
		double toxinas_gramos = toxinas / 1000;
		double diez_ciento = pesogramos * 0.10;
		double veinte_ciento = pesogramos * 0.20;

		if (toxinas_gramos <= diez_ciento) {
			riesgo = "inofensivo";
		}
		if ((toxinas_gramos > diez_ciento) && (toxinas_gramos < veinte_ciento)) {
			riesgo = "riesgo moderado";
		}
		if (toxinas_gramos >= veinte_ciento) {
			riesgo = "yo no lo haria";
		}
		return riesgo;
	}

	public int getToxinas() {
		return toxinas;
	}

	public void setToxinas(int toxinas) {
		this.toxinas = toxinas;
	}

}
