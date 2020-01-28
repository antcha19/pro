/*
 * antonio yepez
 * 28/01/2020
 * Crea un mini-diccionario español-inglés que contenga, al menos,
 *  20 palabras, con su correspondientetraducción. Utiliza un objeto
 *   de la clase HashMap para almacenar las parejas de palabras. 
 *   El programa pedirá una palabra en español y dará la 
 *   correspondiente traducción en inglés, hasta que elusuario pulse
 *    la palabra “salir
 */

package unidad7;

import java.util.*;
public class ejercicio89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		String palabraintroducida = "";
		
		HashMap<String, String> palabras = new HashMap<String, String>();
		palabras.put("hola","hello");
		palabras.put("sistema","system");
		palabras.put("importar","import");
		palabras.put("publico","public");
		palabras.put("static","statico");
		palabras.put("nuevo","new");
		palabras.put("con","with");
		palabras.put("amarillo","yellow");
		palabras.put("rojo","red");
		palabras.put("green","verde");
		palabras.put("azul","blue");
		
		
		while(!palabraintroducida.equals("salir")  ) {
			palabraintroducida = teclado.next();
		if (!palabraintroducida.equals("salir")) {
			System.out.println(palabras.get(palabraintroducida));

		}
		}
	}

}
