package sets;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IntegerSet {

	public static void main(String[] args) {
		//create empty HS of ints.
		HashSet<Integer> hs=new HashSet<>();
		Integer[] data= {34,12,-67,56,12,34,45,7};
		//Fixed size list
		List<Integer> l1=Arrays.asList(data);
	//	l1.add(1234);//exc 
		System.out.println(l1);
		//populate HS from list data
		hs.addAll(l1);
		hs.add(345);
		System.out.println(hs);
		System.out.println(hs.contains(12)?"exists":"doesn't exist");
		System.out.println("Removed 12 "+hs.remove(12));
		//for each
		for(int i : hs)
			System.out.print(i+" ");
		

	}

}
