/*
 * antoino yepez 06112019
 * Realiza un programa que pedirá por teclado una dirección de email con el siguiente formato:
identificador1 + @ + identificador2 + .com | .es | .org | .gov
Y validaremos los siguientes apartados en orden de prioridad:
 */
package entrega2;


import java.util.*;
public class ejercicio62 {

	public static void main(String[] args) {
		//variables
		int error = 0;
		String email;
		int posicion=0;
		
		String[] primeraparte;
		String[] segundaparte;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca su e-mail:");
		email = teclado.nextLine();
		
		 posicion = email.indexOf("@");
		if (posicion < 0) {
			error = 1; //No hay @ 
		}else {
			if (posicion == 0) {
				error = 2; //Empieza por @
		}else {
			primeraparte = email.split("@");
				if (primeraparte[0].length() < 4) {
						error = 3; //identificador1 no llega a 4 caracteres
		}
		else {
				posicion = primeraparte[1].indexOf(".");
				if (posicion < 0) {
		             error = 4; //despues de la @ no hay un punto
					}
					else {
					segundaparte = primeraparte[1].split("\\."); 
						if (segundaparte[0].length() < 3) {
							error = 5; //identificador2 no llega a 3 caracteres
					}
					else {
						if ((!segundaparte[1].equals("com")) &&
						   (!segundaparte[1].equals("es"))   &&
						   (!segundaparte[1].equals("org"))  &&
						   (!segundaparte[1].equals("gov"))) {
								//dominio desconocido
					            error = 6; 
							} 
						}
					}
				}
			}
		}
		switch(error) {
		
		case 0:
			System.out.println("Enhorabuena! Mail correcto!");
		  break;
		case 1:
			System.out.println("ERROR1: No existe una @"); 
			break;
		case 2:
			System.out.println("ERROR2: La direccion empieza por una @"); 
			break;
		case 3:
			System.out.println("ERROR3: El identificador1 no llega a 4 caracteres");
				break; 
		case 4:
			System.out.println("ERROR4: Después de la @ no hay un punto"); 
			break;
			
		case 5:
			System.out.println("ERROR5: El identificador2 no llega a 3 caracteres");
			break;
		case 6:
			System.out.println("ERROR6: Dominio distinto a .com, .es, .org y .gov");
			break;
		}
	}
}