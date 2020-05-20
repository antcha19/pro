
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		ArrayList<Alumno> listaalumno = new ArrayList<Alumno>();
		ArrayList<asignatura> listaasignaturas = new ArrayList<asignatura>();

		int nota = -1;

		// crea un alumno
		Alumno alumno1 = new Alumno("1A", "Antonio", "Yepez", 29, "1DAM");
		listaalumno.add(alumno1);
		// primer metodo
		alumno1.datosalumno();

		// segundo metodo necesita el system.out para imprimir
		Alumno a2 = new Alumno("1B", "Axel", "Antunez", 60, "1DAM");
		listaalumno.add(a2);
		System.out.println(a2.datos_alumno());

		// crea una asignatura
		asignatura asignatura1 = new asignatura("programacion", 256, "La Biblia", "Paco Perez");
		asignatura1.datosasignatura();
		listaasignaturas.add(asignatura1);

		// matricula un alumno de una asignatura
		alumno1.matricular(asignatura1);

		// creo otra asignatura
		asignatura as2 = new asignatura("BBDD", 100, "Libro de Lucia", "Lucia Gimeno");
		listaasignaturas.add(as2);
		a2.matricular(as2);

		// Antonio matriculado de BBDD y programacion , Axel solo pro

		Iterator iter = listaalumno.iterator();
		Alumno alumnoaux;
		while (iter.hasNext()) {
			alumnoaux = (Alumno) iter.next();
			if (alumnoaux.getedad() >= 60) {
				System.out.println(alumnoaux.getnombre() + " es poblacion de riesgo porque tiene " + alumnoaux.getedad()
						+ " años");
			}

		}
		// Antonio va a hcaer el examen de programacion

		while (nota == -1) {
			nota = leer_nota();
		}

		System.out.println("la nota es :" + nota);

		examen e1 = new examen(alumno1, asignatura1, nota);
		
		Alumno aluaux = e1.getAlumno();
		asignatura asigaux = e1.getasignatura();
		System.out.println(aluaux.getnombre()+ "ha sacado " + asigaux.get_asignatura() + " un " + e1.getnota() + " y esta "+ e1.getcalificacion());

	}

	public static int leer_nota() {
		Scanner teclado = new Scanner(System.in);
		int nota = -1;
		System.out.println("dime la nota del examen");
		try {

			nota = teclado.nextInt();
		} catch (Exception e) {
			System.out.println("ha habido problemas con la nota");
		}
		return nota;

	}

}
