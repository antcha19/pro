package arrayslist;

import java.util.*;

public class usoempleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * // array de 3 elementos empleado listaempleados[] = new empleado[3];
		 * 
		 * // creo objetos y los guardo en las posiciones del array listaempleados[0] =
		 * new empleado("anastasia", 45, 2500); listaempleados[1] = new
		 * empleado("antonio", 33, 2700); listaempleados[2] = new empleado("mariamaria",
		 * 34, 2800);
		 */

		// solo puedo almacenar objetos en este caso el objeto empleado
		ArrayList<empleado> listaempleados = new ArrayList<empleado>();

		// creo un arraylist de 12 sirve para no consumir recursos
		// listaempleados.ensureCapacity(12);

		// agregamos
		listaempleados.add(new empleado("anastasia", 45, 2500));
		listaempleados.add(new empleado("antonio", 33, 2700));
		listaempleados.add(new empleado("mariamaria", 34, 2800));
		listaempleados.add(new empleado("anastasia", 45, 2500));
		listaempleados.add(new empleado("antonio", 33, 2700));
		listaempleados.add(new empleado("mariamaria", 34, 2800));
		listaempleados.add(new empleado("anastasia", 45, 2500));
		listaempleados.add(new empleado("antonio", 33, 2700));
		listaempleados.add(new empleado("mariamaria", 34, 2800));
		listaempleados.add(new empleado("anastasia", 45, 2500));
		listaempleados.add(new empleado("antonio", 33, 2700));
		listaempleados.add(new empleado("pepep", 34, 2800));

		// insertamos en la posicion 0 y sustituimos
		listaempleados.set(0, new empleado("olga", 33, 23000));

		// imprime el empleado de la posicion 5
		System.out.println("imprime el empleado de la posicion 5 :" + listaempleados.get(5).damedatos());

		System.out.println("tamano del arraylist " + listaempleados.size());
		// bucle each para imprimir los obejtos del array
//		for (empleado e : listaempleados) {
//			System.out.println(e.damedatos());
//		}

		/*
		 * for (int i = 0; i < listaempleados.size(); i++) { // creamos una variable
		 * objeto de tipo empleado empleado e = listaempleados.get(i);
		 * System.out.println(e.damedatos());
		 * 
		 * }
		 */

		// creo un array con el mismo tamano del arraylist
		empleado arrayempleados[] = new empleado[listaempleados.size()];

		// copiar el metodo arraylist al array
		listaempleados.toArray(arrayempleados);

		// recorremos el array
		for (int i = 0; i < arrayempleados.length; i++) {
			System.out.println(arrayempleados[i].damedatos());

		}
	}

}

class empleado {

	private String nombre;
	private int edad;
	private int salario;

	// constructor
	public empleado(String nombre, int edad, int salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	// metodo para sacar datos
	public String damedatos() {
		return " El empleado se llama " + nombre + " y tiene " + edad + " anyos " + "y un salario de " + salario;
	}

}
