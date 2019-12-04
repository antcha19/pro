/*
 * antonio 03/12/2019
 *  ahorcado
 */

package unidad6;

import java.util.*;

public class ahorcado {

	public static void main(String[] args) {

		

		String[] palabras = { "telefono", "tiburon", "trabajo" };

		int posicionaleatorio = (int) Math.floor(Math.random() * palabras.length);

		// palabra aleatoria
		String palabra = palabras[posicionaleatorio];

		

		// convierte un array en un string de letras
		char[] letras = palabra.toCharArray();
		char[] letrasconguiones = new char[letras.length];

		for (int i = 0; i < letras.length; i++) {
			letrasconguiones[i] = '*';

		}

		System.out.println(letrasconguiones);

		boolean ganado = false;

		while (ganado == false) {
			System.out.println("introduce una letra");

			Scanner lector = new Scanner(System.in);
			// leo  la primere letra de lector
			char letraintroducida = lector.next().charAt(0);

			// si la letra introducida esta en la palabra
			for (int i = 0; i < letras.length; i++) {
				if (letras[i] == letraintroducida) {
					// sustituir por la letra introducida
					letrasconguiones[i] = letraintroducida;

				}
			}
			if (Arrays.equals(letras, letrasconguiones)) {
				System.out.println("has adivinado pringado");
			}
			System.out.println(letrasconguiones);
		}
	}

}
