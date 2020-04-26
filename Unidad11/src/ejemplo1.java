
import java.util.*;
public class ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String actores[] = {"Ron Livingstone","Jennifer Aniston"};
		Pelicula peli = new Pelicula(1, "Trabajo Basura", "Mike Judge", actores);
		Libro libro = new Libro(1,"Don Quijote", "MIguel de Cervantes", 594);
		peli.anuncio();
		libro.anuncio();

	}

}
