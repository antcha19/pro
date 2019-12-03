/*
 * Antonio yepez  03122019
 * Hacer una función que, dado un String, imprima dicha cadena en una caja de caract*/
package unidad6;

import java.util.*;

public class ejercicio74 {

	public static void main(String[] args) {

		String frase;
		int contador = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("iNTRODUZCA NOMBRE");
		frase = teclado.nextLine();  //  escribir una frase  quue los espacios no los reconozca
		caja(frase.toUpperCase()); // MAYUSCULA

		
	}

	public static void caja(String frase) {

		// imprimi la primera linea
				for (int i = 0; i < frase.length() + 2; i++) {
					System.out.print("*");

				}
				System.out.println("");

				// segunda linea
				for (int i = 0; i < frase.length() + 2; i++) {
					if (i == 0) {
						System.out.print("*");
					} else if (i == frase.length() + 1) {
						System.out.println("*");
					} else {
						System.out.print(" ");
					}

				}

				/// imrpime la frase
				System.out.println("*" + frase + "*");
				
				// imprime linea 4
				for (int i = 0; i < frase.length() + 2; i++) {
					if (i == 0) {
						System.out.print("*");
					} else if (i == frase.length() + 1) {
						System.out.println("*");
					} else {
						System.out.print(" ");
					}

				}

				// imprime la ultima linea
				for (int j = 0; j < frase.length() + 2; j++) {
					System.out.print("*");
				}
	}

}
