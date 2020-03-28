/*Crea un programa que escriba 2 ficheros de salida:
- salida1.txt: donde irán los números pares entre el 0 y el 49, uno por línea.
- salida2.txt: donde irán los números impares entre el 0 y el 49, uno por línea.*/

package unidad10;

import java.io.*;
import java.util.*;

public class ejercicio109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creo el objeto file
		File archivo1 = new File("salida1.txt");
		File archivo2 = new File("salida2.txt");
		File archivo3 = new File("salida3.txt");
		// creacion de los archivos fisicamente en el sistema de archivos
		try {
			archivo1.createNewFile();
			archivo2.createNewFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		try {
			FileWriter file = new FileWriter(archivo1);
			FileWriter file2 = new FileWriter(archivo2);
			FileWriter file3 = new FileWriter(archivo3);

			// escribir en los archivos par
			for (int i = 0; i < 49; i += 2) {
				file.write(Integer.toString(i) + "\n");
			}
			file.close();

			// escribir en los archivos impar
			for (int j = 0; j <= 49; j++) {
				if (esImpar(j))
					file2.write(Integer.toString(j) + "\n");
			}
			file2.close();

		

		} catch (IOException e) {
			System.out.println(e.getMessage());

		}

	}

	//numero impar
	public static boolean esImpar(int imparNum) {
		if (imparNum % 2 != 0)
			return true;
		else
			return false;
	}

}
