package harrypotter;

public class libro {

	private String titulo;
	private String autor;
	private int paginas;
	private String estado;

	public libro(String titulo, String autor, int paginas, String estado) {
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.estado = "DISP";

	}

	public void mostaraltalibro() {

		System.out.println(titulo + " escrito por: " + autor + " tiene " + paginas + " pags." + " | " + estado);
	}

	public String get_titulo() {
		return titulo;
	}

	public String get_autor() {
		return autor;
	}

	public int get_paginas() {
		return paginas;
	}

	public String get_estado() {
		return estado;
	}

	public void cambiar_estado() {
		if (estado.equals("DISP")) {
			estado = "PREST";
		} else {
			estado = "DISP";
		}
	}
}
