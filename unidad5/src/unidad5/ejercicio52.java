/*
 * antonio yepez 29102019
 * 
 * Crea un array de números de 100 posiciones, que contendrá los 
 * números del 1 al 100.Obtén la suma de todos ellos y la media.
 */

package unidad5;

public class ejercicio52 {

	public static void main(String[] args) {
			
		int index=0;
		int suma=0;
		
		int[] vector = new int[100]; // reserva posiciones en este caso 100 posiciones[100]
		
		for(index=0; index <= vector.length-1;index++) {
			
			vector[index]=(index+1);
			System.out.println(vector[index]);
			suma=index+suma;				//suma 
		}
			
		 System.out.println("la media es " + suma/100);
	}

}
//terminado