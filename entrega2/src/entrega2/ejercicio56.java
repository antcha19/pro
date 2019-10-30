package entrega2;

import java.text.*; 
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.*;
public class ejercicio56 {

	
	
	public static void main(String[] args) throws ParseException {
		 
		
		Scanner teclado = new Scanner(System.in); //teclado
		Date fecha = new Date();		//fecha
		
		
		
		int numero=0;
		boolean salir = false;
		int suma=0;
		int opcion=0; //Guardaremos la opcion del usuario
		int dias=0;
		int fechasuma =0;
		long diferencia =0;
		long horas = 0;
		long minutos =0;
		long segundos =0;
		int dia ;
		int mes ;
		int ano;
	
	                   
	           System.out.println("Escribe una de las opciones");
	           System.out.println("1.obtener fecha actual");
	           System.out.println("2.obtener hora actual");
	           System.out.println("3.sumar dias");
	           System.out.println("4.diferencia en dias");
	           System.out.println("9. Salir");
	           
	          
	           
	           // suma de dias
	           Calendar cal = new GregorianCalendar();
	           cal.setTimeInMillis(fecha.getTime());
	           cal.add(Calendar.DATE,dias);
	           
	           Date fechaSuma = new  Date(cal.getTimeInMillis());
	           Date fechaResta = new  Date(cal.getTimeInMillis());
	       
	           
	           
	           
	            while (opcion !=9) {
	         	   opcion = teclado.nextInt();

	            
	           switch(opcion){
               case 1:
                   SimpleDateFormat formatofecha =new SimpleDateFormat ("dd-MM-yyyy");
                   System.out.println("la fecha actual" + formatofecha.format(fecha));
                   break;
               case 2:
                   SimpleDateFormat formatohora =new SimpleDateFormat ("hh:mm:ss");
                   System.out.println("la fecha actual" + formatohora.format(fecha));
                   break;
                case 3:
                	System.out.println("cuantos dias quieres sumar");
                	fechasuma = teclado.nextInt();
                	SimpleDateFormat formatofecha1=new SimpleDateFormat ("dd-MM-yyyy");
                	System.out.println("hoy mas dias : " + formatofecha1.format(fechasuma)  ) ;
                	
                	break;
                case 4:
                		Date despues = new Date();
                		long diferencia1 =0;
                		
                		
                		System.out.println("primera fecha");
                		String fecha1 =teclado.nextLine();
                		System.out.println("segunda fecha");
                		String fecha2 =teclado.nextLine();
                		
                		formatofecha =new SimpleDateFormat ("dd-MM-yyyy");
                		fecha = formatofecha.parse(fecha1);
                		
                		formatofecha =new SimpleDateFormat ("dd-MM-yyyy");
                		fecha = formatofecha.parse(fecha2);
                		
                		diferencia1 = fecha.getTime()-despues.getTime();
                		System.out.println("la diferencia es: " + diferencia1/(1000*60*60*24));
                		
                		
                	
                		
                		
                	
                    break;
                case 5:
                    
                    break;
              
                
                
           }
            
       }
	}
}

		
		


