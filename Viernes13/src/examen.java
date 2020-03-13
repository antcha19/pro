import java.util.*;

public class examen {

	private Alumno Alumno;
	private asignatura asignatura;
	private int nota;
	private String calificacion;

	// metodo constructor
	public examen(Alumno Alumno, asignatura asignatura, int nota) {
		this.Alumno = Alumno;
		this.asignatura = asignatura;
		this.nota = nota;
		if (nota < 5) {
			this.calificacion="Suspendido";
		} else {
			this.calificacion="Aprobado";
		}
	}
	
	public Alumno getAlumno() {
		return Alumno;
	}
	public asignatura getasignatura() {
		return asignatura;
	}
	public int getnota() {
		return nota;
	}
	public String getcalificacion() {
		return calificacion;
	}
}
