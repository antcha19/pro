/*
 * Antonio Yepez
 * 11102019
 * Escribe un programa que genere la nómina (bien desglosada) de un empleado según las siguientescondiciones:
 * • Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. Senior, 3 - Jefe de proyecto),
 *  los díasque ha estado de viaje visitando clientes durante el mes y su estado civil (1 - Soltero, 2 – Casado).
 *  • El sueldo base según el cargo es de 950, 1200 y 1600 euros según si se trata de un
 *   prog. junior, unprog. senior o un jefe de proyecto respectivamente.• 
 * Por cada día de viaje visitando clientes se pagan 30 euros extra en concepto de dietas.
 *  Al sueldo netohay que restarle el IRPF, que será de un 25% en caso de estar soltero y 
 *  un 20% en caso de estar casado
 */
package boletin4;

import java.util.Scanner;

public class ejercicio34 {

	public static void main(String[] args) {
		
		//variable scanner
		Scanner sc=new Scanner(System.in);
		
		//variables
		
		//junior
		double junior=950;
		
		//senior
		double senior=1200;
				
		//jefe
		double jefe=1600;
				
		int cargo;
		int estadocivil;
		int dias;
		int dieta;
		
		System.out.println("1 - Programador junior");
		System.out.println("2 - Programador senior");
		System.out.println("3 - Programador jefe de proyecto");
		
		System.out.println("");
		
		System.out.println("introduzca el cargo del empelado");
			cargo =sc.nextInt();
			
			
		
		System.out.println("¿cuantos dias ha estado de viaje visitando clientes?");
			dias=sc.nextInt();
		
		System.out.println("introduzca su estado civil");
			estadocivil=sc.nextInt();
		
		System.out.println("");
			
		System.out.println("===============================");
		
		if (cargo == 1) {
			System.out.println("sueldo base\t" + junior);
		}
		else if (cargo == 2) {
			System.out.println("sueldo base\t" + senior);
		}
		else if (cargo == 3) {
			System.out.println("sueldo base\t" + jefe);
		}
		dieta= dias *30;
		
		System.out.println("dietas\t" + dieta );
		
		
			
		
	}

}
