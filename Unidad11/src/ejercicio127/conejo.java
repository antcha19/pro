package ejercicio127;

public class conejo extends mascota{

	
	
	public conejo( String nombre) {
		super( nombre);
		this.tipo = "conejo";
	}

	public void sonido() {
		System.out.println("hola me llamo " + nombre+ ", soy un conejo  y hago raaabit raaaabit");
	}
	
}
