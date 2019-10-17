package utils;

import cust_exscs.BankHandlingException;

public class BankValidationRules {
	public static final double MIN_BAL;
	static {
		MIN_BAL = 1000;
	}

	// validate balance rule
	public static double validateBalance(double bal) throws BankHandlingException {
		if (bal < MIN_BAL)
			throw new BankHandlingException("Insufficient funds!!!!");
		return bal;
	}

	// validate a/c type
	public static String validateType(String type) throws BankHandlingException{
		switch (type.toUpperCase()) {
		case "SAVING":
		case "CURRENT":
		case "FD":
		case "LOAN":
		case "DMAT":
			return type;

		default: throw new BankHandlingException("Invalid A/C Type");
			
		}
	}
}
