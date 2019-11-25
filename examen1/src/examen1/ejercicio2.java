/*
 * antonio yepez 20112019
 *  laberinto de paco*/

package examen1;
 
//importamos java.util pero todos 
import java.util.*;
public class ejercicio2 {

	public static void main(String[] args) {
		
		
		int [][] laberinto = {{0,0,1,0},
							  {1,0,0,0},
							  {0,0,1,1},
							  {1,0,0,0}};
		char tecla=' ';
		int posicionx=0;
		int posiciony=0;
		
			
		Scanner teclado = new Scanner(System.in);
		
			
		System.out.println("bienvenido al laberento de Paco:");
		System.out.println("pulse W para arriba, S para abajo, A para la izquierda y D para la derecha");
		System.out.println("estas en la casilla" + posicionx + "," + posiciony + "cual es tu proximo movimiento");
		tecla =teclado.next().charAt(0);
		
			while((posicionx !=3) || (posiciony !=3)) {
				switch(tecla) {
				case 'W':
				case 'w':
					System.out.println("has pulsado hacia arriba");
						if (posicionx == 0) {
							System.out.println("ERRROR!. Nos salimos del tablero!: ");
						}
						else if (laberinto[posicionx - 1][posiciony] == 1){ 
							System.out.println("ERROR!. En esa dirección hay una pared!");
						}
						else {
							posicionx--;
						}
						break;
				case 'S':
				case 's':
					System.out.println("has pulsado hacia abajo");
						if (posicionx == 3) {
							System.out.println("ERRROR!. Nos salimos del tablero!: ");
						}
						else if (laberinto[posicionx + 1][posiciony] == 1){ 
							System.out.println("ERROR!. En esa dirección hay una pared!");
						}
						else {
							posicionx++;
						}
						break;
				case 'A':
				case 'a':
					System.out.println("has pulsado hacia la izquierda");
						if (posiciony ==0) {
							System.out.println("ERRROR!. Nos salimos del tablero!: ");
						}
						else if (laberinto[posicionx ][posiciony -1] == 1){ 
							System.out.println("ERROR!. En esa dirección hay una pared!");
						}
						else {
							posiciony--;
						}
						break;
				case 'D':
				case 'd':
					System.out.println("has pulsado hacia la izquierda");
						if (posicionx ==3) {
							System.out.println("ERRROR!. Nos salimos del tablero!: ");
						}
						else if (laberinto[posicionx][posiciony+1] == 1){ 
							System.out.println("ERROR!. En esa dirección hay una pared!");
						}
						else {
							posiciony++;
						}
						break;
				default:
					System.out.println("La letra " + tecla + " es incorrecta. Inténtelo de nuevo");
					break;
				
				}	
			
			if ((posicionx != 3) || (posiciony != 3)) {
					System.out.println("Estas en la casilla " + posicionx + "," + posiciony + ". ¿Cuál es tu próximo movimiento?");
			            tecla = teclado.next().charAt(0);
			        }
			}//while
			System.out.println("Enhorabuena!, has llegado a la casilla " + posicionx + "," + posiciony+ " y por tanto has llegado al final del laberinto!"); 
		
			
			}
		
		
	}		
		
		
		
		
		
	


