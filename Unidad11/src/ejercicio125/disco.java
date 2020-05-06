package ejercicio125;

public class disco extends multimedia {

	protected String genero;

	public disco(String titulo, String autor, String formato, int duracion, String genero) {
		super(titulo, autor, formato, duracion);
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String toString() {
		String resultado = "";
		resultado = this.titulo + "|" + this.autor + "|" + this.formato + "|" + this.duracion + "|" + this.genero;
		return resultado;
	}

}
