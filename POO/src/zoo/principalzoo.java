package zoo;

import java.util.*;

public class principalzoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		ArrayList<animales> listaanimal = new ArrayList<animales>();
		
		
		String tipo = "";
		String nombre="";
		int peso = 0;
		animales animal = new animales(tipo,nombre,peso);
		
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

				// llama al metodo numerico
			//	numerico(opcion);
				// nonumerico(opcion);
				switch (opcion) {
				case 1:
					
					System.out.println("Introduzca el tipo de animal (l-leon, t-tigre):");
					tipo = teclado.next();
					
					System.out.println("Introduzca el nombre del animal (Sin incluir numeros!)");
					nombre = teclado.next();
					System.out.println("Introduzca el peso del animal:");
					peso = teclado.nextInt();
					listaanimal.add(animal);
				

					break;
				case 2:

					break;
				case 3:

					break;
				case 4:
					
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

	public static void numerico(int num) throws Exception {
		Scanner teclado = new Scanner(System.in);
		teclado.nextInt(); 
		if (num < 1 || num > 5) {
			throw new Exception("Solo puedes introducir numeros del 1 al 5");
		}
	}

	public static void nonumerico(int num) throws InputMismatchException { 
	    
		Scanner teclado = new Scanner(System.in);
		
		teclado.nextInt(); 
		throw  new InputMismatchException("haz introducido un dato no numero");
	  
	  }

	public static void tipoanimal(String tipo) throws Exception {
		Scanner teclado = new Scanner(System.in);
		teclado.nextInt();
		if (tipo == "l" || tipo == "t") {
			throw new Exception("ERROR: Esto no es ni un tigre ni un leon!");
		}
	}

	
}
