package ejercicio130;

enum razaperro {
	PastorAleman, Husky, FoxTerrier, Dalmata, Beagle, SanBernardo;
}

public class Perro extends Animal {

	private razaperro raza;
	private String microchip;
	

	public Perro(String nombre, String fechaNacimiento, Double peso, razaperro raza, String microchip) {
		super(nombre, fechaNacimiento, peso);
		this.raza=raza;
		this.microchip=microchip;

	}

	public String toString() {
		return "ficha de perro\n" +
				"nombre: "+nombre +"\n"+
				"Raza:"+raza + "\n" +
				"Fecha de nacimiento:"+ fechaNacimiento +"\n"+
				"Peso: "+ peso +"kg\n"+
				"Microchip :"+microchip + "\n"
				+"comentario " + comentarios +"\n";
	}

}
