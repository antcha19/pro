package ejercicio125;

public class pelicula extends multimedia {

	private String actorprincipal;
	private String actrizprincipal;

	public pelicula( String titulo, String autor, String formato,
			int duracion,String actorprincipal, String actrizprincipal) {
		super(titulo, autor, formato, duracion);
		this.actorprincipal = actorprincipal;
		this.actrizprincipal = actrizprincipal;
	}

	
	//getters
	public String getActorprincipal() {
		return actorprincipal;
	}

	public String getActrizprincipal() {
		return actrizprincipal;
	}
	
	//setters
	public void setActorprincipal(String actorprincipal) {
		this.actorprincipal = actorprincipal;
	}

	public void setActrizprincipal(String actrizprincipal) {
		this.actrizprincipal = actrizprincipal;
	}

	public String toString() {
		String resultado = "";
		resultado = this.titulo + "|" + this.autor + "|" + this.formato + "|" + this.duracion + "|" + this.actorprincipal + "|"
				+ this.actrizprincipal;
		return resultado;
	}

}
