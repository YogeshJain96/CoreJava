package tasks;

import utils.Account;

public class UpdaterTask implements Runnable {
	private Account jointAccount;

	public UpdaterTask(Account jointAccount) {
		super();
		this.jointAccount = jointAccount;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
			while (true) {
				jointAccount.updateBalance(500);
				Thread.sleep(100);
			}
		} catch (Exception e) {
			System.out.println("err in " + Thread.currentThread().getName() + " exc " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");

	}

}
