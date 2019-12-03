/*
 * antonio yepez 27/11/2019
 * 
 * Hacer un programa que contenga un menú que se ejecutará en 
 * bucle y que contendrá las siguientesoperaciones matemáticas 
 * que se codificarán en funciones:
 * 1.- Sumar
 * 2.- Restar
 * 3.- Multiplicar
 * 4.- Dividir
 * 5.- Potencia
 * 6.- Raíz cuadrada
 * 9.- Salir
 * donde:
 * 1.- Función que pide 2 números y calcula la suma.
 * 2.- Función que pide 2 números y calcula la resta.
 * 3.- Función que pide 2 números y calcula la multiplicación.
 * 4.- Función que pide 2 números y calcula la división.
 * 5.- Función que pide 2 números y calcula la potencia.
 * 6.- Función que pide 1 número y calcula la raíz cuadrada.
 * 9.- Salir: Terminará el programa con un mensaje de despedid
 * */

package unidad6;

import java.util.*;

public class ejercicio72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		boolean salir = false;
		int opcion; // Guardaremos la opcion del usuario

		while (!salir) {

			System.out.println("1. sumar dos numeros");
			System.out.println("2. resta de  dos numeros");
			System.out.println("3. multiplicacion dos numeros");
			System.out.println("4. division dos numeros");
			System.out.println("5. Potencia");
			System.out.println("6. Raiz cuadrada");
			System.out.println("9. Salir");

			System.out.println("Escribe una de las opciones");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				// creamos una variable local y llamas a "suma" para que nuestre el resultado
				int suma1 = 0;
				System.out.println("la el resultado de la suma es " + suma(suma1));

				break;
			case 2:
				int resta1 = 0;
				System.out.println("la el resultado de la resta es " + resta(resta1));
				break;
			case 3:
				int multiplicacion1 = 0;
				System.out.println("la el resultado de la multiplicacion es " + multiplicacion(multiplicacion1));
				break;

			case 4:
				int division1 = 0;
				System.out.println("la el resultado de la division es " + division(division1));
				break;
			case 5:
				int potencia1 = 0;
				System.out.println("la el resultado de la potencia es " + potencia(potencia1));
				break;
			case 6:
				int raiz1 = 0;
				System.out.println("la el resultado de la suma es " + raiz(raiz1));
				break;
			case 9:
				salir = true;
				break;
			default:
				System.out.println("Solo números entre 1 y 5 . Pulsa el 9 para salir");
			}

		}
	}

	public static int suma(int n) {
		int a = 0;
		int b = 0;
		int suma = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce los numeros ");
		a = teclado.nextInt();
		b = teclado.nextInt();
		suma = a + b;
		return suma;

	}

	public static int resta(int n) {
		int a = 0;
		int b = 0;
		int resta = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce los numeros ");
		a = teclado.nextInt();
		b = teclado.nextInt();
		resta = a - b;
		return resta;

	}

	public static int multiplicacion(int n) {
		int a = 0;
		int b = 0;
		int multiplicacion = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce los numeros ");
		a = teclado.nextInt();
		b = teclado.nextInt();
		multiplicacion = a * b;
		return multiplicacion;

	}

	public static int division(int n) {
		int a = 0;
		int b = 0;
		int division = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce los numeros ");
		a = teclado.nextInt();
		b = teclado.nextInt();
		division = a / b;
		return division;

	}

	public static int potencia(int n) {
		int a = 0;
		int b = 0;
		int potencia = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce los numeros ");
		a = teclado.nextInt();
		b = teclado.nextInt();
		potencia = (int) Math.pow(a, b);
		return potencia;

	}

	public static int raiz(int n) {
		int a = 0;

		int raiz = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce el numero ");
		a = teclado.nextInt();

		raiz = (int) Math.sqrt(a);
		return raiz;

	}

}
