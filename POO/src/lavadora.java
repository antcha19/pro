
public class lavadora {

	// atributos
	private String marca;
	private int rpm;
	private int tamano;
	private int kilos;
	static int lista = 0;
	static int total = 0;
	// metodo constructor , mismo nombre que la declaramos en el princial

	public lavadora(String marca, int rmp, int tamano, int kilos) {
		this.marca = marca;
		this.rpm = rmp;
		this.tamano = tamano;
		this.kilos = kilos;
		lista++;
		total = total + kilos;

	}

	public static int get_total() {
		return total;
	}

//	public lavadora(String marca_entrada, int rmp_entrada, int tamano_entrada, int kilos_entrada) {
//		marca = marca_entrada;
//		rpm = rmp_entrada;
//		tamano = tamano_entrada;
//		lista++;
//	}

	// metodos que realizaran acciones
	public void totales() {
		System.out.println("en total hay  " + lista);

	}

	// getter del atributo marca
	public String get_marca() {
		return marca;
	}

	// setter del atributo marca
	public void set_marca(String marca) {
		this.marca = marca;
	}

}
