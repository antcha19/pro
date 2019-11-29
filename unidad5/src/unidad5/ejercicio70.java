/*
 * Antonio Yepez 29/11/2019
 * 
 *Realiza un juego del 3 en raya del siguiente modo:- El usuario comenzará tirando y su símbolo en 
 *el tablero será una ‘X’, para ello introducirá por tecladola fila y la columna (ambos valores de 0 a 2),
 *cuyos valores se validarán para que coincidan con casillasdel tablero.-
 *El pc elegirá de forma aleatoria una fila y una columna que no estén ocupadas y su símbolo será una‘O’ en el tablero.
 *- En cada tirada, tanto del jugador como del pc, mostraremos el estado actual del tablero por pantalla ycomprobaremos 
 *las condiciones para ganar el jugador o el pc, para de esta forma dar por finalizada lapartida.
 */

package unidad5;


import java.util.*;
public class ejercicio70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				Scanner teclado = new Scanner (System.in);
				Random aleatorio = new Random();
				
		int columna=0;
		int fila=0;
		int num1;
		int num2;
		
				
				
			System.out.println("Bienvenido al juego del 3 en raya");
			char [][] raya = new char [3][3];
		
			
			// recorre y lo imprime 
			for(int i=0; i < raya.length;i++) {
				for(int j=0; j < raya[0].length; j++) {
				raya[i][j]= '-';
					System.out.print(raya[i][j]);
				}
				System.out.println();

 			}
			do {
				
				do {
					System.out.println("introduce fila y comuna de tu tirada");
					columna = teclado.nextInt();
					fila = teclado.nextInt();
				}
				while ((fila > 3) || (columna > 3)); //Valida usuario
			
			raya[fila][columna] = 'X';
			
			
			// recorre y lo imprime 
			for(int i=0; i < raya.length;i++) {
				for(int j=0; j < raya[0].length; j++) {			
					System.out.print(raya[i][j]);
				}
				System.out.println();
			}
			
			
			//num1 = aleatorio.nextdouble(2);
			//num2 = aleatorio.nextdouble(2);
			//en un bucle do while lo que hago es validar que 
			//esa posición sea != '-';
			//raya[num1][num2] = 'O';
			
			
			
			
			// recorre y lo imprime 
			for(int i=0; i < raya.length;i++) {
				for(int j=0; j < raya[0].length; j++) {			
					System.out.print(raya[i][j]);
				}
				System.out.println();
			}
			
			}while (columna <= 3 || fila <= 3 ); //BUCLE GENERAL
				
	}

}
