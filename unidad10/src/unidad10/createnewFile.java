/*El método que utilizamos para la creación de ficheros devuelve TRUE si el
fichero se ha creado y FALSE si no se creado porque ya existía , por lo que
podríamos completar el código anterior del siguiente modo*/

package unidad10;

import java.io.*;

public class createnewFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creacion del obejto File, pero aun no existe en el sistema de archivos
		File archivo = new File("prueba.txt");
		try {
			if (archivo.createNewFile()) {
				System.out.println("El archivo ha sido creado");
			} else {
				System.out.println("el archivo ya existia");
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
