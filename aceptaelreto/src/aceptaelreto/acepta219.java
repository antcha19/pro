package aceptaelreto;

import java.util.*;

public class acepta219 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int casos = 0;
		int decimos = 0;
		int contador = 0;
		int loteria = 0;
		int casos1 = 0;

		casos = teclado.nextInt();
		while (casos > casos1) {

			decimos = teclado.nextInt();
			for (int i = 0; i < decimos; i++) {
				loteria = teclado.nextInt();
				// si el resto es igual a es par
				if (loteria % 2 == 0) {
					contador++;
				}
			}
			System.out.println(contador);
			casos1++;
			System.out.println(casos);
			contador=0;

		}

	}

}
