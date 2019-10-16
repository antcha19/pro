/*
 * Antonio Yepez
 * 161090
 *Calcula la nota de un trimestre de la asignatura Programación.
 *El programa pedirá las dos notas que hasacado el alumno en
 *los dos primeros controles.Si la media de los dos controles
 *da un número mayor o igual a 5, el alumno está aprobado y
 *se mostrarála media. En caso de que la media sea un número 
 *menor que 5, el alumno habrá tenido que hacer elexamen de
 *recuperación que se califica como apto o no apto,
 *por tanto se debe preguntar al usuario:¿Cuál ha sido el
 *resultado de la recuperación? (apto/no apto).
 *Si el resultado de la recuperación es apto, la nota será un 5; 
 * en caso contrario, se mantiene la notamedia anterior.
 */
package boletin4;

import java.util.Scanner;
public class ejercicio36 {

	public static void main(String[] args) {
		
		//variable scanner
		Scanner sc=new Scanner(System.in);
		
		//variable
		double nota1=0.0;
		double nota2=0.0;
		double promedio=0.0;
		double notafinal=0.0;
		String respuesta;
		String resp_apto="apto";
		String resp_noapto="no apto";
		
		
		
	
		nota1=sc.nextDouble();
		System.out.println("nota del primer control:" + nota1 );
		nota2=sc.nextDouble();
		System.out.println("nota del primer control:" + nota2 );
		promedio=(nota1+nota2)/2;
		
		
		
		if ( promedio >=5 ) {
			System.out.println("tu nota de programacion es :" + promedio );
		}
			else if (promedio <=4.9) {
				
				System.out.println("tu nota de programacion es :" + promedio);
			}
		do {
			System.out.println("¿cual ha sido el resultado de tu recuperacion? ()apto/noapto" );
			respuesta = sc.nextLine();
		}
		while ((!respuesta.equals(resp_apto)) && (!respuesta.equals(resp_noapto)));
		{
			if (respuesta.equals(resp_apto)) {
				
				System.out.println("tu nota de promgracion es: 5 ");
		}
			
			else if (respuesta.equals(resp_noapto)) {
				
				System.out.println("tu nota de promgracion es:" + promedio );
			
			}
		}
	}

}
