package pizza;

import java.util.*;
public class principalpizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pizza pizza1 = new pizza("margarita", "mediana");
		System.out.println(pizza1.estado_pizza());
		pizza pizza2 = new pizza("hawaiana", "familiar");
		System.out.println(pizza2.estado_pizza());
		pizza pizza3 = new pizza("3 quesos", "familiar");
		System.out.println(pizza3.estado_pizza());
		
		System.out.println(pizza.cantidadpizza);
		
		pizza1.servir();
		System.out.println(pizza1.estado_pizza());
		pizza1.servir();
	
		System.out.println(pizza.cantidadpizza);
		System.out.println(pizza.totalservidas);
		
		
		
	}

}
