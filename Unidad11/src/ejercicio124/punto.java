package ejercicio124;

public class punto {

	private int x;
	private int y;

	//constructor
	public punto(int x, int y) {
		this.x = x;
		this.y = y;
	}


	public String toString() {
		return "(" + x + "," + y + ")";
	}

	// getters
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	// setters
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

}
