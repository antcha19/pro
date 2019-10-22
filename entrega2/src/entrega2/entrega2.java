/*
 * Antonio yepez
 * 22102019
 * Realiza un programa que pinte una X hecha de asteriscos.
 *  El programa debe pedir la altura. Se debe
comprobar que la altura sea un número 
impar mayor o igual a 3, en caso
 contrario se debe mostrar un
mensaje de error.
 */

package entrega2;

import java.util.Scanner;
public class entrega2 {

	public static void main(String[] args) {
		


		//variable scanner
		Scanner teclado=new Scanner(System.in);
		
		//variables
		int numero;
		int impar;
				
		//resolucion
		System.out.println("Por favor, introduzca la altura de la X:");
		numero = teclado.nextInt();

		
		 //comprobar altura de un numoer impar  mayor o igual de 3 	
		impar=numero%2;
		if(numero >= 3 && impar != 0) {
			//imprimi los "*"
			for (int x = 1; x <= numero-1; x++) {
				 
			    System.out.print("*");
			 }  	
			System.out.print(" ");
			}	
								
					

		else {
			System.out.println(" error");
		}
		
	
	}

}
