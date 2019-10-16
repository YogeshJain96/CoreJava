package test_equals2;

public class TestStringEquals {

	public static void main(String[] args) {
		String s1=new String("abc");
		String s2=new String("abc");
		System.out.println(s1==s2);//ref equality
		System.out.println(s1.equals(s2));//content equality
		

	}

}
