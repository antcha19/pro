/*
 * antonio yepez 08112019
 */

package unidad5;

import java.util.*;

public class acepta293 {

	public static void main(String[] args) {
		
		//variables
		Scanner teclado = new Scanner(System.in);
        int insectos =6;
        int aracnidos = 8;
        int crustaceos =10;
        int anillo=2;
		int escolo=0;
        int veces=0;
        int total=0;
        int in =0;
        int a =0;
        int c = 0;
		int e =0;
		
        veces = teclado.nextInt();
        
        for (int i = 0; i < veces; i++ ) {
        
        in = teclado.nextInt();
		a = teclado.nextInt();
		c = teclado.nextInt();
		e = teclado.nextInt();
		anillo = teclado.nextInt();
		
		total =((in* insectos)+(a*aracnidos)+(c*crustaceos)+ ((e)*(anillo*2)));
		System.out.println(total);
        }
		
	
	
	
	}
	
	
	

}
