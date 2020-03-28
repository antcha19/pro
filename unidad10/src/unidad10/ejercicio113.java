/*Crea un programa que se encargue de generar de forma dinámica una página web.*/
package unidad10;


import java.io.*;
import java.util.*;
public class ejercicio113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado =  new Scanner (System.in);
		
		//creacion del objeto File
		File web = new File ("index.html");
		
		
		try {
			//se crea fisicamente en el sistema de archivos
			web.createNewFile();
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("introduzca el titulo (<title>) de la pagina web");
		String title = teclado.nextLine();
		System.out.println("Introduzca el texto del rotulo h1 (<h1>) de la página web:");
		String h1 = teclado.nextLine();
		System.out.println("Introduzca el texto del parrafo p (<p>) de la pagina web:");
		String p = teclado.nextLine();
		System.out.println("Introduzca la página web que se enlazará en la etiqueta <a href=>:");
		String link = teclado.nextLine();
		System.out.println("Pagina web creada!, gracias por utilizar este programa...");
		
		
		//escribit en el archivo
		try {
			FileWriter file6 = new FileWriter(web);
			
			file6.write("<html>" + "\n");
			file6.write("<title>"+ title+ "</title>"+"\n");
			file6.write("<head>"+"\n");
			file6.write("</head>"+"\n");
			file6.write("<body>"+"\n");
			file6.write("<h1>" + h1+ "</h1>"+"\n");
			file6.write("<p>" + p +"</p>"+"\n");
			file6.write("<a href =\"http://" +link +"\">Esto es el enlace</a>"+"\n");
			file6.write("</body>"+"\n");
			file6.write("</html>"+"\n");
			
			file6.close();	
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
