package casa;


import java.util.*;
public class casa1 {

	public static void main(String[] args) {
		 //reforzando hacer un bucle 
		Scanner teclado =new Scanner(System.in);
		
		
		int i=0;
		int numero;
		System.out.println("introduce numero");
		numero = teclado.nextInt();
		
	
		do {
			System.out.println(i);
			//suma en contador en 3 en 3 ese valor se puedo cambiar
			i +=3;
			
			//el bucle terminara mientrar i sea menor que el numero introducido
		}while(i<=numero);

	}

}
