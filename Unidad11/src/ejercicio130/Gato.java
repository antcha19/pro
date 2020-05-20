package ejercicio130;
//tipo enumerado

enum RazaGato {
	 Comun, Siames, Persa, Angora,
	 ScottishFold;
}


public class Gato  extends Animal{

	private RazaGato raza;
	private String microchip;
	
	public Gato(String nombre, String fechaNacimiento, Double peso, RazaGato raza, String microchip) {
		super(nombre,fechaNacimiento,peso);
		this.raza=raza;
		this.microchip=microchip;
	}
	
	public String toString() {
		return "ficha de gato\n" + "nombre:" + nombre +"\n"+ "Raza:" + raza + "\n" + "Fecha de nacimiento:"
				+ fechaNacimiento +"\n"+ "Peso: " + peso + "kg\n" + "Microchip :" + microchip + "\n" + "Comentarios " + comentarios +"\n";
	}
	
}
