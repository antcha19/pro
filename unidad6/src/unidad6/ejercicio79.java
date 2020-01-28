package unidad6;

import java.util.*;
public class ejercicio79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int num;
		System.out.println("Introduzca el número a partir del cual haremos la cuenta atrás...");
		num = s.nextInt();
		cuenta_atras(num);
	}

	public static void cuenta_atras(int num) {
		System.out.println(num);
		try {
			Thread.sleep(1000); //Cantidad de milisegundos donde se dormirá el proceso
			} 
		catch (InterruptedException e) {
			e.printStackTrace();        }
		if (num == 0) {
			System.out.println("BOOM!");
			}
		else {
			cuenta_atras(num - 1);
			}   
		}

}



