package ejercicio129;

import java.util.Scanner;

public class principal129 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		int opcion = 0;
		boolean salir = false;
		while (!salir) {
			menu();
			opcion = teclado.nextInt();
			
			switch (opcion) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:
				salir = true;
				break;

			}
		}

	}

	public  static void menu() {
		System.out.println("1-Dar de alta una pelicula");
		System.out.println("2-Listar peliculas ordenadas por titulo");
		System.out.println("3-Listar peliculas ordenadas por valoracion");
		System.out.println("4-Salir de la aplicacion");

	}

	public static void  alta() {
		Scanner 
	}

}
