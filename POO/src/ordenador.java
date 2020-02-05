
public class ordenador {

	// atributos del ordenador
	private String procesador;
	private int ram;
	private int disco;
	static int numerodeordenadores = 0;

	// metodo constructor mismo nombre que la clase en este caso "ordenador"
	public ordenador(String procesadorentrada, int ram_entrada, int disco_entrada) {
		procesador = procesadorentrada;
		ram = ram_entrada;
		disco = disco_entrada;
		numerodeordenadores++;
	}

	// metodos que realizaran acciones
	public void encender_ordenador() {
		System.out.println("encendemos el ordenador con procesador" + procesador + " y memoria " + ram
				+ " GB y disco de " + disco + "Gb");
	}

	public void navegar_internet() {
		System.out.println("navego por internet");
	}

	public void apagar_ordenador() {
		System.out.println("apago el ordenador");
	}
	// preguntar por que estatico
	public  static void numerodeordenadores() {
		System.out.println("de momento hemos creado " + ordenador.numerodeordenadores + " ordenadores");
	}
}
