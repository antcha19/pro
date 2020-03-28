package harrypotter;

public class alumno {

	
	private String dni;
	private String nombre;
	private int edad;
	
	
	public alumno(String dni, String nombre, int edad) {
		this.dni = dni;
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public void mostraralumno() {
		System.out.println("Alumno de NIF: "+dni+ " y nombre: " +nombre +" tiene "+ edad +" años");
	}
	
	public String get_dni() {
		return dni;
	}
	public String get_nombre() {
		return nombre;
	}
	public int get_edad() {
		return edad;
	}
	
	
}
