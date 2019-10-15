package p5;

import java.util.Random;

public class BoB implements Bank {
	private static Random r;
	static {
		r=new Random();
	}

	@Override
	public int createAccount(String name, String type, double balance) {
		System.out.println("created a/c in BoB");
		return r.nextInt(500)+1;
	}

	@Override
	public boolean transferFunds(int srcAcctNo, int destAccNo, double amount) {
		System.out.println("transferring funds in BoB");
		return true;
	}

}
