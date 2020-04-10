/*Construir un programa que permita buscar palabras en un fichero de texto. La palabra debe aparecer
exactamente igual, coincidiendo mayúsculas y minúsculas. Se debe mostrar el número de línea y su
contenido, para cada línea que contenga la palabra buscada. Si no existe en todo el fichero, también se
debe informar de esta circunstancia.*/
package unidad10;

import java.util.*;
import java.io.*;

public class ejercicio119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File archivo = new File("ejercicio119.txt");
		Scanner teclado = new Scanner(System.in);
		String palabrabuscada;
		String linea;
		boolean encontrado = false;
		boolean msgencontrado = false;
		int contadorlinea = 1;

		try {
			archivo.createNewFile();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// escribir en el fichero
		try {
			FileWriter file = new FileWriter(archivo);
			file.write("Hola Don Pepito" + "\n");
			file.write("Hola Don Jose" + "\n");
			file.write("Paso usted pir mi casa yo pase" + "\n");
			file.write("Vi usted a mi abuela a su abuela yo la vi" + "\n");
			file.write("Adios Don Pepito" + "\n");
			file.write("Adios Don Jose");
			file.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("¿Qué palabra quieres buscar en el fichero de entrada?");
		palabrabuscada = teclado.nextLine();
		if (palabrabuscada.equals("")) {
			System.out.println("No ha tecleado ninguna palabra. Fin del programa.");
		} else {

			// leer fichero
			try {
				Scanner teclado1 = new Scanner(archivo);

				while (teclado1.hasNext()) {
					linea = teclado1.nextLine();
					
					String[] contar = linea.split(" ");
					encontrado = buscar(contar, palabrabuscada);
					if (encontrado == true) {
						System.out.println("encontrado en la linea: " + contadorlinea);
						System.out.println(linea);
						msgencontrado = true;
					}
					contadorlinea++;
				}
				teclado1.close();

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			if (!msgencontrado) {
				System.out.println("la palabra " + palabrabuscada + " no se encuentra");
			}
		}
	}

	public static boolean buscar(String[] contar, String palabrabuscada) {
		boolean resultado = false;
		//recorro todo y lo busco
		for (int i = 0; i < contar.length; i++) {
			if (contar[i].equals(palabrabuscada)) {
				resultado = true;
			}
		}
		return resultado;

	}

}
