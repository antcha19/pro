/*metodo delete
 * 
 * El método delete devuelve TRUE si el fichero se pudo borrar con éxito y
FALSE si no se pudo borrar porque alguien ya lo ha borrado o se ha
cambiado su ubicación o permanece abierto*/

package unidad10;

import java.io.*;

public class delete {

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

		boolean resultado_borrar = archivo.delete();
		if (resultado_borrar) {
			System.out.println("el archivo fue borrado");
		} else {
			System.out.println("el archivo no pudo ser borrado");
		}

	}

}
