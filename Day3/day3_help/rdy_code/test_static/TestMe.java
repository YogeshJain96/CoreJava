package test_static;
import static test_static.TestStatic2.*;

public class TestMe {

	public static void main(String[] args) {
		System.out.println("fm main ");
		System.out.println("counter="+counter);
		TestStatic2 t1 = new TestStatic2(45);
		TestStatic2 t2 = new TestStatic2(56);

	}
}
