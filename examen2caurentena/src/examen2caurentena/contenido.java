package examen2caurentena;

public class contenido  {
	protected String titulo;
	protected String productora;
	protected int anyo;
	protected boolean visto = false;
	
	public contenido(String titulo, String productora, int anyo, boolean visto) {
		this.titulo=titulo;
		this.productora=productora;
		this.anyo=anyo;
		this.visto=visto;
	}

	public String getTitulo() {
		if(this.titulo==this.titulo) {
			this.visto = true;
		}else {
			this.visto= false;
		}
	
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean getVisto() {
		return visto;
	}

	public void setVisto(boolean visto) {
		
		this.visto = visto;
	}
	
	

}
