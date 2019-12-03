/*
 * Antonio yepez 26112019
 * */

package unidad5;

import java.util.*;
public class ejercicio54 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();
		//variables 
		int tamano=0;
		int inferior=0;
		int superior=0;
		
		
		int suma=0;
		
		
		//introducir tamano del array
		System.out.println("introduce tamano del array");
		tamano = teclado.nextInt();
		
		
		System.out.println("introduce limite   inferior  y  superior para introducir numero aleatorios");
		inferior = teclado.nextInt();
		superior= teclado.nextInt();
		
		//creo el array

		int vector[]  = new int[tamano]; 		
		System.out.println("se ha generado el siguiente vector de " + tamano + " posiciones");
		for (int i=0; i < vector.length;i++) {
			
		
			
			vector[i] = (int)(aleatorio.nextDouble()*(superior-inferior+1)+ inferior);
			
			suma += vector[i];
			 
			System.out.println("["+vector[i]+"]");
		}
		System.out.println(" la suma de los elementos es: " +suma);
		
		
		
			 
	}

}
//terminado
