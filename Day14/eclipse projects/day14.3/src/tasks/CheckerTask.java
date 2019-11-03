package tasks;

import utils.Account;

public class CheckerTask implements Runnable {
	private Account jointAccount;

	public CheckerTask(Account jointAccount) {
		super();
		this.jointAccount = jointAccount;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
			while (true) {
				double bal=jointAccount.getBalance();
				if(bal != 5000) {
					System.out.println("ERROR!!!!!!!!!!!!!!!");
					System.exit(1);
				}
				Thread.sleep(56);
			}
		} catch (Exception e) {
			System.out.println("err in " + Thread.currentThread().getName() + " exc " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");

	}

}
