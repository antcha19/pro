package ejercicio127;

public class perro extends mascota {

	
	
	public perro ( String nombre) {
		
		super(nombre);
		this.tipo= "perro";
	}
	
	public void sonido() {
		System.out.println("hola me llamo "  + nombre + " , soy un perro  y hago guauuu" );
	}
}
