package ejercicio127;

public abstract class mascota {
	
	protected String tipo;
	protected String nombre;
	
	public mascota( String nombre) {
		this.tipo=tipo;
		this.nombre=nombre;
		
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public abstract void sonido();

}
