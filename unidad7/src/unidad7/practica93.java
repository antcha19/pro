package unidad7;

import java.util.*;

public class practica93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		Queue<String> cola =new LinkedList<String>();
		
		String personas = "";
		
		System.out.println("introduzca nombre para entrar separados por @,'nadie' para que no entre nadie o 'salir para finalizar el programa:'");
		//introduir datos en la cola
		while(!personas.equals("salir")  ) {
			personas = teclado.next();
			cola.add(personas);
		if (personas.equals("salir")) {
			break;
		}
		}
		//mostar estado de la cola
		Iterator iter = cola.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		//quitar una persona de la cola
		System.out.println("introduce numero de personas para salir de la cola");
		personas = teclado.next();
	
		cola.remove(personas);
		System.out.println("estado de la cola despues de entrar:" );
		Iterator iter1 = cola.iterator();
		while (iter1.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		
		
		
	}

}
