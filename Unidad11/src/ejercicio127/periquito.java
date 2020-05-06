package ejercicio127;

public class periquito extends mascota {
	
	
	
	
	public periquito( String nombre) {
		super(nombre);
		this.tipo= "periquito";
	}

	public void sonido() {
		System.out.println("hola me llamo " + nombre + " , soy un periquito  y hago pio pio pioo");
	}

}
