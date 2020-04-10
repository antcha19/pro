/*EJERCICIO 118 – ejer118.java
Crea un fichero de texto con el nombre y contenido que tu quieras. Ahora crea una aplicación que lea
este fichero de texto y muestre por pantalla el mismo texto pero variando entre mayúsculas y
minúsculas.
Supondremos que las palabras solo estan separadas por espacios simples, sin puntos, comas, ni signos
de puntuación.*/

package unidad10;

import java.util.*;
import java.io.*;

public class ejercicio118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File archivo = new File("ejercicio118.txt");

		// creacion el archivo fisicamente
		try {
			archivo.createNewFile();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// escribir en el fichero
		try {
			FileWriter file = new FileWriter(archivo);
			file.write("Hola Don Pepito" + "\n");
			file.write("Hola Don Jose");
			file.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// leer fichero
		try {

			String linea;
			Scanner teclado = new Scanner(archivo);
			while (teclado.hasNext()) {
				linea = teclado.nextLine();
				char[] linea_char = linea.toCharArray();
				for (int i = 0; i < linea.length(); i++) {
					if (Character.isUpperCase(linea_char[i])) {
						System.out.print(Character.toLowerCase(linea_char[i]));
					} else
						System.out.print(Character.toUpperCase(linea_char[i]));
				}
				System.out.println(" ");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
