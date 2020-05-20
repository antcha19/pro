package ejercicio131;

public class Reserva {
	
	private String fecha;
	private int hora;
	private int numPersoReserva;
	private Cliente cliReserva;
	private Mesa mesa;
	
	public Reserva(String fecha, int hora, int numPersoReserva, Mesa mesa , Cliente cliReserva) {
		this.fecha=fecha;
		this.hora=hora;
		this.numPersoReserva=numPersoReserva;
		this.cliReserva=cliReserva;
		this.mesa=mesa;
		if(this.mesa == this.mesa) {
			mesa.ocuparMesa();
		}
		
	}
	
	
	
	
	

}
