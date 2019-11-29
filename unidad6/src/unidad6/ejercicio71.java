/*
 * 
 * Antonio Yepez 27/11/2019
 * Realizar una función que, dado un número N introducido por teclado,
 *  nos diga si el número es primo ono (true o false). 
 *  Dicha función tendrá el siguiente prototipo:
 *  
 *  	public static boolean esPrimo(int n);
 *  
 *  Utilizando la función anterior, realizar un algoritmo para 
 *  averiguar todos los números primos queexisten entre 2 y 1000. 
 *  Mostrar el resultado en 4 columnas
 */

package unidad6;

public class ejercicio71 {

	public static void main(String[] args) {
		
		int inicio=2;
		int fin=1000;
		int columna=0;
		int cont =0;
		boolean esprimo;
		
		
		for (int n=inicio; n <=fin;n++) {
			esprimo(n);
			if(esprimo(n)==true) {
				if(columna <3) {
					System.out.print(n+ "\t");
					columna++;
				}else {
					System.out.println(n);
					columna=0;
				}
			
			}
		}
	}

	public static boolean esprimo(int n) {
			
		if (n % 2  == 0 || n % 3  == 0 || n % 5  == 0 || n % 7  == 0 || n % 11  == 0) 
			return  false;
		
		else 
			return true;
		}
	
	
}


