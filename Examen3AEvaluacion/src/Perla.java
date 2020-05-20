
import java.util.*;

public class Perla implements Interface_Perla {

	private int peso;
	private double precio;
	private String material;

	public Perla() {
		this.peso = peso_aleatorio();
		this.precio = calcular_precio();
		this.material = material_aleatorio();
	}

	public void calcular() {

		Random r = new Random();
		int peso = r.nextInt(100) + 50;

	}

	// Calcula un peso aleatorio entre 50 y 100g
	public int peso_aleatorio() {
		Random r = new Random();
		int peso = r.nextInt(50) + 50;
		return peso;
	}

	// Devuelve un material aleatorio entre (oro,plata,platino y rodio)
	public String material_aleatorio() {
		Random r = new Random();
		String material = "";
		int aleatorio = r.nextInt(4) + 1;
		if (aleatorio == 1) {
			material = "plata";
		} else if (aleatorio == 2) {
			material = "oro";
		} else if (aleatorio == 3) {
			material = "platino";
		} else if (aleatorio == 4) {
			material = "rodio";
		}
		return material;
	}

	// Calcula el precio de la perla teniendo en cuenta que:

	public double calcular_precio() {
		

		double precio = 0;
		if (this.material.equals("plata")) {
			precio = peso * 2.25;
		} else if (this.material.equals("oro")) {
			precio = peso * 7.5;
		} else if (this.material.equals("platino")) {
			precio = peso * 10;
		} else if (this.material.equals("rodio")) {
			precio = peso * 12;
		}
		return precio;

	}

	// Devuelve la descripci�n de la perla.
	public String toString() {

		return "-" + "Perla de: " + material + " que pesa " + peso + "g. PVP: " + precio;

	}

}
