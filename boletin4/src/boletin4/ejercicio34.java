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
		
	
		double junior=950;
		double senior=1200;
		double jefe=1600;
				
		int cargo;
		int estadocivil;
		int dias;
		int dieta;
		double sueldobruto=0.0;
		double sueldoneto=0.0;
		double irpf=0.0;
		double soltero=0.20;
		double casado=0.25;
		double retencion;
		
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
		//sueldobase y dietas
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
		
		System.out.println("dietas\t\t" + dieta );
		//sueldo bruto
		if (cargo == 1) {
			sueldobruto=junior+dieta;
			System.out.println("sueldo bruto\t" + sueldobruto);
		}
		else if (cargo == 2) {
			sueldobruto=senior+dieta;
			System.out.println("sueldo bruto\t" + sueldobruto);
		}
		else if (cargo == 3) {
			sueldobruto=jefe+dieta;
			System.out.println("sueldo bruto\t" + sueldobruto);
		}
		System.out.println("===============================");
		
		//retencion irpf
		if (estadocivil == 1) {
			irpf=sueldobruto*soltero;
			System.out.println("retencion IRPF (20%)\t" + irpf);
		}
		else if (estadocivil == 2) {
			irpf=sueldobruto*casado;
			System.out.println("retencion IRPF (25%)\t" + irpf);
		}
		System.out.println("===============================");
		//sueldo neto
		if (estadocivil == 1) {
			sueldoneto=sueldobruto-irpf;
			System.out.println("sueldobruto\t\t" + sueldoneto);
		}
		else if (estadocivil == 2) {
			sueldoneto=sueldobruto-irpf;
			System.out.println("sueldobruto\t\t" + sueldoneto);
		}
		
	}

}
