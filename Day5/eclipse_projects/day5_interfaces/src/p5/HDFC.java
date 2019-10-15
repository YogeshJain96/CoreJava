package p5;

import java.util.Random;

public class HDFC implements Bank {
	private static Random r;
	static {
		r=new Random();
	}

	@Override
	public int createAccount(String name, String type, double balance) {
		System.out.println("created a/c in HDFC");
		return r.nextInt(500)+500;
	}

	@Override
	public boolean transferFunds(int srcAcctNo, int destAccNo, double amount) {
		System.out.println("transferring funds in HDFC");
		return true;
	}
	
	void payBills()
	{
		System.out.println("bill paments via HDFC");
	}

}
