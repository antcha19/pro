package ejercicio128;

public class coche extends vehiculo{
	
	private int puertas;
	
	//constructor 
	public coche(int matricula,int velocidad, int puertas) {
		super(matricula, velocidad);
		this.puertas=puertas;
	}

	//devuelve el numero de puertas
	public int getPuertas() {
		return puertas;
	}
	

}
