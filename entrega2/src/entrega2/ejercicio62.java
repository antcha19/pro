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
		Scanner teclado = new Scanner(System.in);
		String correo;
		String es="\\.es";
		
		
		
		//introducir el usuario el correo por teclado
		System.out.print("introduce el correo");
		correo = teclado.next();
		
		 System.out.println(correo.length());				// saber la longuitud
		 System.out.println(correo.indexOf("@")); 			//averigua si hay una @ y me da valor menos 1
		 int arroba = correo.indexOf("@");					//guardo indexOf en una variable
		 
		 
		 if (arroba ==-1 ) {
			 System.out.println("Error 1: introduze un correo valido con una @." );
		 		 }
		 else  if(arroba < 4){
			 System.out.println("Error 3: longitud mínima de 4 caractere" );
		 }
		 
	}

}
