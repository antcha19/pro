package zoo;

import java.util.*;

public class animales {

	private String tipo;
	private String nombre;
	private int peso;

	public animales(String tipo, String nombre, int peso) {
		this.tipo = tipo;
		this.nombre = nombre;
		this.peso = peso;

		// esto esta bien????

		if (tipo.equals("l")) {
			this.tipo = "leon";
		} else if (tipo.equals("t")) {
			this.tipo = "tigre";

		}

	}

	// no se porque me da ese error
	public void datos_animal() {
		System.out.println(tipo + nombre + peso);
	}

}
