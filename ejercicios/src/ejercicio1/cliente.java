package ejercicio1;

public class cliente {

	private String nombre;
	private String ncuenta;
	private double saldo;

	// constructor
	public cliente(String nombre, String ncuenta, double saldo) {

		this.nombre = nombre;
		this.ncuenta = ncuenta;
		this.saldo = saldo;

	}

	// gettter y setter de nombre
	public String get_nombre() {
		return nombre;
	}

	public void set_nombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	// gettter y setter de ncuenta
	public String get_ncuenta() {
		return ncuenta;
	}

	public void set_ncuenta(String ncuenta) {
		this.ncuenta = ncuenta;
	}

	
	
	// gettter y setter de saldo
	public double get_saldo() {
		return saldo;
	}

	public void set_saldo(double saldo) {
		this.saldo = saldo;
	}

}
