package thrds1;

public class Tester {

	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread());
		// create child thrds to test concurrency
		MyThread m1 = new MyThread("one");
		MyThread m2 = new MyThread("two");
		MyThread m3 = new MyThread("three");
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " exec #" + i);
			Thread.sleep(100);
		}
		System.out.println("main over....");

	}

}
