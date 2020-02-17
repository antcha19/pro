package pacoairways;

import java.util.ArrayList;

public class airwyas {

	// atributos
	private int id;
	private String origen;
	private String destino;
	private String ida;
	private String vuelta;
	private String estadodevuelo = "vigente";

	public airwyas(int id, String origen, String destino, String ida, String vuelta) {
		this.id = id;
		this.origen = origen;
		this.destino = destino;
		this.ida = ida;
		this.vuelta = vuelta;
		this.estadodevuelo = "vigente";

		System.out.println("billete comprado");

	}

	public void todos() {
		System.out.println("ID del vuelo " + id + " Origen del vuelo: " + origen + " Destino del vuelo: " + destino
				+ " Dia de ida: " + ida + " Dia de vuelta: " + vuelta + " " + estadodevuelo);
	}

	public void cancelacion() {

		if(estadodevuelo.equals("cancelado")) {
			System.out.println("Este vuelo ya esta cancelado ");
		}
		else {
		estadodevuelo = "cancelado";
		System.out.println("ID del vuelo " + id + " Origen del vuelo: " + origen + " Destino del vuelo: " + destino
				+ " Dia de ida: " + ida + " Dia de vuelta: " + vuelta + " " + estadodevuelo);
		}
		
	}

	public void mostarcancelacion() {
		if (estadodevuelo == "cancelado") {
			System.out.println("ID del vuelo " + id + " Origen del vuelo: " + origen + " Destino del vuelo: " + destino
					+ " Dia de ida: " + ida + " Dia de vuelta: " + vuelta + " " + estadodevuelo);
		} else if (!estadodevuelo.equals("cancelado")) {
			System.out.println("no hay ningun vuelo cancelado");
		}

	}

	public void mostarvigente() {
		if (estadodevuelo == "vigente") {
			System.out.println("ID del vuelo " + id + " Origen del vuelo: " + origen + " Destino del vuelo: " + destino
					+ " Dia de ida: " + ida + " Dia de vuelta: " + vuelta + " " + estadodevuelo);
		} else if (!estadodevuelo.equals("vigente")) {
			System.out.println("no hay ningun vuelo vigente");
		}

	}

	public int get_id() {
		return id;
	}

}
