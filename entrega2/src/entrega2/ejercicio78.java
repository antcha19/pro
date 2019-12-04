/*
 * Vamos a jugar al ahorcado!. El mecanismo del juego será el siguiente:
- el JUGADOR1 introducirá la palabra para adivinar, que se mostrará al JUGADOR2 en forma de
cadena de asteriscos.
- el JUGADOR2 irá, en bucle, diciendo letras de forma que:
- Si la letra está en la palabra, se sustituirán todas sus ocurrencias y se informará de cuantas
veces aparecía la letra en la palabra.
- Si no está en la palabra, se sumará 1 al número de fallos. Si hemos llegado a un total de 8
fallos, eso significará que hemos perdido y el programa finalizará.
- Para jugar, y por simplicidad, se tendrá en cuenta que la palabra irá toda en minúsculas y que no
habrán espacios
 */

package entrega2;

import java.util.*;

public class ejercicio78 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String jugador;
		String jugador2;
		String minuscula;
		int error =0;
		int contador = 0;

		System.out.println("jugador 1: introduzca palabra para adivinar");
		// sin espacios
		jugador = teclado.nextLine();
		
		
		//
	//	System.out.println(jugador.toLowerCase());  
		// convierte la pablra del jugar siempre  y guarda en la variable minuscula 
		minuscula = jugador.toLowerCase();
		

		System.out.println("jugador 2: la palabra para adivinar es la siguiente :");
		// convierte un array en un string de letras
		char[] letras = minuscula.toCharArray();
		char[] asterisco = new char[letras.length];

		// sustituyo la palabra introducida por *
		for (int i = 0; i < letras.length; i++) {
			asterisco[i] = '*';

		}

		System.out.println(asterisco);

	
		
		while (letras != asterisco) {
			System.out.println("introduce una letra");

			Scanner lector = new Scanner(System.in);
			// cogo la primere letra de lector
			char letraintroducida = lector.next().charAt(0);

			// si la letra introducida esta en la palabra
			for (int i = 0; i < letras.length; i++) {
				if (letras[i] == letraintroducida) {
					// sustituir por la letra introducida
					asterisco[i] = letraintroducida;
				}
			} 
			
			
			if (Arrays.equals(letras, asterisco)) {
			System.out.println("palabra adivinada! gracias por jugar al ahorcado");
			}
			System.out.println(asterisco);
			
		}
//			switch (error) {	
//			case 1:
//				System.out.println("Error  de 8: te pinto la hora");
//
//				break;
//			case 2:
//			
//				System.out.println("Error 2 de 8: te pinto la cabeza");
//				break;
//			case 3:
//			
//				System.out.println("Error 3 de 8: te pinto el cuerpo");
//				break;
//			case 4:
//			
//				System.out.println("Error 4 de 8: te pinto el brazo izquierdo");
//				break;
//			case 5:
//				
//				System.out.println("Error 5 de 8: te pinto el brazo derecho");
//				break;
//			case 6:
//				
//				System.out.println("Error 6 de 8: te pinto la pierna izquierda");
//				break;
//			case 7:
//				
//				System.out.println("Error 7 de 8: te pinto la pierda derecha");
//				break;
//			case 9:
//				System.out.println("Error 8 de 8: ahorcado");
//				break;
//			
//			}
//
	}

}

