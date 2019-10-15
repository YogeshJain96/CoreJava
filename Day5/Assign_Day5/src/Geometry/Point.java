package Geometry;

public class Point {
	public int x,y;

	public Point(int x, int y) {
		//super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point of Origin [x=" + x + ", y=" + y +"]";
	}
}
