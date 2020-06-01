import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class CONSULTASSOBREVARIASTABLAS {

	private static String db = "db1";
	private static String login = "root";
	private static String password = "tricolorn88";
	private static String url_ = "jdbc:mysql://127.0.0.1:3306/" + db;

	private static Connection connection_;
	private static Statement st_ = null;

	public CONSULTASSOBREVARIASTABLAS() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection_ = DriverManager.getConnection(url_, login, password);
			if (connection_ != null) {
				st_ = connection_.createStatement();
				System.out.println("conexion correcta");
			} else {
				System.out.println("conexion fallida");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		CONSULTASSOBREVARIASTABLAS conexion = new CONSULTASSOBREVARIASTABLAS();

		int opcion = 0;
		boolean salir = false;

		System.out.println("Consultas sobre varias tablas");

		while (!salir) {
			menu();
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				opcion1();
				break;
			case 2:
				opcion2();
				break;
			case 3:
				opcion3();
				break;
			case 4:
				opcion4();
				break;
			case 5:
				opcion5();
				break;
			case 6:
				opcion6();
				break;

			case 7:
				salir = true;
				break;

			default:
				break;
			}
		}

	}

	public static void menu() {
		System.out.println(
				"1: Obtener el nombre y la categoría de los puertos ganados por ciclistas del equipo ‘Banesto’. ");
		System.out.println(
				"2: Obtener el nombre de cada puerto indicando el número (netapa) y los kilómetros de la etapa en la que se encuentra el puerto");
		System.out.println(
				"3: Obtener el nombre y el director de los equipos a los que pertenezca algún ciclista mayor de 33 años.");
		System.out.println("4: Obtener el nombre de los ciclistas con el color de cada maillot que hayan llevado.");
		System.out.println(
				"5: Obtener pares de nombre de ciclista y número de etapa tal que ese ciclista haya ganado esa etapa habiendo llevado el maillot de color ‘Amarillo’ al menos una vez.");
		System.out.println(
				"6: Obtener el valor del atributo netapa de las etapas que no comienzan en la misma ciudad en que acabó la anterior etapa. ");
		System.out.println("7: Salir");
	}

	public static void opcion1() {
		String query = "SELECT * FROM maillot; ";
		System.out.println("-------------------------------------------------------------");
		System.out.println("COD\tTIPO\t\t\tcolor");
		try {
			Statement stmt = connection_.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getString("codigo") + "\t" + rs.getString("tipo") + "\t\t\t"
						+ rs.getString("color") + "\t\t\t" + rs.getString("premio"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void opcion2() {
		int contador = 0;
		String query1 = "SELECT * FROM db1.ciclista\n" + "where edad <= 25; ";
		System.out.println("-------------------------------------------------------------");

		try {
			Statement stmt = connection_.createStatement();
			ResultSet rs = stmt.executeQuery(query1);
			while (rs.next()) {
				System.out.println(rs.getString("dorsal") + "\t" + rs.getString("nombre"));
				contador++;

			}
			System.out.println(contador + " filas selecionadas");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void opcion3() {
		int contador = 0;
		String query3 = "SELECT * FROM db1.puerto where categoria = 'E'; ";
		System.out.println("-------------------------------");
		System.out.println("Altura" + "\t" + "NomPuerto");
		try {
			Statement stmt = connection_.createStatement();
			ResultSet rs = stmt.executeQuery(query3);
			while (rs.next()) {
				System.out.println(rs.getString("altura") + "\t" + rs.getString("nompuerto"));
				contador++;

			}
			System.out.println(contador + " filas selecionadas");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void opcion4() {
		int contador = 0;
		String query3 = "SELECT * FROM db1.etapa where salida = llegada; ";
		System.out.println("-------------------------------");
		System.out.println("NETAPA");
		try {
			Statement stmt = connection_.createStatement();
			ResultSet rs = stmt.executeQuery(query3);
			while (rs.next()) {
				System.out.println(rs.getString("netapa"));
				contador++;

			}
			System.out.println(contador + " filas selecionadas");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void opcion5() {
		int contador = 0;
		String query3 = "SELECT count(*) as ciclistas FROM db1.ciclista; ";
		System.out.println("--------------");
		System.out.println("Ciclistas");
		try {
			Statement stmt = connection_.createStatement();
			ResultSet rs = stmt.executeQuery(query3);
			while (rs.next()) {
				System.out.println(rs.getString("ciclistas"));
				contador++;

			}
			System.out.println(contador + " filas selecionadas");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void opcion6() {
		int contador = 0;
		String query3 = "SELECT count(*) FROM db1.ciclista where edad > 25; ";
		System.out.println("--------------");
		System.out.println("ciclistas mayores de 25 anyos");
		try {
			Statement stmt = connection_.createStatement();
			ResultSet rs = stmt.executeQuery(query3);
			while (rs.next()) {
				System.out.println(rs.getString("count(*)"));
				contador++;

			}
			System.out.println(contador + " filas selecionadas");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
