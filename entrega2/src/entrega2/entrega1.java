/*
 * Antonio Yepez
 * 
 * 23102019
 * Escribe un programa que implemente el juego “Piedra, papel o tijeras”.
En el programa, el papel de uno de los jugadores, lo realizará el ordenador,
mientras que el del otro lo realizará el usuario. Cuando el programa se ejecute deberá:
a) Seleccionar al azar 1 de los 3 elementos: “Piedra”, “Papel” o “Tijeras”.
b) Pedir al usuario que elija uno de ellos. La introducción debe de realizarse
mediante una cadena de texto, de forma que mayúsculas y minúsculas se 
considerarán irrelevantes. En el caso de que el usuario introduzca una
 palabra distinta de las 3 posibles, entonces el programa acabará, diciendo
que la palabra no ha sido reconocida.c) En función de lo que se haya seleccionado 
inicialmente de forma aleatoria en el apartado a) del programa y de lo que haya
 elegido el usuario en el apartado b), el programa anunciará lo que ha elegido
cada uno de los contricantes y deberá señalar el vencedor, caso de que exista,
 o que se ha producido un
empate, caso de no haberlo
 */


package entrega2;

import java.util.Scanner;
import java.util.Random;
public class entrega1 {

	public static void main(String[] args) {
		
		//variable scanner
		Scanner teclado=new Scanner(System.in);
		Random palabra=new Random();//para generar un String aleatorio
		
		//variable
		String papel="papel";
		String tijera="tijera";
		String piedra="piedra";
		String respuesta;
		String stringaletorio;
		boolean  x= true;
		
		//papel 1
		//tijera 2
		//piedra 3
		
		int numeroaleatorio = palabra.nextInt(3) + 1;
		
		System.out.println( numeroaleatorio); 
		
		//resolucion
		System.out.println("elige piedra, papel o tijera");
		do {
			respuesta = teclado.nextLine();
			}
			while ((!respuesta.equals(papel)) && (!respuesta.equals(tijera)) && (!respuesta.equals(piedra)));
			{
		
				if (respuesta.equals("papel")  && numeroaleatorio==1) {
					System.out.println("has empatado");
							 
				}
				else if (respuesta.equals("papel")  && numeroaleatorio==2) {
					System.out.println("has has perdido");
							 
				}
				else if (respuesta.equals("papel")  && numeroaleatorio==3) {
					System.out.println("has ganado");
							 
				}
				else if (respuesta.equals("tijera")  && numeroaleatorio==1) {
					System.out.println("has ganado");
							 
				}
				else if (respuesta.equals("tijera")  && numeroaleatorio==2) {
					System.out.println("has empatado");
							 
				}
				else if (respuesta.equals("tijera")  && numeroaleatorio==3) {
					System.out.println("has perdido");
							 
				}
				else if (respuesta.equals("piedra")  && numeroaleatorio==1) {
					System.out.println("has perdido");
							 
				}
				else if (respuesta.equals("piedra")  && numeroaleatorio==2) {
					System.out.println("has ganado");
							 
				}
				else if (respuesta.equals("piedra")  && numeroaleatorio==3) {
					System.out.println("has empatado");
							 
				}
			 
				
				
		}

	}

}
