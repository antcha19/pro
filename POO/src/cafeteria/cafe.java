package cafeteria;

public class cafe {

	// atributos
	private int maximo;
	private int disponible;

	public cafe(int cafe) {

		this.disponible = 0;
		this.maximo = cafe;
	}

	public void llenarcafetera() {
		this.disponible = maximo;
		System.out.println("la cafetera esta llena, hay disponibles " + maximo);

	}

	public void servirtaza(int cantidadsolicitada) {
		if (disponible == 0) {
			System.out.println("no te puedo servir por que la cafetera esta vacia ");
		}
		if (cantidadsolicitada > disponible) {
			System.out.println("lo siento mucho solo habia " + disponible);
			// disponible= 0;
		} else {
			disponible = disponible - cantidadsolicitada;
			System.out
					.println("servimos una taza de " + cantidadsolicitada + "cl y quedan en la cafetera " + disponible);
		}

	}

	public void agregarcafe(int solicitarcafe) {

		int posible = disponible + solicitarcafe;
		if (posible >= disponible) {
			System.out.println("La cantidad_actual es: " + disponible + "cl. en una cafetera de: " + disponible
					+ "cl. No se puede agregar " + solicitarcafe + "cl. porque desbordaría la cafetera!");
		} else {
			disponible += solicitarcafe;
			System.out.println("Agregamos " + solicitarcafe + "cl. y quedan en la cafetera " + disponible + "cl.");
		}
	}

	public void vaciarcafetera() {
		disponible = 0;
		System.out.println("cafeteria vacia");
	}

}
