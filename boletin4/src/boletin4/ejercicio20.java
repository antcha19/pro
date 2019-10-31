
/*
 * Antonio Yepez
 * 04102019
 * 
 *Escribe un programa que lea 2 datos enteros por teclado (a y b) y 
 *calcule el área de un triángulo. Al final imprimirá el mensaje:
 *“El triángulo de base <b> y altura <a> tiene un área de <area>”
 */



package boletin4;

import java.util.Scanner;

public class ejercicio20 {

	public static void main(String[] args) {
		//variable para introducir por pantalla
				Scanner sc=new Scanner(System.in);
		//variables
		int altura;
		int base;
		double area;
				
		//solucion
		
		System.out.println("introduce altura");
		altura = sc.nextInt();
		System.out.println("introduce base");
		base = sc.nextInt();
		
		area=(base*altura)/2;
		
		
		//muestra el resultado
		System.out.println("el resultado es base " +base+ " y altura " + altura + " tiene una area " + area );
		
				
			

	}

}
