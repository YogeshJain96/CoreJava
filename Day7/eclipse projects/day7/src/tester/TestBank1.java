package tester;

import java.util.Scanner;
import static utils.BankValidationRules.*;

import com.app.core.BankAccount;

public class TestBank1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a/c details no name type bal");
			// validation rules --type n bal
			BankAccount a = new BankAccount(sc.next(), 
					sc.next(), validateType(sc.next()),
					validateBalance(sc.nextDouble()));
			System.out.println("A/C created "+a);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
