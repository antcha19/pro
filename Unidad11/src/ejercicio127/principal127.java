package ejercicio127;

import java.util.*;

public class principal127 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		ArrayList<mascota> listamascotas = new ArrayList<mascota>();

		int opcion = 0;
		boolean salir = false;
		
		// menu
		while (!salir) {
			menu();
			opcion = teclado.nextInt();
			teclado.nextLine();
			switch (opcion) {
			case 1:
				alta(listamascotas);
				break;
			case 2:
				recorrerarrays(listamascotas, "perro" , "gato");
			
				break;
			case 3:
				recorrerarrays(listamascotas, "periquito" , "conejo");
				break;
			case 4:
				recorrerarrays(listamascotas, "gato" , "periquito");
				break;
			case 5:
				recorrerarrays(listamascotas, "perro" , "conejo");
				break;

			case 6:
				salir = true;
				System.out.println("Gracias por utilizar esta agenda");
				break;
			}

		}

	}

	public static void menu() {
		System.out.println("1-Dar de alta una mascota");
		System.out.println("2-Escuchar perros y gatos");
		System.out.println("3-Escuchar periquitos y conejos");
		System.out.println("4-Escuchar gatos y periquitos");
		System.out.println("5-Escuchar perros y conejos");
		System.out.println("6-salir");

	}

	public static void alta(ArrayList<mascota> listamascotas) {
		Scanner teclado = new Scanner(System.in);
		String tipo = "";
		String nombre = "";
		System.out.println("Introduzca el tipo de mascota a dar de alta (P-Perro/G-gato/Q-Periquito/C-Conejo):");
		tipo = teclado.nextLine();

		if (tipo.contains("p") || tipo.contains("g") || tipo.contains("q") || tipo.contains("c")) {
			
			System.out.println("Introduzca el nombre de la mascota");
			nombre = teclado.nextLine();
			switch (tipo) {
			case "p":

				perro p1 = new perro(nombre);
				listamascotas.add(p1);
				System.out.println("Se ha dado de alta a un perro de nombre " + nombre);
				break;

			case "g":
				gato p2 = new gato(nombre);
				listamascotas.add(p2);
				System.out.println("Se ha dado de alta a un gato de nombre " + nombre);
				break;
			case "q":
				periquito p3 = new periquito(nombre);
				listamascotas.add(p3);
				System.out.println("Se ha dado de alta a un periquito de nombre " + nombre);
				break;
			case "c":
				conejo p4 = new conejo(nombre);
				listamascotas.add(p4);
				System.out.println("Se ha dado de alta a un conejo de nombre " + nombre);
				break;

			}
			// break;

		}

	}
	
	public static void recorrerarrays(ArrayList<mascota> listamascotas,String tipo1, String tipo2) {
		//arrays generico
		mascota aux;
		Iterator iter = listamascotas.iterator();
		while(iter.hasNext()) {
			aux = (mascota)iter.next();
			
			if (aux.getTipo().equals(tipo1) || aux.getTipo().equals(tipo2)  ) {
				aux.sonido();
			}
		
		}
				
	}

}
