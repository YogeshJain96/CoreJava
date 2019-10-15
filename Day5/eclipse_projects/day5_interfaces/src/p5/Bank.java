package p5;

public interface Bank {
	int createAccount(String name,String type,double balance);
	boolean transferFunds(int srcAcctNo,int destAccNo,double amount);
}
