package local_date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import static java.time.LocalDate.*;

public class TestLocalDate {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			/*
			 * Create LocalDate instance to represent current date & display it. Hint :
			 * now()
			 */
			LocalDate d1 = now();
			System.out.println(d1);
			/*
			 * Accept day,month,year from user (as ints) & create LocalDate instance &
			 * display it. Hint : of(....)
			 */
			LocalDate d2 = of(2019, 1, 25);
			System.out.println(d2);
			// parse
			System.out.println("Enter join date yr-mon-day");
			LocalDate d3 = parse(sc.next());
			System.out.println(d3);
			/*
			 * Create LocalDate instance to represent current date & display it. Create a
			 * local date 30 days after current date & display it. (Hint : plus)
			 */
			LocalDate d4 = d1.plus(30, ChronoUnit.DAYS);
			System.out.println(d4);
			/*
			 * Create local date 1 year before current date & display it.(Hint : minus)
			 */
			LocalDate d5 = d1.minus(1, ChronoUnit.YEARS);
			System.out.println(d5);
			/*
			 * Display User's age. 
			 * I/P --User's birth date (day,mon,year) (Hint : until)
			 */
			System.out.println("Enter DOB");
			LocalDate dob=parse(sc.next());
			long ageInYrs=dob.until(d1).get(ChronoUnit.YEARS);
			System.out.println("Age in yrs "+ageInYrs);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
