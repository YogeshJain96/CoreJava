package utils;

import static utils.BankValidationRules.parseNValidateDate;
import static utils.BankValidationRules.validateBalance;
import static utils.BankValidationRules.validateType;

import java.util.ArrayList;
import java.util.HashMap;

import com.app.core.BankAccount;

import cust_exc.BankHandlingException;

public class CollectionUtils {
	// a static method to return sample account in HM
	public static HashMap<String,BankAccount> populateAccounts() {
		HashMap<String,BankAccount> hm=new HashMap<>();
		ArrayList<BankAccount> l1 = new ArrayList<>();
		try {

			l1.add(new BankAccount("bob-001", "abc", validateBalance(16000), parseNValidateDate("1-8-2018"),
					validateType("saving")));
			l1.add(new BankAccount("bob-008", "abc5", validateBalance(5000), parseNValidateDate("11-2-2019"),
					validateType("saving")));
			l1.add(new BankAccount("bob-003", "abc7", validateBalance(15000), parseNValidateDate("1-8-2018"),
					validateType("current")));

			l1.add(new BankAccount("bob-006", "abc4", validateBalance(150000), parseNValidateDate("21-3-2019"),
					validateType("current")));
			l1.add(new BankAccount("bob-002", "abc3", validateBalance(19000), parseNValidateDate("2-4-2019"),
					validateType("saving")));
			//copy this info in HM
			
			for(BankAccount a : l1)
				hm.put(a.getAcctNo(), a);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return hm;
	}

	// write a static method to fetch acct details by acct no
	public static BankAccount getAccountByNo(String accNo, HashMap<String,BankAccount> map) throws BankHandlingException {
		BankAccount a=map.get(accNo);
		if(a == null)
			throw new BankHandlingException("Invalid acct no!!!!");
		return a;
	}

}
