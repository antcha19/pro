package ejercicio130;


public class principal130 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*creo pero, gato, pajaro, reptil*/
		Perro p1 = new Perro("Snnopy","24/05/2005", (double) 25, razaperro.Beagle,"Microchip001");
		Gato g1 = new Gato("Garfield","27/07/2012", (double) 120, RazaGato.Comun,"Microchip002"); 
		
		Pajaro pa1 = new Pajaro("Piolin", " 12/07/2016",(double) 1, EspeciePajaro.Canario, true );
		
		Reptil re1 = new Reptil("Godzilla", " 12/01/1420",(double) 19800, EspecieReptil.LagartoGigante, false );
		
		
		//Creamos la clinica
		ClinicaVeterinaria clinica = new ClinicaVeterinaria();
		
		
		/*Inserta en la clínica que has creado en el punto 5 todos los animales de los puntos 1, 2, 3 y 4 */
		clinica.anyadirAnimal(pa1);
		clinica.anyadirAnimal(g1);
		clinica.anyadirAnimal(p1);
		clinica.anyadirAnimal(re1);
		
		
		System.out.println("Inserto un animal que no existe");
		System.out.println("------------------------------");
		clinica.insertarcomen("Pulgas", "dnfighadfg");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Imprimi los animales pero sin sus comentarios");
		
		System.out.println(clinica);
		
		/*Inserto a Snoopy el comentario “Viene acompañado de su hermano Spike”.*/
		clinica.insertarcomen("Snnopy", "Viene acompañado de su hermano Spike");
		clinica.insertarcomen("Garfield", "Llega a la consulta con un empacho de lasaña");
		clinica.insertarcomen("Piolin", "Repite continuamente 'Me parece que he visto a un lindo gatito'");
		clinica.insertarcomen("Godzilla", "Sufre heridas de su pelea contra Gamera");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("todos los animales con sus comentarios");
		System.out.println(clinica.toString());
	}

}
