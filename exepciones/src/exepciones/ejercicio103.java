/*Crea un programa que intente realizar en el main una división entre 2 números enteros
 *  introducidos por teclado y que capture cualquier tipo de excepción
 *(por ejemplo, que el usuario no teclee númerosenteros en la entrada o que el denominador sea distinto de 0).
 *Esto se hará con un bloque try-catch capturando la excepción  de forma genérica con: catch(Exception  e)
 * {System.out.println("Problemas con la division");}
 * Una vez codificado y probado el programa, ahora modifícalo para que imprima un mensaje distintocuando el
 *usuario teclee un dato no numérico en la entrada y cuando el denominador sea distinto de 0,de forma que
 * concretemos el mensaje de la excepción que se imprimirá por pantalla.Para ello, agregaremos al 
 *bloque try-catch que ya tenemos otros 2 bloques catch que harán uso de lasexcepciones 
 *“InputMismatchException “ y “ArithmeticException” respectivamente. 
 *¿En qué ordenpiensas que habría que capturar las 3 excepcione*/

package exepciones;

import java.util.*;

public class ejercicio103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// variables
		int a = 0;
		int b = 0;
		int c = 0;

		// excepciones
		try {
			System.out.println("primer numero");
			a = teclado.nextInt();
			System.out.println("segundo numero");
			b = teclado.nextInt();

			// operacion
			c = a / b;

		}catch (InputMismatchException e) {
			System.out.println("no se puede introducir letras");
		} 
		catch (ArithmeticException e) {
			System.out.println("no se puede dividir entre 0");
		}  catch (Exception e) {

			System.out.println("problemas con la division");

		}
		System.out.println("el resultado es:" + c);
	}

}
