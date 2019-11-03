package cust_exc;

@SuppressWarnings("serial")
public class BankHandlingException extends Exception {
	public BankHandlingException(String mesg) {
		super(mesg);
	}
}
