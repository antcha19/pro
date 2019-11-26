package unidad5;



import java.util.*;
public class hundirflota {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] tab = new char[6][6];
		char[][] grum = new char[6][6];
		int num_trans=1;
		int num_car=1;
		int num_lan=1;
		int num_disp=1;
		int num_aguas=0;
		int i=0;
		int j=0;
		String nombre;
		String opcion;
		String[] coords = new String[2];
		String[] trans = new String[3];
		int coordX = 0;
		int coordY = 0;
		int tiradaX = 0;
		int tiradaY = 0;
		boolean todolibre = true;
		boolean mapas_iguales = false;
		//Inicializamos el tablero a espacios
		for (i = 0; i < 6; i++) {
			for (j = 0; j < 6; j++) 
			{
				tab[i][j] = '_';
				}
			}
			//Inicializamos el tablero del grumete a espacios
		for (i = 0; i < 6; i++) {
			for (j = 0; j < 6; j++) {
				grum[i][j] = '_';
				}
			}
			//PRIMERA PARTE DEL PROGRAMA: TIRA EL CAPITAN 
		System.out.println("Bienvenido al juego de hundir la flota 6x6, introduzca su nombre:");
		nombre = sc.nextLine();
		System.out.println("Hola, Capitan " + nombre + ". Déjeme que le ayude a configurar su flota.");
		
		//Configuramos los transatlánticos
		System.out.println("Introduzca la posición de su transatlántico numero " + num_trans + " de 3 o 'stop' para dejar de introducir datos:");
		opcion = sc.nextLine();
		while (!opcion.equals("stop")) {
			coords = opcion.split(" ");
			coordX = Integer.parseInt(coords[0]);
			coordY = Integer.parseInt(coords[1]);
			if ((coordY + 3) > 5) {
				System.out.println("Ese transatlántico no cabe en el tablero, Capitan " + nombre + ". Acuérdese que ocupan 4 posiciones en horizontal");
				System.out.println("Se lo vuelvo a preguntar...");
				System.out.println("Introduzca la posición de su transatlántico numero " + num_trans + " de 3 o 'stop' para dejar de introducir datos:");
				opcion = sc.nextLine();
				}else 
				{
					
					i = 0;
					todolibre = true;
					while (i < 4) {
						if (tab[coordX][coordY+i] != '_') {
							System.out.println("No puedo ubicar el transatlántico ahí, Capitan " + nombre + ". Se solapa con algo.");
							System.out.println("Se lo vuelvo a preguntar...");
							todolibre = false;
							break;
							}
								i++;                  
								}
							if (todolibre){
								i = 0;
								while (i < 4) {
									tab[coordX][coordY+i] = 'T';
									i++;
									}
								num_trans++;
								}
							if (num_trans > 3) {
								opcion = "stop";
								}else 
								{                        
								System.out.println("Introduzca la posición de su transatlántico numero " + num_trans + " de 3 o 'stop' para dejar de introducir datos:");
								opcion = sc.nextLine();
								}
							}
						}
				//while transatlánticos
		System.out.println("Capitan " + nombre + " aqui están sus transatlánticos...");
		for (i = 0; i < 6; i++) {
			for (j = 0; j < 6; j++) {
				System.out.print(tab[i][j] + " ");
				}
			System.out.println("");
			}
		System.out.println("Ahora vamos a ubicar los cargueros...");
			//Configuramos los cargueros        
		System.out.println("Introduzca la posición de su carguero numero " + num_car + " de 3 o 'stop' para dejar de introducir datos:");
		opcion = sc.nextLine();
		while (!opcion.equals("stop")) {
			coords = opcion.split(" ");
			coordX = Integer.parseInt(coords[0]);
			coordY = Integer.parseInt(coords[1]);
			if ((coordX + 2) > 5) {                 
				System.out.println("Ese carguero no cabe en el tablero, Capitan " + nombre + ". Acuérdese que ocupan 3 posiciones en vertical");                    
				System.out.println("Se lo vuelvo a preguntar...");
				System.out.println("Introduzca la posición de su carguero numero " + num_car + " de 3 o 'stop' para dejar de introducir datos:");
				opcion = sc.nextLine();
				}
			else {
				i = 0;
				todolibre = true;
				while (i < 3) {
					if (tab[coordX+i][coordY] != '_') {
						System.out.println("No puedo ubicar el carguero ahí, Capitan " + nombre + ". Se solapa con algo.");
						System.out.println("Se lo vuelvo a preguntar...");
			todolibre = false;
			break;                        }
			i++;                    }
				if (todolibre){
					i = 0;
					while (i < 3) {
						tab[coordX+i][coordY] = 'C';
						i++;
						}
					num_car++;
					}
				if (num_car > 3) {
					opcion = "stop";
					}else 
						{
						System.out.println("Introduzca la posición de su carguero numero " + num_car + " de 3 o 'stop' para dejar de introducir datos:");
						opcion = sc.nextLine();
						}
				}
			}//while carguero
		System.out.println("Capitan " + nombre + " aqui están sus transatlánticos y sus cargueros...");
		for (i = 0; i < 6; i++) {
			for (j = 0; j < 6; j++) {  
				System.out.print(tab[i][j] + " ");
				}
			System.out.println("");
			}
		System.out.println("Ahora vamos a ubicar las lanchas...");
		//Configuramos las lanchas
		System.out.println("Introduzca la posición de su lancha numero " + num_lan+ " de 5 o 'stop' para dejar de introducir datos:");
		opcion = sc.nextLine();
				while (!opcion.equals("stop")) {
					coords = opcion.split(" ");
					coordX = Integer.parseInt(coords[0]);
					coordY = Integer.parseInt(coords[1]);
					if ((coordX > 5) || (coordY >5)) {
						System.out.println("Esa lancha no la puedo ubicar en el tablero, Capitan " + nombre + ". Acuérdese que el tablero es 6x6");
						System.out.println("Se lo vuelvo a preguntar...");
						System.out.println("Introduzca la posición de su lancha " + num_lan + " de 5 o 'stop' para dejar de introducir datos:");
						opcion = sc.nextLine();
						}else 
						{
							todolibre = true;
							if (tab[coordX][coordY] != '_') {
								System.out.println("No puedo ubicar la lancha ahí, Capitan " + nombre + ". Se solapa con algo.");
								System.out.println("Se lo vuelvo a preguntar...");
								todolibre = false;
								}
							if (todolibre){
								tab[coordX][coordY] = 'L';
								num_lan++;
								}
							if (num_lan > 5) {
								opcion = "stop";
								}else 
								{
	                 System.out.println("Introduzca la posición de su lancha numero " + num_lan + " de 5 o 'stop' para dejar de introducir datos:");
	                 opcion = sc.nextLine();
	                 }
							}
					}//while lancha       
				System.out.println("Capitan " + nombre + " aqui están sus transatlánticos, sus cargueros y sus lanchas...");
				for (i = 0; i < 6; i++) {
					for (j = 0; j < 6; j++) {
						System.out.print(tab[i][j] + " ");
						}
					System.out.println("");
					}
				//SEGUNDA PARTE DEL PROGRAMA: AHORA TIRA EL GRUMETE1
				System.out.println("Ahora es el momento de jugar, grumete!, has de hacer frente a " + (num_trans-1) + " transatlánticos, " + (num_car-1) + " cargueros y " + (num_lan-1) + " lanchas.");
				System.out.println("Acuérdate que puedes hacer agua solo en 5 ocasiones!");
				//No validamos las coordenadas de la tirada del grumete 
				dibujar_mapa_grumete(grum);
				System.out.println("¿Cuál será tu disparo número " + num_disp + "?");195tiradaX = sc.nextInt();196tiradaY = sc.nextInt();197while (num_aguas != 5){198if (tab[tiradaX][tiradaY] != '_') {199grum[tiradaX][tiradaY] = tab[tiradaX][tiradaY];200                System.out.println("IMPACTO!, parece que le hemos dado a algo!");201            }202else {203num_aguas++;204                System.out.println("AGUA!, y llevas: " + num_aguas);205            }206dibujar_mapa_grumete(grum);207mapas_iguales = comparar_mapas(tab, grum);208if (mapas_iguales) {209dibujar_mapa_grumete(grum);210break;211            }212num_disp++;213if (num_aguas != 5) {214                System.out.println("¿Cuál será tu disparo número " + num_disp + "?");215tiradaX = sc.nextInt();216tiradaY = sc.nextInt();217            }218        }219220if (mapas_iguales) {221            System.out.println("¡Enhorabuena grumete! Has ganado la partida en solo " + num_disp + " tiradas.");222        }else {223            System.out.println("Lo siento, hiciste agua en 5 ocasiones!");224        }225        System.out.println("GAME OVER");226227    }//main228229publicstaticvoid dibujar_mapa_grumete(char[][] grum) {230for (inti = 0; i < 6; i++) {231for (intj = 0; j < 6; j++) {Page 4
		Ejercicio1.java232                System.out.print(grum[i][j] + " ");233            }234            System.out.println("");235        }236    }237238publicstaticboolean comparar_mapas(char[][] tab, char[][] grum) {239booleanigual = true;240for (inti = 0; i < 6; i++) {241for (intj = 0; j < 6; j++) {242if (tab[i][j] != grum[i][j]) {243igual = false;244                }245            }246        }247returnigual;248    }249 

	}

}
