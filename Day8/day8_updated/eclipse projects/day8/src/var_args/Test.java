package var_args;

public class Test {

	public static void main(String... args) {
		testMe();
		testMe(new double[] {2,3,4.5});
		testMe(10,23.45,67.789);

	}
	private static void testMe(double... vals)
	{
		System.out.println("Printing values");
		for(double d : vals)
			System.out.print(d+" ");
		System.out.println();
	}

}
