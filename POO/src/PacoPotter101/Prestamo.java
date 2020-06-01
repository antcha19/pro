package PacoPotter101;

public class Prestamo {

	private Libro libro;
	private Alumno alumno;
	
	public Prestamo(Alumno alumno, Libro libro ) {
		this.alumno=alumno;
		this.libro=libro;
	}
	
	
	public void libroprestado() {
		System.out.println("\t"+ libro.getTitulo() + " | " + libro.getAutor() +" | "+ libro.getNumpaginas()+ " pags. prestado a: " +
	alumno.getDNI() + " | " + alumno.getNombre() + " | "  + alumno.getEdad() );
	}


	public Libro getLibro() {
		return libro;
	}


	public Alumno getAlumno() {
		return alumno;
	}
	
	
}
