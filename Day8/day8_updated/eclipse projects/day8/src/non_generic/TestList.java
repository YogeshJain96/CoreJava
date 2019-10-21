package non_generic;

import java.util.ArrayList;
import java.util.Date;

public class TestList {

	public static void main(String[] args) {
		/*
		 * Create raw(non generic ) ArrrayList
ArrayList l1=new ArrayList();
//add int,string,date to the list
String s=l1.get(0);
		 */
		ArrayList l1=new ArrayList();
		l1.add(100);
		l1.add("strings");
		l1.add(new Date());
		String s=(String)l1.get(0);//class cast exception
		/*
		 * int data=(Integer)l1.get(0);
		 */		//System.out.println(data);
	}

}
