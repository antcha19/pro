
package unidad10;

import java.io.*;
import java.util.*;

public class ejercicio114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		File carpeta = null;

		System.out.println("¿Cuántas carpetas quiere crear en el escritorio?");
		int cantidad = teclado.nextInt();
		teclado.nextLine();
		System.out.println("¿Qué nombre quiere que aparezca en las carpetas?");
		String nombre = teclado.nextLine();

		for (int i = 1; i < cantidad; i++) {
			carpeta = new File(  nombre + Integer.toString(i));
			carpeta.mkdir();
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		}
	}
	
}
