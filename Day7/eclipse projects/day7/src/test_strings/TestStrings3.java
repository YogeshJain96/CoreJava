package test_strings;

public class TestStrings3 {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		String s4 = "Hello";
		String s3 = new String(s1);

		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s4));
		System.out.println(s1 == s4);
		System.out.println(s1.equalsIgnoreCase(s4));
//		s1 = s2 = s3 = s4 = null;//How many objects will be marked for GC ?

	}

}
