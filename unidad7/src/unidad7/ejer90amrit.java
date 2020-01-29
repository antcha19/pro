package unidad7;

import java.util.*;

public class ejer90amrit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String palabra_spanish = " ";
		String palabra_eng = " ";
		String comparar_palabra = " ";

		int numero = 0;
		int puntos = 0;
		int cont = 0;
		int aciertos = 0;
		int fallos = 0;
		// creamos el mini-diccionario con HashMap
		HashMap<String, String> map = new HashMap<String, String>();
		// introducimos las palabras
		map.put("hola", "hello");
		map.put("hora", "time");
		map.put("camino", "way");
		map.put("muchos", "many");
		map.put("escribir", "write");
		map.put("largo", "long");
		map.put("dos", "two");
		map.put("dia", "day");
		map.put("gente", "people");
		map.put("agua", "water");

		while (cont != 5) {
			System.out.print("Introduzca una palabra en español: ");
			palabra_spanish = sc.nextLine();

			if (map.containsKey(palabra_spanish)) {
				System.out.println("Tengo la palabra " + palabra_spanish + " en la BD.");
				cont++;
				System.out.print("Ahora digame " + palabra_spanish + " en inglés: ");
				palabra_eng = sc.nextLine();
				if (map.get(palabra_spanish).equalsIgnoreCase(palabra_eng)) {
					System.out.println("Correct!");
					aciertos++;
				} else {
					System.out.println("Ha fallado");
					fallos++;
					System.out.println("La respuesta es: " + map.get(palabra_spanish));
				}
			} else {
				System.out.println("Lo siento, aún tengo la BD desactualizada.");
			}
		}
		System.out.println("Ha tenido " + aciertos + " puntos de 5");
		System.out.println("Ha tenido " + fallos + " fallos de 5");
	}

}
