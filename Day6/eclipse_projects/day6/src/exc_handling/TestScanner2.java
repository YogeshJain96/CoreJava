package exc_handling;

import java.util.Scanner;

import co_variance.Fruit;

public class TestScanner2 {

	public static void main(String[] args) {
		//try-with-resources
		try(Scanner sc = new Scanner(System.in);
			//	System.out.println("fdhgfad");
			//	Fruit f1=new Fruit();
				) {
			System.out.println("Enter complete name");
		//	System.out.println(10/0);
			System.out.println("Hello , " + sc.nextLine());
		} 
		System.out.println("main over...");

	}

}
