package entrega3POO;

import java.util.Random;

public class luchador {

	private int vida;
	private String luchador;

	Random aleatorio = new Random();

	public luchador(String luchador, int vida) {
		this.vida = vida;
		this.luchador = luchador;

	}

	public luchador inicio(luchador lu) {
		luchador f = new luchador(" ", 0);

		return f;
	}

	public luchador pelea(luchador lu, escenario es) {
		luchador s = new luchador(" ", 0);
		System.out.println("comienza la pelea entre " + luchador + " y " + lu.luchador + " en " + es.get_lugar());
		int contador = 0;
		int vidaactual1 = 0;
		int vidaactual2 = 0;

		while (vidaactual1 <= 0 || vidaactual2 <= 0) {
			int vidaaleatoria1 = (int) (Math.random() * 50 + 1);

			vidaactual1 = vida - vidaaleatoria1;
			if (vidaactual1 < 0) {
				vidaactual1 = 0;
			}
			System.out.println(luchador + " golpea a " + lu.luchador + " con una intensidad de " + vidaaleatoria1 + " "
					+ luchador + vidaactual1 + "-" + lu.luchador + vida);
			vidaactual1 = vidaactual1;
			
			
			vidaaleatoria1 = (int) (Math.random() * 50 + 1);
			vidaactual2 = vida - vidaaleatoria1;
			if (vidaactual2 < 0) {
				vidaactual2 = 0;
			}
			System.out.println(lu.luchador + " golpea a " + luchador + " con una intensidad de " + vidaaleatoria1 + " "
					+ luchador + vidaactual1 + "-" + lu.luchador + vidaactual2);
			
		}

		return s;

	}

}
