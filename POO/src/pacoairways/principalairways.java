package pacoairways;

import java.util.*;

public class principalairways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		ArrayList<airwyas> listavuelos = new ArrayList<airwyas>();

		boolean salir = false;
		String billete = "";
		int id = 1;
		int opcion;
		char cancelar;
		char estado;
		int buscar;

		while (!salir) {

			System.out.println("1.comprar billete de avion");
			System.out.println("2.cancelar billete de avion");
			System.out.println("3.estado de mi reserva");
			System.out.println("5.salir");

			System.out.println("Escribe una de las opciones");
			opcion = teclado.nextInt();
			teclado.nextLine();

			switch (opcion) {
			case 1:
				System.out.println("introduzca origen, destino, dia de ida y dia de vuelta separados por @:");

				billete = teclado.nextLine();

				String[] parte = billete.split("@");
				String origen = parte[0];
				String destino = parte[1];
				String ida = parte[2];
				String vuelta = parte[3];

				// creo y lo guardo
				airwyas vuelos = new airwyas(id, origen, destino, ida, vuelta);
				airwyas aux;
				id++;
				listavuelos.add(vuelos);

				break;
			case 2:

				// busca identificador
				System.out.println("¿introduzca el id del billete a cancelar:?");
				buscar = teclado.nextInt();

				airwyas identificador;
				int id_devuelto = 0;
				Iterator iter5 = listavuelos.iterator();
				while (iter5.hasNext()) {
					identificador = (airwyas) iter5.next();
					id_devuelto = identificador.get_id();
					if (id_devuelto == buscar) {
						identificador.todos();
					}
				}

				System.out.println("vuelo encontrado, confirma su cancelacion(S/N)");
				cancelar = teclado.next().charAt(0);
				if (cancelar == 's' || cancelar == 'S') {
					Iterator iter6 = listavuelos.iterator();
					while (iter6.hasNext()) {
						identificador = (airwyas) iter6.next();
						id_devuelto = identificador.get_id();
						if (id_devuelto == buscar) {
							identificador.cancelacion();
						}
					}
				}
				if (cancelar == 'n' || cancelar == 'N') {

				}
				break;
			case 3:

				System.out.println("que vuelos desa ver? (V-vigentes, C-cancelados, T-todos)");
				estado = teclado.next().charAt(0);
				if (estado == 't' || estado == 'T') {

					Iterator iter = listavuelos.iterator();
					while (iter.hasNext()) {
						aux = (airwyas) iter.next();
						aux.todos();
					}
				}
				if (estado == 'v' || estado == 'V') {
					Iterator iter1 = listavuelos.iterator();
					while (iter1.hasNext()) {
						aux = (airwyas) iter1.next();
						aux.mostarvigente();
					}
				}
				if (estado == 'C' || estado == 'c') {
					Iterator iter2 = listavuelos.iterator();
					while (iter2.hasNext()) {
						aux = (airwyas) iter2.next();
						aux.mostarcancelacion();
					}
				}

				break;

			case 5:
				salir = true;
				break;
			default:

			}

		}

	}

}
