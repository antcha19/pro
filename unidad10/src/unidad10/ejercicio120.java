package unidad10;


import java.util.*;
import java.io.*;
public class ejercicio120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado1 =new  Scanner(System.in);
		File archivo = new File ("ejercicio120.txt");
		String quitar="";
		String quitarpalabra="";
		
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
			file.write("Paso usted por mi casa yo pase" + "\n");
			file.write("Vi usted a mi abuela a su abuela yo la vi" + "\n");
			file.write("Adios Don Pepito" + "\n");
			file.write("Adios Don Jose");
			file.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Introduzca palabra a borrar del fichero de entrada");
		quitarpalabra = teclado1.nextLine();
		try {
			Scanner teclado = new Scanner (archivo);
			while (teclado.hasNext()) {
				String linea = teclado.nextLine();
				 // lo quita pero pone con 2 espacios
				 quitar = linea.replaceAll(quitarpalabra, "");
				 //sustitiye dos espacios por uno
				 quitar = quitar.replaceAll("  ", " ");
				System.out.println(quitar);
			}
			teclado.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
	}

}
