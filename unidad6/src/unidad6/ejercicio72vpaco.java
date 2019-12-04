package unidad6;


import java.util.*;

public class ejercicio72vpaco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		//FPV: Declaramos las variables de los datos numericos
		int num1;
		int num2;

		boolean salir = false;
		int opcion; // Guardaremos la opcion del usuario

		while (!salir) {

			System.out.println("1. sumar dos numeros");
			System.out.println("2. resta de  dos numeros");
			System.out.println("3. multiplicacion dos numeros");
			System.out.println("4. division dos numeros");
			System.out.println("5. Potencia");
			System.out.println("6. Raiz cuadrada");
			System.out.println("9. Salir");

			System.out.println("Escribe una de las opciones");
			opcion = teclado.nextInt();
			
			//FPV: Leemos los 2 operandos en el main, no cada vez que hacemos una operación.
			System.out.println("Escribe los 2 operandos, si es un raiz cuadrada solo le haré caso al primero:");
			num1 = teclado.nextInt();
			num2 = teclado.nextInt();

			switch (opcion) {
			case 1:
				//FPV: No le pasamos "suma1" (que vale un 0), sino los 2 operandos, igual en el resto de casos
				System.out.println("el resultado de la suma es " + suma(num1,num2));
				break;
			case 2:
				System.out.println("el resultado de la resta es " + resta(num1,num2));
				break;
			case 3:
				System.out.println("el resultado de la multiplicacion es " + multiplicacion(num1,num2));
				break;
			case 4:
				System.out.println("el resultado de la division es " + division(num1,num2));
				break;
			case 5:
				System.out.println("el resultado de la potencia es " + potencia(num1,num2));
				break;
			case 6:
				//FPV: aqui creo que ponia "el resultado de la suma".
				System.out.println("el resultado de la raiz es " + raiz(num1));
				break;
			case 9:
				salir = true;
				break;
			default:
				System.out.println("Solo numeros entre 1 y 5 . Pulsa el 9 para salir");
			}

		}
	}

	//FPV: Antonio, fijate como al leer los operandos fuera como se acortan los subprogramas. Esto es programación
	//modular, cuya máxima premisa es ahorrarnos teclear el mismo código una y otra vez.
	public static int suma(int a, int b) {
		return(a+b);
	}
	
	public static int resta(int a, int b) {
		return (a-b);
	}

	public static int multiplicacion(int a, int b) {
		return (a*b);
	}

	public static int division(int a, int b) {
		return(a/b);
	}

	public static int potencia(int a, int b) {
		return (int)(Math.pow(a, b));
	}

	public static int raiz(int a) {
		return (int)(Math.sqrt(a));
	}


}
