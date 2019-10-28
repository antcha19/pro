/*
 * antonio yepez
 * 25102019
 */


package boletin4;


import java.util.Scanner;
public class ejercicio45 {

	public static void main(String[] args) {
		
		
		//variable scanner
		Scanner teclado=new Scanner(System.in);
		
		String a="a";
		String b="b";
		String c;
		String d;
		String curso;
		int A=150;
		int B=325;
		int C=520;
		int D=610;
		int practicas;
		int totalpractica;
		int Apractica=15;
		int Bpractica=21;
		int Cpractica=36;
		int Dpractica=50;
		int total;
		
		
		
		
		System.out.println("tipo de carnet");
		curso = teclado.next();
	
			if (a == a) {
				System.out.println("numero de practicas");
				practicas = teclado.nextInt();
				totalpractica=practicas*Apractica;
				System.out.println(totalpractica);
				total = totalpractica+A;
				System.out.println("te has gastado en total " + total);
				
				}
			else if (b == b) {
					System.out.println("numero de practicas"+ B );
					practicas = teclado.nextInt();
					totalpractica=practicas*Bpractica;
					System.out.println(totalpractica);
					total = B + totalpractica;
					System.out.print(B);
				
					System.out.println("te has gastado en total " + total);
					
					}
	
	}
}
