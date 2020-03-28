package exepciones;

import java.util.*;
import java.util.concurrent.ExecutionException;
import java.lang.*;

public class exepcion_error {

	public static void main(String[] args) {

		System.out.println("bienvenido al menu");
		int dato = 0;
		while (dato != 3) {
			try {
			dato = leerdato();
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

	public static int leerdato() throws InputMismatchException, Exception {
		Scanner teclado = new Scanner(System.in);
		int dato = 0;
		try {
			dato = teclado.nextInt();
		} catch (InputMismatchException e) {
			throw new InputMismatchException("dato no numerico");
		}
		if ((dato != 1) && (dato != 2) && (dato != 3)) {
			throw new Exception("Opcion incorrecta");
		}
		return dato;
	}

}
