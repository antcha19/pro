/*
 * Crea un programa que se encargue de simular un chat con Paco del siguiente modo:
-Al principio de todo, se solicitará el nombre al usuario, validando que este sea distinto de espacios.
Luego le preguntará “como estas hoy?”. Estas 2 frases serán fijas a principio de la conversación.
-Luego entramos en un bucle y, cada vez que el usuario interactúe con Paco, este responderá con frases
fijas del siguiente modo:
- Si el número de vocales de la frase que ha introducido el usuario es par, Paco responderá:
"Paco: Qué interesante...cuentame más…"
- Si el número de vocales de la frase que ha introducido el usuario es impar, Paco responderá:
"Paco: No me interesa nada, cuentame otra cosa"

-Cuando el usuario se canse de hablar con Paco, le dirá cualquier frase que contenga la palabra “vete”,
y en ese momento, Paco se despedirá y el programa finalizará.*/

package unidad10;

import java.io.*;
import java.util.*;

public class ejercicio112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		File chat = new File("chat.txt");

		// variables
		int contador = 0;
		String nombre = "";
		String frase = "";
		boolean vete = false;
		String linea = null;

		// creacion del archivo chat.txt
		try {
			chat.createNewFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		try {
			FileWriter file5 = new FileWriter(chat);
			System.out.println("Bienvenido al chat de Paco");
			file5.write("Bienvenido al chat de Paco" + "\n");
			System.out.println("---------------------------");
			file5.write("---------------------------" + "\n");
			System.out.println("Paco: Hola que tal, cómo te llamas?");
			file5.write("Paco: Hola que tal, cómo te llamas?" + "\n");
		
			file5.write(nombre = teclado.nextLine() );

			System.out.println("Paco: Hola " + nombre + " ¿como estas hoy?");
			file5.write("Paco: Hola " + nombre + " ¿como estas hoy?" + "\n");
			while (!vete) {
				file5.write(frase = teclado.nextLine() + "\n");
					/// 
				if(frase.contains("vete")) {
					break;
				}
				for (int i = 0; i < frase.length(); i++) {
					linea = frase;
					if ((linea.charAt(i) == 'a') ||
							 (linea.charAt(i) == 'e') ||
							 (linea.charAt(i) == 'i') ||
							 (linea.charAt(i) == 'o') ||
							 (linea.charAt(i) == 'u')) {
						contador++;
					}
				
					}
					if ((contador % 2) == 0) {
						// par
						System.out.println("Paco: Qué interesante...cuentame más…" + "\n");
						file5.write("Paco: Qué interesante...cuentame más…" + "\n");
						
						
					} else {
						// impar
						System.out.println("Paco: No me interesa nada, cuentame otra cosa" + "\n");
						file5.write("Paco: No me interesa nada, cuentame otra cosa" + "\n");

						
					}

				}
				
			
			
			file5.close();

		}catch(

	IOException e)
	{
		System.out.println(e.getMessage());
	}

}

}
