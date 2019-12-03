package unidad6;

import java.util.Scanner;

public class ejercicio76 {

	public static void main(String[] args) {
		

		
Scanner teclado= new Scanner(System.in);
		
		int numero, opcion=0;
		
		System.out.println("Introduce un número: ");
		numero=teclado.nextInt();
		
		do {
			System.out.println("Introduce una opción: "
					+ "\n1.- Realizar el sumatorio de "+numero
					+ "\n2.- Realizar el factorial de "+numero
					+ "\n3.- Salir de este programa");	
			opcion=teclado.nextInt();
		
			switch (opcion) {
			case 1:
				int sumatorio = funcionsumatorio(numero);
				System.out.println(sumatorio);
				
			break;
			case 2:
				int factorial = funcionfactorial(numero);
				System.out.println(factorial);
			break;
			case 3:
				System.out.println("Gracias por utilizar este programa");
			break;
			default:
				System.err.println("Introduce una opcion correcta");
			break;
			}
			
		
		}while (opcion!=3);
	}
	
	public static int funcionsumatorio(int numero) {
		
		int suma=0;
		
		while (numero!=0) {
		suma=suma+numero;
		numero--;
		}
		return suma;
	}
	
	public static int funcionfactorial(int numero) {
		
		int factorial=1;
		
	    while (numero!=0) {
	        factorial=factorial*numero;
	        numero--;
	      }
		return factorial;
	}

}
