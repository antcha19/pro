/*
 * antonio  4/12/2019
 * Esta función convierte el número n al sistema de palotes y lo devuelve en una cadena de caracteres.
Por ejemplo, el 470213 en decimal es el | | | | - | | | | | | | - - | | - | - | | | en el sistema de palotes.
Utiliza esta función en un programa para comprobar que funciona bien.
Desde la función no se debe mostrar nada por pantalla, solo se debe usar println desde el programa
principal.
 */

package entrega2;

import java.util.*;

public class ejercicio77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		String cadena;
		String cadena2;
		char separacion;

		System.out.println("introduzca numero a convertir");
		cadena = teclado.nextLine();

		// recoremos la cadena
		for (int i = 0; i < cadena.length(); i++) {
			// separamos el primer caracter de la cadena
			separacion = cadena.charAt(i);
			// creamos una cadena auxiliar para cambiar de caracter a string
			cadena2 = Character.toString(separacion);

			System.out.print( convierteenpalotes(Integer.parseInt(cadena2))+ " - ");
		}

	}

	public static String convierteenpalotes(int opciones) {

		String palos;

		switch (opciones) {
		case 0:
			palos = " ";
			break;
		case 1:
			palos = "|";
			break;
		case 2:
			palos = "||";
			break;
		case 3:
			palos = "|||";
			break;
		case 4:
			palos = "||||";
			break;
		case 5:
			palos = "|||||";
			break;
		case 6:
			palos = "||||||";
			break;
		case 7:
			palos = "|||||||";
			break;
		case 8:
			palos = "||||||||";
			break;
		case 9:
			palos = "|||||||||";
			break;
		default:
			palos = "Caracter no válido";
			break;
		}

		return palos;

	}

}
