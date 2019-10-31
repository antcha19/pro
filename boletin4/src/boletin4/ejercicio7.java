/*
 * NOmbre:Antonio Yepez
 * Fecha:02/10/2019
 * escribe un programa en Java que utilice 2 variables numéricas
 * de modo que imprimirá:“Al principio del programa, el valor 
 * de a es “<a>” y el valor de b es “<b>.Luego, intercambiará 
 * las 2 variables e imprimirá:“Después del intercambio, el valor
 *  de a es “<a>” y el valor de b es “<b>
 */
package boletin4;


public class ejercicio7 {

	public static void main(String[] args) {
		//declaracion de variables
		int a=2;
		int b=3;
		int x=0;
		
		//solucion
		System.out.println("Al principio del programa, el valor de"
				+ " a es "+a+" y el valor de b es " + b );
		x=b;
		b=a;
		a=b;
		System.out.println("despues del intercambio, el valor de"
				+ " a es "+a+" y el valor de b es " + b );
			
	
	}

}