package exc_handling;

import java.util.Scanner;

import cust_exceptions.SpeedOutOfRangeException;
import utils.ValidationUtils;

public class TestCustomException {

	public static void main(String[] args) // throws SpeedOutOfRangeException
	{
		// sc --auto closeable manner
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter speed");
			ValidationUtils.checkSpeed(sc.nextInt());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("main over...");

	}

}
