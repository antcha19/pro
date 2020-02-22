package cinepaco;

import java.util.*;
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int opcion_menu=0;
		int idcola=0;
		int numcolas=0;
		HashMap<Integer,Colacine> colas = new HashMap<Integer,Colacine>();
		System.out.println("Bienvenido a Kinepolis, ¿de cuantas salas dispone tu cine?");
		numcolas = s.nextInt();
		for (int i=1; i <= numcolas; i++) { 
			Colacine cola1 = new Colacine();
		 }
		opcion_menu = menu(); 
		while (opcion_menu != 5) {
		switch(opcion_menu) 
		{
		case 1: idcola = solicitud_cola(numcolas);
		encolar_cliente(idcola, colas);
		break;
		case 2: idcola = solicitud_cola(numcolas);
		desencolar_cliente(idcola, colas);
		break;
		case 3: idcola = solicitud_cola(numcolas);
		informacion_sala(idcola, colas);
		break;
		case 4: estado_cine(colas);
		break; 
		}
		opcion_menu = menu();
		}
		System.out.println("Gracias por venir a Kinepolis.");
		}
	
	
		public static int menu() 
		{ 
			int opcion=0;
		Scanner s = new Scanner(System.in); 
		System.out.println("----------- Menu Kinepolis -------------"); 
		System.out.println("1-Encolar cliente en una sala"); 
		System.out.println("2-Desencolar cliente de la sala"); 
		System.out.println("3-Información de una sala"); 
		System.out.println("4-Estado del cine:"); 
		System.out.println("5-Salir");
		opcion = s.nextInt();
		return opcion;
		}
		public static void encolar_cliente(int idcola, HashMap<Integer,Colacine> colas) {
			Colacine c = colas.get(idcola);
		Scanner s = new Scanner(System.in);
		String nombre="";
		int edad=0;
		System.out.println("Introduzca nombre del nuevo cliente para la cola " + idcola +":");
		nombre = s.nextLine();
		System.out.println("Introduzca su edad:");
		edad = s.nextInt();
		Personas pers = new Personas(nombre,edad);
		  
		
		
		
		 
		
		c.anyadirPersona(pers);
		System.out.println("Añadimos a la cola " + idcola + " el cliente " + nombre + " de " + edad + " años.");
		}
		public static void desencolar_cliente(int idcola, HashMap<Integer,Colacine> colas) { 
			System.out.println("Desencolamos al primero de la cola de la sala " + idcola); 
			Colacine c = colas.get(idcola);
		c.quitarPersona();
		}
		public static void informacion_sala(int idcola, HashMap<Integer,Colacine> colas) { 
			System.out.println("La sala " + idcola + " tiene esperando a los siguientes	clientes: ");
		Colacine c = colas.get(idcola);
		c.recorrerCola();
		}
		public static int solicitud_cola(int numcolas) {
		Scanner s = new Scanner(System.in);
		int opcola=0;
		System.out.println("¿Sobre qué sala desea realizar la operación?"); 
		opcola = s.nextInt();
		while (true) {
		if ((opcola >= 1) && (opcola <= numcolas)) {
		break; 
		}
		else {
		System.out.println("Valor de sala introducido erróneo. Introduzca valores desde el 1 hasta el " + numcolas + ":");
		opcola = s.nextInt();
		}
		}
		return opcola; 
		}
		public static void estado_cine(HashMap<Integer,Colacine> colas) { 
			for (int i=1; i <= colas.size(); i++) {
		System.out.println("Clientes de la sala " + i + ":"); 
		Colacine c = colas.get(i);
		c.recorrerCola();
		} 
			


	}

}
