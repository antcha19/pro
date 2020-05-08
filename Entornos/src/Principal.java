
//importamos las librerias

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaramos Scanner con la varible teclado para poder introducir datos por
		// teclado
		Scanner teclado = new Scanner(System.in);

		// creamos un arralist para guarldarlos
		ArrayList<Ferreteria> listaproductos = new ArrayList<Ferreteria>();

		// variables
		int opcion = 0;
		boolean salir = false;

		// bucle del menu
		while (!salir) {
			System.out.println("Bienvenido a mi ferreteria");
			menu();
			System.out.println("Escribe que opcion quieres ");
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				alta(listaproductos);
				break;
			case 2:
				buscar(listaproductos);
				break;
			case 3:
				ID(listaproductos);
				break;
			case 4:
				comprar(listaproductos);
				break;
			case 5:
				listar(listaproductos);
				break;

			case 6:
				salir = true;
				System.out.println("Gracias, ");
				break;
			}
		}

	}

	public static void menu() {
		System.out.println("---------------------------------------");
		System.out.println("1-Dar de alta un producto");
		System.out.println("2-Buscar un producto  por su nombre");
		System.out.println("3-Buscar un porducto por su ID");
		System.out.println("4-Comprar un producto");
		System.out.println("5-Listar contenido del almacen");
		System.out.println("6-salir");
		System.out.println("----------------------------------------");

	}

	// metodo para poder anadir productos al arralist
	public static void alta(ArrayList<Ferreteria> listaproductos) {
		// declaramos Scanner con la varible teclado para poder introducir datos por
		// teclado
		Scanner teclado = new Scanner(System.in);
		// variables
		String nombre = "";
		int ID = 0;

		System.out.println("Introduce el nombre del producto");
		nombre = teclado.nextLine();
		System.out.println("Introduce la ID del producto comenzando desde 0");
		ID = teclado.nextInt();
		Ferreteria productos = new Ferreteria(nombre, ID);
		listaproductos.add(productos);
		System.out.println("has introducido los productos correctamente");
	}

	public static void listar(ArrayList<Ferreteria> listaproductos) {
		// arrays generico
		Ferreteria auxlistar;
		Iterator iter = listaproductos.iterator();
		while (iter.hasNext()) {
			auxlistar = (Ferreteria) iter.next();
			auxlistar.mostrarproductos();
		}
	}

	public static void buscar(ArrayList<Ferreteria> listaproductos) {

		// declaramos Scanner con la varible teclado para poder introducir datos por
		// teclado
		Scanner teclado = new Scanner(System.in);
		String buscar = "";

		System.out.println("introduce el nombre del producto que quieres buscar");
		buscar = teclado.nextLine();

		Ferreteria auxbuscar;
		String nombrebuscado;

		Iterator iter = listaproductos.iterator();
		while (iter.hasNext()) {
			auxbuscar = (Ferreteria) iter.next();
			nombrebuscado = auxbuscar.getNombre();
			if (nombrebuscado.equals(buscar)) {
				auxbuscar.productobuscado();
			}

		}
	}

	public static void ID(ArrayList<Ferreteria> listaproductos) {

		// declaramos Scanner con la varible teclado para poder introducir datos por
		// teclado
		Scanner teclado = new Scanner(System.in);
		int buscar = 0;

		System.out.println("introduce introduce su ID");
		buscar = teclado.nextInt();

		Ferreteria auxbuscar;
		int IDbuscado;

		Iterator iter = listaproductos.iterator();
		while (iter.hasNext()) {
			auxbuscar = (Ferreteria) iter.next();
			IDbuscado = auxbuscar.getCantidad();
			if (IDbuscado == buscar) {
				auxbuscar.cantidadsolicitada();
			}

		}
	}
	public static void comprar(ArrayList<Ferreteria> listaproductos) {

		// declaramos Scanner con la varible teclado para poder introducir datos por
		// teclado
		System.out.println("Productos que puedes comprar");
		listar(listaproductos);
		Scanner teclado = new Scanner(System.in);
		String nombre="";
		int ID=0;
		String buscar = "";
		boolean existe = false;
		
		
		System.out.println("introduce el nombre del producto que quieres comprar");
		buscar = teclado.nextLine();
  
		Ferreteria auxbuscar;
		Ferreteria auxid;
		String nombrebuscado;
		int idbuscado=0;

		Iterator iter = listaproductos.iterator();
		while (iter.hasNext()) {
			auxbuscar = (Ferreteria) iter.next();
			nombrebuscado = auxbuscar.getNombre();
			
			if (nombrebuscado.equals(buscar)  ) {
				
				System.out.println("el producto existe");
				System.out.println(" posicion"+listaproductos.indexOf(auxbuscar));
				iter.remove();	
			}
			
			
//			if (nombrebuscado.equals(buscar)) {
//				for (int i = 0; i < listaproductos.size(); i++) {
//					System.out.println(listaproductos.get(i));
//
//				}
//			}
		
			

		}
	}

}
