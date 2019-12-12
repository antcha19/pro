/*
 * Antonio yepez 16102019
 * Escribe un programa que lea un número entero de 3 cifras y
 * 
 *  muestre por separado las cifras del número. Un ejemplo de ejecución sería
 */

package boletin4;

import java.util.Scanner;

public class ejercicio31 {

	public static void main(String[] args) {

		// variable scanner
		Scanner teclado = new Scanner(System.in);

		int numero;

		int primero = 0;
		int segundo = 0;
		int tercero = 0;

		System.out.println("escribre los numeros");
		numero = teclado.nextInt();

		// 123/100=1,23 como es entero no muestra el decimal
		primero = numero / 100;

		// 123/10=12,3 mostraría 12, pero con el símbolo "%" mostramos el resto de 12/10=2
		segundo = (numero / 10) %10;
		// con % 10 mostramos el resto de 123/10
		tercero = numero % 10;

		System.out.println("el primer numero es : " + numero + " --> " + primero);
		System.out.println("el segundo numero es : " + numero + " --> " + segundo);
		System.out.println("el tercer numero es: " + numero + " --> " + tercero);

	}

}
