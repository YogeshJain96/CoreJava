package thrds2;

//implements scenario
public class MyRunnableTask implements Runnable {
	

	@Override
	public void run() // throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + " exec #" + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("err in " + Thread.currentThread().getName() + " exc " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");

	}

}
