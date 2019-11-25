package unidad5;

import java.util.*;
public class ejercicio54 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();
		//variables 
		int tamano=0;
		int numero1=0;
		int numero2=0;
		int [] array = new int[tamano]; //creo el array
		int numero=0;
		
		System.out.println("introduce tamano del array");
		tamano = teclado.nextInt();
		
		System.out.println(numero);
		for (int i=0; i < tamano;i++) {
			numero = aleatorio.nextInt(100);
      	   array[i] = numero;
      	   
      
			
		}
		
		
			 
	}

}
