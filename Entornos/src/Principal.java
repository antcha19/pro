/*Este programa  utlizamos Porgramacion orientada a objetos. Utilizamos excepciones para solucionar y que nos nuestro los errors
 * He simulado una ferreteria y este seria su menu  
  * 1-Dar de alta un producto
     Damos de alta un producto , tenemos que intorducir su nombre y su identificar que a su vez lo guar damos en un arraylist
    2-Buscar un producto  por su nombre
    Aqui lo que hacemos es buscar  el producto guardado en el arraylist , tendremos que recorrer todo el arraylist y comparar con 
    el producto introducido
	3-Buscar un producto por su ID
	En este punto lo buscamos por su ID 
	4-Comprar un producto
	aqui lo que hacemos es simular que compramos , si el producto se elimima del arraylist
	5-Listar contenido del almacen"
	6-salir;*/

//importamos las librerias
import java.util.*;
import java.io.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * declaramos Scanner con la varible teclado para poder introducir datos por
		 * teclado
		 */
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
			try {
				opcion = Errores();

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
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {

				System.out.println(e.getMessage());

			}

		}

	}

	// codigo del menu
	public static void menu() {
		System.out.println("---------------------------------------");
		System.out.println("1-Dar de alta un producto");
		System.out.println("2-Buscar un producto  por su nombre");
		System.out.println("3-Buscar un producto por su ID");
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
	//listamos todo los datos introducidos
	public static void listar(ArrayList<Ferreteria> listaproductos) {
		// arrays generico
		Ferreteria auxlistar;
		Iterator iter = listaproductos.iterator();
		while (iter.hasNext()) {
			auxlistar = (Ferreteria) iter.next();
			auxlistar.mostrarproductos();
		}
	}

	// metodo para poder productos al arralist
	public static void buscar(ArrayList<Ferreteria> listaproductos) {

		// declaramos Scanner con la varible teclado para poder introducir datos por
		// teclado
		Scanner teclado = new Scanner(System.in);
		String buscar = "";

		System.out.println("introduce el nombre del producto que quieres buscar");
		buscar = teclado.nextLine();

		Ferreteria auxbuscar;
		String nombrebuscado;
		boolean encontrado = false;
		Iterator iter = listaproductos.iterator();
		while (iter.hasNext()) {
			auxbuscar = (Ferreteria) iter.next();
			nombrebuscado = auxbuscar.getNombre();
			if (nombrebuscado.equals(buscar) == true) {
				encontrado = true;
				auxbuscar.productobuscado();
			}

		}
		// validamos si existe o no
		if (encontrado = true) {

		} else {
			System.out.println("No existe");
		}

	}

	public static void ID(ArrayList<Ferreteria> listaproductos) {

		// declaramos Scanner con la varible teclado para poder introducir datos por
		// teclado
		Scanner teclado = new Scanner(System.in);
		int buscar = 0;
		boolean encontrado = false;
		try {
			System.out.println("introduce introduce su ID");
			buscar = teclado.nextInt();

			Ferreteria auxbuscar;
			int IDbuscado;

			Iterator iter = listaproductos.iterator();
			while (iter.hasNext()) {
				auxbuscar = (Ferreteria) iter.next();
				IDbuscado = auxbuscar.getCantidad();
				if (IDbuscado == buscar) {
					encontrado = true;
					auxbuscar.cantidadsolicitada();
				}

			}
			// validamos si existe o no
			if (encontrado == true) {

			} else {
				System.out.println("El producto no existe");
			}
		} catch (InputMismatchException e) {
			System.out.println("introducide solo numeros");
		}

	}

	public static void comprar(ArrayList<Ferreteria> listaproductos) {

		// declaramos Scanner con la varible teclado para poder introducir datos por
		// teclado
		System.out.println("Productos que puedes comprar");
		listar(listaproductos);
		Scanner teclado = new Scanner(System.in);
		String nombre = "";
		int ID = 0;
		String buscar = "";
		boolean existe = false;

		System.out.println("introduce el nombre del producto que quieres comprar");
		buscar = teclado.nextLine();

		// recorremos el arraylist para buscar el producto y si existe lo borra
		Ferreteria auxbuscar;
		Ferreteria auxid;
		String nombrebuscado;
		int idbuscado = 0;
		boolean encontrado = false;
		Iterator iter = listaproductos.iterator();
		while (iter.hasNext()) {
			auxbuscar = (Ferreteria) iter.next();
			nombrebuscado = auxbuscar.getNombre();

			if (nombrebuscado.equals(buscar)) {
				encontrado = true;

				// imprimimos para comprobar si exite el producto
				System.out.println(" posicion" + listaproductos.indexOf(auxbuscar) + " si la posicion es 0 es porque el producto existe ");
				iter.remove();
				break;
			}
			if (encontrado == true) {

			} else {
				System.out.println("El producto no existe");
			}

		}

	}

	// nos obliga a introducir numeros del 1 al 6 y solo datos numericos
	public static int Errores() throws InputMismatchException, Exception {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Eliga una opcion");
		int opcion = 0;
		try {
			opcion = teclado.nextInt();
		} catch (InputMismatchException e) {
			throw new InputMismatchException("dato no numerico");
		}
		if (opcion < 1 || opcion > 6) {
			throw new Exception("Opcion incorrecta solo puedes introducir del 1 al 6");
		}
		return opcion;
	}

}
