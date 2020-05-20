package ejercicio131;

import java.util.ArrayList;
import java.util.*;

enum Estado{
	LIBRE, OCUPADO
}

public class Mesa  implements Interface_Mesa{

	static int numMesa = 0;
	private int numeroMesa;
	private int numPersonaMesa;
	protected Estado estado;
	private String ubicacion;
	private double factura;
	private ArrayList<Plato> listaplatos = new ArrayList<Plato>();

	public Mesa(int numeroMesa, String ubicacion) {
		numMesa ++;
		this.numeroMesa = numeroMesa;
		this.numPersonaMesa = numPersonaMesa;
		this.estado =estado.LIBRE;
		this.ubicacion = ubicacion;
		this.listaplatos=listaplatos;

	}
	
	

	public String obtenerDatosMesa() {
	String 	datos = numeroMesa + " | "+ numPersonaMesa +" | " + ubicacion + " | " +estado; 
		return datos;
	}

	public int getNumMesa() {
		return numMesa;
	}
	
	public void liberarMesa() {
		this.estado= estado.LIBRE;
	}
	
	public void ocuparMesa() {
		
		this.estado=estado.OCUPADO;
	}
	
	public void pedirPlato(Plato p) {
		listaplatos.add(p);
	}
	
	public void detalle_platos() {
		String resultado="";
		Plato aux;
		
		Iterator iter = listaplatos.iterator();
		while(iter.hasNext()) {
			aux =(Plato) iter.next();
			System.out.println(aux.getNombre());
		}
		
	}
	
	public double calcular_factura() {
		double total= 0;
		Plato aux;
		Iterator iter = listaplatos.iterator();
		while(iter.hasNext()) {
			aux =(Plato) iter.next();
			System.out.println(aux.getPrecio());
			total = total + aux.getPrecio();
		}
		
		return total;
	}
	

}
