package nested_classes;

//outer class
public class A {
	private int i;
	private static int j=890;
	public A(int i) {
		super();
		this.i = i;
	}
	void test()
	{
		//outer's instance method
		//display inner's state
		B b1=new B(123);
		b1.print();
	}
	static void show()
	{
		//outer's static method 
		//display inner's state
		A.B b1=new A(345).new B(123);
		b1.print();
		
	}
	//inner class = non static nested class
	class B
	{
		//non static members YES
		//static methods no
		//static final d.m
		private int k;
	//	private static int l;
		private static final int l=10;
		public B(int k) {
			super();
			this.k = k;
		}
		/*
		 * static void testMe() {
		 * 
		 * }
		 */
		 void print()
		{
			//print outer's d.m & inner's
			System.out.println("Outer's state "+i);
			System.out.println("Outer's static d.m"+j);
			System.out.println("inner's state "+k);
		}
	}

}
