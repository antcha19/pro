package arrayslist2;

public class ArrayList {
	
	
	
	private Object[] datoselemento;
	private int  i= 0;

	
	
	public ArrayList(int z) {
		datoselemento= new Object[z];
	}
	
	
	
	//puede almacenar
	public  Object get (int i) {
		return datoselemento[i];
	}
	
	public void add(Object o) {
		datoselemento[i] = o;
		i++;
	}
	
	
}
