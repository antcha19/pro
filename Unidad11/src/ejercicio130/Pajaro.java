package ejercicio130;

//tipo emun
enum EspeciePajaro {
	Canario, Periquito, Agaporni;
}

public class Pajaro extends Animal {

	// atributos
	private EspeciePajaro especie;
	private boolean cantor;

	public Pajaro(String nombre, String fechaNacimiento, Double peso, EspeciePajaro especie, boolean cantor) {
		super(nombre, fechaNacimiento, peso);
		this.especie = especie;
		this.cantor = cantor;

	}



	public String toString() {
		String l1 = "Ficha de Pajaro" + "\n";
		String l2 = "Nombre: " + nombre + "\n";
		String l3 = "Especie: " + especie + "\n";
		String l4 = "Fecha de Nacimiento: " + fechaNacimiento + "\n";
		String l5 = "Peso: " + peso + " Kg." + "\n";
		String l6 = "";
		if (cantor) {
			l6 = "Cantor: " + "SI" + "\n";
		} else {
			l6 = "Cantor: " + "NO" + "\n";
		}
		String l7 = "Comentarios: " + comentarios + "\n";
		return l1 + l2 + l3 + l4 + l5 + l6 + l7;
	}

}
