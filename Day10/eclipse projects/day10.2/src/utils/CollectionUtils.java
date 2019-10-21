package utils;

import static utils.BankValidationRules.parseNValidateDate;
import static utils.BankValidationRules.validateBalance;
import static utils.BankValidationRules.validateType;

import java.util.HashMap;

import com.app.core.BankAccount;

public class CollectionUtils {
	// a static method to return sample account in AL
	public static HashMap<String, BankAccount> populateAccounts() {
		HashMap<String, BankAccount> hm = new HashMap<>();
		try {

			System.out.println(hm.put("bob-001", new BankAccount("bob-001", "abc", validateBalance(16000), parseNValidateDate("1-8-2018"),
					validateType("saving"))));
			System.out.println(hm.put("bob-008", new BankAccount("bob-008", "abc5", validateBalance(5000), parseNValidateDate("11-2-2019"),
					validateType("saving"))));
			System.out.println(hm.put("bob-003", new BankAccount("bob-003", "abc7", validateBalance(15000), parseNValidateDate("1-8-2018"),
					validateType("current"))));

			System.out.println(hm.putIfAbsent("bob-001", new BankAccount("bob-001", "abc4", validateBalance(150000),
					parseNValidateDate("21-3-2019"), validateType("current"))));
			System.out.println(hm.put("bob-002", new BankAccount("bob-002", "abc3", validateBalance(19000), parseNValidateDate("2-4-2019"),
					validateType("saving"))));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return hm;
	}

	// write a static method to fetch acct details by acct no
	/*
	 * public static BankAccount getAccountByNo(String accNo, HashMap<String,
	 * BankAccount> list) throws BankHandlingException { int index =
	 * list.indexOf(new BankAccount(accNo)); if (index == -1) throw new
	 * BankHandlingException("Invalid acct no!!!!!"); return list.get(index); }
	 */

}
