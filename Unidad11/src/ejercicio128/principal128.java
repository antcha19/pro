package ejercicio128;

public class principal128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Declare y cree un array de 4 vehículos */
		vehiculo[] listavehiculos = new vehiculo[4];

		/* Cree 2 camiones y 2 coches y los añada al array */
		coche coche1 = new coche("1234a", 5);
		coche coche2 = new coche("asdfase2", 2);

		// camiones no tiene numero de pertas en el constructor
		camion camion1 = new camion("sadfa4");
		camion camion2 = new camion("sadfa4");

		listavehiculos[0] = coche1;
		listavehiculos[1] = coche2;
		camion cam1 = new camion("CCCC1");
		camion cam2 = new camion("DDDD2");
		remolque remol = new remolque(5000);
		cam1.ponRemolque(remol);
		cam2.ponRemolque(remol);
		listavehiculos[2] = cam1;
		listavehiculos[3] = cam2;

		for (int i = 0; i < listavehiculos.length; i++) {
			System.out.println(listavehiculos[i].toString());
		}
		System.out.println("----");
		try {
			listavehiculos[0].acelerar(120);
			listavehiculos[1].acelerar(120);
			listavehiculos[2].acelerar(90);
			listavehiculos[3].acelerar(90);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		camion camaux = (camion) listavehiculos[3];
		camaux.quitaRemolque();
		listavehiculos[3] = camaux;

		for (int i = 0; i < listavehiculos.length; i++) {
			System.out.println(listavehiculos[i].toString());
		}
		System.out.println("----");

		try {
			listavehiculos[2].acelerar(20);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
