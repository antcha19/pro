/*
 * antonio yepez 06112019
 */
package entrega2;

import java.util.*;

public class ejercicio61 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in); //teclado
		Random aleatorio = new Random();	  // aleatorio
		//variables 
		int opcion=0;
		int tamano=0;
		int numero=0;
	
		int posicion_vector=0;
		
		System.out.println("Tamaño del vector ");
    	tamano = teclado.nextInt();						//introduce el el tamono del vector
    	
    	// variables del vector
    	int[] vector = new int [tamano];
  
		
    	
    			//menu
        
			while(opcion !=9) {
				System.out.println("------------------------- pulse una opcion del menu---------------");
		   		   System.out.println("1. rellenar vector por teclado");
		           System.out.println("2. rellenar vector de forma aleatoria (numers de 1 a 100)");
		           System.out.println("3. modificar una posicion del vector");
		           System.out.println("4. consultar una posicion del vector");
		           System.out.println("5. mostrar todo el vector");
		           System.out.println("6. ordenar ascendentemente el vector ");
		           System.out.println("9. Salir");
    	
         
    	   opcion = teclado.nextInt();
       
        switch(opcion){
            case (1):
                   for(int i=0;i < vector.length ; i++) {
            			System.out.println("introduzca valor " + (i+1) + " de " + tamano );
            			vector[i]= teclado.nextInt();
                   }
			   	  break;
            case (2):
	            
	            	for (int i=0;i < vector.length;i++) {
	            	  numero = aleatorio.nextInt(100)+1;
	            	  vector [i] = numero; 
	            	  }
                		break;
            case (3):
	            	System.out.println("introduzca una posicon del vector0..n-1");
            		posicion_vector =teclado.nextInt();
	            	if(posicion_vector > (vector.length -1)) {
	            		System.out.println("posicion no encontrada en el vector");
	            	} 
	            	else {
	            	System.out.println("que valor quiere introducir en la poscion" + posicion_vector + "?");
	            	vector[posicion_vector]=teclado.nextInt();
	            	}
	                break;
            case (4):
            	System.out.println("introduzca la posicion");
            	posicion_vector=teclado.nextInt();
            	System.out.println(vector[posicion_vector]);
            	
                break;
            case (5):
	            	 System .out.println("[");
	            	  for (int i=0; i < vector.length; i++) {
	            		  if (i==(vector.length -1 )) {
	           			  System .out.print(vector[i]);
	           			 }
	            		  else {
	           			 System .out.println(vector[i] + ", ");	
	            		  }
	            	  	}
	            		  System.out.println("]");
	                  break;
            case (6):
		               Arrays.sort(vector);
            			System.out.printf( "%s",Arrays.toString(vector));
		                break;
            case (9):
            	System.out.printf( "gracias por utilizar este menu");
            	break;
            default:
            	System.out.printf( "solo puedes pulsar una opcion  entre 1-5");
            	break;
        }
			}
}//public
}//class

			
	




               
                             	
                       
			
	
			
	
	
         
	
	
     
 
  