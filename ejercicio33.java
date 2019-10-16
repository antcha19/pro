/*
 * Antonio Yepez
 * 11102019
 * Realiza un programa que nos diga si hay probabilidad de que
 *  nuestra pareja nos está siendo infiel. El programa irá
 *   haciendo preguntas que el usuario contestará 
 *   con verdadero o falso. Cada pregunta contestada 
 *   como verdadero sumará 3 puntos. Las preguntas 
 *   contestadas con falso no suman puntos.
 */

package boletin4;

import java.util.Scanner;

public class ejercicio33 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//declaracion de variables
		int respos=0;
		int con=3;
		int res=0;
		int res1=0;
		int res2=0;
		int res3=0;
		int res4=0;
		int res5=0;
		int res6=0;
		int res7=0;
		int res8=0;
		int res9=0;
		int resultado=0;
		
		
		System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente");
		 res =sc.nextInt();
		 if (res == 1 ) {
			resultado =resultado + con ;
			
		}
		 System.out.println("Ha aumentado sus gastos de vestuario");
		 res1 =sc.nextInt();
		 if (res1 == 1 ) {
			resultado=resultado+ con ;
			}
			
		 System.out.println("Ha perdido el interés que mostraba anteriormente por ti");
		 res2 =sc.nextInt();
		 if (res2 == 1 ) {
			resultado=resultado + con ;
			}
		 
		 System.out.println("Ahora se asea con más frecuencia");
		 res3 =sc.nextInt();
		 if (res3 == 1 ) {
			resultado=resultado + con ;
			}
		 
		 System.out.println(" No te deja que mires la agenda de su teléfono móvil");
		 res4 =sc.nextInt();
		 if (res4 == 1 ) {
			resultado=resultado + con ;
			}
		 
		 System.out.println("  A veces tiene llamadas que dice no querer contestar cuando estás tú delant");
		 res5 =sc.nextInt();
		 if (res5 == 1 ) {
			resultado=resultado + con ;
			}
		 
		 System.out.println(" Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
		 res6 =sc.nextInt();
		 if (res6 == 1 ) {
			resultado=resultado + con ;
			}
		 
		 System.out.println(" Muchos días viene tarde después de trabajar porque dice tener mucho más trabaja");
		 res7 =sc.nextInt();
		 if (res7 == 1 ) {
			resultado=resultado + con ;
			}
		 
		 System.out.println(" Has notado que últimamente se perfuma más");
		 res8 =sc.nextInt();
		 if (res8 == 1 ) {
			resultado=resultado + con ;
			}
		 
		 System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
		 res9 =sc.nextInt();
		 if (res9 == 1 ) {
			resultado=resultado + con ;
			}
		 
		 //resultado
		  if (resultado > 0 &&  resultado < 10) {
			  System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel" + resultado);
			} 
		  else  if(resultado >=11 && resultado < 12) {
			  System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente"
			  		+ " será algo sin importancia. No bajes la guardia." + resultado);
		  }
		  else  if(resultado >=22 && resultado < 30) {
			  System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona."
			  		+ " Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza" + resultado);
		  }
		  
			}
		
		 
		 
		
		  

}
