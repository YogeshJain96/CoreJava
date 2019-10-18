package lists;

import java.util.*;

public class IntegerList {
	public static void main(String[] args) {
		// create empty AL , size =0 ;capa =10
		ArrayList<Integer> l1 = new ArrayList<>();
		System.out.println("l1 via toString" + l1);
		int[] ints = { 200, 10, -45, 10, 28, 1, 45, 67, 15, 56 };
		// populate AL
		for (int i : ints)// i=ints[0],.....
			l1.add(i);// auto boxing
		System.out.println("l1 via toString" + l1);
		System.out.println("l1 via for-loop");
		// for loop
		for (int i = 0; i < l1.size(); i++)
			System.out.print(l1.get(i) + " , ");
		System.out.println();
		// for-each
		System.out.println("l1 via for-each");
		for (int i : l1)// auto un boxing
			System.out.print(i + " ");
		System.out.println();
		// 4. Check if specific element exists
		System.out.println(l1.contains(67) ? "Exists" : "Doesn't Exist");
		System.out.println(l1.contains(10767) ? "Exists" : "Doesn't Exist");
		// 5. Display index of 1st & last occurrence of a specific element.
		System.out.println("1st " + l1.indexOf(10) + " last " + l1.lastIndexOf(10));
		/*
		 * 6. Create empty LinkedList. 7. Populate this linked list from AL contents.
		 * 
		 */
		LinkedList<Integer> l2 = new LinkedList<>();
		l2.addAll(l1);
		System.out.println("Adding l1 in L2 and printing");
		for (int i = 0; i < l2.size(); i++)
			System.out.print(l2.get(i) + " , ");
		System.out.println("\n l2 contains " + l2);
		// create a new populated Vector using data from AL
		Vector<Integer> v = new Vector<Integer>(l1);
		System.out.println("vector contains " + v);
		// 8. Double elems of AL if elem > 10
		for (int i = 0; i < l1.size(); i++)
			if (l1.get(i) > 10) //auto un boxing
				l1.set(i, l1.get(i) * 2);//replace
		System.out.println(l1);
		// Remove specific elem;
		l1.remove(0);
		System.out.println("l1 after remove "+l1);
		//10. Sort AL in asc order.
		Collections.sort(l1);
		System.out.println("sorted list "+l1);
		// Convert AL ----> array (using generic method)
		//create Integer[] of sufficient size
		Integer[] integers=new Integer[5];
	 	Integer[] integers2=l1.toArray(integers);//l1.toArray(integers);Integer[] integers2=integers;
		System.out.println(Arrays.toString(integers2));
		System.out.println(integers==integers2);

	}
}
