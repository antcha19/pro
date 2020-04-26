package unidad10;

import java.util.*;
import javax.xml.*;
import javax.xml.parsers.DocumentBuilderFactory;

import java.io.*;

public class ejercicio121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File archivo = new File ("BIBLIOTECA.XML");
		int cuenta_libros = 0;
		int nota = 0;
		//leo el fichero biblioteca
		try {
			Scanner sf = new Scanner (archivo);
			while (sf.hasNext()) {
				String linea = sf.nextLine();
				if(linea.contains("<LIBRO>")) {
					cuenta_libros++;
					nota= nota + procesar_libro(sf);
				}
			}
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		double resultado = ((float) nota / cuenta_libros);
		System.out.printf("Se han procesado %s libros y la nota media es: %.2f", cuenta_libros, resultado);
	}

	public static int procesar_libro(Scanner sf) {
		String linea = "";
		linea = sf.nextLine();
		String[] palabras = linea.split("<TITULO>");
		String[] palabras1 = palabras[1].split("</TITULO>");
		String titulo_ok = palabras1[0] + ".txt";

		File file_salida = new File(titulo_ok);
		FileWriter file = null;
		try {
			file_salida.createNewFile();
			file = new FileWriter(file_salida);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		linea = sf.nextLine();
		String info1 = procesar_etiqueta(linea, "AUTOR");
		linea = sf.nextLine();
		String info2 = procesar_etiqueta(linea, "EDITORIAL");
		linea = sf.nextLine();
		String info3 = procesar_etiqueta(linea, "CATEGORIA");
		linea = sf.nextLine();
		String info4 = procesar_etiqueta(linea, "ISBN");
		linea = sf.nextLine();
		String info5 = procesar_etiqueta(linea, "NOTA");
		int info5_in = Integer.parseInt(info5.substring(1, info5.length() - 1));
		linea = sf.nextLine();
		String info6 = procesar_etiqueta(linea, "COMENTARIOS");
		try {
			file.write("---------------------\n");
			file.write("Autor: " + info1 + "\n");
			file.write("Editorial: " + info2 + "\n");
			file.write("Categoria: " + info3 + "\n");
			file.write("ISBN: " + info4 + "\n");
			file.write("NOTA: " + info5_in + "\n");
			file.write("COMENTARIOS: " + info6 + "\n");

			file.write("---------------------\n");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		try {
			file.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return info5_in;
	}

	public static String procesar_etiqueta(String linea, String etiqueta) {
		String etiqueta_ini = "<" + etiqueta + ">";
		String etiqueta_fin = "</" + etiqueta + ">";
		String[] palabras = linea.split(etiqueta_ini);
		String[] palabras1 = palabras[1].split(etiqueta_fin);
		return (palabras1[0]);
	}

}
