package ejercicios;

import java.util.*;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList cola = new LinkedList();

		// introducir numero del uno al 10
		for (int i = 1; i < 11; i++)
			cola.offer(i);

		while (cola.peek() != null) {
			System.out.println(cola.poll());

		}

	}

}
