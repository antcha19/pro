package examen2caurentena;

public class pelicula extends contenido{
	private int nomioscar;
	private int ganaoscar;
	
	public pelicula(String titulo, String productora, int anyo,boolean visto, int nomioscar, int ganaoscar) {
		super(titulo, productora,anyo,visto);
		this.nomioscar=nomioscar;
		this.ganaoscar=ganaoscar;
	}
	
	
	public void mostrarpelicula() {
		System.out.println(titulo+ "|" + productora + "|" + anyo + "|" + visto);
	}
	
	
	
	
}
