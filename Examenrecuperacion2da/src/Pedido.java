import java.util.ArrayList;
import java.util.Iterator;

public class Pedido {

		static int idpedido;
	   private String nombre;
	   private  ArrayList<pizza> listapizzas;
	   
	   public Pedido(String nombre, ArrayList<pizza> listapizzas) {
		   this.nombre=nombre;
		   this.listapizzas= listapizzas;
		   idpedido++;
	   }
	   
	  

	public String getNombre() {
		return nombre;
	}



	 public ArrayList<pizza> getlista() {
		 return listapizzas;
	 }
	public void mostrarpedido() {
		pizza aux = null;
		Iterator iter1 = listapizzas.iterator();
		while (iter1.hasNext()) {
			aux = (pizza) iter1.next();
			aux.get_nombre();			
		}
		System.out.println("Cliente " + nombre +  " ha pedido " + aux.get_nombre());
	}

	
	   
	   
}

