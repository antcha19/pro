
import java.util.*;

public class ListaDesayuno {

	private ArrayList<Bolleria> listaingredientes = new ArrayList<Bolleria>();

	public ListaDesayuno() {
		this.listaingredientes = listaingredientes;
	}

	public void anyadir_bollo(Bolleria b) {
		listaingredientes.add(b);
	}

	public String toString() {
		Bolleria aux = null;
		String resultado="";
		double precio=0;
		Iterator iter = listaingredientes.iterator();
		while (iter.hasNext()) {
			aux = (Bolleria) iter.next();
			resultado = resultado + aux.toString() + "\n";
			precio = precio + aux.getPrecio() ;
		}
		return resultado +" el precio"+ precio;
	}
}
