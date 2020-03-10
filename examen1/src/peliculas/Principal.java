package peliculas;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 0;
		ArrayList<Profesional> lista_profes = new ArrayList<Profesional>();
		ArrayList<Pelicula> lista_pelis = new ArrayList<Pelicula>();
		opcion = pintar_menu();
		while (true) {
			switch (opcion) {
			case 1:
				alta_profesional("Director", lista_profes);
				break;
			case 2:
				alta_profesional("Actor", lista_profes);
				break;
			case 3:
				alta_profesional("Productor", lista_profes);
				break;
			case 4:
				alta_pelicula(lista_profes, lista_pelis);
				break;
			case 5:
				resumen_videoclub(lista_pelis);
				break;
			case 6:
				System.out.println("Gracias por utilizar nuestro Videoclub");
				break;
			}

			if ((opcion != 1) && (opcion != 2) && (opcion != 3) && (opcion != 4) && (opcion != 5) && (opcion != 6)) {
				System.out.println("Opcion incorrecta!");
			}
			if (opcion == 6) {
				break;
			}
			opcion = pintar_menu();
		}
	}

	public static int pintar_menu() {
		int opcion = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("--VIDEOCLUB BE KIND - REWIND --");
		System.out.println("1-Dar de alta un Director");
		System.out.println("2-Dar de alta un Actor");
		System.out.println("3-Dar de alta un Productor");
		System.out.println("4-Dar de alta una pelicula");
		System.out.println("5-Listado de peliculas");
		System.out.println("6-Salir");
		opcion = s.nextInt();
		return opcion;
	}

	public static void alta_profesional(String tipo, ArrayList<Profesional> lista_profes) {
		String nombre = "";
		int edad = 0;
		int numoscars = 0;
		int numero = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Vamos a dar de alta un " + tipo + ":");
		System.out.println("Introduzca nombre:");
		nombre = s.nextLine();

		System.out.println("Introduzca la edad de " + nombre + ":");
		edad = s.nextInt();
		System.out.println("Introduzca el numero de oscars que ha ganado " + nombre + ":");
		numoscars = s.nextInt();
		Profesional p = new Profesional(tipo, nombre, edad, numoscars);
		lista_profes.add(p);
		switch (tipo) {

		case "Actor":
			numero = Profesional.numactores;
			break;
		case "Director":
			numero = Profesional.numdirectores;
			break;
		case "Productor":
			numero = Profesional.numproductores;
			break;
		}
		System.out.println(tipo + " numero " + numero + " dado de alta!");
	}

	public static void alta_pelicula(ArrayList<Profesional> lista_profes, ArrayList<Pelicula> lista_pelis) {
		String titulo_pelicula = "";
		String director_pelicula = "";
		String productor_pelicula = "";
		String nombre_actor = "";
		Scanner s = new Scanner(System.in);
		int cuenta_actores = 1;
		boolean encontrado = false;
		Profesional director = null;
		Profesional actor = null;
		Profesional productor = null;
		ArrayList<Profesional> lista_actores = new ArrayList<Profesional>();
		System.out.println("Introduzca el titulo de la nueva pelicula:");
		titulo_pelicula = s.nextLine();
		while (director == null) {
			System.out.println("Introduzca el director de " + titulo_pelicula + ":");
			director_pelicula = s.nextLine();
			director = buscar_profesional("Director", director_pelicula, lista_profes);
			if (director == null) {
				System.out.println(director_pelicula + " no existe en la base de datos de directores.");
			}
		}
		while (productor == null) {
			System.out.println("Introduzca el productor de " + titulo_pelicula + ":");
			productor_pelicula = s.nextLine();
			productor = buscar_profesional("Productor", productor_pelicula, lista_profes);
			if (productor == null) {
				System.out.println(productor_pelicula + " no existe en la base de datos de productores.");
			}
		}

		System.out.println("Ahora vamos a introducir los actores de " + titulo_pelicula
				+ ", pulse en cualquier momento salir para dejar de introducirlos:");
		while (!nombre_actor.equals("salir")) {
			System.out.println("Introduzca nombre del actor numero " + cuenta_actores + ":");
			nombre_actor = s.nextLine();
			if (nombre_actor.equals("salir")) {
				break;

			}
			actor = buscar_profesional("Actor", nombre_actor, lista_profes);
			if (actor != null) {
				lista_actores.add(actor);
				cuenta_actores++;
			} else {
				System.out.println(nombre_actor + " no existe en la base de datos de actores.");
			}
		}
		Pelicula mipeli = new Pelicula(titulo_pelicula, director, productor, lista_actores);
		lista_pelis.add(mipeli);
	}

	public static Profesional buscar_profesional(String tipo, String nombre, ArrayList<Profesional> lista_profes) {
		boolean encontrado = false;
		Iterator iter = lista_profes.iterator();
		Profesional profeaux = null;
		String nombreaux;
		String tipoaux;
		while (iter.hasNext()) {
			profeaux = (Profesional) iter.next();
			nombreaux = profeaux.getnombre();
			tipoaux = profeaux.gettipo();
			if ((tipoaux.equals(tipo)) && (nombreaux.equals(nombre))) {
				encontrado = true;
				break;
			}
		}
		if (encontrado == true) {
			return profeaux;
		} else {
			return null;
		}
	}

	public static void resumen_videoclub(ArrayList<Pelicula> lista_pelis) {
		System.out.println("Peliculas:" + Pelicula.numpelis);
		System.out.println("Directores:" + Profesional.numdirectores);
		System.out.println("Productores:" + Profesional.numproductores);
		System.out.println("Actores:" + Profesional.numactores);
		Iterator iter = lista_pelis.iterator();
		Pelicula peliaux;
		while (iter.hasNext()) {
			peliaux = (Pelicula) iter.next();
			peliaux.resumenPelicula();
		}
	}
}
