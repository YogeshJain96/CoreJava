package tester;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

public class TestShapes4 {

	public static void main(String[] args) {
		Shape s=new Rectangle(10,20, 5, 10);//up casting
		System.out.println(s);//D.M.D
		System.out.println(s.area());//D.M.D
		s=new Circle(34, 56, 10);
		System.out.println(s);//D.M.D
		System.out.println(s.area());//D.M.D
		((Circle)s).calcPerimeter();
		s=new Rectangle(10,20, 5, 10);
		((Circle)s).calcPerimeter();//class cast ext
		
		
	
	}

}
