/*
 * Antonio yepez 
 * caja magica*/

package unidad5;

import java.util.*;
public class ejercicio64cajamagica {

	public static void main(String[] args) {
		
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		int x;
		int y;
		int suma_filas=0;
		int suma_columnas=0;
		int suma_diagonal_principal=0;
		int suma_diagonal_inversa=0;
		
		do { 
			//PREGUNTAMOS HASTA QUE LAS DIMENSIONES DE X E Y SEAN IGUALES

		System.out.println("Introduce las dimensiones de la matriz: ");
		x = teclado.nextInt();
		y = teclado.nextInt();
		
		if  (x!=y || x<=1 || y<=1) {
			System.out.println("¡La matriz debe ser cuadrada y mínimo de 2x2!");

		}
		
		}while (x!=y || x<=1 || y<=1);
		
		int matriz[][]= new int [x][y];	//DECLARAMOS UNA MATRIZ DE X FILAS E Y COLUMNAS

		//RELLENAMOS LA MATRIZ	
		
		for (int i=0; i < matriz.length; i++) {
			for (int j=0; j < matriz.length; j++) {
				System.out.println("Introduzca el valor [" + i + "," + j + "]");
				matriz[i][j] = teclado.nextInt();
			}
		}
		
		//IMPRIMIMOS LA MATRIZ
		
		for (int i=0; i < matriz.length; i++) {
			for (int j=0; j < matriz.length; j++) {
		          System.out.print(matriz[i][j]);
		        }
		      System.out.println();
		    }
		
		//SUMAMOS LOS VALORES DE LAS FILAS DE LA MATRIZ
		
	      for (int i = 0; i < matriz.length; i++) {  
	          suma_filas=0;  
	          for (int j = 0; j < matriz[i].length; j++) {  
	            suma_filas=suma_filas+matriz[i][j];  
	          }  
	          System.out.println("La suma de los valores de la fila "+(i+1)+" es: "+suma_filas);  
	        }

		//SUMAMOS LOS VALORES DE LAS COLUMNAS DE LA MATRIZ
	      
	      for (int i = 0; i < matriz[0].length; i++) {  
	        suma_columnas=0;  
	        for (int j = 0; j < matriz.length; j++) {  
	          suma_columnas=suma_columnas+matriz[j][i];  
	        }  
	        System.out.println("La suma de los valores de la columna "+(i+1)+" es: "+suma_columnas);  
	      }
	      
	      //SUMA DIAGONAL PRINCIPAL
	       
	        for (int i = 0; i < matriz.length; i++) {     
	          suma_diagonal_principal=suma_diagonal_principal+matriz[i][i];   
	        }  
	        System.out.println("La suma de la diagonal principal es: "+suma_diagonal_principal);  
	      
	      
	      //SUMA DIAGONAL INVERSA
	       
	          for(int i = 0; i < matriz.length; i++){  
	            for(int j = 0; j < matriz[i].length; j++){  
	              if( i+j == matriz.length - 1){  
	               suma_diagonal_inversa = suma_diagonal_inversa + matriz[i][j];  
	            }  
	          }  
	        }  
	        System.out.println("La suma de la diagonal inversa es: "+suma_diagonal_inversa);  
	          
	      
	      //SI LA SUMA DE TODOS ES IGUAL LA MATRIZ SERÁ MÁGICA
	      
	      if (suma_filas==suma_columnas || suma_filas==suma_diagonal_principal || suma_filas==suma_diagonal_inversa) {
		       
	    	  System.out.println("La matriz es mágica");  

	      }
	      else
	    	  System.out.println("La matriz NO es mágica");  

		
	}

	

}
//terminado
