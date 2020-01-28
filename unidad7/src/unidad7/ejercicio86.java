/*
 * Antonio Yepez 
 * 24/01/2020
 * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación muestra esos nombrespor pantalla.
 *  Utiliza para ello un bucle for que recorra todo el ArrayList.*/

package unidad7;

import java.util.*;

public class ejercicio86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> compañerosclase  = new ArrayList();
		compañerosclase.add("Ana");
		compañerosclase.add("Antoino");
		compañerosclase.add("Pablo");
		compañerosclase.add("Jampi");
		compañerosclase.add("Alex");
		compañerosclase .add("Amrit");
		
		Iterator bucle = compañerosclase.iterator();
		//true si existen mas elementos
		while (bucle.hasNext())
		//devuelve el elemento y apunta al siguiente
			System.out.println(bucle.next());
		
		
	}

}
