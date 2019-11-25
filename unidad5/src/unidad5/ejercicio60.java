/*
 *  antonio yepez 05102019
 *  
 *  Realiza un generador de melodía con las siguientescondiciones:
 *  a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol, la y si.
 *  b) Una melodía está formada por un número aleatorio de notas mayor o igual a 4, menor o 
 *  igual a 28 ysiempre múltiplo de 4 (4, 8, 12...).
 *  c) Cada grupo de 4 notas será un compás y estará separado del siguiente compás 
 *  mediante la barravertical “|” (Alt + 1). 
 *  El final de la melodía se marca con dos barras.
 *  d) La última nota de la melodía debe coincidir con la primera
 */

package unidad5;

import java.util.*;
public class ejercicio60 {
	

	public static void main(String[] args) {
		
		Random aleatorio = new Random();
		// matriz declarada e inicializada
		String [] melodi = {"do", "re", "fa" , "sol", "la", "si" };
		
		int numero;
		int index=0;
		
		numero = aleatorio.nextInt(28)+4;
		System.out.print(numero);
		
	
	}
}
