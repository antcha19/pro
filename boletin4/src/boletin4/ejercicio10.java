/*
 * Antonio Yepez
 * 0210209
 * 
 * Escribe un programa en Java que utilice el valor de 2 variables enteras
 *  que contendrán el número de niños y de niñas matriculados en un colegio.
 *  Se encargará de imprimir el porcentaje de niños y de niñas matriculados 
 *  en el curso de la forma:“Tenemos   matriculados  <num_niños>  niños   
 *  y  <num_niñas>  niñas.En total,tenemos mariculados <num_total>   alumnos, 
 *  siendo   un   <porcentaje1>   perteneciente   a   los   niños 
 *  y <porcentaje2>perteneciente a las niñas”.
 */

package boletin4;

public class ejercicio10 {

	public static void main(String[] args) {
		
		//declaracion de variables
		 int niñas=60;
		 int niños=40;
		 int total=0;
		 int porcentaje1=0;
		 int porcentaje2=0;
		 
		 //solucion
		 total=niñas+niños;
		 porcentaje1=total*niños/100;
		 porcentaje2=total*niñas/100;

		 //Salida de pantalla
		 System.out.println("Tenemos   matriculados  "+niños+"  niños  "
		 		+ "y  "+niñas+"  niñas.En total,tenemos  "
		 		+ " matriculados "+total+ " alumnos, siendo "
		 		+ "un   "+porcentaje1+" %  perteneciente   a   los   niños"
		 		+ "   y   "+porcentaje2+" % perteneciente a las niñas");
	}

}