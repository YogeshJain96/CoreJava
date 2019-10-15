package Geometry;
import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Total Shapes:");
		int n=sc.nextInt();
		Computable[] shapes=new Computable[n];
		int countShapes=0;
		
		//Menu
		boolean exit=false;
		while(!exit) {
			System.out.println("Menu:");
			System.out.println("1: Add Circle");
			System.out.println("2: Add Rectangle");
			System.out.println("3: Display area & perimeter of all shape");
			System.out.println("0: Exit");
			System.out.println("Enter Choice:");
		
			switch (sc.nextInt()) {
			case 1:
				if(countShapes<n) {
					shapes[countShapes++]=new Circle(10,20,12.5);
					System.out.println("Circle Added");}
				else
					System.out.println("Can't Add more Shapes!");
				break;
			case 2:
				if(countShapes<n) {
					shapes[countShapes++]=new Rectangle(10,20,15,20);
					System.out.println("Rectangle Added");}
				else
					System.out.println("Can't Add more Shapes!");
				break;
			case 3:{System.out.println("Shape's Area and Perimeter");
					for(Computable sh:shapes) {
						if(sh!=null) {
							System.out.println("--------------------------");
							System.out.println(sh);
							System.out.print("Area: "+sh.area());
							System.out.println(" and Perimeter: "+sh.perimeter());
							if(sh instanceof Circle)
								((Circle)sh).drawArc();
							if(sh instanceof Rectangle)
								((Rectangle)sh).diagonals();
							
						}
						else {
							System.out.println("List End");
							break;
						}
					}
				}
				break;
			case 0:System.out.println("Bye!");
					exit=true;
				break;
			default:System.out.println("Invalid Choice!");
				break;
			}
		
		}
	}
}
