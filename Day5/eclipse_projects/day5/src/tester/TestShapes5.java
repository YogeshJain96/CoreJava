package tester;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

class TestShapes5 {

	public static void main(String[] args) {
		Shape[] shapes = { new Circle(10, 20, 6), new Rectangle(20, 40, 13, 7) };
		for (Shape s : shapes) {
			System.out.println(s.area());
			if (s instanceof Circle)
				System.out.println(((Circle) s).calcPerimeter());
			else
				System.out.println("invalid shape : no perimeter");
		}
		

	}

}
