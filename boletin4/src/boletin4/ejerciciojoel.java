/*
 * antonio yepez	22112019
*/
package boletin4;


import java.util.*;
public class ejerciciojoel {

	public static void main(String[] args) {
		
		
		
		Scanner teclado = new Scanner (System.in);
		
		int ps1=0;
		int ps=0;
		int contador1=1;
		int contador3=3;
		int contador=0;
		String  nombre;
		String t="t";
		String[][] tablero = new  String [6][6]; 
		
		
		System.out.println("Bienvenido al juego de hundir la flot 6x6, introduzca su nombre:");
		nombre=teclado.next();
		System.out.println("Hola, Capitan " + nombre +  " . Dejeme que le ayude a configurar su fota," );
		System.out.println("introduzca la posicion de su transatlantico numero " + contador1 +" de 3 o stop para introducir datos:" );
		
		for (int i=0; i < tablero.length; i++) {					
			 for (int j=0 ; j < tablero.length; j++) {
				
				 if( i==0 || j==0 ) {
					 System.out.print(t); 
					 contador++;
				 
				 }else
				 System.out.printf("_");
			 }
			 System.out.printf("\n");
	}

}
}
