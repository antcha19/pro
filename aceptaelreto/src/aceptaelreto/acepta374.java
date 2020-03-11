/*criogenzacion*/

package aceptaelreto;

import java.util.*;

public class acepta374 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int casos = 0;

		int temperaturas = 0;
		int min = 0;
		int cmin = 0;
		int max = 0;
		int cmax = 0;
		boolean nprimero = true;
		casos = teclado.nextInt();

		for (int i = 0; i < casos; i++) {

			do {
				temperaturas = teclado.nextInt();

				if (nprimero == true) {
					min = temperaturas;
					max = temperaturas;
					nprimero = false;
				}
				if (temperaturas == 0) {
					break;
				}
				if (temperaturas < min) {
					min = temperaturas;
					cmin = 1;
				} else if (min == temperaturas) {
					cmin++;
				}
				if (max < temperaturas) {
					max = temperaturas;
					cmax = 1;
				} else if (max == temperaturas) {
					cmax++;
				}

			} while (temperaturas != 0);
			
			System.out.println(min + " " + cmin + " " + max + " " + cmax);
			min = 0;
			cmin = 0;
			max = 0;
			cmax = 0;
			nprimero = true;
			

		}

	}

}
