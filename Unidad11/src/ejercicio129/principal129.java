package ejercicio129;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.*;
import java.util.Scanner;

import ejercicio128.camion;

import java.io.*;
import java.util.Arrays;

public class principal129 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		ArrayList<Pelicula> listapeliculas = new ArrayList<Pelicula>();

		int opcion = 0;
		boolean salir = false;
		while (!salir) {
			menu();
			try {
				opcion = Errores();
				switch (opcion) {
				case 1:
					alta(listapeliculas);

					break;
				case 2:
					ordetitulo(listapeliculas);
					break;
				case 3:
					ordevaloracion(listapeliculas);
					break;
				case 4:
					salir = true;
					System.out.println("Gracias por utilizar esta base de datos de películas");
					break;

				}

			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {

				System.out.println(e.getMessage());

			}
		}
	}

	public static void menu() {
		System.out.println("1-Dar de alta una pelicula");
		System.out.println("2-Listar peliculas ordenadas por titulo");
		System.out.println("3-Listar peliculas ordenadas por valoracion");
		System.out.println("4-Salir de la aplicacion");

	}

	public static void alta(ArrayList<Pelicula> listapeliculas) {
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		String titulo = "";
		int duracion = 0;
		int nota = 0;
		String genero = "";
		String generos = "";

		System.out.println("Introduzca titulo de la pelicula:");
		titulo = teclado.nextLine();
		System.out.println("Introduzca duracion de la pelicula:");
		duracion = teclado.nextInt();
		System.out.println("Introduzca nota de la pelicula");
		nota = teclado.nextInt();
		teclado.nextLine();

		while (true) {
			System.out.println("Introduzca genero de la pelicula (Comedia,Drama,Terror o Ciencia-Ficcion):");
			genero = teclado.nextLine();
			generos = genero.toLowerCase();
			if ((generos.equals("comedia")) || (generos.equals("drama")) || (generos.equals("terror"))
					|| (generos.equals("ciencia-ficcion"))) {
				break;
			}
		}
		Pelicula peliculas = new Pelicula(titulo, duracion, nota, genero);
		listapeliculas.add(peliculas);
		System.out.println("Pelicula ha sido anadida");
	}

	public static void ordetitulo(ArrayList<Pelicula> listapeliculas) {
		/* Paso un arralist a un array */
		String ordenartitulo[] = new String[listapeliculas.size()];
		/* sirve para contar el array cuantos hay */
		int contador = 0;
		Pelicula auxvalora;
		Iterator iter = listapeliculas.iterator();
		while (iter.hasNext()) {
			auxvalora = (Pelicula) iter.next();
			ordenartitulo[contador] = auxvalora.mostrarlistadotitulo();
			contador++;
		}
		Arrays.sort(ordenartitulo);
		for (int i = 0; i < ordenartitulo.length; i++) {
			String[] partespeli = ordenartitulo[i].split("@");

			System.out.println("-" + partespeli[0] + " Duracion: " + partespeli[1] + "min. Valoracion:" + partespeli[2]
					+ "/10 Genero:" + partespeli[3]);

			 

		}

	}

	public static void ordevaloracion(ArrayList<Pelicula> listapeliculas) {
		String ordenarvaloracion[] = new String[listapeliculas.size()];
		int contador = 0;
		Pelicula auxvalora;
		Iterator iter = listapeliculas.iterator();
		while (iter.hasNext()) {
			auxvalora = (Pelicula) iter.next();
			ordenarvaloracion[contador] = auxvalora.mostrarlistadovaloracion();
			contador++;
		}
		Arrays.sort(ordenarvaloracion);
		for (int i = 0; i < ordenarvaloracion.length; i++) {
			
			System.out.println(ordenarvaloracion[i]);

		}

	}

	/* nos obliga a introducir numeros del 1 al 4 y solo datos numericos */
	public static int Errores() throws InputMismatchException, Exception {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Eliga una opcion");
		int opcion = 0;
		try {
			opcion = teclado.nextInt();
		} catch (InputMismatchException e) {
			throw new InputMismatchException("dato no numerico");
		}
		if (opcion < 1 || opcion > 4) {
			throw new Exception("Opcion incorrecta solo puedes introducir del 1 al 4");
		}
		return opcion;
	}
}
