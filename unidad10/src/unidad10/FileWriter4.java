/*clase file writer para escribir en ficheros*/

package unidad10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File archivo = new File("prueba.txt");

		try {
			// crea fisicamente en el sistema de archivos
			archivo.createNewFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		//filewriter - clase que me permite escribit  en un archivo a traves de su metedo write
		try {
			FileWriter file = new FileWriter(archivo);
			file.write("esto es una prueba\n");
			file.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
