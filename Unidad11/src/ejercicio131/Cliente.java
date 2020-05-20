package ejercicio131;

public class Cliente  implements Interface_Cliente{
	
	private String nombre;
	private String telefono;
	
	public Cliente (String nombre, String telefono) {
		this.nombre=nombre;
		this.telefono=telefono;
	}

	public String getNombre() {
		return nombre;
	}
	
		
}
