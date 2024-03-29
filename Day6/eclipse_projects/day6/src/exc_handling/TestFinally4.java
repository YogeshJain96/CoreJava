package exc_handling;

public class TestFinally4 {

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

	private static void testMe() 
	{
		try {
			System.out.println("in try");
			String[] ss = { "aa", "bb" };
			System.out.println(ss[1]);
			boolean flag = true;
			if (flag)
				System.exit(0);
			System.out.println("end of try");
		} finally {
			System.out.println("in meth's finally");
		}
		System.out.println("meth end");
	}

}
