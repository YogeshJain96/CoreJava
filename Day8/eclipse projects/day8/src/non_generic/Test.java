package non_generic;

import java.util.ArrayList;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// create a holder to hold an int
		Holder h1=new Holder(1234);//int --->Integer ---Object
		int data=(int)h1.getRef();//explicit down-casting is essential
		
		System.out.println(data);
		
		// create a holder to hold a string
		Holder h2=new Holder("abcd");//string---> obj up casting
		String s=(String)h2.getRef();//explicit down-casting is essential
		
		System.out.println(s);
	   
		h1=h2;
		System.out.println(h1.getRef());
	    //data=(int)h1.getRef();//error
		
		//Raw ArrayList
		ArrayList l1=new ArrayList();
		l1.add(123);
		l1.add("sssss");
		l1.add(new Date());
		//Treats l1.get(index) as Object
		int i1=(int) l1.get(0);//Explicit casting required
		String s1=(String) l1.get(1);
		Date d1=(Date) l1.get(2);
		System.out.println(i1+s1+d1);
	}

}
