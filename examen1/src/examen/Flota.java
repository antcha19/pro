package examen;

import java.util.*;

public class Flota {

	private String nombre;
	private ArrayList<Nave> naves= new ArrayList<Nave>();
	
	public Flota (String nombre_entrada, ArrayList<Nave> naves) {
		this.nombre=nombre_entrada;
		this.naves=naves;
	}
	public String get_nombre() {
		return nombre;
	}
}
