package zoo;

import java.util.*;

public class animales {

	private char tipo;
	private String nombre;
	private int peso;

	public animales(char tipo, String nombre, int peso) {
		this.tipo = tipo;
		this.nombre = nombre;
		this.peso = peso;
	}

	public String toString() {
		return "Animal de: "+ nombre + " tiene ahora el peso :" + peso + "kg";
	}

	
	
	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String get_nombre() {
		return nombre;
	}
	public int get_peso() {
		return peso;
	}

}
