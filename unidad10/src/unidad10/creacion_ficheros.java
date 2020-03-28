package unidad10;

import java.io.File;
import java.io.IOException;

public class creacion_ficheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creacion del obejto File, pero aun no existe en el sistema de archivos
		File archivo = new File("prueba.txt");

		try {
			// crea fisicamente en el sistema de archivos
			archivo.createNewFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		// si no se especifica ninguna ruta, el archivo se creara en la carpeta del
		// proyecto.

	
	}

}
