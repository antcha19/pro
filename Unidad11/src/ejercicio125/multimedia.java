package ejercicio125;

public class multimedia {

	protected String titulo;
	protected String autor;
	protected String formato;
	protected int duracion;

	public multimedia(String titulo, String autor, String formato, int duracion) {
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		if (this.formato.equals("wav")) {
			this.formato = "wav";
		} else if (this.formato.equals("mp3")) {
			this.formato = "mp3";
		} else if (this.formato.equals("midi")) {
			this.formato = "wav";
		} else if (this.formato.equals("avi")) {
			this.formato = "avi";
		} else if (this.formato.equals("mov")) {
			this.formato = "mov";
		} else if (this.formato.equals("mpg")) {
			this.formato = "mpg";
		} else if (this.formato.equals("cdAudio")) {
			this.formato = "cdAudio";
		} else if (this.formato.equals("dvd")) {
			this.formato = "dvd";
		}
		this.duracion = duracion;
	}

	/*-Por último, un método equals() que recibe un objeto de tipo “Multimedia” y devuelve true en caso de
	que el título y el autor sean iguales a los del objeto que llama al método y false en caso contrario.*/
	public boolean equals(multimedia m) {

		if ((this.titulo).equals(m.titulo) || (this.autor).equals(m.titulo)) {
			return true;
		} else {
			return false;
		}
	}
	
	//toString() que devuelve la información del objeto
	public String toString() {
		 String resultado="";
		 resultado = this.titulo + "|" + this.autor + "|" + this.formato + "|" + this.duracion;
		 return resultado;
		 }

	// getters
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getFormato() {
		return formato;
	}

	public int getDuracion() {
		return duracion;
	}

	// setters
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	

}
