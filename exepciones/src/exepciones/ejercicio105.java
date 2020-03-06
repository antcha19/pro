/*Realiza un programa que inicialice los valores de un vector de 3 enteros (indexado por tanto de 0 a 2) y 
 * que lance una excepción cuando intentemos asignar un valor en la posición 3.
 *  Si no sabes qué nombre recibe esta excepción, lanza el programa sin bloque try-catch 
 *  y cópiala del error no controlado que lanza Eclipse*/

package exepciones;

public class ejercicio105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int vector [] = new int [3];
		
		for (int i = 0; i < vector.length; i++) {
			//quiere acceder a la posicion que no existe
			System.out.println(vector[4]);
		}
		
		}catch (ArrayIndexOutOfBoundsException a){
			System.out.println("quieres acceder a una posicion que no existe");
		}
	}

}
