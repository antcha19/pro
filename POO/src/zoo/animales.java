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
		
		
		

	}


	
	public String get_tipo(){
		return tipo;
	}
	public String get_nombre() {
		return nombre;
	}
	public int get_peso() {
		return peso;
	}

}
