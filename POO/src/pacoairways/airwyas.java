package pacoairways;

import java.util.ArrayList;

public class airwyas {

	// atributos
	private int id;
	private String origen;
	private String destino;
	private String ida;
	private String vuelta;

	public airwyas(int id, String origen, String destino, String ida, String vuelta) {
		this.id = id;
		this.origen = origen;
		this.destino = destino;
		this.ida = ida;
		this.vuelta = vuelta;

		System.out.println("billete comprado");

	}

	public void todos() {
		System.out.println(id+origen+destino+ida+vuelta);
	}

	

}
