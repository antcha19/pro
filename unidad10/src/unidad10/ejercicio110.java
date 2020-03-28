package unidad10;

import java.util.Scanner;
import java.io.*;

public class ejercicio110 {

	public static void main(String[] args) {
	

		File archivo1 = new File("salida1.txt");
		File archivo2 = new File("salida2.txt");
		File archivo3 = new File("salida3.txt");

		// parte del ejercicio 110 leer y ordenador los numeros

		try {
			FileWriter file3 = new FileWriter(archivo3);
			
			Scanner teclado = new Scanner(archivo1);
			Scanner teclado1 = new Scanner(archivo2);
			while (teclado.hasNext() && teclado1.hasNext()) {
				String linea = teclado.next();
				System.out.println(linea);
				String linea1 = teclado1.next();
				System.out.println(linea1);

				// crear archivo y escribri los numeros ordenados
				file3.write(linea + "\n" + linea1 + "\n");
			}
			teclado.close();
			teclado1.close();
			file3.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());

		}
	}

}
