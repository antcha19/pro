package pizza;

public class pizza {

	// atributos
	private String tipopizza;
	private String tamanopizza;
	private String estado;
	
	static int cantidadpizza = 0;
	static int totalservidas = 0;

	public pizza(String tipopizza, String tamanopizza) {

		this.tipopizza = tipopizza;
		this.tamanopizza = tamanopizza;
		estado = "pedida";
		
		cantidadpizza++;
	}

	public String estado_pizza() {
		return ("pizza de tipo " + tipopizza + " y de tamano " + tamanopizza + " Estado: " + estado);

	}

	public void servir() {
		
		if (estado.equals("Servida")) {
			System.out.println("esta pizza ya se ha servido");

		} 
		else {
			estado = "Servida";
			cantidadpizza--;
			totalservidas++;

		}
		
	}

}
