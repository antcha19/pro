package aceptaelreto;

import java.util.*;

public class acepta337 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int casos = 0;
		int arriba = 0;
		int abajo = 0;
		int casos2 = 0;
		int suma = 0;
		
		//vector
		int abajovector[] = new  int[6];
		int arribavector[] = new int[6];

		casos = teclado.nextInt();

		for (int i = 0; i < 6; i++) {
			abajo = teclado.nextInt();
			  abajovector[i]=abajo;
		}System.out.println();

		for (int j = 0; j < 6; j++) {
			arriba = teclado.nextInt();
			 arribavector[j] = arriba ;
			
	}

}
}
