
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// acciones del programa principal y concretamos la clase ordenador en un objeto
		// llamado ordenador1
		ordenador ordenador1 = new ordenador("i7", 16, 512);
		ordenador ordenador2 = new ordenador("i5", 8, 256);

		// llamanos al metodo encender_ordenador
		ordenador1.encender_ordenador();
		ordenador1.navegar_internet();
		ordenador1.apagar_ordenador();

		// llamamos al metodo pero con otro pc
		ordenador2.encender_ordenador();
		//llamamos a todos los ordenadores creados
		ordenador.numerodeordenadores();

		// lavadora
		//ArrayList<lavadora> listalava = new ArrayList<lavadora>();
		lavadora lavadoras = new lavadora("siemens", 1400, 300);
		lavadora lavadoras1 = new lavadora("Bosch", 1800, 299);
		lavadora lavadoras2 = new lavadora("siemes", 1400, 3);
		
		

	}

}
