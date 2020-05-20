
public class Magdalena extends Bolleria{
	
	private String tipo;
	private boolean llevapapel;
	
	
	public Magdalena(double peso, String tipo, boolean llevapapel) {
		super(peso);
		this.tipo=tipo;
		this.llevapapel=llevapapel;
		
	}
	
	
//	public  String toString() {
//		String resultado = "magdalena de : " + peso +  " g. con forma " + tipo + " y " +
//	    llevapapel + "PVP: " + precio;
//		return resultado;
//	}
	
	
	public String toString() {
		String l1 = "Magdalena de :" ;
		String l2 = peso +  "g. con forma ";
		String l3 = tipo + "  y ";
		String l4 = "";
		if (llevapapel) {
			l4 = "lleva papel";
		} else {
			l4 = "no lleva papel";
		}
		String l5 = " PVP: " + precio;
	
		return l1 + l2 + l3 + l4 + l5;
	}
	

}
