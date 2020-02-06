package cafeteria;

import java.util.*;
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cafe cafeteria1 = new cafe(1000);
		
		cafeteria1.llenarcafetera();
		cafeteria1.servirtaza(90);
		cafeteria1.servirtaza(10);
		cafeteria1.agregarcafe(50);
		cafeteria1.servirtaza(960);
		cafeteria1.servirtaza(1);
		cafeteria1.agregarcafe(1200);
		cafeteria1.agregarcafe(50);
		cafeteria1.vaciarcafetera();
		cafeteria1.llenarcafetera();
		
		
			
	}

}
