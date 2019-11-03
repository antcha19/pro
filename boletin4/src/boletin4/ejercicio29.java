/*
 * antonio yepez 01112019
 * 
 * Escribe un programa que lea en la entrada una frase en 
 * minúsculas y sea capaz de repetir dicha frase y además pasarla a mayúsculas.
 */

package boletin4;


import java.util.*;
public class ejercicio29 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String frase;
		String frase1;
		String frase2;
		String frase3;
		String frase4;
		String frase5;
		String frase6;
		String frase7;
		 
		
		System.out.println("introduza una frase para pasarla a mayuscula con 7 palabras");
		frase = teclado.next();
		String mayuscula=frase.toUpperCase();
		frase1 = teclado.next();
		String mayuscula1=frase1.toUpperCase();
		frase2 = teclado.next();
		String mayuscula2=frase2.toUpperCase();
		frase3 = teclado.next();
		String mayuscula3=frase3.toUpperCase();
		frase4 = teclado.next();
		String mayuscula4=frase4.toUpperCase();
		frase5 = teclado.next();
		String mayuscula5=frase5.toUpperCase();
		frase6 = teclado.next();
		String mayuscula6=frase6.toUpperCase();
		frase7 = teclado.next();
		String mayuscula7=frase7.toUpperCase();
		System.out.println("tu frase en mayusculas: " +mayuscula +" "+ mayuscula1 +" "+ mayuscula2+" "+mayuscula3+" "
							+mayuscula4+" "+mayuscula5 + " " +mayuscula6 +" "+mayuscula7);
		System.out.println("y en minuscula es : " +frase1 + " "+frase2+" "+frase3+" "+frase4
				+" "+frase5+" "+frase6+" "+frase7 );
		
		
			

	}

}
