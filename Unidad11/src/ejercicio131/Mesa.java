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
	private int idmesa;
	private ArrayList<Plato> listaplatos = new ArrayList<Plato>();

	public Mesa(int numPersonaMesa, String ubicacion) {
		numMesa ++;
		this.idmesa =numMesa;
		this.numeroMesa = numeroMesa;
		this.numPersonaMesa = numPersonaMesa;
		this.estado =estado.LIBRE;
		this.ubicacion = ubicacion;
		this.listaplatos=listaplatos;

	}
	
	

	public String obtenerDatosMesa() {
	String 	datos = idmesa + " | "+ numPersonaMesa +" | " + ubicacion + " | " +estado; 
		return datos;
	}

	public int getNumMesa() {
		return numMesa;
	}
	
	public int getIdmesa() {
		return idmesa;
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
			
			total = total + aux.getPrecio();
		}
		return total;
	}
	

}
