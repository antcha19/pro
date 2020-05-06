package ejercicio125;

import java.util.*;

public class ejercicio125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String titulo, autor, formato, actorprincipal, actrizprincipal;
		int duracion;

		/* crea un objeto de tipo ListaMultimedia de tamaño máximo 10 */
		listamultimedia lista = new listamultimedia(10);

		/* Se pidan los datos de 3 películas al usuario y se añadan a la lista. */
		for (int i = 0; i < 3; i++) {
			System.out.println("introduce el titulo de la pelicula ");
			titulo = teclado.nextLine();
			System.out.println("introduce el autor de la pelicula ");
			autor = teclado.nextLine();
			System.out.println("introduce el formato de la pelicula");
			formato = teclado.nextLine();
			System.out.println("introduce la duracion de la pelicula ");
			duracion = teclado.nextInt();
			teclado.nextLine();
			System.out.println("introduce el nombre del actor ");
			actorprincipal = teclado.nextLine();
			System.out.println("introduce el nombre de la actriz ");
			actrizprincipal = teclado.nextLine();
			// tiene que estar igual que elconstructor de pelicula
			pelicula pelis = new pelicula(titulo, autor, formato, duracion, actorprincipal, actrizprincipal);
			/* anado las peliculas a la lista multimedia */
			lista.add(pelis);
		}
		System.out.println(lista.toString());

		/*
		 * Se cree un objeto de tipo “Película” introduciendo el título y el autor de
		 * una de las películas de la lista. Para el resto de los argumentos se utilizan
		 * valores no significativos
		 */

		pelicula busca = new pelicula("Titanic", "James Cameron", "0", 0, "0", "0");
		int posicion = lista.indexOf(busca);
		pelicula recupera = (pelicula) lista.get(posicion);
		System.out.println("POS " + posicion + ":" + recupera.toString());
		 

		
		
		 listamultimedia lis = new listamultimedia(10);
		 disco d1 = new disco("Off the Wall","Michael Jackson","mp3",66,"R&B");
		 disco d2 = new disco("Dead Letters","The Rasmus","mp3",81,"Pop");
		 disco d3 = new disco("A night at the opera","Queen","mp3",90,"Rock");
		 lis.add(d1);
		 lis.add(d2);
		 lis.add(d3);
		 System.out.println(lis.toString());
		 disco busca1 = new disco("Off the Wall","Michael Jackson","0", 0, "0");
		 int posicion1 = lis.indexOf(busca1);
		 disco recupera1 = (disco)lis.get(posicion1);
		 System.out.println("POS "+posicion1+":"+recupera1.toString());
		
		
	}

}
