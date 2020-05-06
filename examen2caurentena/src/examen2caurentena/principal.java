package examen2caurentena;

import java.util.*;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		// arraylist
		ArrayList<pelicula> listapeliculas = new ArrayList<pelicula>();
		ArrayList<serie> listaseries = new ArrayList<serie>();

		// variables
		int opcion = 0;
		boolean salir = false;
		String titulo = "";
		String productora = "";
		int anyo = 0;
		int nomioscar = 0;
		int oscarganados = 0;
		int temporadas = 0;
		boolean finalizada = false;
		boolean visto = false;

		// menu
		while (!salir) {
			menu();
			opcion = teclado.nextInt();
			teclado.nextLine();
			switch (opcion) {
			case 1:
				System.out.println("introduzca el titulo de la pelicula");
				titulo = teclado.nextLine();
				System.out.println("Introduzca productora de la pelicula");
				productora = teclado.nextLine();
				System.out.println("Introduzca año de publicacion");
				anyo = teclado.nextInt();
				System.out.println("Numero de nominaciones a los oscars:");
				nomioscar = teclado.nextInt();
				System.out.println("Numero de oscars ganados:");
				oscarganados = teclado.nextInt();
				while (nomioscar < oscarganados) {
					System.out.println("ERROR!, mas oscars ganados que nominaciones!");
					System.out.println("Numero de nominaciones a los oscars:");
					nomioscar = teclado.nextInt();
					System.out.println("Numero de oscars ganados:");
					oscarganados = teclado.nextInt();

				}

				System.out.println("La pelicula" + titulo + " ha sido dada de alta correctamente!");
				pelicula peliculas = new pelicula(titulo, productora, anyo, visto, nomioscar, oscarganados);
				listapeliculas.add(peliculas);
				break;

			case 2:

				String auxili = "";
				System.out.println("Introduzca titulo de la serie");
				titulo = teclado.nextLine();
				System.out.println("Introduzca productora de la serie");
				productora = teclado.nextLine();
				System.out.println("Introduzca año de publicacion");
				anyo = teclado.nextInt();
				System.out.println("Introduzca numero de temporadas:");
				temporadas = teclado.nextInt();
				while (temporadas == 0) {

					System.out.println("ERROR!," + titulo + " debería tener, al menos 1 temporada!");
					System.out.println("Introduzca numero de temporadas:");
					temporadas = teclado.nextInt();
					System.out.println("¿La serie está finalizada o no? (S/N)");
					teclado.nextLine();
					auxili = teclado.nextLine();
					while (!auxili.equalsIgnoreCase("s") && !auxili.equalsIgnoreCase("n")) {
						System.out.println("¿La serie esta finalizada? (S/N)");
						auxili = teclado.nextLine();
						if (auxili.equalsIgnoreCase("s")) {
							finalizada = true;
						}
						if (auxili.equalsIgnoreCase("n")) {
							finalizada = false;
						}
					}

				}

				serie series = new serie(titulo, productora, anyo, visto, temporadas, finalizada);
				listaseries.add(series);
				System.out.println("La serie " + titulo + "ha sido dada de alta correctamente!");
				break;

			case 3:
				String comparar;
				boolean encontrado = false;
				System.out.println("Introduzca el titulo del contenido que quiere visualizar:");
				titulo = teclado.nextLine();
				for (contenido auxiliar : listapeliculas) {
					comparar = auxiliar.getTitulo();
					if (comparar.equalsIgnoreCase(titulo) == true) {
						auxiliar.getVisto();
						encontrado = true;
						break;
					}
				}
				if (encontrado = true) {
					System.out.println("marcado como visto el " + titulo);
				} else {
					System.out.println("no existe");
				}
				for (contenido auxiliar : listaseries) {
					comparar = auxiliar.getTitulo();
					if (comparar.equalsIgnoreCase(titulo) == true) {
						auxiliar.getVisto();
						encontrado = true;
						break;
					}
				}
				if (encontrado = true) {
					System.out.println("marcado como visto el " + titulo);
				} else {
					System.out.println("no existe");
				}
				break;
			case 4:
				pelicula aux;
				Iterator iter = listapeliculas.iterator();
				while (iter.hasNext()) {
					aux = (pelicula) iter.next();
					aux.mostrarpelicula();
				}

				serie auxserie;
				Iterator iter2 = listaseries.iterator();
				while (iter2.hasNext()) {
					auxserie = (serie) iter2.next();
					auxserie.mostrarserie();
				}

				break;
			case 5:
				
				pelicula auxpendiente;
				Iterator iterpendiente = listapeliculas.iterator();
				while (iterpendiente.hasNext()) {
					boolean falso= false;
					auxpendiente = (pelicula) iterpendiente.next();
					falso=auxpendiente.getVisto(); 
					if(falso == false) {
						auxpendiente.mostrarpelicula();
					}
				}

				serie auxseriependiente;
				Iterator iter2pendiente = listaseries.iterator();
				while (iter2pendiente.hasNext()) {
					auxseriependiente = (serie) iter2pendiente.next();
					auxseriependiente.mostrarserie();
				}

				break;

			case 6:
				salir = true;
				System.out.println("Gracias por utilizar esta agenda");
				break;
			}

		}

	}

	public static void menu() {
		System.out.println("1-Dar de alta una película");
		System.out.println("2-Dar de alta una serie");
		System.out.println("3-Ver un contenido");
		System.out.println("4-Listar contenido");
		System.out.println("5-Listar contenido pendiente por ver");
		System.out.println("6-salir");

	}

}
