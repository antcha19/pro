package unidad5;


import java.util.*;

public class ejercicio62 {

	public static void main(String[] args) {
	//variables
	int error = 0;
	String[] primparte;
	String[] segparte;
	Scanner teclado = new Scanner(System.in); 
	
	System.out.println("Introduzca su e-mail:"); 
	String email = teclado.nextLine();
	
	int posicion = email.indexOf("@");
	
	if (posicion < 0) {
		error = 1; //No hay @ 
		}
	else {
		if (posicion == 0) {
			error = 2; //Empieza por @
			}
				else {
					primparte = email.split("@");
					if (primparte[0].length() < 4) {
						error = 3; //identificador1 no llega a 4 caracteres
					}
					else {
						posicion = primparte[1].indexOf(".");
						if (posicion < 0) {
							error = 4; //despues de la @ no hay un punto
							}
							else {
								segparte = primparte[1].split("\\."); 
								if (segparte[0].length() < 3) {
									error = 5; //identificador2 no llega a 3 caracteres
								}
								else {
									if ((!segparte[1].equals("com")) && 
									   (!segparte[1].equals("es"))  && 
									   (!segparte[1].equals("org")) &&
									   (!segparte[1].equals("gov"))) {
											error = 6; //dominio desconocido
									} 
								}
							}
					}
				}
	}
	switch(error) {
	
	case 0: System.out.println("Enhorabuena! Mail correcto!"); 
		break;
		
	case 1:System.out.println("ERROR1: No existe una @"); 
		break;
	case 2: System.out.println("ERROR2: La direccion empieza por una @"); 
		break;
	case 3: System.out.println("ERROR3: El identificador1 no llega a 4 caracteres");
		break;
	case 4: System.out.println("ERROR4: Después de la @ no hay un punto"); 
		break;
	case 5: System.out.println("ERROR5: El identificador2 no llega a 3caracteres");
		break;
	case 6:System.out.println("ERROR6: Dominio distinto a .com, .es, .org y .gov");
	}
	
	} 
	}
	

