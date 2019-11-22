/*
 * antonio yepez 20112019
 *  laberinto de paco*/

package examen1;
 
//importamos java.util pero todos 
import java.util.*;
public class ejercicio2 {

	public static void main(String[] args) {
		
			
		Scanner teclado = new Scanner(System.in);
		
			
		System.out.println("bienvenido al laberento de Paco:");
		System.out.println("pulse W para arriba, S para abajo, A para la izquierda y D para la derecha");
		
		
		
		int [][] posicion = new int [4][4];
		
		
		
		posicion [0][0] = 0;
		posicion [0][1] = 0;
		posicion [0][2] = 5;	//posicion pared
		posicion [0][3] = 0;
		posicion [1][0] = 5;	//posicion pared
		posicion [1][1] = 0;
		posicion [1][2] = 0;
		posicion [1][3] = 0;
		posicion [2][0] = 0;
		posicion [2][1] = 0;
		posicion [2][2] = 5;	//posicion pared
		posicion [2][3] = 5;	//posicion pared
		posicion [3][0] = 5;	//posicion pared
		posicion [3][1] = 0;
		posicion [3][2] = 0;
		posicion [3][3] = 0;
		
		
		// obtener el numero de filas y columnas de las matriz

		int filas = posicion.length;
		int columnas= posicion.length;
		
		// imprimir  
		for (int i=0;i<filas;i++) {
		 for(int j=0; j<columnas; j++)
			
			
			 if(posicion[0][0] != posicion[0][1])
			 System.out.printf("has avanzado estas en la posision 0.1");
		 	break;
			}
			 if(posicion[0][1] != posicion[0][2])
			System.out.println("error . nos salimos del tablero");
	}
	
	
	

}
