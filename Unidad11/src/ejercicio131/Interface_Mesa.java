package ejercicio131;

public interface Interface_Mesa {

	/* devuelve los datos de la Mesa (numMesa, numPersonaMesa, ubicacion, estado) */
	public String obtenerDatosMesa();

	// devuelve el atributo numMesa
	public int getNumMesa();

	/* Pone el atributo estado de la Mesa a LIBRE */
	public void liberarMesa();
	
	/*pone el atributo estado de la mesa a Ocupado*/
	public void ocuparMesa();
	
	/*informar de todos los platos pedidos por la mesa
	 * para ello, recorrer el arraylist de platos y llamar a getNombre() en cada uno*/
	public void detalle_platos();
	
	/*calcular la factura de la mesa
	 *Para ello, recorrer el ArrayList de platos y llamar a getPrecio, acumulando el total*/
	public double calcular_factura();
	
}
