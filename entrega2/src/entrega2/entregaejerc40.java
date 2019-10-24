/*
 * antonio yepez
 * 23102019
 * Escribir un programa que lea un número positivo n por teclado y
 *que escriba en la salida, línea a línea,los pares de enteros 
 *i y j tal que: 1<= i <= n y 1<= j <= n.
 * Además, en cada línea se escribirá el valor
que toma la expresión: i + j + 2 * i * j.
 */


package entrega2;


import java.util.Scanner;

public class entregaejerc40 {

	public static void main(String[] args) {
		
		//variable scanner
		Scanner teclado=new Scanner(System.in);
		
		//variables
		int n;
		int j=1;
		int i=1;
		int resultado;
		System.out.println("introduzca n");
		n=teclado.nextInt();
		
		for(  i = 1;  i<= n; i++ ) {
			for(  j = 1 ;  j<= n ; j++) {
				System.out.println( i +"," + j+ " : " );
			}
		} 
	
	

	}

}
