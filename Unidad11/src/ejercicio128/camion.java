package ejercicio128;

public class camion extends vehiculo {

	private  remolque remol = null;
	
	public camion(int matricula,int velocidad) {
		super(matricula, velocidad);
		
	}
	
	public void  ponremolque(remolque r) {
		remol = r;
	}
}
