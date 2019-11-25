/*
 * Antonio yepez 20112019
 * 
 * Los alumnos de Programación de 1o de DAM de un IES deciden hacerle una bandera a Paco, su
profesor favorito.
Para la confección de la bandera, deciden que el nombre de Paco se repita una y otra vez a lo largo y lo
ancho de dicha tela sagrada, dejando claro su admiración hacia su profesor/líder espiritual. Si el
nombre se corta a mitad de una línea, no importa, contínua en la siguiente línea, así una y otra vez hasta
llegar al final de la bandera.
La empresa textil con la que contactan los alumnos les cobrará 5 € por cada letra, excepto por la P, que
al ser mayúscula, les ocupa 2 cuadrantes y les cobrará 10 €.
El programa comenzará pidiendo en la misma línea las dimensiones de la bandera (mínimo 4x4, Paco
no se merece menos), luego dibujará la bandera cuyos bordes se dibujarán con el símbolo de la ‘@’ y
acabará resumiendo el total de la factura.*/

package examen1;

import java.util.*;

public class ejercicio1 {

	public static void main(String[] args) {
		
		
		//variables
		int filas; 
		int columnas;
		int cont=1;
		int coste=0;
		int costep=0;
		int costea=0;
		int costec=0;
		int costeo=0;
		int nump=0;
		int numa=0;
		int numc=0;
		int numo=0;
		int i=0;
		int j=0;
		
			
		//datos
		do {
				Scanner teclado = new Scanner(System.in);
				System.out.println("Introduzca doemnsiones de la bandera de paco:");		
				filas = teclado.nextInt();
				columnas = teclado.nextInt();
				
				
				
			   if (filas< 4 ) {
					System.out.println("Introduzca x  es inferior a 4");
			   }
			   if (columnas< 4 ) {
					System.out.println("Introduzca y es inferior a 4");
			   } 
		}
		while ((filas  < 4) || (columnas < 4));
	
		
		//rellena primera linea mas dos posiciones
			for ( i=0; i < filas + 2; i++) {					
				 System.out.print("@");
					
				 }
				 System.out.println("");
			  	 
			//rellena el cuerpo de la bandera
				 for(j =0;j < columnas; j++) {
					 System.out.print("@");
					 for ( i=0; i < filas ; i++) {
						 switch(cont) {
						 case 1: System.out.print("P");
						 		 costep+=10;
						 		 nump++;
						 		 break;
						 case 2: System.out.print("a");
						 		 costea+=5;
						 		 numa++;
						 		 break;
						 case 3: System.out.print("c");
						 		 costec+=5;
						 		 numc++;
						 		 break;
						 case 4: System.out.print("o"); 
						 		 costeo+=5;
						         numo++;
						         break;
						 }
						 cont++;
						 if (cont ==5) {
							 cont =1;
						 	}
						 }
					 System.out.println("@");
				 }
				 //rellenar la ultima linea de la bandera
				 for(i=0; i<filas +2; i++) {
					 System.out.print("@");
				 }
				 System.out.println("");
			 
				 //imprimir mensajes con los constes
				 
				 coste= costep+costea+costec+costeo;
				 System.out.println("imprimir esta bandera costaria:" + coste + " € ya que hay que imprimir:");
				 
				 System.out.println(+nump+" letras P por valor de:" + costep + " € ");
				 System.out.println(+numa+" letras a por valor de:" + costea + " € ");
				 System.out.println(+numc+" letras c por valor de:" + costec + " € ");
				 System.out.println(+numo+" letras o por valor de:" + costeo + " € ");
	
				
					
			 
		

	}


}
