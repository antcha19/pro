/*
 * antonio yepez 08112019
 */


package unidad5;
import java.util.*;
public class acepta368 {

	public static void main(String[] args) {
		//variables
		Scanner teclado = new Scanner (System.in);
		int huevo=0;
		int olla=0;
		int tiempo=0;
		

		do {
			huevo = teclado.nextInt();
			olla = teclado.nextInt();
			
			if (olla==0 && huevo ==0) {			//ola y huevo es iguala cero termina el progrma
				break;
			}
			else 
				tiempo=huevo/olla;		
			System.out.println(tiempo);
			 if (olla%huevo ==0 ) 
				
				System.out.println(tiempo*10);
				else 
					System.out.println((tiempo+1)*10);
			
			}while (huevo > 0 && olla > 0);

	
	}

}
