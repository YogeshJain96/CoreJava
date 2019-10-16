package method_overloading;
import java.util.Scanner;
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
	static void test(B o)
	{
		System.out.println("in B version");
	}
	static void test(A a)
	{
		System.out.println("in A version");
	}
	static void test(C c)
	{
		System.out.println("in c version");
	}
	/*
	 * static void test(String o) { System.out.println("in string version"); }
	 */
	/*
	 * static void test(Scanner o) { System.out.println("in scanner version"); }
	 */
}
class A{}
class B extends A {}
class C extends B{}
