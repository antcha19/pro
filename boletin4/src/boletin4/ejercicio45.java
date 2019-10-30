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
		
<<<<<<< HEAD
		String a="a";
		String b="b";
		String c;
		String d;
		String carnet;
		String A;
=======
		
		String curso;
		int A=150;
>>>>>>> ad5b330de6b237a3a1c09909c69156dfaf69191f
		int B=325;
		int C=520;
		int D=610;
		int practicas=0;
		int Apractica=15;
		int Bpractica=21;
		int Cpractica=36;
		int Dpractica=50;
		
		
<<<<<<< HEAD
		System.out.println("tipo de carnet");
		curso = teclado.next();
	
			if (carnet == A) {
				System.out.println("numero de practicas");
				practicas = teclado.nextInt();
				totalpractica=practicas*Apractica;
				System.out.println(totalpractica);
				total = totalpractica+A;
				System.out.println("te has gastado en total " + total);
				
				}
			else if (curso == B) {
					System.out.println("numero de practicas"+ B );
					practicas = teclado.nextInt();
					totalpractica=practicas*Bpractica;
					System.out.println(totalpractica);
					total = B + totalpractica;
					System.out.print(B);
=======
		 System.out.println("que permiso de conducir quieres A,B,C,D");
		 curso=teclado.next();
		 System.out.println("cuantas practicas vas hacer");
		 practicas=teclado.nextInt();
		 
		 
		 //comparamos la respuesta curso si es igual a cualquiera de los casos entrata, 
		 if (curso.equals("a")||curso.equals("b")||curso.equals("c")||curso.equals("d")||
			curso.equals("A")||curso.equals("B")||curso.equals("C")||curso.equals("D")) {
			 curso=curso.toUpperCase();
			 
			 
			 switch (curso) {
			 		case "A":
			 			System.out.println("total a pagar: " + (A+(Apractica*practicas)));break;
			 		case "b":
			 			System.out.println("total a pagar: " + (B+(Bpractica*practicas)));break;
			 		case "C":
			 			System.out.println("total a pagar: " + (C+(Cpractica*practicas)));break;
			 		case "D":
			 			System.out.println("total a pagar: " + (D+(Dpractica*practicas)));break;
			 }
		 }	
>>>>>>> ad5b330de6b237a3a1c09909c69156dfaf69191f
				
		 		// si no cumple la condicion de if saltara a este punto
		 else 
			 System.out.println("introduce un permiso vigente");

			
		 }
		 
}
		 
	
	

