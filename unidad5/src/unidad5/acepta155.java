/*
 * Antonio Yepez 08112019
 * 
 * El perímetro de un polígono es la suma de la longitud de
 *  todos sus lados. ¿Eres capaz de calcular el perímetro de
 *   un rectángulo? 
 */


package unidad5;


import java.util.*;
public class acepta155 {

	public static void main(String[] args) {
		
		//variables
		Scanner teclado = new Scanner(System.in);
		int x=0;
		int y=0;
		int a=0;
		int b=0;
		int c=0;
		int negativo=-1;
		
		do {
		x = teclado.nextInt();
		y = teclado.nextInt();
		
		a=x+x;
		b=y+y;
		c =a+b;
			//solo imprimira si x y y sea valor  positivo
			if (x>=0 && y >=0){
		 System.out.print(c);
		}
		 	// mientras x sea superior o y sea supeiror en el bucle
			} while (x > negativo && y > negativo);
	}
	

}
