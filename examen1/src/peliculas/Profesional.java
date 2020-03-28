package peliculas;

import java.util.*;

public class Profesional {
	private String tipo;
	private String nombre;
	private int edad;
	private int numoscars;
	static int numactores = 0;

	static int numdirectores = 0;
	static int numproductores = 0;

	public Profesional(String tipo, String nombre, int edad, int numoscars) {
		this.tipo = tipo;
		this.nombre = nombre;
		this.edad = edad;
		this.numoscars = numoscars;
		switch (tipo) {
		case "Director":
			numdirectores++;
			break;
		case "Actor":
			numactores++;
			break;
		case "Productor":
			numproductores++;
			break;
		}
	}

	public String gettipo() {
		return tipo;
	}

	public String getnombre() {
		return nombre;
	}

	public int getoscars() {
		return numoscars;
	}
}
