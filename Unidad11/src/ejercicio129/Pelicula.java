package ejercicio129;

public class Pelicula {

	protected String titulo;
	protected double duracion;
	protected int valoracion;
	protected String genero;

	public Pelicula(String titulo,double duracion, int valoracion, String genero) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.valoracion = valoracion;
		this.genero = genero;

	}
	
	public String mostrarlistadotitulo() {
		return(titulo + "@" + duracion +"@"+ valoracion +"@"+ genero);
	}
	public String mostrarlistadovaloracion() {
		return(valoracion + "@" + titulo +"@"+ duracion +"@"+ genero);
	}

	public int getValoracion() {
		return valoracion;
	}

	public String getTitulo() {
		return titulo;
	}
	
	

	
}
