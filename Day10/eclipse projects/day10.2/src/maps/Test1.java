package maps;

import java.util.*;

import com.app.core.BankAccount;

import static utils.CollectionUtils.populateAccounts;

public class Test1 {

	public static void main(String[] args) {
		HashMap<String, BankAccount> accts = populateAccounts();
		//display all acct details
	//	System.out.println(accts);
		for(BankAccount a : accts.values())
			System.out.println(a);
	}

}
