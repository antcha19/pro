package ejercicio131;

import java.util.*;

public class Restaurante implements Interface_Restaurante {

	private String nombreRes;
	private int telefono;
	private ArrayList<Mesa> listamesas = new ArrayList<Mesa>();

	public Restaurante(String nombreRes, int telefono) {
		this.nombreRes = nombreRes;
		this.telefono = telefono;
		this.listamesas = listamesas;
	}

	public void montarMesa(Mesa m) {
		listamesas.add(m);
	}

	/* busca em el Arraylist de mesas aquella con el NumMesa de m y borrarla */
	public void recogerMesa(Mesa m) {
		Mesa aux;
		int mesaborrar = 0;
		mesaborrar = m.getIdmesa();
		Iterator iter = listamesas.iterator();
		while (iter.hasNext()) {
			aux = (Mesa) iter.next();
			if (mesaborrar == aux.getIdmesa()) {
				listamesas.remove(aux);
				break;
			}
		}

	}

	public void listarMesas() {
		Mesa aux;
		int cuentamesas=0;
		Iterator iter = listamesas.iterator();
		while (iter.hasNext()) {
			aux = (Mesa) iter.next();
			cuentamesas++;
			System.out.println(aux.obtenerDatosMesa());	
		}
		if (cuentamesas == 0) {
			System.out.println("Todas las mesas estan recogidas");
		}
	}

	/*
	 * recorrer el Arraylist de mesas acumulando las facturas de todas ellas. Para
	 * ello, paro cada mesa llamaremos a calcualr_factura
	 */
	public double calcular_caja() {
		double total = 0;

		Mesa aux;
		Iterator iter = listamesas.iterator();
		while (iter.hasNext()) {
			aux = (Mesa) iter.next();
			total = total + aux.calcular_factura();
		}
		return total;

	}
}
