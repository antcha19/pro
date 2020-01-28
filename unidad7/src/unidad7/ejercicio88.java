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

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("antonio", "1234");
		map.put("pepito", "zxcv");
		map.put("andres", "qwert");
		System.out.println(map);
		int contadorcontrasena = 0;
		int contadorusuario = 0;
		String nombre = " ";
		String contrasena = "";
		String contrasenavalidada = "";

		
		 while (contadorcontrasena < 3 && contadorusuario < 3) {
			System.out.println("introduce el nombre de usurario");
			nombre = teclado.nextLine();

			if (map.containsKey(nombre)) {

				while (contadorcontrasena < 3) {
					System.out.println("introduce la contrasena");
					contrasena = teclado.nextLine();
					contrasenavalidada = map.get(nombre);
					if (contrasenavalidada.equals(contrasena)) {
						System.out.println(" ha accedido al area restringida");
						break;
					} else {
						contadorcontrasena++;
						if (contadorcontrasena == 3) {
							System.out.println("tu cuenta esta bloqueada");
						} else {
								System.out.println("contrasena incorrecta");
							}
						}
					}
				
			}else {
				contadorusuario++;
				if (contadorusuario == 4) {
					System.out.println("el usuario  no existe , vuelve a intentarlo");
				}
			}
		}
	}

}
