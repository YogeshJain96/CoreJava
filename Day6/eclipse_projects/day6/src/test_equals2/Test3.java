package test_equals2;

public class Test3 {

	public static void main(String[] args) {
		Object e1=new Emp(10, "abc", 1000);
		Object e2=new Emp(100, "abc", 1000);
		Object e3=new Emp(10, "abc2", 1000);
		Object e4=new Emp(10, "abc", 1000);
		System.out.println(e1.equals(e2));
		String s="2343";
		System.out.println(e1.equals(s));
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e4));
	
	}

}
