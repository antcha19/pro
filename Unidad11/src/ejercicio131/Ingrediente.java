package ejercicio131;

public class Ingrediente  implements Interface_Ingrediente{
	
	private String nombreingre;
	private int cantidad;
	
	public Ingrediente (String nombreingre, int cantidad) {
		this.nombreingre=nombreingre;
		this.cantidad=cantidad;
	}
	
	public String detalleIngrediente() {
		String detalles = "("+ " ingrediente " +  nombreingre + " con cantidad " + cantidad;
		return detalles; 
	}

}
