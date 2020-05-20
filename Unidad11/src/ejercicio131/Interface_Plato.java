package ejercicio131;

public interface Interface_Plato {

	/* anadir ingrediente i al arraylist de ingredientes del plato */
	public void anyadir_ingrediente(Ingrediente i);

	/*
	 * Mostar todos los ingredientes del plato Para ello, recorrer el arraylist de
	 * ingredientes y llamar a detalleIngrediente
	 */
	public String consultar_ingredientes();

	//devuelve el atributo nombreplato
	public String getNombre();

	//devuelve el atributo precio
	public double getPrecio();

}
