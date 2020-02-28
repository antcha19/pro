package harrypotter;


import java.util.*;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=  new Scanner (System.in);
		
		//variables
		boolean salir = false;
		int opcion =0;
		
		
		
		System.out.println("bienvenido a la biblioteca de hogwarts");
		System.out.println("1.dar de alta un libro");
		System.out.println("2.dar de alta un alumno");
		System.out.println("3.prestar un libro");
		System.out.println("4.devolver un libro");
		System.out.println("5.resumen de la biblioteca");
		System.out.println("9.salir");
		
		opcion = teclado.nextInt();
		
		
		
		
		
		
		
		while(!salir) {
			switch (opcion) {
			case 1:
				
				break;
			case 2:
							
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 9:
				 salir = true;
				break;
			

			default:
				break;
			}
		}
		
		
		
		
	}

}
