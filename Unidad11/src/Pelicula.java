
public class Pelicula extends Producto {

	private String director;
	private String[] actores;

	public Pelicula(int codigo, String titulo, String director, String[] actores) {
		super(codigo, titulo);
		this.director = director;
		this.actores = actores;
	}

	public void anuncio() {
		System.out.println("Hola, soy una pelicula");
	}
}
