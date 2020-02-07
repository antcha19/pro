package aceptaelreto;

import java.util.*;

public class acepta252 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		String frase = "";
		 String cambio="";

		// ESCRIBE UNA CADENA DE CARACTEeres
	
		
		while (true) {
			frase = teclado.nextLine();
		
			System.out.println(frase);
			if(frase.contentEquals("XXX")) {
				
				break;
			}
			frase = frase.toLowerCase();
			frase = frase.replace(" ", "");
			
			for (int i = frase.length() - 1; i >= 0; i--) {
				//cambia la frase
				cambio = cambio + frase.charAt(i);
		    }
			System.out.println(cambio);
			//compara la frase CAMBIO CON FRASE 
			if(cambio.contentEquals(frase)) {
				System.out.println("SI");
			}else
				System.out.println("NO");
		}
	}

}
