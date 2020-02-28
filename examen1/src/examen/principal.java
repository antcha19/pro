package examen;

import java.util.*;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// variables
		boolean salir = false;
		int opcion = 1;
		Scanner teclado = new Scanner(System.in);
		String nave;
		String nombretripulante;
		int edad;
		String rango;
		String flota;

		/// arraylis de nave, tripulante, flota
		ArrayList<Nave> listanaves = new ArrayList<Nave>();

		ArrayList<Tripulante> listatripulantes = new ArrayList<Tripulante>();

		ArrayList<Flota> listaflotas = new ArrayList<Flota>();

		// bucle su pulso 0 se acaba
		while (!salir) {
			System.out.println("--------------Menú de la Galaxia--------------");
			System.out.println("1-Alta de nave");
			System.out.println("2-Alta de tripulante");
			System.out.println("3-Alta de flota ");
			System.out.println("4-Consultar nave");
			System.out.println("5-Consultar flota");
			System.out.println("6-salir");

			System.out.println("introduzca opción:");
			opcion = teclado.nextInt();

			/// menu
			switch (opcion) {

			case 1:
				System.out.println("introduzca nombre de la nave");
				teclado.nextLine();
				nave = teclado.nextLine();
				// añado al arraylist
				listanaves.add(new Nave(nave, listatripulantes));
				break;
			case 2:

				System.out.println("ntroduzca nombre de la nave donde desea dar de alta al tripulante:");
				teclado.nextLine();
				nave = teclado.nextLine();
				System.out.println("introduzca el nombre del tripulante para la nave " + nave + ":");
				nombretripulante = teclado.nextLine();
				System.out.println("ntroduzca la edad del nuevo tripulante:");
				edad = teclado.nextInt();
				System.out.println("ntroduzca su rango (Soldado, Capitan, Comandante):");
				teclado.nextLine();
				rango = teclado.nextLine();

				listatripulantes.add(new Tripulante(nombretripulante, edad, rango));

				break;
			case 3:
				System.out.println("introduzca nombre para su flota:");
				teclado.nextLine();
				flota = teclado.nextLine();
				String salir2 = "";

				listaflotas.add(new Flota(flota, listanaves));

				System.out.println("introduzca nombre de nave para añadir a la flota " + flota);
				nave = teclado.nextLine();
				salir2 = nave;
				System.out.println("a nave " + nave + " se añade a la flota " + flota);

				break;

			case 4:
				System.out.println("introduzca el nombre de la nave");
				teclado.nextLine();
				nave = teclado.nextLine();
				String nombre_devuelto = "";
				nombre_devuelto = nave;
				// creo una variable auxiliar
				Nave buscar;
				// buscar nave
				Iterator iter4 = listanaves.iterator();
				while (iter4.hasNext()) {
					buscar = (Nave) iter4.next();
					nombre_devuelto = buscar.get_nombre();
					if (nave.equalsIgnoreCase(buscar.get_nombre())) {
						buscar.get_nombre();
						System.out.println(" existe " + nave);
						break;
					}

				}

				break;
			case 5:
				System.out.println("introduzca el nombre de la flota");
				teclado.nextLine();
				flota = teclado.nextLine();
				String flota_devuelta = "";
				flota_devuelta = flota;
				// creo una variable auxiliar
				Flota buscarflota;
				/// buscar flota
				Iterator iter5 = listaflotas.iterator();
				while (iter5.hasNext()) {
					buscarflota = (Flota) iter5.next();
					flota_devuelta = buscarflota.get_nombre();
					if (flota.equalsIgnoreCase(buscarflota.get_nombre())) {
						buscarflota.get_nombre();
						System.out.println(" existe " + flota);
						break;
					}

				}

				break;

			case 6:
				salir = true;
				break;
			default:
			}

		}
	}

}
