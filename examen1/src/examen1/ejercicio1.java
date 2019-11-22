/*
 * Antonio yepez 20112019
 * 
 * Los alumnos de Programación de 1o de DAM de un IES deciden hacerle una bandera a Paco, su
profesor favorito.
Para la confección de la bandera, deciden que el nombre de Paco se repita una y otra vez a lo largo y lo
ancho de dicha tela sagrada, dejando claro su admiración hacia su profesor/líder espiritual. Si el
nombre se corta a mitad de una línea, no importa, contínua en la siguiente línea, así una y otra vez hasta
llegar al final de la bandera.
La empresa textil con la que contactan los alumnos les cobrará 5 € por cada letra, excepto por la P, que
al ser mayúscula, les ocupa 2 cuadrantes y les cobrará 10 €.
El programa comenzará pidiendo en la misma línea las dimensiones de la bandera (mínimo 4x4, Paco
no se merece menos), luego dibujará la bandera cuyos bordes se dibujarán con el símbolo de la ‘@’ y
acabará resumiendo el total de la factura.*/

package examen1;

import java.util.*;

public class ejercicio1 {

	public static void main(String[] args) {
		
		
		//variables
		int filas; 
		int columnas;
		int x;
		int y;
	
		
		
			
		//datos
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca doemnsiones de la bandera de paco:");		
		filas = teclado.nextInt();
		columnas = teclado.nextInt();
		
		
		
//		if (filas< 4 & columnas <4) {
//			System.out.println("Introduzca x  es inferior a 4");
//			x = teclado.nextInt();
//			System.out.println("Introduzca y es inferior a 4");
//			y = teclado.nextInt();
//			
//		} 
//	
		//matriz
		int[][] matriz = new int[filas][columnas];
		
		//inicializamos matriz
		for (int i=0; i < filas; i++) {					
			 for (int j=0 ; j < columnas; j++) {
				
				 System.out.printf("paco", matriz[i][j]);
				
			 }
			 
			 
			 System.out.printf("\n");
			 
		}
				
					
			 
		}
		
		


}
