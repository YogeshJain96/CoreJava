package test_strings;

public class Test4 {

	public static void main(String[] args) {
		byte[] bytes = { 65, 66, 67, 68, 69, 70, 71 };
		System.out.println(new String(bytes, 2, 3));
		System.out.println(new String(bytes));
		String s="testing string API";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(s.length()-1));
		System.out.println(s.contains("string"));
		System.out.println(s.contains(new StringBuilder("api")));
	    System.out.println(s.indexOf('t', 2));
	    System.out.println("abc".compareTo("ABC"));
	    System.out.println("abc".compareToIgnoreCase("ABC"));
	}

}
