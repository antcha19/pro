/*antonio yepez
 * 161090
 * El precio base de una bandera es de un céntimo de 
 * euro el centímetro cuadrado. Si la queremos con 
 * unescudo bordado, el precio se incrementa en 2.50 € 
 * independientemente del tamaño. Los gastos de envío
 * son 3.25 €. El IVA ya está incluido en todas las 
 * tarifas
 */

package boletin4;

import java.util.Scanner;
public class ejercicio35 {

	public static void main(String[] args) {
		 
		//variable scanner
		Scanner sc=new Scanner(System.in);
		
		//variables
		int centimetro=0;
		int ancho=0;
		int ebordado;
		double costecm2=1;
		double precio;
		double preciosinbordado=0.0;
		double preciobordado=2.50;
		double envio=3.25;
		double escudo=0.0;
		double iva=0.21;
		double total;
		String resp_SI="si";
		String resp_NO="no";
		String respuesta;
				
		System.out.println("introduzca la altura de la bandera en cm2");
		centimetro=sc.nextInt();
		System.out.println("ahora introduzca la anchura ");
		ancho=sc.nextInt();
		//pregunta si quiere el escudo bordado
		do {
			System.out.println("¿quiere escudo bordado? (s/n):");
			respuesta = sc.nextLine();
		}
		while ((!respuesta.equals(resp_SI)) && (!respuesta.equals(resp_NO)));
		{
			//precio bandera
			precio=(centimetro*ancho)*(costecm2);
			System.out.println("bandera  de " + centimetro + " cm2 \t" + precio+"€");
			//si la respuesta es si
			if (respuesta.equals(resp_SI)) {
				System.out.println("con escudo \t\t" +preciobordado);
			}
			//respuesta es no
			else if (respuesta.equals(resp_NO)) {
				System.out.println("Sin escudo \t\t" +preciosinbordado);
			}
			//gasto de envio
			System.out.println("gasto de envio \t\t" +envio);
			
			//total
			if (respuesta.equals(resp_SI)) {
				total=precio+preciobordado+envio;
				System.out.println("Sin escudo \t\t" +total);
			}
			//respuesta es no
			else if (respuesta.equals(resp_NO)) {
				total=precio+preciosinbordado+envio;
				System.out.println("total \t\t" +total);
			
			}
		}
		
		
		
	}

}
