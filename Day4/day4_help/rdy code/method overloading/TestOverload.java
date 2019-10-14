package tester;
class TestOverload 
{
	public static void main(String[] args) 
	{
		test(null);
	}
	static void test(Object o)
	{
		System.out.println("in obj version");
	}
	static void test(String o)
	{
		System.out.println("in string version");
	}
	static void test(Integer o)
	{
		System.out.println("in Integer version");
	}
}
