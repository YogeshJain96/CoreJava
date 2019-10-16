package exc_handling;

import java.io.IOException;

public class TestFinally1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("1");
		try {
			testMe();
			System.out.println("back in main");
		} catch (Exception e) {
			System.out.println("in main's catch-all  " + e + " msg : " + e.getMessage());
		} finally {
			System.out.println("in main's finally");
		}
		System.out.println("main over..");

	}

	private static void testMe() throws Exception// throws InterruptedException,IOException
	{
		try {
			System.out.println("in try");
			String[] ss = { "aa", "bb" };
			Thread.sleep(123);
			System.out.println(ss[0]);
			System.out.println("Press enter to continue...");
			System.in.read();
			boolean flag = false;
			if (flag)
				return;
			System.out.println("end of try");
		} finally {
			System.out.println("in meth's finally");
		}
		System.out.println("meth end");
	}

}
