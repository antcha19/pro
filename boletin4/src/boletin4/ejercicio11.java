/*
 * Antonio Yepez
 * 02102019
 * 
 * Escribe un programa en Java que lea el valor de 2 variables que 
 * corresponderán a la altura en centímetros y el peso en gramos
 *  del usuario y calcule el IMC con la fórmula:
 *  IMC=peso(KG)/altura(m2)
 */
package boletin4;

public class ejercicio11 {

	public static void main(String[] args) {
		
		//declaracion de variables 
		int peso=80000;
		double altura=184;
		double imc=0;
		
		//peso		
		peso=peso/1000;
		
		//Altura
		altura=altura/100;
			altura=altura*altura;
		
		//resultado				
		imc=peso/altura;
		
		System.out.println(peso);
		System.out.println(altura);
		System.out.println("El IMC calculado es "+ imc );

	}

}