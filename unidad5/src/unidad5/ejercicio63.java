/*
 * Antonio yepez 12112019
 * Realiza un programa que solicite la dimensión de un vector por teclado. 
 * Una vez creado el vector, lo informará con valores aleatorios entre 0 y 100,
 * lo mostrará por pantalla y además dirá si está ordenadoo no.
 */

package unidad5;

import java.util.*;
public class ejercicio63 {

	public static void main(String[] args) {
		
		//variables
		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();
		int tamano=0;
	 
		
		
		int vector=0;
		int numero=0;
		
		
		
		System.out.println("introduzca la dimension del vector");
		tamano= teclado.nextInt();
		
		int [] array = new int [tamano];
			
			 for(int i=0; i < tamano; i++) {
				// genera numero alatorio
				 numero = aleatorio.nextInt(100); 	
				 // guarda el numeroaleatorio en la posicion i del array 
				 array[i]= numero;					
				 System.out.println(array[i]);
			 }
			 //copia vector en otro
		     int [] copia =	Arrays.copyOfRange(array, 0, tamano); 
		     //ordena el vector
			 Arrays.sort(copia); 							 	
			 //compara los 2 vectores 
			 if(Arrays.equals(array, copia)==true){			    
				 System.out.println("el vector esta ordenado");
			 }
			 else 
				 System.out.println("el vector no esta ordenado");
				 
			 
		
		
	
	}

}
