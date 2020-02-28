package examen;

import java.util.*;

public class Nave {
	private String nombre;
	private ArrayList<Tripulante> listatripulantes= new ArrayList<Tripulante>();
	
	public Nave (String nombre_entrada, ArrayList<Tripulante> listatripulantes) {
		this.nombre=nombre_entrada;
		this.listatripulantes=listatripulantes;
	}
	public String get_nombre() {
		return nombre;
	}

}
