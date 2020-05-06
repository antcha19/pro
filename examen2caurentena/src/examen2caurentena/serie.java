package examen2caurentena;

public class serie  extends contenido{
	
	private int numtemporadas;
	protected boolean finalizado = false;
	
	public serie(String titulo, String productora, int anyo,boolean visto, int numtemporadas, boolean finalizado) {
		super(titulo, productora,anyo,visto);
		this.numtemporadas=numtemporadas;
		this.finalizado =finalizado;
	}
	
	public void mostrarserie() {
		System.out.println(titulo+ "|" + productora + "|" + anyo + "|" + finalizado);
	}
	
	

	
}
