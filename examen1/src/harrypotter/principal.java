package harrypotter;

import java.util.*;



public class principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		// arraylist
		ArrayList<libro> listalibros = new ArrayList<libro>();
		ArrayList<alumno> listaalumnos = new ArrayList<alumno>();

		int opcion = 0;
		boolean salir = false;
		int contlibros = 1;
		int contalumno = 1;

		while (!salir) {

			System.out.println("Bienvenido a la biblioteca de Hogwarts");
			System.out.println("1- Dar de alta un libro ");
			System.out.println("2-Dar de alta a un alumno");
			System.out.println("3-Prestar un libro");
			System.out.println("4-devolver un libro");
			System.out.println("5-Resumen de la biblioteca");
			System.out.println("9-Salir");

			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				String libro;
				String autor;
				int paginas = 0;
				String estado = " ";
				System.out.println("Introduzca titulo del libro numero " + contlibros + " :");
				libro = teclado.next();
				System.out.println("Introduzca su autor:");
				autor = teclado.next();
				System.out.println("Introduzca numero de paginas:");
				paginas = teclado.nextInt();

				libro libros = new libro(libro, autor, paginas, estado);

				listalibros.add(libros);
				System.out.println("Se ha dado de alta el siguiente ejemplar:");
				libros.mostaraltalibro();
				System.out.println();
				contlibros++;
				break;
			case 2:
				String dni;
				String nombre;
				int edad;
				System.out.println("Introduzca DNI del alumno numero " + contalumno + ":");
				dni = teclado.next();
				System.out.println("Introduzca su nombre:");
				nombre = teclado.next();
				System.out.println("Introduzca su edad:");
				edad = teclado.nextInt();

				alumno alumnos = new alumno(dni, nombre, edad);
				listaalumnos.add(alumnos);
				System.out.println("Se ha dado de alta el siguiente alumno:");
				alumnos.mostraralumno();
				System.out.println();

				break;
			case 3:
				System.out.println("Introduzca DNI del alumno:");
				String encontrardni = teclado.next();
				
				alumno alumnoaux2= null;
				
				String dni_devuelto= "";
				Iterator iter5 = listaalumnos.iterator();
				while(iter5.hasNext()) {
					alumnoaux2 = (alumno) iter5.next();
					dni_devuelto = alumnoaux2.get_dni();
				
					
				}
				
				while (alumnoaux2.get_dni() == alumnoaux2.get_dni()) {
					System.out.println("Introduzca titulo del libro a prestar");
					
					break;
				}
				
				
//				// busca identificador
//				System.out.println("¿introduzca el id del billete a cancelar:?");
//				buscar = teclado.nextInt();
//				//creo una variable auxiliar
//				airwyas identificador;
//				
//				int id_devuelto = 0;
//				//iterator para busca el id 
//				Iterator iter5 = listavuelos.iterator();
//				while (iter5.hasNext()) {
//					identificador = (airwyas) iter5.next();
//					id_devuelto = identificador.get_id();
//					if (id_devuelto == buscar) {
//						identificador.todos();
//					}
//				}
//				
	

				

				break;
			case 4:

				break;
			case 5:

				// alumno
				System.out.println("+Clientes dados de alta");
				Iterator iter2 = listaalumnos.iterator();
				alumno alumnoaux;
				while (iter2.hasNext()) {
					alumnoaux = (alumno) iter2.next();
					System.out.println("\t -Alumno de NIF: " + alumnoaux.get_dni() + " y nombre: "
							+ alumnoaux.get_nombre() + " tiene " + alumnoaux.get_edad() + "años");
				}

				// libros
				System.out.println("+Libros dados de alta:");
				Iterator iter = listalibros.iterator();
				libro libroaux;
				while (iter.hasNext()) {
					libroaux = (libro) iter.next();
					System.out.println("\t -" + libroaux.get_titulo() + " escrito por: " + libroaux.get_autor()
							+ " tiene " + libroaux.get_paginas() + " paginas ");
				}
				System.out.println("+Prestamos efectuados");

				System.out.println();
				break;
			case 9:
				salir = true;
				break;

			default:
				break;
			}
		}

		
	}
	

}
