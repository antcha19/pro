
/*Antonio Yepez	
 * 04102019
 *Escribe un programa que sume, reste, multiplique y divida 2 números introducidos por teclado.
 * Mostrarla información de la siguiente forma
 */


package boletin4;

import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {
		//variable para introducir por pantalla
		Scanner sc=new Scanner(System.in);
		
		//declaracion de variables
		int x;
		int y;
		
		//resolucion
		System.out.println("introduce x:"); 
		x  = sc.nextInt();
		
		
		System.out.println("introduce y:"); 
		y  = sc.nextInt();
		//mostar valores introducidos
		System.out.println("Los valores introducidos son" + x + " y " + y );
		System.out.println("\tSUMA RESTA PRODUCTO     COCIENTE");
		System.out.println("--------------------------------------------------");
		System.out.println("X="+x+"y="+y +   (x+y) + (x-y) + (x*y) + (x/y ));
		System.out.println("--------------------------------------------------");
	}

}