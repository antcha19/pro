package unidad10;

import java.util.*;
import javax.xml.*;
import javax.xml.parsers.DocumentBuilderFactory;

import java.io.*;

public class ejercicio121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		File archivo = new File ("BIBLIOTECA.XML");
	
		//leo el fichero biblioteca
		try {
			Scanner teclado = new Scanner (archivo);
			while (teclado.hasNext()) {
				String linea = teclado.nextLine();
				 System.out.println(linea);
			}
			teclado.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
	}

}
