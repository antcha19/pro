/*
 * Antonio yepez    3/12/2019
 * Realiza un programa que simule la extracción de una letra al azar, para saber porqué apellido se empieza a preguntar en un examen de oposiciones.
 *  Para ello, ten en cuenta que tenemos 26 letras (sin la ñ) y que la letra ‘A’ se corresponde con el carácter ASCII 65.*/

package unidad5;


import java.util.*;
public class ejercicio69 {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		
		int numero = aleatorio.nextInt(25);
		
		char apellido[] = {'A','B','C','D','E','F','G','H','I',
						   'J','K','L','M','N','O','P','Q','R',
						   'S','T','U','V','W','X','Y','Z'};
		
		System.out.print(apellido[numero]);

	}

}
//terminado