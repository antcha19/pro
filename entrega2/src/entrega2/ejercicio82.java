/*
 * Antonio Yepez y  Gabriel Martinez 
  11/12/2019
 */

package entrega2;

import java.util.*;

public class ejercicio82 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero;
		System.out.print("introduzca numero");
		numero = teclado.nextInt();
		// llama al metodo divisores
		divisores(numero, numero);
		System.out.println(divisores(numero, numero));

	}

	public static String divisores(int n, int num) {

		// si numero sea 1 se acabe

		if (num == 0) {
			return " ";
		}

		else if (n % num == 0) {

			return num + "," + divisores(n, num - 1);

		} else {
			return divisores(n, num - 1);
			
		}
	}

}
