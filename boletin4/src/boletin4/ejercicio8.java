/*Antnio Yepez
 * 02102019
 * Escribe un programa en Java que utilice 2 variables enteras,
 *  de modo que imprimirá:
 *  “Bienvenido a mi calculadora”.
 *  “El valor de a es : “ <a>
 *  “El valor de b es : “<b>
 *  “a + b = “ <a + b>
 *  “a – b = “ <a – b>
 *  “a x b = “ <a x b>
 *  “a / b = “ <a / b>
 *  “a % b = “ <a % b>
*/

package boletin4;


public class ejercicio8 {

	public static void main(String[] args) {
	//declaracion variables
		int a=5;
		int b=5;
	//Solucion
		System.out.println("Bienvenido a mi calculadora."
				+ "El valor de a es : "+a+" El valor de b es : " + b );
		
		System.out.println("a+b=" + (a + b) );
		System.out.println("a-b=" + (a - b) );
		System.out.println("a*b=" + (a * b) );
		System.out.println("a/b=" + (a / b) );
		System.out.println("a%b=" + (a % b) );
		 
	}

}
