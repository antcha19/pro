package PacoPotter101;



import java.util.*;

public class Principal101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		int opcion = 0;
		boolean salir = false;
		ArrayList<Libro> listalibros = new ArrayList<Libro>();
		ArrayList<Alumno> listaalumnos = new ArrayList<Alumno>();
		ArrayList<Prestamo> listaprestamos = new ArrayList<Prestamo>();

		while (!salir) {
			menu();
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				altalibro(listalibros);
				break;
			case 2:
				altaAlumno(listaalumnos);
				break;
			case 3:
				prestar(listalibros, listaalumnos, listaprestamos);
				break;
			case 4:
				devolver(listalibros, listaalumnos, listaprestamos);
				break;
			case 5:
				resumen(listalibros, listaalumnos, listaprestamos);
				break;
			case 9:
				salir = true;
				break;

			default:
				break;
			}

		}

	}

	public static void menu() {
		System.out.println("Bienvenido a la blioteca de hogwarts");
		System.out.println("1.-dar de alta un libro");
		System.out.println("2.-dar de alta un alumno");
		System.out.println("3.-prestar un libro");
		System.out.println("4.devolver un libro");
		System.out.println("5.-resuemn de la blioteca");
		System.out.println("9.-Salir");
	}

	public static void altalibro(ArrayList<Libro> listalibros) {
		Scanner teclado = new Scanner(System.in);
		String titulo = "";
		System.out.println("introduzca titulo del libro numero1:");
		titulo = teclado.nextLine();
		System.out.println("introduzca su autor:");
		String autor = teclado.nextLine();
		System.out.println("intorducaza numero de paginas");
		int numpaginas = teclado.nextInt();
		Libro libros = new Libro(titulo, autor, numpaginas);
		listalibros.add(libros);
		System.out.println("Se ha dado de alta el siguiente ejemplar");

	}

	public static void altaAlumno(ArrayList<Alumno> listaalumnos) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca DNI del alumno numero");
		String dni = teclado.nextLine();
		System.out.println("Introduzca su nombre:");
		String nombre = teclado.nextLine();
		System.out.println("Introduzca su edad:");
		int edad = teclado.nextInt();
		Alumno alumnos = new Alumno(dni, nombre, edad);
		listaalumnos.add(alumnos);
		System.out.println("-Alumno de NIF:" + dni + " y  nombre:" + nombre + " tiene " + edad + " años.");
	}

	public static void prestar(ArrayList<Libro> listalibros, ArrayList<Alumno> listaalumnos,
			ArrayList<Prestamo> listaprestamos) {
		Scanner teclado = new Scanner(System.in);

		boolean encontrado = false;
		String dniencontrado;
		Alumno auxdni = null;
		while (encontrado == false) {
			System.out.println("Introduzca DNI del alumno:");
			String dni = teclado.nextLine();
			Iterator iterdni = listaalumnos.iterator();
			while (iterdni.hasNext()) {
				auxdni = (Alumno) iterdni.next();
				dniencontrado = auxdni.getDNI();
				if (dni.equalsIgnoreCase(dniencontrado)) {
					encontrado = true;
					break;
				} else {
					System.out.println("dni no encontrado");

				}
			}
		}

//parte del libro
		boolean liencontrado = false;
		String libroencontrado;
		Libro auxlibro = null;
		while (liencontrado == false) {
			System.out.println("Introduzca titulo del libro a prestar");
			String libro = teclado.nextLine();
			Iterator iterlibro = listalibros.iterator();
			while (iterlibro.hasNext()) {
				auxlibro = (Libro) iterlibro.next();
				libroencontrado = auxlibro.getTitulo();
				if (libro.equalsIgnoreCase(libroencontrado)) {
					liencontrado = true;
					break;
				} else {
					System.out.println("libro no encontrado");
				}
			}
		}
		if (encontrado == true && liencontrado == true) {
			Prestamo presta = new Prestamo(auxdni, auxlibro);
			listaprestamos.add(presta);
			auxlibro.cambiar_estado();

		}

	}

	public static void devolver(ArrayList<Libro> listalibros, ArrayList<Alumno> listaalumnos,
			ArrayList<Prestamo> listaprestamos) {
		Scanner teclado = new Scanner(System.in);
		boolean encontrado = false;

		String dniencontrado;
		Alumno auxdni = null;
		while (encontrado == false) {
			System.out.println("Introduzca DNI del alumno:");
			String dni = teclado.nextLine();
			Iterator iterdni = listaalumnos.iterator();
			while (iterdni.hasNext()) {
				auxdni = (Alumno) iterdni.next();
				dniencontrado = auxdni.getDNI();
				if (dniencontrado.equalsIgnoreCase(dni)) {
					encontrado = true;
					//break;
				} else {
					System.out.println("dni no encontrado");
					
				}
			}
		}

		boolean liencontrado = false;
		String libroencontrado;
		Libro auxlibro = null;
		while (liencontrado == false) {
			System.out.println("Introduzca titulo del libro a prestar");
			String libro = teclado.nextLine();
			Iterator iterlibro = listalibros.iterator();
			while (iterlibro.hasNext()) {
				auxlibro = (Libro) iterlibro.next();
				libroencontrado = auxlibro.getTitulo();
				if (libroencontrado.equalsIgnoreCase(libro)) {
					liencontrado = true;
					break;
				} else {
					System.out.println("libro no encontrado");
					
				}

			}
		}
		boolean devolucion = false;
		Prestamo auxpres;
		Libro libroaux;
		Alumno dniaux;
		Iterator iterpres = listaprestamos.iterator();
		while (iterpres.hasNext()) {
			auxpres = (Prestamo) iterpres.next();
			dniaux = auxpres.getAlumno();
			libroaux = auxpres.getLibro();
			if (dniaux.getDNI().equals(auxdni.getDNI()) && libroaux.getTitulo().equals(auxlibro.getTitulo())) {
				auxlibro.cambiar_estado();
				listaprestamos.remove(auxpres);
				break;
			}
		}
	}

	public static void resumen(ArrayList<Libro> listalibros, ArrayList<Alumno> listaalumnos,
			ArrayList<Prestamo> listaprestamos) {
		boolean vacioalu = false;
		boolean vaciolibro = false;
		System.out.println("------------------------------");
		System.out.println("Lista libros");
		Libro auxlibro;
		Iterator iter = listalibros.iterator();
		while (iter.hasNext()) {
			vaciolibro = true;
			auxlibro = (Libro) iter.next();
			auxlibro.estado_Libro();
		}
		if (vaciolibro == false) {
			System.out.println("\t" + "La lista de libros esta vacia");
		}

		System.out.println("------------------------------");
		System.out.println("Lista Alumnos");
		Alumno auxalu;
		Iterator iteralu = listaalumnos.iterator();
		while (iteralu.hasNext()) {
			auxalu = (Alumno) iteralu.next();
			auxalu.altaAlumno();
			vacioalu = true;
		}
		if (vacioalu == false) {
			System.out.println("\t" + "La lista de Alumnos  esta vacia");
		}

		System.out.println("------------------------------");
		System.out.println("Lista de prestamos");
		boolean vaciopres = false;
		Prestamo auxpres;
		Iterator iterpres = listaprestamos.iterator();
		while (iterpres.hasNext()) {
			auxpres = (Prestamo) iterpres.next();
			auxpres.libroprestado();
			vaciopres = true;
		}
		if (vaciopres == false) {
			System.out.println("\t" + " la lista de prestamos  esta vacia");
		}
	}

}
