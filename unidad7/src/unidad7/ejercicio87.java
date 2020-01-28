/*
 * 
 * Antonio Yepez 
 * 24/01/2020
 * Realiza un programa que introduzca valores aleatorios 
 * (entre 0 y 100) en un  ArrayList  y que luegocalcule la suma,
 *  la media, el máximo y el mínimo de esos números.
 *   El tamaño de la lista también será aleatorio y podrá oscilar
 *    entre 10 y 20 elementos.
 */

package unidad7;

import java.util.*;

public class ejercicio87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// variables
		int suma = 0;
		int media = 0;
		int maximo = 0;
		int minimo = 0;
		boolean primeravez = false;

		ArrayList<Integer> numerosaleatorio = new ArrayList();

		Random aleatorio = new Random();
		// genera aletoriamente las posicions de la Arraylista
		int posicioneslista = aleatorio.nextInt(10) + 10;

		for (int i = 0; i < posicioneslista; i++) {
			int numero = aleatorio.nextInt(100) + 1;
			// añade los numeros alateorios a la lista
			numerosaleatorio.add(numero);
			// suma de todos los numeros
			suma = suma + numero;
			// numero maximo
			if (numero > maximo) {
				maximo = numero;
			}
			// numero minimo
			if (primeravez == false) {
				minimo = numero;
				primeravez = true;
			}
			if (numero < minimo) {
				minimo = numero;
			}

		}

		// media de la suma total
		media = suma / posicioneslista;

		// imprimi toda la lista
		Iterator iter = numerosaleatorio.iterator();
		// true si existen mas elementos
		while (iter.hasNext()) {
			// devuelve el elemento y apunta al siguiente
			System.out.println(iter.next());
		}

		System.out.println("posiciones:" + posicioneslista);
		System.out.println("la suma es " + suma);
		System.out.println("la numero maximo es " + maximo);
		System.out.println("la la media " + media);
		System.out.println("la numero minimo " + minimo);
	}

}
