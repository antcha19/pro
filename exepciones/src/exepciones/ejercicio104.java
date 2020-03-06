/*Modifica el programa anterior para que la excepción de la división entre 0 se traslade 
 * a un subprogramaque se llamará desde el programa principal.Para ello, acuérdate que 
 * este subprograma tendrá un bloque try-catch donde hará la división y, en caso de 
 * producirse la excepción, incluirá la palabra reservada “throw” en el cuerpo del subprograma 
 * y“throws” en la cabecera para indicar al programa principal que el módulo ha fallado*/

package exepciones;

import java.util.*;

public class ejercicio104 {

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

			subprograma(a, b);

		} catch (InputMismatchException e) {
			System.out.println("no se puede introducir letras");
		} catch (ArithmeticException e) {
			System.out.println("no se puede dividir entre 0");
		} catch (Exception e) {

			System.out.println(e.getMessage());

		}
		System.out.println("el resultado es:" + c);

	}

	public static int subprograma(int a, int b) throws Exception {
		int c = 0;
		if (b == 0 || a == 0) {
			throw new Exception("no se puede dividir entre cero");
		}
		if (b < 0 || a < 0) {
			throw new Exception("no se puede poner numeros negativos");
		} else {
			c = a / b;
		}
		return c;
	}

}
