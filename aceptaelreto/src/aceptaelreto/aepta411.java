/*sobre la tela de una raña*/
package aceptaelreto;

import java.util.*;

public class aepta411 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		long telarana = 0;
		long peso = 0;
		long suma = 0;
		long cont = 0;

		do {
			telarana = teclado.nextInt();
			cont = 0;
			suma = 0;
			if (telarana == 0) {
				break;
			}

			do {
				peso = teclado.nextInt();
				suma = suma + peso;
				if (suma <= telarana && peso != 0) {

					cont++;
				}
			} while (telarana != 0 && peso != 0);
			System.out.println(cont);

		} while (telarana != 0);

	}

}
