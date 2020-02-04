
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//acciones del programa principal y tiene que llamarse igual que la clase ejemple"ordenador"
		ordenador ordenador1 = new ordenador("i7",16,512);
		lavadora lavadoras = new lavadora ("siemes", 1400, 3);
		
		
		
		//llamanos al metodo encender_ordenador
		ordenador1.encender_ordenador();
		ordenador1.navegar_internet();
		ordenador1.apagar_ordenador();
	}

}
