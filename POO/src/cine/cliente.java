package cine;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class cliente {

	Scanner teclado = new Scanner(System.in);

	private String nombre;
	private int edad;


	public cliente(String nombre, int edad) {

		this.nombre = nombre;
		this.edad = edad;

	}

//	public colacliente {
//		
//				
//	}

	public void anadircliente(String nombre , int edad) {
		
		System.out.println("Introduzca nombre del nuevo cliente para la cola");
		nombre=teclado.nextLine();
		System.out.println("Introduzca la edad del cliente");
		edad=teclado.nextInt();
		
		//colaclientes.add(cliente(nombre, edad));

		
	}

}
