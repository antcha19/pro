package ejercicio131;

import java.util.*;

public class Principal131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		// creamos 2 clientes
		Cliente cliente1 = new Cliente("Paco perez", "66656565");
		Cliente cliente2 = new Cliente("Gareth Bale", "65645689");

		// creamos 2 mesas
		Mesa mesa1 = new Mesa(2, "Terraza");
		Mesa mesa2 = new Mesa(4, "Comedor interno");

		// creo un restaurante y monto las 2 mesas
		Restaurante restaurante1 = new Restaurante("Bazofia para todos", 654323450);
		restaurante1.montarMesa(mesa1);
		restaurante1.montarMesa(mesa2);

		// listamos las 2 mesas y deberian estar libres
		System.out.println("-Listado de las mesas:");
		restaurante1.listarMesas();

		// Hago las reservas de las 2 mesas
		Reserva reserva1 = new Reserva("01/06/2020", 20, 2, mesa1, cliente1);
		Reserva reserva2 = new Reserva("01/06/2020", 22, 4, mesa2, cliente2);

		// Obtenemos los datos de la mesa de la terraza, ahora está ocupada
		System.out.println("-Estado de la mesa de la terraza:");
		System.out.println(mesa1.obtenerDatosMesa());

		// Obtenemos los datos de la mesa del comedor interno, ahora está ocupada
		System.out.println("-Estado de la mesa del comedor interno:");
		System.out.println(mesa2.obtenerDatosMesa());

		// Damos de alta 3 ingredientes
		Ingrediente ingre1 = new Ingrediente("tomate", 100);
		Ingrediente ingre2 = new Ingrediente("spaghetti", 200);
		Ingrediente ingre3 = new Ingrediente("queso", 30);

		// Creamos un plato con esos 3 ingredientes
		Plato plato1 = new Plato("Spaghetti al plato");
		plato1.anyadir_ingrediente(ingre1);
		plato1.anyadir_ingrediente(ingre2);
		plato1.anyadir_ingrediente(ingre3);

		System.out.println("------------------------------");
		System.out.println("Ingredientes de los spaguetti:");
		plato1.consultar_ingredientes();

		/* Creamos otro plato con 2 ingredientes de antes y uno nuevo */
		Plato plato2 = new Plato("Pizza barbacoa");
		Ingrediente ingre4 = new Ingrediente("carne piacada", 300);
		plato2.anyadir_ingrediente(ingre1);
		plato2.anyadir_ingrediente(ingre3);
		plato2.anyadir_ingrediente(ingre4);
		System.out.println("------------------------------");
		System.out.println("Ingredientes de la pizza:");
		plato2.consultar_ingredientes();

		// creamos un ultimo plato con un nuevo ingrediente
		Plato plato3 = new Plato("Entrecot con salsa de queso");
		Ingrediente ingre5 = new Ingrediente("entrecot", 500);
		plato3.anyadir_ingrediente(ingre5);
		plato3.anyadir_ingrediente(ingre3);
		System.out.println("------------------------------");
		System.out.println("-Ingredientes del entrecot:");
		plato3.consultar_ingredientes();

		// Desde la mesa m1 se piden los 3 platos creados anteriormente
		mesa1.pedirPlato(plato1);
		mesa1.pedirPlato(plato2);
		mesa1.pedirPlato(plato3);

		//// Resumimos los 3 platos que se han pedido en esa mesa
		System.out.println("------------------------------");
		System.out.println("-Platos pedidos de la primera mesa");
		mesa1.detalle_platos();
		// Piden la factura de la mesa y se van
		System.out.println("La mesa ha gastado : " + mesa1.calcular_factura() + " € y se van. ");
		mesa1.liberarMesa();

		System.out.println("---------------------");
		// La segunda mesa pide 4 entrecots
		mesa2.pedirPlato(plato3);
		mesa2.pedirPlato(plato3);
		mesa2.pedirPlato(plato3);
		mesa2.pedirPlato(plato3);
		System.out.println("-Platos pedidos de la segunda mesa");
		mesa2.detalle_platos();

		// piden la factura de la mesa y se van
		System.out.println("-La mesa ha gastado: " + mesa2.calcular_factura() + "€ y se van.");
		mesa2.liberarMesa();

		// Comprobamos el total de la caja
		System.out.println("El restaurante ha facturado: " + restaurante1.calcular_caja() + "€.");

		System.out.println("---------------------");
		// Al final del dia desmontamos las mesas
		// Empezamos recogiendo la mesa m1
		restaurante1.recogerMesa(mesa1);

		// Si listamos las mesas solo nos aparece la mesa mesa2, ya que la mesa1 la
		// hemos recogido
		restaurante1.listarMesas();

		// Recogemos la mesa m2
		restaurante1.recogerMesa(mesa2);
//////		//Comprobamos que todas las mesas estan recogidas.
//////		//Esta llamada devuelve el mensaje "Todas las mesas estan recogidas"
		restaurante1.listarMesas();

	}

}
