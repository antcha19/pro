package cinepaco;

import java.util.*;

public class Colacine {

	private Queue<Personas> lista_clientes = new LinkedList<Personas>();
	static int num_clientes = 0;

	public Colacine() {
		num_clientes++;

	}

	public void recorrerCola() {
		Iterator iter = lista_clientes.iterator();
		Personas pers;
		while (iter.hasNext()) {
			pers = (Personas) (iter.next());
			pers.imprimir_persona();
		}
	}

	public void anyadirPersona(Personas p) {
		lista_clientes.add(p);
	}

	public void quitarPersona() {
		lista_clientes.remove();
	}
}
