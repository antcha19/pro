package ejercicio128;

public class camion extends vehiculo {

	private remolque remol = null;

	public camion(String matricula) {
		super(matricula);

	}

	public void ponremolque(remolque r) {
		remol = r;
	}

	public void ponRemolque(remolque r) {
		remol = remol;
	}

	public void quitaRemolque() {
		this.remol = null;
	}

	public String toString() {
		 if (remol == null) {
		 return "Matricula: " + matricula + " Velocidad: " + velocidad;
		 }else {
		 return "Matricula: " + matricula + " Velocidad: " + velocidad + " Remolque peso:" + remol.getPeso();
		 }
	}

	public void acelerar(double velo) throws Exception {
		velocidad = velocidad + velo;

		if ((velocidad) > 100) {
			throw new Exception("Frenando Alonso!");
		}
	}
}
