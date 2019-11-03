package thrds2;

import static java.lang.Thread.currentThread;

public class JoiningTask implements Runnable {
	private Thread t1;
	public JoiningTask(Thread t1) {
		super();
		this.t1 = t1;
	}
	@Override
	public void run() {
		System.out.println(currentThread().getName() + " strted");
		try {
			//wait till t1 (IO Task 's thrd) completes
			t1.join();
		} catch (InterruptedException e) {
			System.out.println("err in " + currentThread().getName() + " exc " + e);
		}
		System.out.println(currentThread().getName() + " over");
		
		

	}

}
