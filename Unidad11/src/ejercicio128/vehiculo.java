package ejercicio128;

public class vehiculo {
	
	protected int matricula = 0;
	protected int velocidad = 0;
	
	public vehiculo(int matricula,int velocidad) {
		this.matricula=matricula;
		this.velocidad=velocidad;
	}
	

	public String  toString() {
		
		 return " (" + matricula + "|" + velocidad + "km/h";
		 
	}
	
}
