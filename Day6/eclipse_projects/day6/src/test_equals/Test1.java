package test_equals;

public class Test1 {

	public static void main(String[] args) {
		Emp e1=new Emp(10, "abc", 1000);
		Emp e2=new Emp(10, "abc", 1000);
		Emp e3=e1;
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e1.hashCode()+" "+e2.hashCode()+" "+e3.hashCode());

	}

}
