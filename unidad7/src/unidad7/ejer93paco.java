package unidad7;

import java.util.*;

public class ejer93paco {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String nombres;
		int salen;
		Queue<String> cola = new LinkedList<String>();
		while (true) {
			System.out.println(
					"Introduzca nombres para ENTRAR separados por @,'nadie' para que no entre nadie o 'salir' para finalizar el programa:");
			nombres = s.nextLine();
			if (nombres.equals("salir")) {
				break;
			}
			if (!nombres.equals("nadie")) {
				insertar_cola(nombres, cola);
			}
			System.out.println("Estado de la cola despues de ENTRAR:");
			imprimir_cola(cola);
			System.out.println("Introduzca numero de personas para SALIR de la cola:");
			salen = s.nextInt();
			s.nextLine();
			while (salen > cola.size()) {
				System.out.println("No pueden salir " + salen + " personas porque en la cola solo hay " + cola.size() + " personas.");
				System.out.println("Introduzca numero de personas para SALIR de la cola:");
				salen = s.nextInt();
				s.nextLine();
			}
			borrar_cola(salen, cola);
			System.out.println("Estado de la cola despues de SALIR:");
			imprimir_cola(cola);
		}
	}

	public static void insertar_cola(String nombres, Queue<String> cola) {
		String[] nombres_array = nombres.split("@");
		for (int i = 0; i < nombres_array.length; i++) {
			cola.add(nombres_array[i]);
		}
	}

	public static void borrar_cola(int salen, Queue<String> cola) {
		for (int i = 0; i < salen; i++) {
			System.out.println("Sale de la cola " + cola.element());
			cola.remove();
		}
	}

	public static void imprimir_cola(Queue<String> cola) {
		Iterator iter = cola.iterator();
		while (iter.hasNext()) {
			System.out.println("  " + iter.next());
		}
	}
}
