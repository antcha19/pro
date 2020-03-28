package peliculas;

import java.util.*;

public class Pelicula {

	private String titulo;
	private Profesional director;
	private Profesional productor;
	private ArrayList<Profesional> Lista_Actores = new ArrayList<Profesional>();

	static int numpelis = 0;

	public Pelicula(String titulo, Profesional director, Profesional productor, ArrayList<Profesional> Lista_Actores) {
		this.titulo = titulo;
		this.director = director;
		this.productor = productor;
		this.Lista_Actores = Lista_Actores;
		numpelis++;
	}

	public void resumenPelicula() {
		int totaloscars = 0;
		System.out.println("--");
		System.out.println("+'" + titulo + "', dirigida por : " + director.getnombre() + " producida por: "
				+ productor.getnombre() + " e interpretada por: ");
		totaloscars = director.getoscars() + productor.getoscars();
		Iterator iter = Lista_Actores.iterator();
		Profesional profeaux;
		while (iter.hasNext()) {
			profeaux = (Profesional) iter.next();
			System.out.println("\t-" + profeaux.getnombre());
			totaloscars = totaloscars + profeaux.getoscars();
		}
		System.out.println("Entre el director, productor y actores, " + titulo + " tiene " + totaloscars + " oscars.");
		System.out.println("--");
	}
}
