
//importamos 
import java.util.*;

public class principalrecuperacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		int motos = 0;
		boolean salir = false;

		ArrayList<String> listaclientes = new ArrayList<String>();
		ArrayList<pizza> listapizzas = new ArrayList<pizza>();
		ArrayList<Pedido> listapedidos = new ArrayList<Pedido>();

		System.out.println("BENVENUTTI A LA PIZZERIA DI GUISEPPE!");
		System.out.println("DE  cuentas motos de reparto consta el establecimiento?");
		motos = teclado.nextInt();
		while (!salir) {

			menus();
			opcion = teclado.nextInt();
			if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4 || opcion == 5) {
				switch (opcion) {
				case 1:
					alta(listapizzas);

					break;
				case 2:
					String cliente = "";
					System.out.println("Introduzca nombre del nuevo cliente:");

					cliente = teclado.nextLine();
					teclado.nextLine();
					System.out.println("Un nuevo cliente con nombre " + cliente + "ha sido dado de alta!");
					listaclientes.add(cliente);
					break;
				case 3:
					pedido(listaclientes, listapizzas, listapedidos);

					break;
				case 4:

					break;
				case 5:
					resumen(listaclientes, listapizzas, listapedidos);
					break;
				case 6:
					salir = true;
					System.out.println("Adios");
					break;

				default:
					break;
				}
			}
		}

	}

	public static void menus() {
		System.out.println("------------------------------------");

		System.out.println("1.-dar de alta una pizza en el menu");
		System.out.println("2.-dar de alta un cliente");
		System.out.println("3.-hacer un pedido");
		System.out.println("4.regreso del repartidor");
		System.out.println("5.-listar pedidos");
		System.out.println("6.-Salir");
	}

	public static void alta(ArrayList<pizza> listapizzas) {
		Scanner teclado = new Scanner(System.in);
		int contador = 1;
		String nombre = "";
		int cantidad = 0;
		String ingredientes;
		System.out.println("Creemos una pizza nueva!...");
		System.out.println("Introduzca nombre de la nueva pizza:");
		nombre = teclado.nextLine();
		System.out.println("Introduzca numero de ingredientes:");
		cantidad = teclado.nextInt();
		teclado.nextLine();
		String listaingredientes[] = new String[cantidad];

		for (int i = 0; i < cantidad; i++) {
			System.out.println("Introduzca ingrediente" + contador + "de la pizza : " + nombre);
			ingredientes = teclado.nextLine();
			listaingredientes[i] = ingredientes;
			contador++;
		}
		pizza pizza = new pizza(nombre, cantidad, listaingredientes);
		listapizzas.add(pizza);

	}

	public static void pedido(ArrayList<String> listaclientes, ArrayList<pizza> listapizzas,
			ArrayList<Pedido> listapedidos) {
		Scanner teclado = new Scanner(System.in);
		String cliente1 = "";
		boolean encontrado = false;
		String clienteencontrado = "";
		while (encontrado == false) {
			System.out.println("Introduzca nombre de cliente:");
			cliente1 = teclado.nextLine();
			String aux1;
			Iterator iter = listaclientes.iterator();
			while (iter.hasNext()) {
				aux1 = (String) iter.next();
				if (cliente1.equalsIgnoreCase(cliente1)) {
					encontrado = true;
					System.out.println("existe");
					break;
				}
			}
			if (encontrado == false) {
				System.out.println("no existe");

			}
		}

		// pizza
		boolean encontrado1 = false;
		String nombrepizza = "";
		String pizzaencontrado;
		while (!nombrepizza.equals("salir")) {
			System.out.println("Introduzca nombre de pizza o 'salir' para finalizar el pedido:");
			nombrepizza = teclado.nextLine();
			pizza aux;
			Iterator iter1 = listapizzas.iterator();
			while (iter1.hasNext()) {
				aux = (pizza) iter1.next();
				pizzaencontrado = aux.get_nombre();
				if (nombrepizza.equalsIgnoreCase(pizzaencontrado)) {
					encontrado1 = true;
					System.out.println("existe");
					break;
				}
			}
			if (encontrado1 == false) {
				System.out.println("noexiste");

			}
		}

// pedido realizado

		if (encontrado == true && encontrado1 == true) {
			Pedido presta = new Pedido(cliente1, listapizzas);
			listapedidos.add(presta);
		}

	}

	public static void resumen(ArrayList<String> listaclientes, ArrayList<pizza> listapizzas,
			ArrayList<Pedido> listapedidos) {
		Pedido aux;
		Iterator iter1 = listapedidos.iterator();
		while (iter1.hasNext()) {
			aux = (Pedido) iter1.next();
			aux.mostrarpedido();
		}
		pizza aux11;
		Iterator iter11 = listapizzas.iterator();
		while (iter11.hasNext()) {
			aux11 = (pizza) iter11.next();
			System.out.println(aux11.toString());

		}
	}

}
