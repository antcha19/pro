/*Crea un programa que lea el fichero generado en el programa anterior y vaya introduciendo en un
ArrayList aquellos números leídos que sean múltiplo de 5. Una vez finalizada la lectura del fichero de
entrada, el program recorrerá el ArrayList y mostrará todos los múltiplos de 5 que se han insertado.*/

package unidad10;

import java.io.File;
import java.io.FileWriter;
import java.io.*;

import java.util.*;

public class ejercicio111 {

	public static void main(String[] args) {

		File archivo3 = new File("salida3.txt");

		ArrayList<Integer> listamultiple = new ArrayList<Integer>();

		
		try {
			Scanner teclado1 = new Scanner(archivo3);
			while (teclado1.hasNext()) {
				int numero = teclado1.nextInt();
				listamultiple.add(numero);
			}
			teclado1.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());

		}
		// imprimo el arraylist
		Iterator iter = listamultiple.iterator();
		int multipleaux;
		while (iter.hasNext()) {
			multipleaux = (Integer) iter.next();
			// solo imprimira los multiplos de 5
			if (multipleaux % 5 == 0) {
				System.out.println(multipleaux);
			}
		}

	}

}
