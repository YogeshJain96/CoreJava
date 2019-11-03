package test_itr;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator2 {

	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<>();
		int[] data= {3,4,12,34,-60,6,7,8};
		for(int i : data)
			l1.add(i);
		System.out.println(l1);
		//fail fast behaviour of Iterator / ListIterator
		//attach itr
		Iterator<Integer> itr=l1.iterator();
	//	l1.remove(0);
	//	l1.add(124);
		l1.set(0, 5678);
		//display list elems using itr
		System.out.println("l1 via Itr");
		while(itr.hasNext())
			System.out.println(itr.next());
	
	}

}
