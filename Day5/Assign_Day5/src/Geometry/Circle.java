package Geometry;
//import static Geometry.Computable.PI;//Not required as it's Implemented already via Interface
public class Circle  extends Point implements Computable{
	
	private double r;
	
	Circle(int x, int y, double r){
		super(x,y);
		this.r=r;
	}
	
	@Override
	public String toString() {
		return "Circle [r=" + r +","+ super.toString() + "]";
	}
	
	@Override
	public double area() {
		double a;
		a=PI*r*r;
		return a;
	}

	@Override
	public double perimeter() {
		double p=2*PI*r;
		return p;
	}
	
	public void drawArc() { 
		System.out.println("drawing arc");
		}
	
}
