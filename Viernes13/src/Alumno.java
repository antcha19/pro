import java.util.ArrayList;

public class Alumno {

	private String DNI;
	private String nombre;
	private String priape;
	private int edad;
	private String curso;
	private ArrayList<asignatura> listaasignaturas = new ArrayList<asignatura>();

	// metodo constructor
	public Alumno(String DNI, String nombre, String priape, int edad, String curso) {

		this.DNI = DNI;
		this.nombre = nombre;
		this.priape = priape;
		this.edad = edad;
		this.curso = curso;
	}

	// primer metodo
	public void datosalumno() {
		System.out.println(DNI + " : " + nombre + " " + priape + " ," + edad + ", (" + curso + ")");
	}

	// segundo metodo
	public String datos_alumno() {
		return (DNI + " : " + nombre + " " + priape + " ," + edad + ", (" + curso + ")");
	}

	public int getedad() {
		return edad;
	}

	public String getnombre() {
		return nombre;
	}

	public void matricular(asignatura as1) {
		listaasignaturas.add(as1);
		System.out.println(nombre + " se ha matriculado de :  " + as1.get_asignatura());
	}

}
