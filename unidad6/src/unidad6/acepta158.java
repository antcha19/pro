/*
 * antonio yepez 13/11/2019
 * 
 * Los saltos de Mario
 */

package unidad6;

import java.util.*;

public class acepta158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		int casos;
		int altura;
		int actual = 0;
		int anterior = 0;
		int contasub = 0;
		int contabaj = 0;

		casos = teclado.nextInt();

		for (int i = 0; i < casos; i++) {
			 contasub = 0;
			 contabaj = 0;

			altura = teclado.nextInt();
			for (int j = 0; j < altura; j++) {
				actual = teclado.nextInt();
				if (j==0) {
					anterior = actual;
				}
				if (actual > anterior) {
					
					contasub++;
				}
				if (actual < anterior) {
					contabaj--;
				}
				anterior = actual;
			}
			System.out.print(contasub+" "+ contabaj);
			
		}
		
	}

}
