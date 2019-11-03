package test_itr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestListItr {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		int[] data = { 3, 4, 12, 34, -60, 6, 7, 8 };
		for (int i : data)
			l1.add(i);
		System.out.println(l1);
		ListIterator<Integer> litr=l1.listIterator(l1.size());
		while(litr.hasPrevious())
			System.out.print(litr.previous()+" ");
	}

}
