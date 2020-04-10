package unidad10;

/*Desarrolla un programa que, dado cualquier fichero en la entrada, escriba por pantalla estadísticas
básicas del mismo.
En concreto, escribirá número de palabras, número de carácteres totales del texto (sin contar los
espacios) y la longitud media de una palabra medida en número de carácteres.
Supondremos que las palabras solo estan separadas por espacios simples, sin puntos, comas, ni signos
de puntuación.*/

import java.util.*;
import java.awt.LinearGradientPaint;
import java.io.*;

public class ejercicio116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creacion del objeto File
		File entrada = new File("entrada.txt");
		int contador =0;
		int contador1=0;
		float media ;
		 
		
 		try {
			// se crea fisicamente en el sistema de archivos
			entrada.createNewFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		// escribit en el archivo
		try {
			FileWriter file = new FileWriter(entrada);

			file.write("Hola Don Pepito" + "\n");
			file.write("Hola Don Jose");

			file.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		try {
			contarymostrar(entrada);
			//contarymostrarcaracteres(entrada);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		

	}
	//public static void leerarchivo(File entrada) casi lo mismo pero con void no se pone el return
	public static int contarymostrar(File entrada) throws IOException {
		String linea="";
		int contador=0;
		int contador1=0;
		float media;
		try {
			Scanner teclado = new Scanner(entrada);
			while (teclado.hasNext()) {
				linea = teclado.next();
				contador = contador + contarpalabra(linea);
				
				contador1 = contador1 + contarcaracteres(linea);
			}
			System.out.println("numero de palabras es "+contador);
			System.out.println( "numero de caractereres es "+contador1);
			media=contador1/contador;
			System.out.println("la longuitud media es " + media);
			teclado.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return contador;
	}
	
	
//	public static int contarymostrarcaracteres(File entrada) throws IOException {
//		String linea="";
//		
//		int contador1=0;
//		try {
//			Scanner teclado = new Scanner(entrada);
//			while (teclado.hasNext()) {
//				linea = teclado.next();
//				contador1 = contador1 + contarcaracteres(linea);
//			}
//			System.out.println(contador1);
//			teclado.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		return contador1;
//	}

	public static int contarpalabra(String linea) {
		int palabra;
		String[] contar = linea.split(" ");
		palabra = contar.length;
		return palabra;
	}
	
	public static int contarcaracteres(String linea) {
		int palabra2;
		
		//String[] contar2 = linea.split("");
		palabra2 = linea.length();
		return palabra2;
	}
	

}
