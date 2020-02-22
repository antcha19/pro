package cinepaco;

public class Personas {
	private String nombre;
	private int edad;
	

	public Personas(String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;
		
	}
	 public void imprimir_persona(){
		 System.out.println(this.nombre + ","+ edad + " .");
	 }
}
