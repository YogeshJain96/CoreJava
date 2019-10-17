package test_strings;

public class Test1 {

	public static void main(String[] args) {
		String s="hello";
		s.concat("hi");
		s+= "1234";//s =s+"1234";
		s.toUpperCase();
		System.out.println(s);
	    System.out.println(s.substring(4, s.length()));
	    System.out.println(s);
	    

	}

}
