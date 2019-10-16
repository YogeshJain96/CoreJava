package exc_handling;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter complete name");
			System.out.println(10/0);
			System.out.println("Hello , " + sc.nextLine());
		} finally {
			System.out.println("closing scanner");
			if (sc != null)
				sc.close();
		}
		System.out.println("main over...");

	}

}
