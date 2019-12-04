/*
 * antonio yepez 3/12/2019
 * Esta función convierte los dígitos del número n en las correspondientes palabras y lo devuelve todo en
una cadena de caracteres.
Por ejemplo, el 470213 convertido a palabras sería:
cuatro, siete, cero, dos, uno, tres
Utiliza esta función en un programa para comprobar que funciona bien.
Desde la función no se debe mostrar nada por pantalla, solo se debe usar println desde el programa principal.
 */
package unidad6;


import java.util.*;
public class ejercicio75 {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner (System.in);
		 
		 String cadena;
		 String cadena2;
		 char separamos;

		 System.out.println("introduzca numero a convertir");
		 cadena = teclado.nextLine();
		 
		 //recoremos la cadena
		 for (int i =0; i < cadena.length(); i++) {
			 //separamos el primer caracter de la cadena
			 separamos = cadena.charAt(i);
			 //creamos una cadena auxiliar para cambiar de caracter a string
			 cadena2= Character.toString(separamos);
			 
			 System.out.print(" " + convierte(Integer.parseInt(cadena2)));
			 }
		 
		 
	}

	
	public static String convierte(int separar) {
		
		String numeros;

		
		switch (separar) {
		case 0:
			numeros="cero";
			break;
		case 1:
			numeros="uno";
			break;	
		case 2:
			numeros="dos";
			break;
		case 3:
			numeros="tres";
			break;
		case 4:
			numeros="cuatro";		
			break;
		case 5:
			numeros="cinco";
			break;
		case 6:
			numeros="seis";		
			break;
		case 7:
			numeros="siete";
			break;
		case 8:
			numeros="ocho";			
			break;
		case 9:
			numeros="nueve";			
			break;
		default:
			numeros="Caracter no válido";			
			break;			
		}	
	
		
		
		return numeros;
	}
}
