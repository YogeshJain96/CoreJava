package com.app.core;
import static utils.BankValidationRules.*;

import cust_exscs.BankHandlingException;

/*
 * tate -- acct no(string), customer name , type(currently string later enum) , balance (double) 
 */
public class BankAccount {
	private String acctNo, name, type;
	private double balance;
	public static final double INTEREST_RATE;
	static {
		INTEREST_RATE=0.07;
	}

	public BankAccount(String acctNo, String name, String type, double balance) {
		super();
		this.acctNo = acctNo;
		this.name = name;
		this.type = type;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", name=" + name + ", type=" + type + ", balance=" + balance + "]";
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("in bank acct equals");
		if (o instanceof BankAccount)
			return acctNo.equals(((BankAccount) o).acctNo);
		return false;
	}
	/*
	 * B.L --withdraw,deposit,fundsTransfer, apply simple Interest.
	 * 
	 * 
	 */
	public void deposit(double amt)
	{
		balance += amt;
	}
	public void withdraw(double amt) throws BankHandlingException
	{
		validateBalance(balance-amt);
		balance -= amt;
	}
	public void transferFunds(BankAccount dest,double amt) throws BankHandlingException
	{
		this.withdraw(amt);
		dest.deposit(amt);
	}
	public void applyInterest()
	{
		balance += (balance*INTEREST_RATE);
	}
	
}
