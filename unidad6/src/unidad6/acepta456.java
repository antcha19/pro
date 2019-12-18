/*
 * Antonio Yepez,13/12/2019
 * 
 * Tarta Sacher
 */

package unidad6;

import java.util.*;

public class acepta456 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int casos = 0;
		int ancho = 0;
		int largo = 0;
		int tableta = 0;
		int resultado;
		
		casos = teclado.nextInt();

		for (int i = 0; i < casos; i++) {
			ancho = teclado.nextInt();
			largo = teclado.nextInt();
			tableta = teclado.nextInt();
			resultado = ancho * largo;
				// si es el resto es mayor que 0
			
			if (tableta % resultado > 0) {
				System.out.println((tableta / resultado) + 1);
			} else {
				// si no el resto no es maoyr que o
				System.out.println(tableta / resultado);
			}

		}

	}
}
