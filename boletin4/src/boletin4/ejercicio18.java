/*
 * Antonio Yepez
 * 04102019
 * Dado un valor en Mb introducido por teclado, mostrar su equivalencia en bytes,
 *  KB, GB y TB.
 *  Mostrar la información en 5 columnas.
 */

package boletin4;

import java.util.Scanner;

public class ejercicio18 {

	public static void main(String[] args) {
		//variable para introducir por pantalla
				Scanner sc=new Scanner(System.in);
		//variable
			int x;
			double byts;
			double KB;
			double GB;
			double TB;
			
		//solucion
			
			
			System.out.println("Introduce numero en MB");
			x = sc.nextInt();
			byts=((x*1024)*(1024));
			KB=x*1024;
			GB=x/1024;
			TB=(x/1024)/1024;
			
			System.out.println(+byts+ "byts");
			System.out.println(+KB+ "KB");
			System.out.println(+GB+ "GB");
			System.out.println(+TB+ "TB");
			

	}

}