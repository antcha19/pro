
package exacuarentena;




/*errores que falta 
 * con contadores y lo e mayuscula*/

import java.util.*;
import java.io.*;

public class principal115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		ArrayList<String> listacontactos = new ArrayList<String>();

		File examen = new File("salida.txt");
		// variables

		boolean salir = false;
		int opcion = 0;
		String alta = "";
		String baja = "";
		int contador = 0;
		int contador2 =1;
		boolean encontrado = false;

		// creacion del archivo chat.txt
		try {
			examen.createNewFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		//bucle menu
		while (!salir) {
			try {
				menu();
				opcion = leerdato();

				switch (opcion) {
				case 1:
					System.out.println("Introduzca nombre del nueve contact:");
					alta = teclado.next();
					String auxiliar;
					Iterator iter1 = listacontactos.iterator();
					while (iter1.hasNext()) {
						auxiliar = (String) iter1.next();
						if (alta.equalsIgnoreCase(auxiliar)) {
							System.out.println("error en contacto ya existe");
							listacontactos.remove(alta);
							break;
						}

					}
					listacontactos.add(alta);
					contador++;
					System.out.println("Alta realizada con éxito!. Numero de contactos en la agenda:" + contador);
					
					break;
					
				case 2:
					
					System.out.println("introduzca nombre del contacto dar de baja");
					baja = teclado.next();
					String auxiliar2;

					Iterator iter2 = listacontactos.iterator();
					while (iter2.hasNext()) {
						auxiliar2 = (String) iter2.next();
						if (baja.equalsIgnoreCase(auxiliar2)) {
							System.out.println("el contacto existe y sera borrado :Numero de contactos en la agenda:" + contador2);
							encontrado = true;
							listacontactos.remove(baja);
							
							break;
						}
					}
					contador2++;
					if (encontrado == false) {
						System.out.println("ERROR: El contacto no existe en la agenda");
					}
					break;
					
				case 3:
					Iterator iter = listacontactos.iterator();
					while (iter.hasNext()) {
						System.out.println(iter.next());
					}
					break;
				case 4:
					salir = true;
					System.out.println("Gracias por utilizar esta agenda");
					break;

				}

			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {

				System.out.println(e.getMessage());

			}

		}

		// escribir datos en fichero
		try {
			FileWriter contactos = new FileWriter(examen);
		} catch (

		IOException e) {
			System.out.println(e.getMessage());
		}

		try {
			FileWriter contactos = new FileWriter(examen);

			Iterator<String> Iter = listacontactos.iterator();
			String escribiraux;
			while (Iter.hasNext()) {
				escribiraux = (String) Iter.next();
				contactos.write(escribiraux + "\n");
			}
			contactos.close();
		} catch (Exception e) {

		}

	}

	public static int leerdato() throws InputMismatchException, Exception {
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		try {
			opcion = teclado.nextInt();
		} catch (InputMismatchException e) {
			throw new InputMismatchException("dato no numerico");
		}
		if (opcion < 1 || opcion > 4) {
			throw new Exception("Opcion incorrecta solo puedes introducir del 1 al 4");
		}
		return opcion;
	}

	public static void menu() {
		System.out.println("1-dar de alta un contacto de la agenda");
		System.out.println("2-dar de baj un contacto de la agenda");
		System.out.println("3-Listar agenda");
		System.out.println("4-salir");

	}

	
}
