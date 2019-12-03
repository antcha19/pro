/*
 * antonio yepez 26 nov 2019
 * calcular letra dni*/


package unidad5;

import java.util.*;
public class ejercicio55 {
	
	public static void main(String[] args) {

	 Scanner teclado = new Scanner (System.in);
	 
	 
	 int dni;
	 int resto;
	 String salir="salir";
	
	 
	 char  [] letras  =   {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	
	 while(salir == salir) {
	 System.out.print("introduzca su DNI");
	 dni = teclado.nextInt();
	 
	 //resto = es el resto de dni 
	 resto= dni%23;
	 
	 //letras [resto es un numero del resto del dni introducido y como su letra correspondiente del vector]
	 System.out.println("su letra  es " + letras[resto]);
	 System.out.println("su DNI es " +dni+"" +letras[resto]);
	 }

}
}
//terminado