package ejercicio131;

public interface Interface_Restaurante {
	
	/*anade la mesa m al arraylist de mesas*/
	public void montarMesa(Mesa m);
	
	/*busca em el Arraylist de mesas aquella con el NumMesa de m y borrarla*/
	public void recogerMesa(Mesa m);
	
	
	public void listarMesas();
	
	public double calcular_caja();
	

}
