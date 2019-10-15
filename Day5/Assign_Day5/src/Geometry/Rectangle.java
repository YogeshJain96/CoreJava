package Geometry;

public class Rectangle extends Point implements Computable {
	private double width,height;
	
	public Rectangle(int x,int y,double width, double height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height +","+ super.toString() + "]";
	}
	
	@Override
	public double area() {
		double a=height*width;
		return a;
	}

	@Override
	public double perimeter() {
		double p=2*(height+width);
		return p;
	}

	public void diagonals(){
	 System.out.println("diagonals of rectangle are equal in length");
	}

}
