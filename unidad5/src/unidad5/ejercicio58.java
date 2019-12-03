/*
 * antonio yepez 05112019
 * 
 * Escribe un programa que introduzca el tamaño en filas y columnas
 *  de una matriz. Una vez informado eltamaño, pedirá uno a uno los 
 *  datos de la matriz. Para finalizar, el programa mostrará   
 *  la matrizintroducida y la suma de todos sus componentes
 */

package unidad5;

import java.util.*;
public class ejercicio58 {

	public static void main(String[] args) {
		 
		Scanner teclado = new Scanner(System.in);
		
		
	
		int fila;
		int columna;
		
		System.out.println("introduce numero de filas");
		fila = teclado.nextInt();
		System.out.println("introduce numero de columna");
		columna = teclado.nextInt();
		
		//declaro la matriz
		int[][] matriz = new int [fila][columna]; 		  
		
		
		for (int i=0; i < fila; i++) {					
			 for (int j=0 ; j < columna; j++) {
				 System .out.printf("introducir datos para la posicon "+i+j);
				 // el usuario va rellanando los valores de la matriz
				 matriz[i][j]= teclado.nextInt();
			 }
		}
		System.out.println("\nSu vector es: \n");
		
		//VOLVEMOS A HACER EL RECORRIDO PARA QUE IMPRIMA LOS VALORES QUE AHORA TIENE ALMACENADOS
		for (int i=0; i < fila; i++) {
			 for (int j=0 ; j < columna; j++) {
				 System .out.print(matriz[i][j]);
			 }
			 System .out.println("\n");	

	    }

	}
}
//terminado
