package ejercicio124;

public class poligono {

	private punto[] listadopuntos;

	// constructor
	public poligono(punto[] listadopuntos) {
		this.listadopuntos = listadopuntos;
	}

	public void trasladar(int desX, int desY) {
		for (int i = 0; i < listadopuntos.length; i++) {
			listadopuntos[i].setX(listadopuntos[i].getX() + desX);
			listadopuntos[i].setY(listadopuntos[i].getY() + desY);
		}
	}

	public void escalar(int desX, int desY) {

		for (int i = 0; i < listadopuntos.length; i++) {
			listadopuntos[i].setX(listadopuntos[i].getX() * desX);
			listadopuntos[i].setY(listadopuntos[i].getY() * desY);
		}
	}

	public int numVertices() {
		return (this.listadopuntos.length);
	}

	public String toString() {
		String resultado = "";
		for (int i = 0; i < listadopuntos.length; i++) {
			resultado = resultado + "(" + listadopuntos[i].getX() + "," + listadopuntos[i].getY() + ") ";
		}
		return resultado;

	}

}
