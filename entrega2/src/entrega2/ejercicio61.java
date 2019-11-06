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
		int index=0;
		int numero=0;
		int respuesta1=0;
		int respuesta2=0;
		
		System.out.println("Tamaño del vector ");
    	index = teclado.nextInt();						//introduce el el tamono del vector
    	
    	// variables del vector
    	int[] vector = new int [index];
    	int filas =vector.length;
		
    	
    			//menu
        
			do{
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
                   for(int i=0;i < filas ; i++) {
            			System.out.println("introduzca valor " + i + " de " + index );
            			vector[index-1]= teclado.nextInt();
            	}
           
   			  System.out.print(vector[index-1]);
   			   			 	 break;
            case (2):
            	System.out.println("2. rellenar vector de forma aleatoria (numers de 1 a 100)");
            for (int i=0;i < vector.length;i++) {
            	  numero = aleatorio.nextInt(100)+1;
            	  vector [i] = numero;
            	
            }
                break;
            case (3):
            	System.out.println("introduzca una posicon del vector0..n-1");
            	respuesta1 =teclado.nextInt();
            	System.out.println("el valor contenido en es :");
            	respuesta2 =teclado.nextInt();
            	vector [respuesta1]= respuesta2;
                break;
            case (4):
            	System.out.println("introduzca la posicion");
            	respuesta2 =teclado.nextInt();
            	System.out.println(vector[respuesta2]);
            	
                break;
            case (5):
            	  for (int i=0; i < vector.length; i++) {
           			  System .out.print(vector[i]);
           			 }
           			 System .out.println("");	
                
                break;
            case (6):
               Arrays.sort(vector);
            System.out.printf( "%s",Arrays.toString(vector));
                
                break;
                   
	
            	case (7):
            		break;
        }
			}
			
			while (opcion != 9 );{
			 System.out.println("Salir");
			}
			
	}
}



               
                             	
                       
			
	
			
	
	
         
	
	
     
 
  