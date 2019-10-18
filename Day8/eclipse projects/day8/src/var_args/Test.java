package var_args;

import java.util.*;

public class Test {

	public static void main(String... args) {
//		testMe();
//		testMe(new double[] {2,3,4.5});
//		testMe(10,23.45,67.789);
		Integer[] ints= {4,5,12,45,67,890};
		 System.out.println(ints.getClass());
		List<Integer> list = Arrays.asList(ints); 
		// printing the list
		for(int l:list)
			System.out.println(l);
		//list.add(12);
		//list.remove(0);
		list.set(1,345);//Resetting position 1 value to 345 
		
		 System.out.println("The list is: " + list); 
		 
		 System.out.println(list.getClass()); 
		 System.out.println(list.getClass().getName());

	}
//	private static void testMe(double... vals)
//	{
//		System.out.println("Printing values");
//		for(double d : vals)
//			System.out.print(d+" ");
//		System.out.println();
//	}

}
