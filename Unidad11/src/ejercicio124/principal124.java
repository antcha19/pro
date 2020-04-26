package ejercicio124;


public class principal124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//vector
		punto p1 = new punto(0,0);
		punto p2 = new punto(2,0);
		punto p3 = new punto(2,2);
		punto p4 = new punto(0,2);
		
		//array
		punto[] listadopuntos = new punto [4];
		 listadopuntos[0] = p1;
		 listadopuntos[1] = p2;
		 listadopuntos[2] = p3;
		 listadopuntos[3] = p4;
		
		 
		 poligono poli = new poligono(listadopuntos);
		  System.out.println(poli.toString());
		  poli.trasladar(4, -3);
		  System.out.println(poli.toString());
		  poli.escalar(2, 2);
		  System.out.println(poli.toString());
		  System.out.println(poli.numVertices());
		 
		
	}

}
