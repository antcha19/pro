package cine;

import java.util.*;


public class principalcine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int opcion = 0;
		boolean salir = false;
		int cantidadsalas;
		String cliente;
		int numero;

		Queue<cliente> colaclientes = new LinkedList<cliente>();
		
		
		HashMap<Integer, Queue<cliente>> saladecine = new HashMap <Integer, Queue<cliente>>();
		
		for (int i = 0; i < saladecine.size(); i++) {
			
//			saladecine.add(Queue<cliente>              );
			
		}
		

		System.out.println("Bienvenido a Kinepolis,¿de cuantas salas dispone tu cine!");
		cantidadsalas = teclado.nextInt();
		
		
		System.out.println("-----------Menu Kinepolis-----------------");
		System.out.println("1.Encolar cliente en una sala");
		System.out.println("2.desncolar cliente de la sala");
		System.out.println("3.Informacion de una sala");
		System.out.println("4.Estado del cine");
		System.out.println("5.Salir");
		opcion = teclado.nextInt();
		while (!salir) {
			switch (opcion) {
			case (1):
					
				break;
			case (2):
					
				break;
			case (3):
					
				break;
			case (4):
				
			
				break;
			case (5):
				
				salir = true;
				System.out.println("Gracias por venir a Kinepolis");
				break;

			default:
				break;
			}
		}
	}

}
