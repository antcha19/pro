package cinejean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// Creo cola de objetos tipo Clientes
				Queue<Clientes> colacine = null;

				// Creo arraylist de colacine
				ArrayList<Queue<Clientes>> colas = new ArrayList<Queue<Clientes>>();

				// Metodo para crear el numero de salas, exportando el arrayList y la cola
				Crear_Colas(colas, colacine);

				// Menu, exportando a cola
				Menu(colas);

			}

			public static ArrayList<Queue<Clientes>> Crear_Colas(ArrayList<Queue<Clientes>> colas, Queue<Clientes> colacine) {
				Scanner teclado = new Scanner(System.in);

				System.out.println("Bienvenido a Kinepolis, de cuantas salas dispone tu cine?");

				// Introduccion de numero de salas totales
				int numero = teclado.nextInt();

				// Creaccion de colas
				for (int i = 0; i < numero; i++) {
					colas.add(colacine = new LinkedList<Clientes>());
				}

				// Devuelvo arrayList modificada
				return colas;
			}

			public static void Menu(ArrayList<Queue<Clientes>> colas) {
				Scanner teclado = new Scanner(System.in);
				int opcion;

				// Do while mientras no use la opcion salir
				do {

					System.out.println("------- Menu Kinepolis -------");
					System.out.println("1- Encolar cliente en una sala");
					System.out.println("2- Desencolar cliente de la sala");
					System.out.println("3- Informaci�n de una sala");
					System.out.println("4- Estado del cine");
					System.out.println("5- Salir");

					// Introducci�n de opci�n
					opcion = teclado.nextInt();

					// En cada metodo exporto el arrayList
					switch (opcion) {
					case 1:
						Opcion1(colas);
						break;

					case 2:
						Opcion2(colas);
						break;

					case 3:
						Opcion3(colas);
						break;

					case 4:
						Opcion4(colas);
						break;

					case 5:
						System.out.println("Gracias por venir a Kinepolis");
						break;

					default:
						System.out.println("Opcion invalida");
						break;
					}
				} while (opcion != 5);

			}

			public static void Opcion1(ArrayList<Queue<Clientes>> colas) {
				Scanner teclado = new Scanner(System.in);
				System.out.println("Sobre que sala desea realizar la operacion?");

				// Introducimos sala a la que a�adir cliente
				int numsala = teclado.nextInt();

				// Si la sala es incorrecta se repite la petici�n
				while (numsala > colas.size() || numsala < 1) {
					System.out.println(
							"Valor de sala introducido err�neo. introduzca valores desde el 1 hasta el " + colas.size());
					numsala = teclado.nextInt();
				}

				// Introduccion de datos de cliente
				System.out.println("Introduzca nombre del nuevo cliente para la cola " + numsala + ":");
				String nombre = teclado.next();
				System.out.println("Introduzca su edad:");
				int edad = teclado.nextInt();

				// Creaci�n de objeto tipo cliente en la cola situada en la posici�n
				// (numsala - 1) del arrayList
				System.out.println("A�adimos a la cola " + numsala + " el cliente " + nombre + " de " + edad + " a�os");
				colas.get(numsala - 1).add(new Clientes(nombre, edad));
			}

			public static void Opcion2(ArrayList<Queue<Clientes>> colas) {
				Scanner teclado = new Scanner(System.in);

				// introducci�n de sala a modificar y validaci�n de la misma
				System.out.println("�Sobre qu� sala desea realizar la operaci�n?");
				int numsala = teclado.nextInt();
				while (numsala > colas.size() || numsala < 1) {
					System.out.println(
							"Valor de sala introducido err�neo. introduzca valores desde el 1 hasta el " + colas.size());
					numsala = teclado.nextInt();
				}

				// Quitamos el primero de la cola en
				// la posici�n (numsala - 1)
				System.out.println("Desencolamos al primero de la cola de la sala " + numsala);
				colas.get(numsala - 1).remove();
			}

			public static void Opcion3(ArrayList<Queue<Clientes>> colas) {
				// Creaccion de cola auxiliar
				Queue<Clientes> Aux;
				Scanner teclado = new Scanner(System.in);

				// introducci�n de sala a consultar y validaci�n de la misma
				System.out.println("�Sobre qu� sala desea realizar la operaci�n?");
				int numsala = teclado.nextInt();
				while (numsala > colas.size() || numsala < 1) {
					System.out.println(
							"Valor de sala introducido err�neo. introduzca valores desde el 1 hasta el " + colas.size());
					numsala = teclado.nextInt();
				}

				// Recorremos el arraylist
				for (int i = 0; i < colas.size(); i++) {

					// Si encontramos la cola
					if (i == numsala - 1) {

						// Igualamos la cola auxiliar a la buscada
						Aux = colas.get(i);
						System.out.println("clientes de la sala " + (i + 1) + ":");

						// Recorremos la cola y mostramos los clientes
						Iterator iter = Aux.iterator();
						while (iter.hasNext()) {
							Clientes cliaux = (Clientes) iter.next();
							cliaux.Mostrar();
						}

					}
				}
			}

			public static void Opcion4(ArrayList<Queue<Clientes>> colas) {
				// Creaccion de cola auxiliar
				Queue<Clientes> Aux;

				// Recorremos el arrayList
				for (int i = 0; i < colas.size(); i++) {

					// Igualamos la cola auxiliar a la cola del arrayList en la posicion i
					Aux = colas.get(i);
					System.out.println("clientes de la sala " + (i + 1) + ":");

					// Recorremos la cola y mostramos
					Iterator iter = Aux.iterator();
					while (iter.hasNext()) {
						Clientes cliaux = (Clientes) iter.next();
						cliaux.Mostrar();
					}
				}

			}
	

}
