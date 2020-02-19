package entrega3POO;

import java.util.*;

public class principalpelea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		
		luchador ken = new luchador("ken",100);
		luchador ryu = new luchador("ryu",100);
		luchador mrbison = new luchador("mr_bison",100);
		escenario  templopekin = new escenario ("templopekin");
		escenario  bisonmansion = new escenario ("bisonmansion");
		
		

		ken.inicio(ryu, templopekin);
		mrbison.inicio(ken,bisonmansion);
		ryu.inicio(ken, templopekin);
		
	//	ken.pelea(ryu);
		
		
		
	

		
		
	}
}
