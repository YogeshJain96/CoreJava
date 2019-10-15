package shapes;

public abstract class Shape {
	private int x, y;

	public Shape(int x, int y) {
		// super();
		this.x = x;
		this.y = y;
	}
	/*
	 * public Shape() { // TODO Auto-generated constructor stub }
	 */

	@Override
	public String toString() {
		System.out.println("in shape's tostring");
	//	System.out.println(super.toString());
		return x + " " + y;
	}
	//area
	public abstract double area();
	

}
