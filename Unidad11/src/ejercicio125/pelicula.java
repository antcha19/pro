package ejercicio125;

public class pelicula extends multimedia {
	
	private String actorprincipal;
	private String actrizprincipal;
	
	public pelicula(String actorprincipal,String actrizprincipal, String titulo, String autor, String formato, int duracion) {
		super(titulo,autor,formato, duracion);
		this.actorprincipal=actorprincipal;
		this.actrizprincipal=actrizprincipal;
	}
	

}
