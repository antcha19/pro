package ejercicio128;

public class vehiculo {
	
	protected String matricula ;
	protected double velocidad = 0;
	
	public vehiculo(String matricula) {
		this.matricula=matricula;
		this.velocidad=velocidad;
	}
	

	public String  toString() {
		
		 return " (" + matricula + "|" + velocidad + "km/h";
		 
	}
	
	public void acelerar(double velo) throws Exception {
		 velocidad = velocidad + velo;
		 }
	
}
