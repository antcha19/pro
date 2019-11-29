/*
 * antonio yepez 
 * 29/112019
 *
 * l gobierno norteamericano desea cifrar una transmisión efectuada
 *  desde el area 51. Como quieren queel area permanezca en el 
 *  anonimato, planean sustituir la frase
 “el area 51” por “Murcia” cada vez queaparezca en la  transmisión.
 * Antes de realizar el cifrado, se comprobará que “el area 51”
 * aparece en la transmisión. 
 * Si no aparece, sedará por finalizado el programa:*/
package unidad6;


import java.util.*;		
public class ejercicio73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
				
		String cifrado;
		
		System.out.println("Introduzca la tranmision a cifrar:");
		cifrado= teclado.nextLine();
		cifrado=frase(cifrado);
		System.out.println(cifrado);
	}
	
	
	public static String  frase(String frase) {
		
	
		frase = frase.replaceAll("area51", "murcia");
		return frase;
		
	}
	
}
