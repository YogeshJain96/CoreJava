package strings;
import static strings2.Test.*;

public class TestStringIntern {

	public static void main(String[] args) {
		
				String s1="hi";
				String s2=new String(s1);
				String s3=s2.intern();
				String s4="hi";
				String s5="h".concat("i");
				String s6="h"+"i";
				System.out.println(s1==s2);//false
				System.out.println(s1==s3);//true
				System.out.println(s2==s3);//false
				System.out.println(s1==s4);//true
				System.out.println(s1==s5);//false
				System.out.println(s1==s6);//true
				System.out.println(s1==s7);//true
				

	}

}
