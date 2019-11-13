/*
 * Antonio Yepez 13112019
 * 
 * Realiza un programa que construya una matriz de unas dimensiones introducidas por teclado. Después
informará todos los valores de la matriz con una serie de valores aleatorios cuyo rango mínimo y
máximo también se introducirá por teclado.
El programa, a continuación, mostrará la matriz por pantalla y solicitará en bucle un valor a buscar
dentro de la matriz. Si el valor no se encuentra en la matriz se informará de ello, pero si lo encuentra,
tendrá que decir en qué posiciones de la matriz está.
Este bucle se repetirá hasta que el usuario teclee, en lugar de un número a buscar, la palabra “sa
 */
package unidad5;

import java.util.*;

public class ejercicio66 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
				
		
		//variables
		int fila ;
		int columna;
		int numero;
		int inferior;
		int superior;
	  
		
		System.out.println("introduce numero de filas");
		fila = teclado.nextInt();
		System.out.println("introduce numero de columna");
		columna = teclado.nextInt();
		System.out.println("introduce numero inferior de rango ");
		inferior = teclado.nextInt();
		System.out.println("introduce numero superior de rango");
		superior = teclado.nextInt(); 
		
		int  valor= inferior-superior;
		
		//declaro la matriz 
		int[][] matriz = new int [fila][columna]; 		
		
		
		for (int i=0; i < fila; i++) {					
			 for (int j=0 ; j < columna; j++) {
				
				 System.out.printf("%4d", matriz[i][j]);
			 }
			 System.out.printf("\n");
			 
		}
	

	}

}
