package test_overload;
class TestRefOverload 
{
	public static void main(String[] args) 
	{
		test((byte)123);
	}
	/*static void test(Object o)
	{
		System.out.println("in obj version");
	}*/
	static void test(String o)
	{
		System.out.println("in string version");
	}
	static void test(Integer o)
	{
		System.out.println("in Integer version");
	}
	
}
