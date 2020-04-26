
public class Producto {

	private int codigo;
	private String titulo;

	public Producto(int codigo, String titulo) {
		this.codigo = codigo;
		this.titulo = titulo;
	}

	public void anuncio() {
		System.out.println("Hola, soy un producto generico");
	}
}
