/*
 * antonioyepez
 * 24/01/2020
 * Implementa el control de acceso al área restringida de un programa para
 *  lo que se debe pedir unnombre de usuario y una contraseña.
 *  Si el usuario introduce los datos correctamente, el programa dirá
 * “Ha accedido al área restringida”. Elusuario tendrá un máximo de
 * 3 oportunidades, de forma que cuando se agoten, el programa 
 * dirá “Losiento, no tienes acceso al área restringida”.
 * Los nombres de usuario con sus correspondientes contraseñas
 * deben  star almacenados en unaestructura de la clase HashMap.
 */

package unidad7;


import java.util.*;
public class ejercicio88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		
		HashMap<String, String> map =new HashMap<String,String>();
		
		map.put("antonio", "1234");		
		System.out.println(map);
		
		String nombre;
		String contrasena="";
		
		nombre = teclado.nextLine();
		
		if ( map.containsKey(nombre)){
			System.out.println("si el usuario existe");
		}else
			System.out.println("el usuario no existe");
		contrasena = teclado.nextLine();
		
		if (map.containsValue(contrasena)) {
			
		}
		
		
		
		
		
	}

}
