/* Escribe un programa en Java que utilice una estructura del tipo “enum”
*  para escribir los 7 días de lasemana por pantalla. Acuérdate que un 
 *  tipo “enum” hay que declararlos fuera de la clase, al principiode tu
*   fichero .java. Por pantalla se imprimirá
 */
package boletin4;

public class ejercicio5 {
	enum semana{lunes,martes,miercoles,jueves,viernes,sabado,domingo}

	public static void main(String[] args) {
		

		

		
			
				System.out.println("Odio los "+semana.lunes+".Los "+semana.martes+" del"
						+ " paso de la fase de negación a la fase de aceptación.Cuando"
						+ " es "+semana.miercoles+" pienso que ya vamos por la mitad de la semana."
						+ "El previo del Viernes, el "+semana.jueves+", es mi día favorito"
						+ " de la semana.El "+semana.viernes+" suelo quedar con mis amigos"
						+ " para cenar.Los "+semana.sabado+" me levanto tarde y siempre desayuno "
						+ "tortitas.Me deprimen los "+semana.domingo+" porque pienso que mañana"
						+ " es "+semana.lunes+"");

			}

	

	

}
