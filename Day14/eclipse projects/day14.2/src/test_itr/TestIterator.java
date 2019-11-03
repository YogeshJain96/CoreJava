package test_itr;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<>();
		int[] data= {3,4,12,34,-60,6,7,8};
		for(int i : data)
			l1.add(i);
		System.out.println(l1);
		//attach iterator to this list & display elems
		System.out.println("Displaying list via Itr");
		Iterator<Integer> itr=l1.iterator();
		//itr.remove(); IllegalStateExc
		while(itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
			itr.remove();//IllegalStateExc
		}
		System.out.println("List after remove");
		System.out.println(l1);

	}

}
