import java.util.ArrayList;
import java.util.Arrays;



public class pizza {

	private String nombre;
	private String listaingredientes[];
	private int calorias;
	private int precio;

	public pizza(String nombre, int numeroingredietnes, String listaingredientes[]) {
	
		this.nombre = nombre;
		this.listaingredientes = listaingredientes;
		char letra;
		int cont = 0;
		int contcalorias = 0;
		for (int i = 0; i < listaingredientes.length; i++) {

			for (int j = 0; j < nombre.length(); j++) {

				
				letra = nombre.charAt(j);

				if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
					cont++;
				} else {
					contcalorias++;
				}
			}
		}
		this.precio = cont * 10;
		this.calorias = contcalorias * 2;
		
	}

	public String get_nombre() {
		return nombre;
	}
	
	

	
		

	

	
	public String toString() {
		return "pizza [nombre=" + nombre + "\n"+
				", listaingredientes=" + Arrays.toString(listaingredientes) + ", calorias="
				+ calorias + ", precio=" + precio + "]";
	}

}
