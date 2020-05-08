package ejercicio128;

public class coche extends vehiculo{
	
	private int puertas;
	
	//constructor 
	public coche(String matricula, int puertas) {
		super(matricula);
		this.puertas=puertas;
	}

	//devuelve el numero de puertas
	public int getPuertas() {
		return puertas;
	}
	

}
