package com.app.core;

import static utils.BankValidationRules.*;

import java.util.Date;

import cust_exscs.BankHandlingException;

/*
 * tate -- acct no(string), customer name , type(currently string later enum) , balance (double) 
 */
public class BankAccount {
	private String acctNo, name;
	private double balance;
	// a/c creation date
	private Date creationDate;
	//acct type : enum
	private AccType acType;
	public static final double INTEREST_RATE;
	static {
		INTEREST_RATE = 0.07;
	}

	public BankAccount(String acctNo, String name, double balance, Date creationDate,AccType acType) {
		super();
		this.acctNo = acctNo;
		this.name = name;
		this.acType=acType;
		this.balance = balance;
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", name=" + name + ", type=" + acType + ", balance=" + balance
				+ " created on " + sdf.format(creationDate);
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
	public void deposit(double amt) {
		balance += amt;
	}

	public void withdraw(double amt) throws BankHandlingException {
		validateBalance(balance - amt);
		balance -= amt;
	}

	public void transferFunds(BankAccount dest, double amt) throws BankHandlingException {
		this.withdraw(amt);
		dest.deposit(amt);
	}

	public void applyInterest() {
		balance += (balance * INTEREST_RATE);
	}

}
