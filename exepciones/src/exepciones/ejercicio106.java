/*
 * Realiza un programa que lea un entero de teclado y que lance una excepción si el número 
 * introducidoes primo. Para ello, el programa encerrará en un bloque try-catch la llamada a un subprograma 
 * que tendrá en sucabecera la palabra reservada “throws” y que comprobará si el número es primo, 
 * lanzando la excepcióncon “throw” en caso afirmativo, que devolverá al programa principal y que este imprimir*/


package exepciones;

import java.util.*;
public class ejercicio106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		int numero=0;
		try {
		System.out.println("introduce un numero");
		numero = teclado.nextInt();
	
		numeroprimo(numero);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static boolean numeroprimo(int numero) throws Exception{
		
		int contador = 2;
		boolean primo=true;

		while ((primo) && (contador!=numero)){
		  if (numero % contador == 0)
		    primo = false;
		  contador++;
		}
		if (primo == true) {
			throw new Exception("el numero es primo");
		}
		else  {
			throw new Exception("no es primo");
		} 
		
	}


}
