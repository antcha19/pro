package boletin4;


import java.util.Scanner;
public class ejercicio217 {

	public static void main(String[] args) {
		
		
				//variable scanner
				Scanner teclado=new Scanner(System.in);
			
			//variables
			int n;
			
			n= teclado.nextInt();
			while( n != 0) {	 // n distinto a 0		
				if(n%2 == 0) { //si n /2 es igual a 0
					System.out.println("DERECHA");
					}
				else if (n%2 != 0) { //si n/2 es distinto a 0
					System.out.println("IZQUIERDA");
					}
				n= teclado.nextInt();
			}
				
	}
	
			
		
			
	
}
