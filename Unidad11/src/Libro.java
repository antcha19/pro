
public class Libro extends Producto {

	private int numpaginas;
	private String autor;

	public Libro(int codigo, String titulo, String autor, int numpaginas) {
		super(codigo, titulo);
		this.autor = autor;
		this.numpaginas = numpaginas;

	}

	public void anuncio() {
		System.out.println("Hola, soy un libro");
	}

}
