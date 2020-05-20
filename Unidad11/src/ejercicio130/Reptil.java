package ejercicio130;

//tipo emun
enum EspecieReptil {
	Tortuga, Iguana, DragonDeComodo, LagartoGigante;
}

public class Reptil extends Animal {

	private EspecieReptil especie;
	private boolean venenoso ;

	public Reptil(String nombre, String fechaNacimiento, Double peso, EspecieReptil especie, boolean venenoso) {
		super(nombre, fechaNacimiento, peso);
		this.especie = especie;
		this.venenoso = venenoso;
	}

//	public String toString() {
//		return "ficha de Reptil\n" + "nombre: " + nombre + "\n" + "Raza:" + especie + "\n" + "Fecha de nacimiento:"
//				+ fechaNacimiento + "\n" + "Peso: " + peso + "kg" + "\n" + "Venenoso :" + venenoso + "\n"
//				+ "Comentarios:" + comentarios;
//	}

	public String toString() {
		String l1 = "Ficha de Reptil" + "\n";
		String l2 = "Nombre: " + nombre + "\n";
		String l3 = "Especie: " + especie + "\n";
		String l4 = "Fecha de Nacimiento: " + fechaNacimiento + "\n";
		String l5 = "Peso: " + peso + " Kg." + "\n";
		String l6 = "";
		if (venenoso) {
			l6 = "Venenoso: " + "SI" + "\n";
		} else {
			l6 = "Venenoso: " + "NO" + "\n";
		}
		String l7 = "Comentarios: " + comentarios + "\n";
		return l1 + l2 + l3 + l4 + l5 + l6 + l7;
	}
}
