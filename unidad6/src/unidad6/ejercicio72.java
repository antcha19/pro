/*
 * antonio yepez 27/11/2019
 * 
 * Hacer un programa que contenga un menú que se ejecutará en 
 * bucle y que contendrá las siguientesoperaciones matemáticas 
 * que se codificarán en funciones:
 * 1.- Sumar
 * 2.- Restar
 * 3.- Multiplicar
 * 4.- Dividir
 * 5.- Potencia
 * 6.- Raíz cuadrada
 * 9.- Salir
 * donde:
 * 1.- Función que pide 2 números y calcula la suma.
 * 2.- Función que pide 2 números y calcula la resta.
 * 3.- Función que pide 2 números y calcula la multiplicación.
 * 4.- Función que pide 2 números y calcula la división.
 * 5.- Función que pide 2 números y calcula la potencia.
 * 6.- Función que pide 1 número y calcula la raíz cuadrada.
 * 9.- Salir: Terminará el programa con un mensaje de despedid
 * */

package unidad6;
import java.util.*;
public class ejercicio72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner teclado = new Scanner(System.in);
			
		       boolean salir = false;
		       int opcion; //Guardaremos la opcion del usuario
		       
		       while(!salir){
		           
		           System.out.println("1. Opcion 1");
		           System.out.println("2. Opcion 2");
		           System.out.println("3. Opcion 3");
		           System.out.println("4. Salir");
		           
		           System.out.println("Escribe una de las opciones");
		           opcion = teclado.nextInt();
		           
		           switch(opcion){
		               case 1:
		                   System.out.println("Has seleccionado la opcion 1");
		                   break;
		               case 2:
		                   System.out.println("Has seleccionado la opcion 2");
		                   break;
		                case 3:
		                   System.out.println("Has seleccionado la opcion 3");
		                   break;
		                case 4:
		                   salir=true;
		                   break;
		                default:
		                   System.out.println("Solo números entre 1 y 4");
		           }
		           
		       }
		       
		    }

}
