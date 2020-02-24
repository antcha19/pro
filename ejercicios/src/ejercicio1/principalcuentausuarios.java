package ejercicio1;


import java.util.*;
public class principalcuentausuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creamos los clientes 
		cliente  cl1 = new cliente("antonio", "00001", 20000);
		cliente  cl2 = new cliente("nadal", "00002", 30000);
		cliente  cl3 = new cliente("penelope", "00003", 344000);
		cliente  cl4 = new cliente("pepaaa", "00004", 50000);
		
		
		//coleccion de tipo HashSet
		Set<cliente>clientesbanco= new HashSet<>();	
		
		//agregamos los objetos tipo clientes a la coleccion clientesbancos  
		clientesbanco.add(cl1);
		clientesbanco.add(cl2);
		clientesbanco.add(cl3);
		clientesbanco.add(cl4);
		
		// recorremos la coleccion clientesbancos con el bucle each
		for (cliente cliente : clientesbanco) {
			System.out.println(cliente.get_nombre() + " " +cliente.get_ncuenta() + " " +cliente.get_saldo());
			
		}
	}

}
