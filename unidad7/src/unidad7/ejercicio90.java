/*
 * antonio yepez
 * 28/01/2020
 * Realiza un programa que escoja al azar 5 palabras en español del
 * inidiccionario del ejercicio anterior.El programa irá pidiendo
 * que el usuario teclee la traducción al inglés de cada una de
 * estas palabras ycomprobará si son correctas. 
 * Al final, el programa deberá mostrar cuántas respuestas son válidas ycuántas son erróneas.
 */

package unidad7;

import java.util.*;

public class ejercicio90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		String palabra=" ";
		int contador =0;
		
		HashMap<String, String> palabras = new HashMap<String, String>();
		palabras.put("hola","hello");
		palabras.put("sistema","system");
		palabras.put("importar","import");
		palabras.put("publico","public");
		palabras.put("static","statico");
		palabras.put("nuevo","new");
		
		
		System.out.println("introduce la palabra en español");
		palabra=teclado.next();
		while(contador !=5) {
		if(palabras.containsKey(palabra)) {
			System.out.println("existe la palabra");
			contador++;
			
			System.out.println("ahora dimelo en ingles");
			palabra=teclado.next();
			System.out.println(palabras.get(palabra));
			contador++;
		}else {
			System.out.println("no la tengo");
		}
		}
		System.out.println(contador);
	}
	
	

}
