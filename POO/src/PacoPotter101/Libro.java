package PacoPotter101;

public class Libro {

	private String titulo;
	private String autor;
	private int numpaginas;
	private String estado;

	public Libro(String titulo, String autor, int numpaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.numpaginas = numpaginas;
		this.estado = "DISP";
	}

	public void cambiar_estado() {
		if (estado.equals("DISP")) {
			estado = "PREST";
		} else {
			estado = "DISP";
		}
	}

	public void estado_Libro() {
		System.out.println("\t-" + titulo + " escrito por: " + autor + " tiene " + numpaginas + " pags. | " + estado);
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getNumpaginas() {
		return numpaginas;
	}

}
