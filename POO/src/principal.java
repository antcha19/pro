import java.util.*;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****************ORDENADORES*******************");
		// acciones del programa principal y concretamos la clase ordenador en un objeto
		// llamado ordenador1
		ordenador ordenador1 = new ordenador("i7", 16, 512);
		ordenador ordenador2 = new ordenador("i5", 8, 256);

		// llamanos al metodo encender_ordenador
		ordenador1.encender_ordenador();
		// llamamos al metodo pero con otro pc
		ordenador2.encender_ordenador();

		ordenador1.navegar_internet();
		ordenador1.apagar_ordenador();

		// llamamos a todos los ordenadores creados y la guardamos en otra variable
		int p = ordenador.numerodeordenadores;
		System.out.println("tengo " + p + " ordenadores ");
		
		
		
		System.out.println("****************LAVADORAS*******************");
		// lavadora
		ArrayList<lavadora> listalava = new ArrayList<lavadora>();
		lavadora lavadoras = new lavadora("siemens", 1400, 300, 10);
		lavadora lavadoras1 = new lavadora("Bosch", 1800, 299, 20);
		lavadora lavadoras2 = new lavadora("siemes", 1400, 3, 50);
		lavadora lava;

		listalava.add(lavadoras);
		listalava.add(lavadoras1);
		listalava.add(lavadoras2);
		Iterator lista = listalava.iterator();
		while (lista.hasNext()) {
			lava = (lavadora) lista.next();
			lava.totales();
		}

		// accedo al al valor marca
		String milavadoras = lavadoras.get_marca();
		System.out.println("la primera lavadora es " + milavadoras);
		// modifico al metodo marca por el siguiente nombre
		lavadoras.set_marca("balay");
		String milavadoras1 = lavadoras.get_marca();
		System.out.println("he cambiado la lavadora: " + milavadoras + " por " + milavadoras1);

		System.out.println("los kilos totales son: " + lavadora.get_total());

	}

}
