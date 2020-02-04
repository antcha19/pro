
public class ordenador {

	

		
		//atributos del ordenador
		private String procesador;
		private int ram;
		private int disco;
		
		// metodo constructor mismo nombre que la clase en este caso "ordenador"
		public ordenador (String procesadorentrada, int ram_entrada, int disco_entrada){
			procesador = procesadorentrada;
			ram = ram_entrada;
			disco = disco_entrada;
		}
		
		//metodos que realizaran acciones
		public void encender_ordenador() {
			System.out.println("encendemos el ordenador con procesador procesador " + " y memoria " + ram + " GB y disco de "
					+ disco + "Gb");
		}
		public void navegar_internet() {
			System.out.println("navego por internet");
		}
		public void apagar_ordenador() {
			System.out.println("apago el ordenador");
		}
	}

