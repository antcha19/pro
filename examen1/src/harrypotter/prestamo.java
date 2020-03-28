package harrypotter;

public class prestamo {
	
	private alumno alumno;
	private libro libro;
	
	public prestamo(alumno alumno, libro libro) {
		this.alumno=alumno;
		this.libro=libro;
	}
	
	public void libroprestado() {
		System.out.println("prestado a: "+ alumno.get_dni()+ " | " + alumno.get_nombre() +"|" + alumno.get_edad() );
	}
	
	
	 
	

}
