package ejercicio122;

public class interino extends profesor{

	private String tipo;
	private int duraciondias;
	
	public interino(String nombre, String DNI, int edad, String residencia,int sueldo, String centro,String lugartrabajo,String tipo,int duraciondias) {
		super(nombre,DNI,edad,residencia,sueldo,centro,lugartrabajo);
		this.tipo=tipo;
		this.duraciondias=duraciondias;
	}

	
	
	/* además de un método al que nos devolverá, teniendo en cuenta los
	 días de baja, los meses que estará trabajando el profesor interino, tomando como referencia que
	 1 mes tiene 30 días.*/
	public int numero_meses() {
		return(duraciondias / 30);
	}
	
	
	//getters
	public String getTipo() {
		return tipo;
	}
	
	public int getDuraciondias() {
		return duraciondias;
	}

	
	//setters
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setDuraciondias(int duraciondias) {
		this.duraciondias = duraciondias;
	}
	

	
}
