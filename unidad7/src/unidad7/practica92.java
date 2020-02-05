/*
 * antonio yepez*/
package unidad7;

import java.util.*;

public class practica92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();
		// variables
		String pais = "";
		int contador = 0;
		int contador1 = 0;
		int maximo = 0;
		String ganador = " ";
		// declaro hasmap
		HashMap<String, Integer> paises = new HashMap<String, Integer>();

		System.out.println("Bienvenido al festival de Eurovision!");
		// bucle para introducir paises
		while (!pais.equals("salir") || contador <= 3) {
			System.out.println("Introduzca nombre del pais " + contador);
			// generera numeros alatorios
			int numerosaleatorios = aleatorio.nextInt(10) + 10;
			pais = teclado.nextLine();
			// insertar en el hasmap pais y numero aleatorio generado
			paises.put(pais, numerosaleatorios);
			//maxima puntuacion
			if (numerosaleatorios > maximo) {
				maximo = numerosaleatorios;
				ganador = pais;
			}
			//para que salir no lo cuente como un pais
			if (pais.equals("salir")) {
				paises.remove(pais, numerosaleatorios);
				break;
			}
			contador++;
		}
		System.out.println(
				"con las puntuaciones repartidas, el pais ganador es :" + ganador + " con " + maximo + " puntos");
		System.out.println(paises);
		// bucle para verificar pais con su puntuacion
		while (!pais.equals("salir") || contador1 <= contador) {
			System.out.println(" introduzca el nombre de pais para saber su puntuacion:");
			pais = teclado.nextLine();
			System.out.println(pais + " ha recibido " + paises.get(pais) + " votos ");
			if (pais.equals("salir")) {
				System.out.println("salir no es un pais");
				break;
			}
		}
	}

}
