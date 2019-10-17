package strings2;

public class TestLiteralPoolWithIntern {

	public static void main(String[] args) {
		String s1 = new String("hello");// 2 string objs are created
		// 1 literal string object @ class loading time (whose ref is present is
		// literal string pool )
		// & other dynamically created @ run time.
		
		String s4 = s1 + "india";//"helloindia" ref not yet added in the pool
		/*
		 * But in the next line , by calling the intern() method on this object, you can tell JVM
		 * to put this String ref in the pool and whenever someone else creates
		 * "helloindia", this object will be returned instead of creating a new object.
		 * 
		 */
		String s6 = s4.intern();//now a ref is added to literal pool having same adr 
		//value as s4 & pointing to string object "helloindia" --so s4=s6
		String s5 = "helloindia"; //doesn't add anything anywhere --s5=s4=s6 
		System.out.println(s4 == s6);
		System.out.println(s5 == s6);
		System.out.println(s4 == s6);
	}

}
