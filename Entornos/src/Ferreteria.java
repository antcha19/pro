
public class Ferreteria {
	
	private String nombre;
	private int ID;
	
	public Ferreteria(String nombre, int ID) {
		this.nombre=nombre;
		this.ID=ID;
		
	}
	
	
	public void mostrarproductos() {
		System.out.println("La ferreteria tiene " + nombre + " con esta " + ID + " unidades");
	}

	public void productobuscado() {
		System.out.println("El producto que buscar es " + nombre + "y tiene " +ID+ " unidaddes almacenadas en el almacen" );
	}

	public void cantidadsolicitada() {
		System.out.println("El producto con " + ID + "esta asociado a " + nombre);
	}
	
	public String getNombre() {
		return nombre;
	}


	public int getCantidad() {
		return ID;
	}

	
}
