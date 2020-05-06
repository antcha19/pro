package ejercicio127;

public class gato extends mascota {
	
	public gato( String nombre) {
		super( nombre);
		this.tipo= "gato";
	}
	
	
	public  void sonido() {
		System.out.println("hola me llamo " +nombre +", soy un " + tipo+"  y hago miauuu" );
	}
	

}
 