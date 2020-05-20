
import java.io.*;
import java.util.Iterator;

public class Principal {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		/*
		 * Imprimir la información del Collar y de la ListaDesayuno en un fichero de
		 * salida que se llamará “salida.txt” y que contendrá la misma información
		 * contenida en los puntos 2 y 8.
		 */
		File Archivo = new File("salida.txt");

		try {
			Archivo.createNewFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("DESAYUNO");
		System.out.println("--------");

		/* 3.-Creación de una Magdalena de 190g. de forma Cuadrada y con papel. */

		Magdalena mag1 = new Magdalena(190, "Cuadrada", true);
		/*
		 * 4- Creación de una Magdalena de 83g, de forma Redonda y sin papel. (0,5
		 * punto)
		 */
		Magdalena mag2 = new Magdalena(83, "Cuadrada", false);

		Napolitana napo1 = new Napolitana(210, "Crema");
		Napolitana napo2 = new Napolitana(332, "Chocolate");

		// 7- Añadir las 2 Magdalenas y las 2 Napolitanas a un objeto de tipo
		// ListaDesayuno.
		ListaDesayuno lista = new ListaDesayuno();
		lista.anyadir_bollo(mag1);
		lista.anyadir_bollo(mag2);
		lista.anyadir_bollo(napo1);
		lista.anyadir_bollo(napo2);

		System.out.println(lista.toString());


		try {
			FileWriter file = new FileWriter(Archivo);
			file.write(lista.toString());
			//aqui deberia
			file.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
