package test_equals;

public class Test2 {

	public static void main(String[] args) {
		Emp e1=new Emp(10, "abc", 1000);
		Emp e2=new Emp(100, "abc", 1000);
		
		System.out.println(e1.equals(e2));
	
	}

}
