/*
 * antonio yepez
 * Vamos a programar “El juego del número mágico”, que funciona del siguiente modo:El ordenador elegirá un número al azar entre 1 y 100. El usuario irá introduciendo números por teclado,y el ordenador le irá dando pistas: “El número mágico es mayor" o “El número mágico es menor",hasta que el usuario acierte.Entonces, el ordenador le felicitará y le comunicará el número de intentos que necesitó para acertar el número secreto. Un ejemplo de ejecución sería el siguiente:

 */


package unidad5;

import java.util.Random;
import java.util.Scanner;
public class ejercicio53 {

	public static void main(String[] args) {
		
		Random aleatorio = new Random();
		Scanner teclado = new Scanner(System.in);
		
		int numeroaleatorio=0;
		int numero=0;
		int contador=0;
		numeroaleatorio = aleatorio.nextInt(100);
		
		//System.out.println(numeroaleatorio);
	
		System.out.println("el juego del numero magica");
		System.out.println("introduzca el numero");
		numero = teclado.nextInt();
		
		while (numero != numeroaleatorio) { 					//mientras numero sea distinto a numeroaleatorio
			
			if(numeroaleatorio >= numero ) { 					//si numeroaleatorio es mayor a numero introducido
				System.out.println("el numero es mayor");
			}
		else if (numeroaleatorio <= numero) { 					// //si numeroaleatorio es mayor a numero introducido
			System.out.println("el numero es menor");
			}
		numero= teclado.nextInt();
		contador++;
		
	}
		
		System.out.println(contador);
			}
		

	}


	

