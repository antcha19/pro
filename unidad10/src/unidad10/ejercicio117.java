/*Crea un fichero de texto con el nombre y contenido que tu quieras. Ahora crea una aplicación que lea
este fichero de texto y muestre su contenido por pantalla sin espacios. */
package unidad10;

import java.util.*;
import java.io.*;

public class ejercicio117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creacion del objeto File
		File archivo = new File("ejercicio117.txt");

		try {
			// se crea fisicamente en el sistema de archivos
			archivo.createNewFile();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			FileWriter file = new FileWriter(archivo);
			file.write("Hola Don Pepito" + "\n");
			file.write("Hola Don Jose");
			file.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			Scanner teclado = new Scanner(archivo);
			while (teclado.hasNext()) {
				String linea = teclado.nextLine();
				// eliminar espacios en blanco
				String quitarespacios = linea.replaceAll(" ", "");
				System.out.println(quitarespacios);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
