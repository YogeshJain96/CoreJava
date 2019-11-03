package tester;

import tasks.CheckerTask;
import tasks.UpdaterTask;
import utils.Account;

public class Test1 {

	public static void main(String[] args) throws Exception{
		// create join acct
		Account a=new Account(5000);
		//create thrds n start the same
		Thread t1=new Thread(new UpdaterTask(a));
		Thread t2=new Thread(new CheckerTask(a));
		t1.start();t2.start();
		t1.join();
		t2.join();
		System.out.println("main over...");
			

	}

}
