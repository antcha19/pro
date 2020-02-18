package ejercicio96;

public class fraccion {

	// atributos
	private int numerador;
	private int denominador;

	// metedo constructor
	public fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}

	// getter del atributo numerador
	public int get_numerador() {
		return numerador;
	}

	// getter del atributo numerador
	public int get_denominador() {
		return denominador;
	}

	public fraccion invertir() {
		fraccion f = new fraccion(0, 0);
		f.numerador = this.denominador;
		f.denominador = this.numerador;
		return f;
	}

	public void escribir_fraccion() {
		System.out.println(numerador + "/" + denominador);
	}

	public fraccion multiplicar(fraccion f) {
		fraccion m = new fraccion (0,0);
		m.numerador=f.numerador*this.numerador;
		m.denominador =f.denominador*this.denominador;
		//misma solucion
//		m.numerador=numerador*f.numerador;
//		m.denominador = denominador*f.denominador;
		return m;
	}

	public fraccion dividir(fraccion f) {
		fraccion v = new fraccion(0,0);
		v.numerador = numerador*f.denominador;
		v.denominador= denominador*f.numerador;
		return v;
	}

}
