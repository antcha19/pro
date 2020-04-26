package ejercicios;

import java.util.*;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int[] matriz = { 5, 145, 96, 570, -8 };

		for (int i = 0; i < matriz.length; i++) {
			System.out.println("mi matriz el valir es:" + i + " = " + matriz[i]);
		}

		// recorrido ascendente
		System.out.println("--------------------------");
		System.out.println("recorrido ascendente");
		for (int i = 0; i < matriz.length; i++) {
			System.out.printf("%4d", matriz[i]);
		}
		System.out.println("\n");

		// recorrido descendente
		System.out.println("--------------------------");
		System.out.println("recorrido descendente");
		for (int i = matriz.length - 1; i >= 0; i--) {
			System.out.printf("%4d", matriz[i]);
		}
		System.out.println("\n");

		// arrays multidimensionales
		System.out.println("arrays multidimensionales");
		int[][] multi = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < multi.length; i++) {
			for (int j = 0; j < multi.length; j++) {
				System.out.printf("%4d", multi[i][j]);
			}
			System.out.println("\n");
		}

		/// creacion
		
			int[][] a =  {{1, 2, 3}, 
						  {4, 5, 6}, 
						  {7, 8, 9}};
						  

			int filas = teclado.nextInt();
			int columnas = teclado.nextInt();
			
			

			for (int i = 0; i < filas; i++) {
				for (int j = 0; j < columnas; j++) {
					System.out.printf("%4d", a[i][j]);
				}
				System.out.println("\n");
			}
			
		

	}

}
