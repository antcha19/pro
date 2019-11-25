package entrega2;

import java.util.*;
public class ejercicio44 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		    //Declaramos variables
		int altura, i, j, y;
		
		    //preguntamos la distancia
		
		System.out.println("Por favor, introduzca la altura de la X:"); altura = sc.nextInt();
		sc.nextLine();
		// la y es la linea que empieza por la derecha, entonces se resta en
		    y=(altura-1);
		    //iniciamos bucle
		for (i=0;i<altura;i++) {
		for (j=0;j<altura;j++) {
		if ((i==j)||((i+j)==y)) { System.out.print("*");
		} else { System.out.print(" ");
		}
		}
		      //Saltamos de linea
		System.out.print("\n"); }
		}
		        
	

}
