package zoo;

import java.util.*;

public class principalzoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		ArrayList<animales> listaanimal = new ArrayList<animales>();

		int opcion = 0;

		boolean salir = false;

		while (!salir) {

			System.out.println("bienvenido al ZOO tigres & Leones");
			System.out.println("---------------------------------");
			System.out.println("1.Dar de alta animal");
			System.out.println("2.Dar de baja animal");
			System.out.println("3.modificar peso");
			System.out.println("4.Listado animales");
			System.out.println("5.salir");
			try {

				opcion = teclado.nextInt();

				switch (opcion) {
				case 1:

					anadir(listaanimal);

					break;
				case 2:
					baja(listaanimal);
					break;
				case 3:
					modificar(listaanimal);
					break;
				case 4:
					listado(listaanimal);
					break;
				case 5:
					salir = true;
					break;
				default:
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void anadir(ArrayList<animales> listaanimal) throws Exception {
		Scanner teclado = new Scanner(System.in);
		char tipo = ' ';
		String nombre = "";
		int peso = 0;
		System.out.println("Introduzca el tipo de animal (l-leon, t-tigre):");
		try {
			tipo = leertipoanimal();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Introduzca el nombre del animal (Sin incluir numeros!)");
		nombre = teclado.next();
		System.out.println("Introduzca el peso del animal:");
		peso = teclado.nextInt();
		animales animal = new animales(tipo, nombre, peso);
		listaanimal.add(animal);
		System.out.println("Has dado de alta a " + nombre);

	}

	public static void baja(ArrayList<animales> listaanimal) {
		Scanner teclado = new Scanner(System.in);
		String baja = "";
		String bajaguardado = "";
		boolean existe = false;
		System.out.println("Introduzca el nombre del animal para dar de baja:");
		baja = teclado.nextLine();
		for (animales aux : listaanimal) {
			bajaguardado = aux.get_nombre();
			System.out.println(bajaguardado);
			if (aux.get_nombre().equals(baja)) {
				existe = true;
				System.out.println("existe");
				System.out.println("Animal de nombre " + aux.get_nombre() + " dado de baja ");
				listaanimal.remove(aux);
				break;
			}
		}
		if (existe == false) {
			System.out.println("No existe");
		}
	}

	public static void modificar(ArrayList<animales> listaanimal) {
		Scanner teclado = new Scanner(System.in);
		String nombre = "";
		int peso = 0;
		boolean existe = false;
		System.out.println("Introduzca el nombre del animal para modificar el peso:");
		nombre = teclado.nextLine();
		for (animales auxmodi : listaanimal) {
			if (auxmodi.get_nombre().equalsIgnoreCase(nombre)) {
				existe = true;
				System.out.println("Introduzca el nuevo peso para Simba:");
				peso = teclado.nextInt();
				auxmodi.setPeso(peso);
				break;
			}
		}
		if (existe == false) {
			System.out.println("no existe");
		}

	}

	public static void listado(ArrayList<animales> listaanimal) {
		for (animales auxmostar : listaanimal) {
			System.out.println(auxmostar);
		}
	}

	public static void numerico(int num) throws Exception {
		Scanner teclado = new Scanner(System.in);
		teclado.nextInt();
		if (num < 1 || num > 5) {
			throw new Exception("Solo puedes introducir numeros del 1 al 5");
		}
	}

	public static int nonumerico() throws InputMismatchException {

		Scanner teclado = new Scanner(System.in);

		teclado.nextInt();
		throw new InputMismatchException("haz introducido un dato no numero");

	}

	public static char leertipoanimal() throws Exception {
		Scanner teclado = new Scanner(System.in);
		char tipo = teclado.nextLine().charAt(0);
		if ((tipo != 't') && (tipo != 'l')) {
			throw new Exception("ERROR: Esto no es ni un tigre ni un leon!");
		}
		return tipo;
	}

}
