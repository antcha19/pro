/*
 * antonio yepez  19112019
 *Realiza un programa que lea las dimensiones de una matriz que será cuadrada y de lado par.
 * Es decir,validará que las dimensiones sean 2x2, 4x4, 6x6, etc.Lo que hará el programa será 
 * informar el cuadro superior izquierdo con ‘1’, el superior derecho con‘2’, el inferior izquierdo
 *  con ‘3’ y el inferior derecho con ‘4’ y lo mostrará por panta*/

package unidad5;


import java.util.*;
public class ejercicio67 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		 
		 int fila;
			int columna;
			int tamano=0;
			int mitad;
			
			
			System.out.println("introduce el tamano de la matriz");
			tamano = teclado.nextInt();
			mitad = tamano/2;
			
			//declaro la matriz con fila y  columna a ingresar
			int[][] matriz = new int [tamano][tamano]; 
			
			//recorrer e imprimir todos los elementos de la matriz
			int filas = matriz.length;
			int columnas = matriz[0].length;
			
			for (int i=0; i < filas; i++) {					
				 for (int j=0 ; j < columnas; j++) {
					 matriz[i][j]=1;
					 
					 if (i >= mitad) {
						 matriz[i][j]=3;
					 }
					 if (j >= mitad) {
						 matriz[i][j]=2;
					 }
					 if (j >= mitad && i >= mitad) {
						 matriz[i][j]=4;
					 }
					 System.out.printf("%4d", matriz[i][j]); 
					}
				 
				 System.out.printf("\n");
	
		    }

		}
}
//terminado
