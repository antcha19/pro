/*
 *  Antonio Yepez
 *  04102019
 *  
 *  Escribe un programa que calcule el total de una factura que tendrá siempre 5 conceptos distintos
 *   y que tendrá un descuento.Para ello, el programa pedirá por teclado:- 
 *   El nombre del cliente.
 *    El NIF. 
 *   El domicilio.-
 *    5 líneas con los datos:- Cantidad- Concepto- Precio- Importe- Porcentaje del descuento
 *  
 */

package boletin4;




import java.util.Scanner;

public class ejercicio21 {

	public static void main(String[] args) {
		//variable para introducir por pantalla o scanner
		Scanner sc=new Scanner(System.in);
		
		//variables
		String nombre;
		int nif;
		String calle;
		int cantidad;
		String concepto;
		double precio;
		double importe;
		double descuento;
		double total;
		double totalbruto;
		
		//solucion
		System.out.println("introduce nombre");
		nombre = sc.nextLine();
		System.out.println("introduce nif");
		nif = sc.nextInt();
		sc.nextLine();
		System.out.println("introduce calle");
		calle = sc.nextLine();
		System.out.println("introduce  cantidad");
		cantidad = sc.nextInt();
		sc.nextLine();
		System.out.println("introduce concepto");
		concepto = sc.nextLine();
		System.out.println("introduce  precio");
		precio = sc.nextDouble();
		sc.nextLine();
		
		//importe no se calcula
		//System.out.println("introduce  importe");
		//importe = sc.nextDouble();
		//sc.nextLine();
		System.out.println("introduce  descuento");
		descuento = sc.nextDouble();
		sc.nextLine();
		
		
		importe=cantidad*precio;
		totalbruto=importe*descuento/100;
		total=importe-totalbruto;
		//imprimir 
		System.out.println("nombre: " + nombre + "\t\t\t\t\t\t NIF "+  nif );
		System.out.println("Domicilio: " + calle);
		System.out.println("------------------------------------------------------------------");
		System.out.println("cantidad\t\tconcepto-referencia\t\tprecio\timporte");
		System.out.println(+cantidad+"\t\t\t\t"+concepto+"\t\t\t"+precio+"\t"+importe );
		System.out.println("------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t" +importe+"\t"+totalbruto+"\t"+total);
		
		
		
		
	}

}