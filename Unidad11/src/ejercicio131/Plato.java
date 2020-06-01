package ejercicio131;

import java.util.ArrayList;
import java.util.*;

public class Plato implements Interface_Plato {

	protected String nombre;
	private double precio;
	private ArrayList<Ingrediente> listaingredientes = new ArrayList<Ingrediente>();

	public Plato(String nombre) {
		this.nombre = nombre;
		this.precio = precio;
		this.listaingredientes = listaingredientes;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		String[] caracter = nombre.split("");
			if(caracter[0].equalsIgnoreCase("A") || caracter[0].equalsIgnoreCase("E") || caracter[0].equalsIgnoreCase("I")
					|| caracter[0].equalsIgnoreCase("O") || caracter[0].equalsIgnoreCase("U")) {
				this.precio=10;
			}else {
				this.precio=5;
			}
		return precio;
	}

	public void anyadir_ingrediente(Ingrediente i) {
		listaingredientes.add(i);
	}

	/*
	 * Mostar todos los ingredientes del plato Para ello, recorrer el arraylist de
	 * ingredientes y llamar a detalleIngrediente
	 */
	public String consultar_ingredientes() {
		String consulta = "";

		Ingrediente aux;
		Iterator iter = listaingredientes.iterator();
		while (iter.hasNext()) {
			aux = (Ingrediente) iter.next();
			System.out.println(aux.detalleIngrediente());
			consulta = aux.detalleIngrediente();
		}
		return consulta;
	}

}
