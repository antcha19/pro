package examen;

public class Tripulante {

	private String nombre;
	private int edad;
	private String rango;
	
	public Tripulante (String nombre_entrada, int edad_entrada, String rango_entrada) {
		this.nombre=nombre_entrada;
		this.edad=edad_entrada;
		this.rango=rango_entrada;
		
		
	}
	public String get_nombretripulante() {
		return nombre;
	}
	public int get_edad() {
		return edad;
	}
	public String get_rango() {
		return rango;
	}
}
