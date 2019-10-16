package exc_handling;

public class TestCheckedExc {

	public static void main(String[] args) {
		System.out.println("before");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("in interrupted exc....");
		}
		System.out.println("after");

	}

}
