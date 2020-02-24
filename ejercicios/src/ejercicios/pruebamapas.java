package ejercicios;

// importamos todas las clases
import java.util.*;

public class pruebamapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		String borrar;
		

		// creamos la clases hashmap con su key y valor
		HashMap<String, empleado> personal = new HashMap<String, empleado>();

		// introduzco objetos dentro de un mapa
		personal.put("123", new empleado("manolo"));
		personal.put("124", new empleado("anastasia"));
		personal.put("125", new empleado("antonio"));
		personal.put("126", new empleado("pepe"));
		personal.put("126", new empleado("pepapig"));

		// imprimimos
		System.out.println("imprimimos todos el hashmap");
		System.out.println(personal);

		// eliminamos
		System.out.println("eliminamos ");
		personal.remove("123");
		System.out.println(personal);

		System.out.println("sustituimos");
		// sustituimos a pepapig por casper con la misma clave
		personal.put("126", new empleado("casper"));
		System.out.println(personal);

		// imprimimos con un entryset nos devuelve una interfaz interna
		System.out.println("imprimimos con un entryset nos devuelve una interfaz interna");
		System.out.println(personal.entrySet());

		// accedemos y la guardamos entrada la key y el valor
		for (Map.Entry<String, empleado> entrada : personal.entrySet()) {

			String	clave = entrada.getKey();
			empleado valor = entrada.getValue();

			System.out.println("clave:" + clave + ", valor: " + valor);

			

		}
		
		
	}

}

// clase empleado
class empleado {

	private String nombre;
	private double sueldo;

	// constructor
	public empleado(String n) {

		nombre = n;
		sueldo = 2000;
	}

	public String toString() {
		return "[Nombre:" + nombre + ", Sueldo:" + sueldo + "]";
	}

}
