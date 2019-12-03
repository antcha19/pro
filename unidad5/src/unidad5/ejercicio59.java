/*
 * antonio yepez 05112019
 * 
 * Escribe un programa que simule la tirada de dos dados.
 *  El programa deberá continuar tirando los dadosuna y 
 *  otra vez hasta que en alguna tirada los dos dados tengan el mismo valor
 */

package unidad5;

import java.util.*;
public class ejercicio59 {

	public static void main(String[] args) {
		
		Random dado1 = new Random();
		Random dado2 = new Random();
		Scanner teclado = new Scanner(System.in);
		
		int da1=1;
		int da2=1;
		int contador=1;
		int primera;
		
		
		
		da1 = dado1.nextInt(6)+1;
		da2 = dado2.nextInt(6)+1;
		
		
		
		System.out.println("vamos a tirar los dados...");
		
		
		while (da1 != da2) { 					
			
			if(da1 != da2 ) { 					
				System.out.println("en la tirada " + contador + " ha salido " + da1+ "y en la 2 ha salido " + da2);
							}
			da1 = dado1.nextInt(6)+1;
			da2 = dado2.nextInt(6)+1;
			if (da1 == da2) { 					
				System.out.println("al fin son iguales al " +contador+ " intento" );
				
			}

			
			contador++;
			
		
	}
	}
}
//terminado
		
		
		
		

	


