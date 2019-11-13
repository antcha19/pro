/*
 * Antonio Yepez 13112019
 * 
 * Realiza un programa que lleve a cabo una validación sobre un password.
 *El password tendrá una serie de restricciones:
1- Ha de tener, al menos, 8 caracteres.
2- Al menos la mitad del password ha de estar en minúsculas.
3- El password ha de tener, al menos, 2 mayúsculas.
4- El password ha de tener, al menos, 3 números.
5- El password NO ha de incluir el carácter ‘@’.
El programa se ejecutará en bucle y mostrará en cada iteración, de forma acumulativa, todos los errores
que se van produciendo en cada iteración. Es decir, si el password incumple las restricciones 1, 2 y 3,
informará de que se están incumpliendo las 3. El programa finalizará cuando el password cumpla todas
las restricciones arriba descritas.
 */
package unidad5;


import java.util.*;
public class ejercicio64 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		String contrasena;
		int mayuscula=0;
		int minuscula=0;
		int arroba=0;
		int numeros=0;
		
		do {
		System.out.println("introduzca su contrasena");
		contrasena = teclado.nextLine();
		
		//cuenta los caracteres de la contrasena
		for(int i=0;i<contrasena.length();i++) {
			if (Character.isDigit(contrasena.charAt(i))){
				numeros++;
			}
		
		// encuentra si hay caracteres minuscula
				if(Character.isLowerCase(contrasena.charAt(i)) ) { 					
				 minuscula++;
				}
			// encuentra si hay caracteres mayuscula
			if(Character.isUpperCase(contrasena.charAt(i)) ) { 					
			 mayuscula++;
			}
		}
		arroba = contrasena.indexOf("@");		
			
		//debe tener al menos 8 caaracteres
				if(contrasena.length()<8 ) { 					
					System.out.println("El tamano del password ha de ser de,  al menos 8 caracters" + contrasena.length());
					}
					//Al menos la mitad del password ha de estar en minúsculas
				if(minuscula <2) { 					
					System.out.println("Al menos la mitad del password ha de estar en minúsculas" + minuscula);
					}
				//la contrasena ha de tener , al menos 2 mayuscula
				if(mayuscula <2 ) { 					
					System.out.println("la contrasena ha de tener , al menos 2 mayuscula" + mayuscula);
					}
				//la contrasema ha de tener, al menos, 3 número
				if(numeros < 3 ) { 					
					System.out.println("El password ha de tener, al menos, 3 números" + numeros);
					}
				//la contrasena no debe incluir la @
				if(arroba >=1 ) { 					
					System.out.println("El password NO ha de incluir el carácter ‘@’.");
					}
			
		}		
		while(contrasena.length()<=8|| minuscula <= contrasena.length ()/2|| mayuscula >=1 || numeros <3 || arroba >1  );
		
	}
	
}
