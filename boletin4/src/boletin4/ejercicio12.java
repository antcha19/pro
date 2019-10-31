/* Antonio Yepez
* 04102019
* 
*scribe un programa en Java que lea de varias variables el numero de votos en unas elecciones:
*<votos_podemos>, <votos_psoe>, <votos_pp>, <votos_ciudadanos>, <votos_vox>Y los agrupe del 
*siguiente modo:<grupo_izquierda> = Podemos + PSOE<grupo_derecha> = PP + Ciudadanos + Vox 
*Y acabe imprimiendo el mensaje:“Los votos de la izquierda son  <grupo_izquierda>  que constituyen
* el  <porcentaje>  % del total y losvotos de la derecha son <grupo_derecha> que constituyen 
* el <porcentaje> % del total
*/


package boletin4;

public class ejercicio12 {

	public static void main(String[] args) {
		
		//declaracion de variables
		int podemos=5;
		int psoe=55;
		int pp=32;
		int cuidadanos=6;
		int vox=2;
		int grupoizquierda=0;
		int grupoderecha=0;
		double porcientoiz=0;
		double porcientode=0;
		int total=0;
		
		
		//solucion
		grupoizquierda = podemos+psoe;
		grupoderecha = pp+cuidadanos+vox;
		
		total=grupoizquierda+grupoderecha;
			porcientoiz = total*grupoizquierda/100;
			porcientode = total*grupoderecha/100;
		
		//resultado
		
				System.out.println("Los votos de la izquierda son  " +grupoizquierda+"  que constituyen"
				+ " el  " + porcientoiz +"  % del total y los votos de la derecha "
				+ "son "+grupoderecha+" que constituyen el " +porcientode+ " % del total");
		

	}

}