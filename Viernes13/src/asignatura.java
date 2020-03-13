
public class asignatura {
	private String nomasignatura;
	private int duracion;
	private String libro;
	private String profesor;
	private String obligatoria;

	public asignatura(String nomasignatura, int duracion, String libro, String profesor) {
		this.nomasignatura = nomasignatura;
		this.duracion = duracion;
		this.libro = libro;
		this.profesor = profesor;
		if (nomasignatura.equals("programacion")) {
			this.obligatoria = "SI";
		} else {
			this.obligatoria = "NO";
		}
	}

	public void datosasignatura() {
		System.out.println(nomasignatura + " de " + duracion + " con el libro " + libro + " impartida por " + profesor
				+ " y " + obligatoria + " es obligatoria");
	}

	public String get_asignatura() {
		return nomasignatura;
	}
}
