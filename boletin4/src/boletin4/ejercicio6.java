/*
 * NOmbre:Antonio Yepez
 * Fecha:02/10/2019
 * Escribe un programa en Java que utilice el valor de 3 variables
 *  enteras a, b y c y calcule el valor de x dentro de la fórmula de 
 *  una ecuación de segundo grado. Al finalizar el programa, imprimirá:
 *  “El valor de x siendo a = “ <a> “ b = “ <b> “y c = “<c> “ es igual a “<x>”.
 *  No hace falta llevar a cabo ninguna validación. La fórmula para obtener x es la siguiente:
(-b-+(raiz2b2-4ac))/2a
 */

package boletin4;


public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=20;
		int c=3;
		double x1=0;
		double x2=0;
		double raiz;
		
		//solucion 1
		raiz=(b*b)-(4*a*c);
		x1=(-b + Math.sqrt(raiz))/(2*a);
		//solucion 2
		raiz=(b*b)-(4*a*c);
		x2=(+b + Math.sqrt(raiz))/(2*a);
		//Imprimir resultado negativo
		System.out.println("El valor de x siendo a = “ "+a+" “ b = “ "+b+" “y c "
				+ "= “"+c+" “ es igual a “"+x1+"");
		//imprimer resultado positivo
		System.out.println("El valor de x siendo a = “ "+a+" “ b = “ "+b+" “y c "
				+ "= “"+c+" “ es igual a “"+x2+"");	
	

	}

}
