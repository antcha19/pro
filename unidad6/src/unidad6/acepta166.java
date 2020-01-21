package unidad6;

import java.util.*;

public class acepta166 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int inicio;
		int fin;
		int resultado1 = 0;
		int resultado2 = 0;

	

		do {
			inicio = teclado.nextInt();
			fin = teclado.nextInt();
			// si inicio es inferior es mejor a fin
			if (inicio < fin) {
				
				resultado2 = (inicio + (99 - fin));
				
			}

			if (fin > inicio) {
				resultado1 = fin - inicio;
				 
			}

			if (resultado2 < resultado1) {
				System.out.println(resultado2);
			} else {
				System.out.println(resultado1);
			}
		} while (inicio > 0 || fin <0);
	}

}
