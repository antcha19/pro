package ejercicio96;

public class principal96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fraccion f1 = new fraccion(2,3);
		fraccion f2 = new fraccion(2,3);
		fraccion fmul =  f1.multiplicar(f2);
		f1.escribir_fraccion();
		f2.escribir_fraccion();
		fmul.escribir_fraccion();
		fmul = fmul.invertir();
		fmul.escribir_fraccion();
		fraccion fdividir = f1.dividir(f2);
		fdividir.escribir_fraccion();
	}

}
