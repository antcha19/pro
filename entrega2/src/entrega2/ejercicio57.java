package entrega2;

import java.util.*;
public class ejercicio57 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); //teclado
		
		int opcion=0;
		boolean salir = false;
		String cadena;
		
		
		System.out.println("1. longitud de una cadena");
        System.out.println("2. comparacion de 2 cadenas");
        System.out.println("3. concatenacion de dos cadenas");
        System.out.println("4. obtener una cadena invertida");
        System.out.println("5. invertir cadenas");
        System.out.println("6. es palindromo");
        System.out.println("9. Salir");
      
        
       while (opcion !=9) {
    	   opcion = teclado.nextInt();
       
        switch(opcion){
            case 1:
            	System.out.println("introduce una cadena");
                cadena = teclado.next();
                int length = cadena.length();						// calcular la longitud de la cadena 
                System.out.println("la longuitud es: " + cadena.length());
                break;
            case 2:
            	System.out.println("introduce primero cadena");
                String cadena1 = teclado.next();
                System.out.println("introduce primero cadena");
                String cadena2 = teclado.next();
                 if (cadena1.equals(cadena2) ) { 			// equals sirve para comparar 
                	 System.out.println("las cadenas son iguales");
               	            }
                break;
            case 3:
                System.out.println("introduce primero cadena");
                String cadena3 = teclado.next();
                System.out.println("introduce primero cadena");
                String cadena4 = teclado.next();
                System.out.println("concatenacion de dos cadenas" + cadena3 + cadena4);
                break;
            case 4:
                System.out.println("introduce una cadena");
                String cadena5 = teclado.next();
                System.out.println("introduce 2 numeros");
                int numero1 = teclado.nextInt();
                int numero2 = teclado.nextInt();
                String subcadena = cadena5.substring(numero1,numero2);
                System.out.println(subcadena);
                break;
            case 5:
                System.out.println("introduce una cadena");
                String cadena6 = teclado.next();
                String cadenainvertida="";
        		for (int x=cadena6.length()-1;x>=0;x--)
                	cadenainvertida = cadenainvertida + cadena6.charAt(x);
                	System.out.println(cadenainvertida);
                
                break;
            case 6:
                System.out.println("introduce una cadena");
                String cadena7 = teclado.next();
                
                
                break;
                             	
                       
        }
         
    }
	}
     
 }
  
