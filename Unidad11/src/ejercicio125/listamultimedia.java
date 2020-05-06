package ejercicio125;

public class listamultimedia {

	/* array de objetos Multimedia */
	private multimedia[] lista;
	private int contobjetos;

	public listamultimedia(int contobjetos) {
		this.contobjetos = contobjetos;
		lista = new multimedia[contobjetos];
	}
	
	
	public multimedia get(int posicion) {
		 return lista[posicion];
		 }

	/* int size(): devuelve el número de objetos que hay en la lista */
	public int size() {
		return lista.length;
	}

	/*
	 * boolean add(Multimedia m): añade el objeto al final de la lista y devuelve
	 * true. En caso de que la lista esté llena devolverá false.
	 */
	public boolean add(multimedia m) {
		boolean resultado = false;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == null) {
				lista[i] = m;
				resultado = true;
				break;
			}
		}
		return resultado;
	}

	/*
	 * int indexOf(Multimedia m): devuelve la posición del objeto que se introduce
	 * por parámetro, si no se encuentra, devolverá -1
	 */
	public int indexOf(multimedia m) {
		int resultado = -1;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].equals(m))
				return i;
		}
		return resultado;
	}

	/*
	 * String toString() devuelve la información de los objetos que están en la
	 * lista. Para ello, llamará al méotdo toString de cada uno de los objetos
	 * Multimedia de la lista
	 */

	public String toString() {
		String resultado = "";
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == null) {
				break;
			}
			resultado = resultado + lista[i].toString() + "\n";
		}
		return resultado;
	}
}
