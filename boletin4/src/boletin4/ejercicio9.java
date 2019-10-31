/*
 * NOmbre:Antonio Yepez
 * Fecha:02/10/2019
 * Escribe un programa en Java que utilice el valor de una variable entera
 *  para almacenar la edad delusuario.
 *  -Luego, dividirá el año del descubrimiento de América por esa <edad>.
 *  -Al cociente se le restará el número de grand slams ganados por Nadal.
 *  -El resultado de la resta anterior es el cuadrado del número secreto.
 *  -Imprimirá por pantalla “El número secreto es...” <resultado>.
 */

package boletin4;


public class ejercicio9 {

	public static void main(String[] args) {
		
		//declaracion de variables
		int edad=28;
		int america=1492;
		int nadal=19;
		double resultado=0;
		double raiz=0;
		
		//solucion
		raiz=(america/edad)-nadal;
		resultado=Math.sqrt(raiz);
				
		System.out.println("el numero secreto es "+ resultado  );

	}

}