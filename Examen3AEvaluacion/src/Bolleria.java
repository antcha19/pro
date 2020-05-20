
abstract class Bolleria {
	
	protected double peso;
	protected double precio;
	
	public Bolleria(double peso) {
		this.peso=peso;
		this.precio=peso * 0.1;
	}

	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	public double getPrecio() {
		return precio;
	}


	public abstract String toString();

}
