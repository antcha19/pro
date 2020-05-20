package ejercicio130;

import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class ClinicaVeterinaria {

	private ArrayList<Animal> listaAnimales = new ArrayList<Animal>();

	public ClinicaVeterinaria() {
		this.listaAnimales = listaAnimales;
	}

	public void anyadirAnimal(Animal a) {
		listaAnimales.add(a);
	}

	public Animal buscarAnimal(String nombre) {
		Animal aux = null;
		boolean encontrado = false;
		Animal guardado =null;
		Iterator iter = listaAnimales.iterator();
		while (iter.hasNext()) {
			aux = (Animal) (iter.next());
			if ((aux.getNombre()).equals(nombre)) {
				encontrado = true;
				guardado = aux;
				System.out.println("Animal encontrado " + nombre);
				break;
			}
		}
		if (guardado == null) {
			System.out.println("Animal no encontrado " + nombre);
			
		}
		return guardado;
	}

	public void insertarcomen(String nombre, String comentario) {

		Animal auxinsertar = buscarAnimal(nombre);
		if (auxinsertar != null) {
			auxinsertar.setComentarios(comentario);
		}

	}

	public String toString() {
		Scanner teclado = new Scanner(System.in);
		String lista = "";
		Animal aux;

		Iterator iter = listaAnimales.iterator();
		while (iter.hasNext()) {
			aux = (Animal) iter.next();
			lista = lista+" \n" + aux.toString();
			
		}
		return lista;
	}

}