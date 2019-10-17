package test_dates;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// SDF
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println("Enter DOB day/mon/yr");
			Date dob = sdf.parse(sc.next());
			System.out.println(dob);
			System.out.println("Foramatted date " + sdf.format(dob));

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}

		System.out.println("main over...");
	}
}
